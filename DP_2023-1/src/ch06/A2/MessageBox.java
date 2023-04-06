package ch06.A2;

import ch06.A2.framework.Product;

public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    // 복사 생성자 
    public MessageBox(MessageBox prototype) { // 같은 클래스의 인스턴스를 인수로 가짐.
        this.decochar = prototype.decochar; // 인스턴스 생성시 필드 복사
    }

    @Override
    public void use(String s) {
        int decolen = 1 + s.length() + 1;
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + s + decochar);
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        return new MessageBox(this);
    }
}
