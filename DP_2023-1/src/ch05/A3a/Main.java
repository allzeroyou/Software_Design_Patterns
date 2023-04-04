package ch05.A3a;

// Main 클래스가 Thread 클래스
public class Main extends Thread {
  public static void main(String[] args) {
    System.out.println("Start.");
    
    // 스레드 객체가 3개 생성됨
    new Main("A").start(); // 시작해라!
    new Main("B").start(); // 시작해라!
    new Main("C").start(); // 시작해라!

    System.out.println("End.");
  }

  // 스레드: 필수적으로 구현해줘야 하는 메소드: run()
  // 스레드가 하는 일 정의.
  @Override
  public void run() {
    Singleton obj = Singleton.getInstance();
    System.out.println(getName() + ": obj = " + obj);
  }

  public Main(String name) {
    super(name);
  }
}
