package ch14.practice;
// 발생한 트러블을 표현하는 Trouble 클래스.
public class Trouble {
  private int number;

  public Trouble (int number){
    this.number= number; // 트러블 번호
  }
  public int getNumber(){
      return number;
  }
  public String toString(){
    return "[Trouble "+number+"]";
  }
}
