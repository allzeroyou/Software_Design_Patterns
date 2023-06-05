package ch12.A2;
// 코드 안보고 직접 한줄씩 구현해보기

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
  // 표시 문자열 저장 장소
  private List<String> body = new ArrayList<>();
  // 표시 문자열 최대 문자 수
  private int columns = 0;

  // 문자열 추가
  public void add(String msg) {
    body.add(msg);

    // 더 긴 문자열을 넣는다면
    if (columns < msg.length()) {
      // 최대 문자 수 갱신
      columns = msg.length();
    }
    // 제일 긴 문자열 개수에 맞추기위해 빈칸 추가함.
    updatePadding();
  }

  @Override
  public int getColumns() {
    return columns;
  }

  @Override
  public int getRows() {
    return body.size(); // 문자열 개수
  }

  @Override
  public String getRowText(int row) {
    return body.get(row);
  }

  // 표시 문자열 오른쪽 끝에 채울 공백을 필요에 따라 늘린다
  private void updatePadding() {
    for (int row = 0; row < body.size(); row++) {
      String line = body.get(row);

      int padding = columns - line.length(); // 채워야 할 빈칸 개수.

      if (padding > 0) { // 빈칸을 채워야 되면
        body.set(row, line + spaces(padding)); 
      }
    }
  }

  // count 수만큼의 공백을 만든다
  private String spaces(int count) {
    StringBuilder spaces = new StringBuilder();
    for (int i = 0; i < count; i++) {
      spaces.append(' ');
    }
    return spaces.toString();
  }
}
