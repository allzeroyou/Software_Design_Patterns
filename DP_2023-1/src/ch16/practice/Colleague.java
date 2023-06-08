package ch16.practice;
// 중재자에게 상담을 의뢰할 멤버를 나타내는 인터페이스

public interface Colleague {
  // 메소드의 인수로 전달된 인스턴스는 나중에 상담이 필요할때 사용
  public abstract void setMediator(Mediator mediator);

  // Mediator에서 활성/비활성 지시
  public abstract void setColleagueEnabled(boolean enabled);

}
