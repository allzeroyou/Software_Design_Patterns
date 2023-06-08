package ch16.practice;
// 중재자를 나타내는 인터페이스
// createColleagues: Mediator가 관리할 멤버를 생성하는 메소드
// colleagueChanged: 멤버인 Colleague가 호출하는 메소드

public interface Mediator {
  // Colleage 생성
  public abstract void createColleagues();
  // Colleague 상태 변화시 호출됨
  public abstract void colleagueChanged();

}
