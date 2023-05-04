// 관찰자
public interface Observer {
  // notifies(통지 받을) 때 호출되는 메소드
  public abstract void update(NumberGenerator generator); // 인자: 관찰대상
}
