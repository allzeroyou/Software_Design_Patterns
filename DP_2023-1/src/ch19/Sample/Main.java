package ch19.Sample;

public class Main {
  public static void main(String[] args) {
    SafeFrame frame = new SafeFrame("State Sample");

    while (true) { 
      for (int hour = 0; hour < 24; hour++) {
        frame.setClock(hour); // 시간 설정
        try {
          Thread.sleep(1000); // 1초에 한번 씩 
        } catch (InterruptedException e) {
        }
      }
    }
  }
}
