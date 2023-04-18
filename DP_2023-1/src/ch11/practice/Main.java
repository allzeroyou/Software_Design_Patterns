package ch11.practice;

public class Main {
  public static void main(String[] args) {
    Entry f1 = new File("v1", 100);

    System.out.println(f1.getName());
    System.out.println(f1.getSize());
    System.out.println(f1);

    // // 0418 9:17~
    // Directory root = new Directory("root"); // type: Entry, 실제 type: Directory
    // Directory bin = new Directory("bin");
    // Directory tmp = new Directory("tmp");
    // Directory usr = new Directory("usr");

    // ((Directory) root).add(bin); // root밑에 bin이 담김
    // // Directory에는 add있음
    // // Entry에는 없음
    // // 컴파일러는 부모타입을 더 중요하게
    // // 형 변환해주어야!
    // // 할때마다 이렇게 하려면 불편하다 -> 아예 Entry에서 Directory 타입으로 변경.
    // root.add(tmp);
    // root.add(usr);
    // // add의 인자는 entry 타입을 받음 -> directory가 entry를 상속받고 있으니까 괜찮나??

    // bin.add(new File("vi", 100));
    // bin.add(new File("latex", 200));

    // //
    // System.out.println(root.getSize()); // 자식 file 크기만 더함 : 300
    // root.printList(); // 중요!
    // // prefix 관련한 메소드 확인할 것.
    // // Directory 34번째 행부터

  }

}
