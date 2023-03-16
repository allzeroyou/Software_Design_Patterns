package ch01.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
  // 메인 메소드
  public static void main(String[] args) {
    // 책 생성
    Book b1 = new Book("book 1");
    Book b2 = new Book("book 2");

    // System.out.println(b1.getName());

    // 책꽂이 생성
    BookShelf bs1 = new BookShelf(1); // 최대 크기 제한
    
    // 책 2권 꽂음
    bs1.appendBook(b1);
    bs1.appendBook(b2);

    // Book result = bs1.getBookAt(0);
    // Book result2 = bs1.getBookAt(1);

    // System.out.println(result.getName());
    // System.out.println(result2.getName());

    // for 루프 이용해 책 이름 출력

    // for (int i = 0; i <= bs1.getBookCount(); i++) {
    // System.out.println(bs1.getBookAt(i).getName()); } // getBookAt의 우클릭> go to
    // definition> Return 타입이 Book임을 확인
    // 실행 시 nullpointerexception 발생
    // --> 조건식에 등호를 빼주거나, -1을 해준다.

    // 확장 for 루프를 이용해 책이름 출력
    System.out.println("확장 for 루프를 이용한 책 출력");
    for (Book b : bs1) {
      System.out.println(b.getName());
    }

    // 3/14
    // iterator 이용해 책 이름 출력하기.

    // 1. iterator 얻기
    System.out.println("<book list using iterator>");

    // BookShelfIterator iterator = bs1.iterator();
    Iterator<Book> iterator = bs1.iterator();
    // 2. iterator 이용해 원소 얻어오기
    while (iterator.hasNext()) { // 책이 더 있다면
      Book b = iterator.next();
      System.out.println(b.getName());
    }

    // 3.16-3주차 목
    // 문자열 리스트 다루기
    // 컬렉션: 원소가 여러개 있는 객체임.
    // eg. List, Set, Map -> (인터페이스)
    // List 중 ArrayList를 가장 많이 사용

    // ArrayList sList = new ArrayList();
    List<String> sList = new ArrayList<String>(); // 부모타입으로 반환하는게 더 좋음.
    sList.add("a");
    sList.add("b");
    sList.add("c");

    // 모든 원소 출력하기(컬렉션 다루기)
    // 1. for loop 이용
    for (int i = 0; i < sList.size(); i++) {
      System.out.println(sList.get(i));
    }
    System.out.println();

    // 2. 확장 for문 이용
    for (String s : sList) {
      System.out.println(s); // s가 원소 하나하나를 가리킴.

    }
    System.out.println();
    // 3. iterator 이용

    // iterator 이용의 2단계
    // 1단계: iterator 얻기
    Iterator<String> iterator2 = sList.iterator();
    // 2단계: 원소 얻어오기
    while (iterator2.hasNext()) {
      String s = iterator2.next();
      System.out.println(s);
    }
    System.out.println();

    // 4. stream(스트림) 이용하기
    sList.stream().forEach(System.out::println); // stream: 시냇물-원소 하나하나를 시냇물에 둥둥 띄움.
    // :: - 메소드 참조
    // 함수형 프로그래밍에서 메소드 하나를 나타내는 참조형임.

  }
}
