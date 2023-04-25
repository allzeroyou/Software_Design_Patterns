package ch12.Sample;

public class StringDisplay extends Display {
    private String string; // 표시 문자열 

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.length();
    }

    @Override
    public int getRows() {
        return 1; // 행수는 1
    }

    @Override
    public String getRowText(int row) {
        if (row != 0) { // 한 줄이기 때문에 row는 0임.
            throw new IndexOutOfBoundsException(); // 예외 객체가 getRowText를 호출한 클라이언트에게 간다.
        }
        return string;
    }
}
