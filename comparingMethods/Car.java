package comparingMethods;

public class Car {

  private String brand;
  private String model;
  private double price;
  private int year;

  public Car(String brand, String model, double price, int year) {
    this.brand = brand;
    this.model = model;
    this.price = price;
    this.year = year;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return brand + " " + model + " - Price: " + price + ", Year: " + year;
  }
}
