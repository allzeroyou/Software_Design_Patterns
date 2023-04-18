package ch11.practice;

import java.util.ArrayList;
import java.util.List;

// composite(그릇)을 나타내는 클래스
public class Directory extends Entry {
  private String name;
  // 자기 내용물 리스트를 관리하는 변수
  private List<Entry> directory = new ArrayList<>(); // Entry: 부모타입 -> 파일, 디렉토리 타입의 자식들을 다 담을 수 있음.

  public Directory(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  // 자기 (자식) 내용물들의 getSize()를 호출함.
  public int getSize() {
    int size = 0;
    // 확장 for문
    for (Entry entry : directory) {
      size += entry.getSize(); // 재귀적 호출
    }
    return size;
  }

  @Override
  // 자기자신 내용물 출력.
  protected void printList(String prefix) {
    System.out.println(prefix + "/" + this);

    for (Entry entry : directory) {
      entry.printList(prefix + "/" + name); // 재귀 호출
ㅎ
    }
  }

  // 디렉터리 엔트리를 디렉터리에 추가한다
  public Entry add(Entry entry) {
    directory.add(entry);
    return this;
  }
}
