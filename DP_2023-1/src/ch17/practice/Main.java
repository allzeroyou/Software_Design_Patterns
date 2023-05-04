public class Main {
    public static void main(String[] args) {
      // ⭐️수업시간에 직접 코드 채워 봄
      // 관찰 대상 생성
      NumberGenerator generator = new RandomNumberGenerator();

      // 관찰자 생성
      Observer observer = new DigitObserver();
      Observer graphObserver = new GraphObserver();

      // 관찰자 관찰대상에 등록.
      generator.addObserver(observer);
      generator.addObserver(graphObserver); // 새로운 observer 등록만 해주면 알아서 작동


      // 관찰자에게 숫자 생성 요청.
      generator.execute();

        // NumberGenerator generator = new RandomNumberGenerator();
        // Observer observer1 = new DigitObserver();
        // Observer observer2 = new GraphObserver();
        // generator.addObserver(observer1);
        // generator.addObserver(observer2);
        // generator.execute();
    }
}
