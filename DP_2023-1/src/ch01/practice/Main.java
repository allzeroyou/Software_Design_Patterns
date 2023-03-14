package ch01.practice;

public class Main {
  // 메인 메소드
  public static void main(String[] args) {
    // 책 생성
    Book b1 = new Book("book 1");
    Book b2 = new Book("book 2");

    // System.out.println(b1.getName());

    // 책꽂이 생성
    BookShelf bs1 = new BookShelf(10);
    bs1.appendBook(b1);
    bs1.appendBook(b2);

    // Book result = bs1.getBookAt(0);
    // Book result2 = bs1.getBookAt(1);

    // System.out.println(result.getName());
    // System.out.println(result2.getName());

    // for 루프 이용해 책 이름 출력


    // for (int i = 0; i <= bs1.getBookCount(); i++) {
      // System.out.println(bs1.getBookAt(i).getName()); // getBookAt의 우클릭> go to definition> Return 타입이 Book임을 확인
    // nullpointerexception 발생
    // 조건식에 등호를 빼주거나, -1을 해준다.
    

    // 3/14 
    // iterator 이용해 책 이름 출력하기.


    // 1. iterator 얻기
    System.out.println("<book list using iterator>");

    BookShelfIterator iterator = bs1.iterator();
    // 2. iterator 이용해 원소 얻어오기
    while(iterator.hasNext()){ // 책이 더 있다면
      Book b = iterator.next();
      System.out.println(b.getName());
    }

  }
}


