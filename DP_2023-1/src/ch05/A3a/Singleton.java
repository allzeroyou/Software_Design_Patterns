package ch05.A3a;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
        slowdown(); // 생성될 때 시간이 걸리도록 함. // 여러 스레드 왔다갔다 할 수 있도록 해 다른 객체를 생성하도록
    }

    // public static Singleton getInstance() { // 싱글톤 객체 생성.
    public static synchronized Singleton getInstance() { // synchronized: 동시에 2개 이상의 스레드가 getInstance() 안으로 들오지 못하도록 막는다.
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000); // Thread 클래스 sleep 메소드 호출.
            // cpu를 내놓고 잠을 잔다.
            // 적어도 1초 걸리도록.
        } catch (InterruptedException e) { // 
        }
    }
}
