package ch10.practice;

import javax.xml.namespace.QName;

public class Main {
  public static void main(String[] args) {
    // 바위
    Hand h1 = Hand.ROCK;
    System.out.println(h1); // toString을 하지 않았는데 바위가 출력되는 이유?
    // println 은 문자열을 출력 -> 따라서 toString이 없다면 자동으로 호출함.

    // 가위
    Hand h2 = Hand.getHand(2);
    System.out.println(h2);
    // h1이 h2를 이기는지 확인.
    if (h1.isStrongerThan(h2)) {
      System.out.println(h1 + "가 이김");
    } else if (h1.isWeakerThan(h2)) {
      System.out.println(h2 + "가 이김");
    } else {
      System.out.println("무승부");
    }
    // WinningStrategy
    WinningStrategy ws1 = new WinningStrategy(2020);
    ws1.study(false);
    Hand WinningStrategyH1 = ws1.nextHand();
    System.out.println(WinningStrategyH1);
    //
    ws1.study(true);
    WinningStrategyH1 = ws1.nextHand();
    System.out.println(WinningStrategyH1);
  }
}
