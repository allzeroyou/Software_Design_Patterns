package ch02.practice2;

// 클라이언트
public class Main {
  public static void main(String[] args) { // jvm가 main 메소드 먼저 실행.

    // 가정) 클라이언트가 직접 Banner를 사용하지 못한다 - 직접 220v 이용
    // 1.
    // 만약
    // Banner를 수정하면 클라이언트가 영향 받음.

    // Vendor class: 소스코드를 주지 않음 -> 소스코드를 직접 수정 x
    // 기존 클래스 손 대지 못함. 그럼에도 새로운 인터페이스에 기존 클래스에 맞출 수 있음.
    Banner b = new Banner("String1");
    b.showWithParen();
    b.showWithAster();


    // 클라이언트는 "Print 인터페이스"를 이용하길 원한다 - 어댑터 이용
    // 2.
    // 장점1: Banner를 수정해도 클라이언트는 영향 받지 않음 (c.f. iterator 패턴-코드 수정 시 영향 x)
    // 장점2: Banner를 수정하지 않고도 Print 처럼 사용함.
    Print x = new PrintBanner("String2"); // Print 인터페이스구현.

    x.printWeak();
    x.printStrong();

  }
}
