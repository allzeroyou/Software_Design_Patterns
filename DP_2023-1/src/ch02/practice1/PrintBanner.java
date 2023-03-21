package ch02.practice1;

// 어댑터: 상속을 이용함(inheritance)
public class PrintBanner extends Banner implements Print { // implements Print: Print를 구현함.
    public PrintBanner(String string) { // 생성자
        super(string); // 부모생성자 호출.
    }

    @Override
    public void printWeak() { // 12 볼트
        showWithParen(); // 220 볼트: 실제일은 Banner가 한다
        // 인터페이스는 딱히 기능이 없고, 클라이언트가 호출할 함수의 이름을 변경함.(showWithParen -> printWeak)
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
