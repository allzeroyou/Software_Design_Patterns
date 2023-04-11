package ch10.practice;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random; // 임의의 수 생성기
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed); // seed가 같으면 동일한 숫자 생성
    }

    @Override
    public Hand nextHand() { // 핵심 기능
        if (!won) { // 직전에 졌으면
            prevHand = Hand.getHand(random.nextInt(3)); // nextInt: 0, 1, 2 중 하나의 난수 생성
        }
        return prevHand; // 직전에 이겼으면 같은 손 리턴
    }

    @Override
    public void study(boolean win) { // 
        won = win;
    }
}
