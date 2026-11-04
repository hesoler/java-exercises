package threads;

public class RunnableExample implements Runnable {

  private String threadName;

  public RunnableExample(String name) {
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
    Thread thread1 = new Thread(new RunnableExample("Runnable-1"));
    Thread thread2 = new Thread(new RunnableExample("Runnable-2"));

    thread1.start();
    thread2.start();
  }

}
