
package ch10.Q4;

import java.util.Comparator;

//public class ComparatorAscending implements Comparator{
public class ComparatorAscending implements Comparator<String> {

  @Override
  // 오름차순 정렬
  // public int compare(Object a, Object b) { // Java: 타입 엄격. Object->String으로 바꾸면 Comparator의 compare 메소드 사용 못함.
  public int compare(String a, String b) {
    // 반환값: 양수, 음수, 0
    // 정렬 주체(List): 반환값이 양수일때 a와 b를 서로 바꾼다.

    // 오름차순: 작은 것-앞에
    // 큰 것이 온다면 양수를 return 해야 함 -> 위치를 바꿔야 함을 알려줌.

    ///return ((String) a).compareTo((String) b); // String으로 형 변환. // .이 우선순위가 가장 높음.
    return a.compareTo(b); 
    // compareTo: a의 문자코드 - b의 문자코드
    // a가 작은 경우 음수 return
    // a가 큰 경우 양수 return -> a와 b의 위치 바꿈 -> 오름차순의 기능.
  }

}