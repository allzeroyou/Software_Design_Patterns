package ch01.practice;

import java.util.Iterator;

// iterator: 집합체를 접근해 하나씩 꺼내온다.
// BookShelfIterator: BookShelf에 접근해 하나씩 꺼내온다.
public class BookShelfIterator implements Iterator<Book> {
  // 집합체: Iterator, 반복할 집합체 필요.
  BookShelf bookShelf;
  // 책 꽂이 index
  int index = 0;

  // 생성자
  public BookShelfIterator(BookShelf bookShelf) {
    // 생성시 두 속성의 값 초기화
    this.bookShelf = bookShelf;
    this.index = 0;
  }

  // 모든 iterator는 2개의 메소드 가짐.
  // 1. 꺼내올 책이 더 있는지 검사하는 메서드
  @Override
  public boolean hasNext() {
    if (index < this.bookShelf.getBookCount()) {
      // 꺼낼 책 있음
      return true;
    } else {
      // 꺼낼 책 없음
      return false;
    }
  }

  // 2. 다음 책을 반환하는 메서드
  @Override
  public Book next() {
    Book book = this.bookShelf.getBookAt(index);
    index++; // next 호출마다 다음책, 그 다음책 호출.
    return book;
  }
}
