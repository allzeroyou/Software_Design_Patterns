package ch10.practice;

public class Main {
  public static void main(String[] args) {
    /*
     * // 바위
     * Hand h1 = Hand.ROCK;
     * System.out.println(h1); // toString을 하지 않았는데 바위가 출력되는 이유?
     * // println 은 문자열을 출력 -> 따라서 toString이 없다면 자동으로 호출함.
     * 
     * // 보
     * Hand h2 = Hand.getHand(2);
     * System.out.println(h2);
     * // h1이 h2를 이기는지 확인.
     * if (h1.isStrongerThan(h2)) {
     * System.out.println(h1 + "가 이김");
     * } else if (h1.isWeakerThan(h2)) {
     * System.out.println(h2 + "가 이김");
     * } else {
     * System.out.println("무승부");
     * }
     * 
     * // WinningStrategy 동작 테스트
     * WinningStrategy ws1 = new WinningStrategy(2020);
     * 
     * ws1.study(false);
     * Hand WinningStrategyH1 = ws1.nextHand();
     * System.out.println(WinningStrategyH1);
     * 
     * //
     * ws1.study(true);
     * WinningStrategyH1 = ws1.nextHand();
     * System.out.println(WinningStrategyH1);
     */

    // 게임 진행
    // 1. player 생성
    Player p1 = new Player("DaYeongYOO", new ProbStrategy(130));
    Player p2 = new Player("MiRyeKim", new WinningStrategy(100));
    // 2. 게임 시작
    for (int i = 0; i < 100; i++) {

      Hand h1 = p1.nextHand();
      Hand h2 = p2.nextHand();
      // 3. 결과
      if (h1.isStrongerThan(h2)) {
        System.out.println("Winner: " + p1);
        p1.win();
        p2.lose();
      } else if (h1.isWeakerThan(h2)) {
        System.out.println("Winner: " + p2);
        p1.lose();
        p2.win();
      } else {
        System.out.println("Even...");
        p1.even();
        p2.even();
      }
    }
    System.out.println("Total Result: ");
    System.out.println(p1);
    System.out.println(p2);
  }
}
