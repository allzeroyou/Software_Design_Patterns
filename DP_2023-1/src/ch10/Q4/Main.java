package ch10.Q4;

import java.util.*;

class Main {
  public static void main(String[] args) {
    // Arrays 클래스: asList-> 문자열로 들어온 걸 리스트로 만들어줌.
    List<String> list = Arrays.asList("D", "B", "C", "E", "A");

    // 사전순으로 작은 순서: 오름차순
    // list: 전략을 가지는 contect
    // comparator: 전략에 해당.
    list.sort(new ComparatorAscending());
    System.out.println(list);

    // 사전순으로 큰 순서: 내림차순
    list.sort(new ComparatorDesending());
    System.out.println(list);
  }
}
