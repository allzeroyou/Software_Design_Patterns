package ch06.A1a.framework;

// 추상 클래스
public abstract class Product implements Cloneable {
    public abstract void use(String s); // 추상 메소드

    public Product createCopy() { // 구체적 메소드
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
