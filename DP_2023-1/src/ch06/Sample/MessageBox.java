package ch06.Sample;

import ch06.Sample.framework.Product;

public class MessageBox implements Product { // Product 상속
    private char decochar;

    public MessageBox(char decochar) { // 문자열을 둘러쌀 장식 문자
        this.decochar = decochar;
    }

    @Override
    public void use(String s) { // 문자열(s)을 decochar로 둘러싸서 출력
        int decolen = 1 + s.length() + 1; // deco length.
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
        Product p = null;
        try {
            p = (Product)clone(); // 자기 복제.
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
