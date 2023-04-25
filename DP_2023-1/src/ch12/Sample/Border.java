package ch12.Sample;

// 장식자
public abstract class Border extends Display {
  // 내용물(장식대상)을 가르킴
  // Display : 부모타입. 부모 장식 ok, 자식 장식 ok.
  protected Display display; // 이 장식틀이 감싸는 '내용물'

  protected Border(Display display) { // 인스턴스 생성 시 '내용물'을 인수로 지정
    this.display = display;
  }
}
