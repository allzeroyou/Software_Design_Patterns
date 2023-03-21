package ch02.practice1;

// 클라이언트
public class Main {
  public static void main(String[] args) { // jvm가 main 메소드 먼저 실행.

    // 가정) 클라이언트가 직접 Banner를 사용하지 못한다 - 직접 220v 이용
    // Banner b = new Banner("String1");
    // b.showWithParen();
    // b.showWithAster();

    // 클라이언트는 "Print 인터페이스"를 이용하길 원한다 - 어댑터 이용
    PrintBanner x = new PrintBanner("String2"); // Print 인터페이스구현.
// ^ 이름을 Print로 하지 않아도 괜찮지않나?

    x.printWeak();
    x.printStrong();

  }
}
