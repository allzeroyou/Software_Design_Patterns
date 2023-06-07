package ch14.practice;
// 문제 해결 사슬을 만들기 위한 추상 클래스 Support

public abstract class Support {
  private String name; // 트러블 해결자 이름
  private Support next; // 떠넘길곳

  public Support(String name) {
    this.name = name;
    this.next = null;
  }

  // 떠넘길 곳을 설정한다
  public Support setNext(Support next) {
    this.next = next;
    return next;
  }

  // template method 사용
  public void support(Trouble trouble) {

    // if (resolve(trouble)) {
    // done(trouble);
    // } else if (next != null) {
    // next.support(trouble);
    // } else {
    // fail(trouble);
    // }

    // 재귀 호출 말고 루프로 전개
    for (Support obj = this; true; obj = obj.next) {
      if (obj.resolve(trouble)) {
        obj.done(trouble); // 트러블 해결되면
        break; // 루프 탈출
      } else if (obj.next == null) { // 맨 마지막 사람이라면
        obj.fail(trouble); // 실패했다!
        break; // 루프 탈출
      }
    }
  }

  // 트러블을 해결하는 추상 메소드 resolve
  protected abstract boolean resolve(Trouble trouble);

  // 트러블 해결
  protected void done(Trouble trouble) {
    System.out.println(trouble + "is resolved by" + this + ".");
  }

  // 트러블 해결 불가
  protected void fail(Trouble trouble) {
    System.out.println(trouble + "can not be resolved.");
  }

  // 트러블 해결자의 문자열 표현
  public String toString() {
    return "[" + name + "]";
  }

}
