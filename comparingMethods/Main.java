package comparingMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Car> carList = Arrays.asList(
        new Car("Toyota", "Corolla", 15000, 1995),
        new Car("Toyota", "Yaris", 25000, 2008),
        new Car("Mercedes", "McLaren", 250000, 2005),
        new Car("Porsche", "Cayman S", 95000, 2004),
        new Car("Lamborghini", "Aventador", 300000, 2012),
        new Car("Nissan", "Skyline", 115000, 2015),
        new Car("Honda", "Civic", 20000, 2000),
        new Car("Hyundai", "Tiburon", 40000, 2020)
    );

    // 1. Order by price ascending
    System.out.println("Cars ordered by price ascending:");
    List<Car> orderedByPrice = new ArrayList<>(carList);
    orderedByPrice.sort(Comparator.comparingDouble(Car::getPrice));
    orderedByPrice.forEach(System.out::println);
    System.out.println("--------------------------------------------------");

    // 2. Order by brand and then by model
    System.out.println("Cars ordered by brand and then by price:");
    carList.stream()
        .sorted(Comparator.comparing(Car::getBrand).thenComparing(Car::getPrice))
        .forEach(System.out::println);
    System.out.println("--------------------------------------------------");

    // 3. Cars with price > 100000
    System.out.println("Cars with price lower than 100000:");
    carList.stream()
        .filter(car -> car.getPrice() < 100000)
        .forEach(System.out::println);
    System.out.println("--------------------------------------------------");

    // 4. Cars with brand equal to "Toyota" or "Nissan"
    System.out.println("Cars with brand equal to 'Toyota' or 'Nissan':");
    carList.stream()
        .filter(car -> car.getBrand().equals("Toyota") || car.getBrand().equals("Nissan"))
        .forEach(System.out::println);
    System.out.println("--------------------------------------------------");

    // 5. Cars with model containing "r"
    System.out.println("Cars with model containing 'r':");
    carList.stream()
        .filter(car -> car.getModel().toLowerCase().contains("r"))
        .forEach(System.out::println);
    System.out.println("--------------------------------------------------");
  }
}
