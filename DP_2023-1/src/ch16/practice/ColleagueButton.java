package ch16.practice;

import java.awt.Button;

// Colleague 인터페이스 구현
public class ColleagueButton extends Button implements Colleague {
  private Mediator mediator;

  public ColleagueButton(String caption) {
    super(caption);
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  // Mediator 활성/비활성 지시
  public void setColleagueEnabled(boolean enabled) {
    setEnabled(enabled);
  }

}
