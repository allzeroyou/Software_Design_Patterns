package ch16.practice;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.print.attribute.standard.Media;

// Colleague 인터페이스 구현
// TextField 인터페이스도 구현, 텍스트 내용의 변화를 textValueChanged 메소드로 파악하기 위함
public class ColleagueTextField extends TextField implements TextListener, Colleague { // Colleague 역할.
  // 중재자 선언
  private Mediator mediator;

  // 생성자
  public ColleagueTextField(String text, int columns) {
    super(text, columns);
  }

  // Mediator 설정
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  // Mediator 활성/비활성지시
  public void setColleagueEnabled(boolean enabled) {
    setEnabled(enabled);
    // 활성/비활성에 맞게 배경색 변경
    setBackground(enabled ? Color.white : Color.lightGray);
  }

  // textValueChanged 메소드
  public void textValueChanged(TextEvent e) {
    mediator.colleagueChanged(); // 중재자에게 문자열이 변경되면 알린다!
  }
}
