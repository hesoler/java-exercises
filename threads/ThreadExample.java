package threads;

public class ThreadExample extends Thread {

  private String threadName;

  public ThreadExample(String name) {
    this.threadName = name;
  }

  @Override
  public void run() {
    System.out.println(threadName + " is running.");
    try {
      for (int i = 0; i < 5; i++) {
        System.out.println(threadName + " - Count: " + i);
        Thread.sleep(1000); // Sleep for 1 second
      }
    } catch (InterruptedException e) {
      System.err.println(threadName + " was interrupted.");
    }
    System.out.println(threadName + " has finished.");
  }

  public static void main(String[] args) {
    ThreadExample thread1 = new ThreadExample("Thread-1");
    ThreadExample thread2 = new ThreadExample("Thread-2");

    thread1.start();
    thread2.start();
  }

}
