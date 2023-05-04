import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
  private Random random = new Random(); // 난수 생성기
  private int number; // 현재 수 : 이 객체의 상태 나타냄.

  // 수를 취득한다
  @Override
  public int getNumber() {
    return number;
  }

  // 수를 생성한다
  @Override
  public void execute() {
    for (int i = 0; i < 20; i++) {
      number = random.nextInt(50); // random.nextInt: 호출시 0에서 49사이 랜덤숫자 생성 → 상태변화
      notifyObservers();
    }
  }
}
