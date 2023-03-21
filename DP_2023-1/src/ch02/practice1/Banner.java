package ch02.practice1;

// vendor class : 이미 제공된 것. c.f.) 220볼트

public class Banner {
    private String string;

    public Banner(String string) { // 생성자
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")"); // 문자열 출력 with  소괄호
    }

    public void showWithAster() {
        System.out.println("*" + string + "*"); // 문자열 출력 with asterisk(*)
    }
}
