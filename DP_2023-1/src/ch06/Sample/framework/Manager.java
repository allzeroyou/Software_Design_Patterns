package ch06.Sample.framework;

import java.util.HashMap;
import java.util.Map;

// Product라는 "부모타입"으로 코딩되어 있음.
// 코드를 볼 때 부모타입으로 짠 코드는 좋은 코드 -> 유연성
// 원칙: Programming to Interface/Abstract Class

public class Manager {
  // Map<Key, Value> 쌍 저장
  private Map<String, Product> showcase = new HashMap<>();

  // prototype과 name을 받아서 showcase(HashMap)에 저장
  public void register(String name, Product prototype) { // Product 타입(부모): 자식을 모두 받을 수 있음. -> 유연한 코드
    // 다른 Product를 많이 만들어도 받아올 수 있음.
    // Manager 코드는 전혀 변경 할 필요 x
    showcase.put(name, prototype);
  }

  public Product create(String prototypeName) {
    Product p = showcase.get(prototypeName); // 문자열을 이용해서 showcase에서 찾아옴.
    // return p; // 하지 않고 createCopy()-> 복제품을 반환.
    // return p.clone(); // clone 호출한 주체->매니저 이기 때문에 안됨.
    // clone은 자기 자신만 호출 가능.
    return p.createCopy();
  }
}
