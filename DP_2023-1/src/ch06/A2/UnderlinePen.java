package ch06.A2;

import ch06.A2.framework.Product;

public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    // 복사 생성자 
    public UnderlinePen(UnderlinePen prototype) { // 같은 클래스의 인스턴스를 인수로 가짐
        this.ulchar = prototype.ulchar; // 인스턴스 생성 시 필드를 복사하는 생성자.
    }

    @Override
    public void use(String s) {
        int ulen = s.length();
        System.out.println(s);
        for (int i = 0; i < ulen; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        return new UnderlinePen(this);
    }
}
