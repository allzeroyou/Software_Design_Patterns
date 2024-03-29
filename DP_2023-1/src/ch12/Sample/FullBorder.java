package ch12.Sample;

public class FullBorder extends Border { // 장식자(FullBorder)이므로 장식자(Border) 상속
  public FullBorder(Display display) {
    super(display); // 부모 생성자 호출(생성자 안에 super가 있으므로)
  }

  @Override
  public int getColumns() {
    // 문자 수는 내용물 양쪽에 좌우 장식 문자만큼 더한 것
    return 1 + display.getColumns() + 1;
  }

  @Override
  public int getRows() {
    // 행수는 내용물의 행수에 상하 장식 문자만큼 더한 것
    return 1 + display.getRows() + 1;
  }

  @Override
  public String getRowText(int row) {
    if (row == 0) { // 상단 테두리
      return "+" + makeLine('-', display.getColumns()) + "+";
    } else if (row == display.getRows() + 1) { // 하단 테두리
      return "+" + makeLine('-', display.getColumns()) + "+";
    } else { // 기타
      return "|" + display.getRowText(row - 1) + "|"; // 실제 text의 index는 행 수 - 1 (row - 1)
    }
  }

  // 문자 ch로 count 수만큼 연속한 문자열을 만든다
  private String makeLine(char ch, int count) {
    StringBuilder line = new StringBuilder(); // StringBuilder: 문자열 구축시 사용
    for (int i = 0; i < count; i++) {
      line.append(ch);
    }
    return line.toString();
  }
}
