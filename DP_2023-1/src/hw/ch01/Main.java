package hw.ch01;

public class Main {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("자료구조론", "박우창"));
    bookShelf.appendBook(new Book("소프트웨어분석설계", "최승훈"));
    bookShelf.appendBook(new Book("프로그래머수학", "이주영"));
    bookShelf.appendBook(new Book("컴퓨터동작원리", "유견아"));
    bookShelf.appendBook(new Book("컴퓨터그래픽스", "이경미"));
    bookShelf.appendBook(new Book("어린왕자", "유다영"));

    // 실행화면 첫줄에 학번과 이름 출력
    System.out.println("20200848 유다영");

    for (Book book : bookShelf) {
      System.out.print(book.getName());
      System.out.print(book.getAuthor());
      System.out.println();
    }
  }
}
