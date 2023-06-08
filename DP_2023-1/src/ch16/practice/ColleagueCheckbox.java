package ch16.practice;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
// 예제에서는 체크박스가 아니라 라디오버튼으로 사용됨
// 라디오 버튼의 상태 변화를 itemStateChanged 메소드로 파악하기 위해 ItemListener 인터페이스 구현

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
  // 중재자 선언
  private Mediator mediator;

  // 생성자
  public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
    super(caption, group, state);
  }

  // Mediator 설정
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  // Mediator에서 활성/비활성 지시
  public void setColleagueEnabled(boolean enabled) {
    setEnabled(enabled);
  }

  // 상태변화시 Mediator에게 알린다.
  public void itemStateChanged(ItemEvent e) {
    mediator.colleagueChanged();
  }

}
