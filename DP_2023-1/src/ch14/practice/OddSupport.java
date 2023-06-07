package ch14.practice;

// 홀수번호 트러블 해결하는 클래스
public class OddSupport extends Support {
  public OddSupport(String name) {
    super(name);
  }

  protected boolean resolve(Trouble trouble) {
    if (trouble.getNumber() % 2 == 1) {
      return true;
    } else
      return false;
  }
}
