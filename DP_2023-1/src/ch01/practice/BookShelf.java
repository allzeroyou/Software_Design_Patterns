package ch01.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.naming.InitialContext;

// 반복가능한 Iterable 인터페이스 상속.
// 원소타입은 Book임을 명시.
public class BookShelf implements Iterable<Book> {
  // Book book; // 책꽂이는 책을 가지고 있다.
  // 책이 여러개니까 배열 선언
  private Book[] books; // 여러 권 꽂을 수 있음-배열이라 크기 제한 o, 초과해서 넣는 경우 예외 발생
  // 아래처럼 ArrayList 클래스를 이용해 크기제한 없이 책을 계속해서 추가가능.

  // private List<Book> books;-수업시간에 급히 실습해본거라 아래 메소드 수정 필요...
  // 책의 마지막 위치
  private int last = 0;

  // 생성자
  public BookShelf(int maxsize) { // initialsize
    // 배열 생성
    this.books = new Book[5]; // 배열 크기 결정 후 변경 x(고정)
    // 따라서 생성될때 크기를 받아 일반화 가능
    this.books = new Book[maxsize];
    // this.books = new ArrayList<>(intialsize);
  }

  // 책 꽂는 메소드
  public void appendBook(Book book) {
    // book을 books에 담으면 됨.
    this.books[last] = book; // books가 속성인경우 -> this를 붙여줌
    last++; // 책 한권 꽂힐 때 마다 이동시켜줌. 배열의 일반적인 경우.
    // books.add(book);
  }
  // 3.16(목) 수정
  // 책 꺼내는 메서드

  // public Book getBookAt(int index) {
  public Book getBookFrom(int index) {
    return books[index];
    // return books.size();
  }

  // 책 개수를 리턴하는 메서드
  public int getBookCount() {
    return last; // last-1일수도 있음.
  }

  // iterator 반환하는 메소드
  // public BookShelfIterator iterator(){ // BookShelfIterator 하나 밖에 리턴을 못함.
  @Override // 어노테이션: 표시 - 부모클래스에 있는걸 override 한 것임을 명시.
  public Iterator<Book> iterator() { // 부모타입으로 반환할 경우, BookShelfIterator뿐만 아니라 다른 것(e.g. BookShelfIteratorBackward 도
                                     // 리턴가능(일반화)
    return new BookShelfIterator(this); // 현재 책꽂이와 iterator가 연결됨.
    // return new BookShelfIteratorBackward(this); // 다양한 iterator를 만들어놓고 상황에따라 다른
    // iterator 반환 가능.

  }
}
