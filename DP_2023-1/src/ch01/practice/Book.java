package ch01.practice; // 클래스 만들때 어떤 패키지에 속하는지, 패키지 선언 부터 해야함

public class Book {
  // 속성
  private String name = ""; // 책 제목

  // 생성자
  public Book(String name) {
    this.name = name;
  }

  // 메소드
  public String getName() {
    return name;
  }

}
