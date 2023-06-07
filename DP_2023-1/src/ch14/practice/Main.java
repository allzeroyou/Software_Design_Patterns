package ch14.practice;

public class Main {
  public static void main(String[] args) {
    Support alice = new NoSupport("Alice"); // 해결안함
    Support bob = new LimitSupport("Bob", 100); // 숫자 범위 내 문제 해결

    Support charlie = new SpecialSupport("Charlie", 1); // 지정한 번호의 문제 해결

    Support diana = new LimitSupport("Diana", 200);
    Support elmo = new OddSupport("Elmo");
    Support fred = new LimitSupport("Fred", 300);

    // 책임 사슬 형성 -> setNext()!
    alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

    for (int i = 0; i < 500; i += 33) {
      alice.support(new Trouble(i));
    }

  }
}
