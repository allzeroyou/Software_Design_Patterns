package ch14.practice;

// limit으로 지정한 번호 미만의 문제 해결하는 클래스 LimitSupport
public class LimitSupport extends Support {
  private int limit; // 이 번호 미만이면 해결 가능

  public LimitSupport(String name, int limit) {
    super(name);
    this.limit = limit;
  }

  protected boolean resolve(Trouble trouble) {
    if (trouble.getNumber() < limit) {
      return true;
    } else {
      return false;
    }
  }

}