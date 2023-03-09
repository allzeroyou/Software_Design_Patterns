package ch01.practice;

public class BookShelf {
  // Book book; // 책꽂이는 책을 가지고 있다.
  // 배열 선언
  private Book[] books; // 여러 권 꽂을 수 있음

  // 책의 마지막 위치
  private int last = 0;

  // 생성자
  public BookShelf(int maxsize) {
    // 배열 생성
    // this.books = new Book[5]; // 배열 크기 결정 후 변경 x(고정)
    // 생성될때 크기를 받아 일반화 가능
    this.books = new Book[maxsize];
  }

  // 책 꽂는 메소드
  public void appendBook(Book book){
    // book을 books에 담으면 됨.
    this.books[last]=book; // books가 속성인경우 -> this를 붙여줌
    last++; // 책 한권 꽂힐 때 마다 이동시켜줌. 배열의 일반적인 경우.
  }
  // 책 꺼내는 메서드
  public Book getBookAt(int index){
    return books[index];
  }

  // 책 개수를 리턴하는 메서드
  public int getBookCount(){
    return last;
  }
}
