package ch02.practice2;

// 어댑터: 위임을 이용(delegation)-어댑티에게 일을 맡김.

public class PrintBanner extends Print { // Print가 추상 클래스 이므로 implements -> extends 로 변경
  // 어댑티를 갖는 속성
  private Banner banner;
  // 위임: 어떤 클래스가 다른 클래스를 속성으로 가짐
  // PrintBanner는 Banner 클래스를 속성으로 가짐.

  public PrintBanner(String string) {
    this.banner = new Banner(string);
  }

  // 핵심: 어댑티를 가지고 있다가(banner) 호출이 되면 어댑티에게 일을 시킨다.

  public void printWeak() { // abstract 키워드 삭제 -> 직접 구현하므로 // 12 볼트에 해당.
    // 220 볼트
    banner.showWithParen(); // 위임
    // 클라이언트) 12볼트를 호출 -> 220 볼트로 변경

  }

  public void printStrong() { // 12 볼트
    banner.showWithAster(); // 220 볼트 // 위임
  }

}
