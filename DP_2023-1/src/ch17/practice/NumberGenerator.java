import java.util.ArrayList;
import java.util.List;


// 관찰대상
public abstract class NumberGenerator {
  // Observer를 저장한다
  private List<Observer> observers = new ArrayList<>();

  // Observer를 추가한다
  public void addObserver(Observer observer) { // Observer: 부모타입 -> 어떤 Observer든 받을 수 있음을 의미.
    observers.add(observer);
  }

  // Observer를 제거한다
  public void deleteObserver(Observer observer) {
    observers.remove(observer);
  }

  // ⭐️ Observer에 통지한다
  public void notifyObservers() {
    for (Observer o : observers) { // 확장 for문 // 원소 타입 : 컬렉션
      o.update(this); // 관찰자에게 통지
    }
  }

  // 수를 취득한다
  public abstract int getNumber();

  // 수를 생성한다
  public abstract void execute();
}
