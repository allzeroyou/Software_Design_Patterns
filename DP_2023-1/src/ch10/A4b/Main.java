package ch10.A4b;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 람다식 이용
        // interface 중 Functional interface 존재 -> 인터페이스에 메소드가 한 개만 선언되어 있음.
        // Functional Interface 들어갈 자리에 람다식 넣을 수 있음.
        // Comparator interface: Functional interface.
        
        // 사전순으로 작은 순서
        list.sort((a, b) -> a.compareTo(b)); // (인자1, 인자2) -> method body를 제공한 것과 같음.
        System.out.println(list);

        // 사전식 순으로 큰 순서
        list.sort((a, b) -> b.compareTo(a));
        System.out.println(list);
    }
}
