public class DigitObserver implements Observer {
  // 통지 받은 후 하는 일
  @Override
  public void update(NumberGenerator generator) {
    System.out.println("DigitObserver:" + generator.getNumber());
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
    }
  }
}
