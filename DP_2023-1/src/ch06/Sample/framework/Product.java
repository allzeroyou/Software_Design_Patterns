package ch06.Sample.framework;

// 인터페이스끼리 상속 가능(Cloneable 상속)
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createCopy(); // 자기 복제품을 반환하는 메소드.
}
