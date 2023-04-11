package ch10.practice;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random; // 임의 수 필요
    private int prevHandValue = 0;
    private int currentHandValue = 0;
    // 2차원 배열
    private int[][] history = {
        { 1, 1, 1, },
        { 1, 1, 1, },
        { 1, 1, 1, },
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue)); // 직전의 냈던 행의 합을 통해 임의의 수 구함.
        int handvalue = 0;
        // bet: 랜덤값
        if (bet < history[currentHandValue][0]) {  // 1번째 구간
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) { // 2번째 구간
            handvalue = 1;
        } else { // 3번째 구간
            handvalue = 2;
        }
        prevHandValue = currentHandValue; // 직전
        currentHandValue = handvalue; // 새로 생성
        return Hand.getHand(handvalue);
    }

    private int getSum(int handvalue) { // handvalue: 몇번째 행
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handvalue][i]; // handvalue 고정, 변하는 건 i 값 -> handvalue 행을 다 더함.
        }
        return sum;
    }

    @Override
    public void study(boolean win) { // 전략을 위한 준비작업을 하는 메소드
        if (win) {
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
