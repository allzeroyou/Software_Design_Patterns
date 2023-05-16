package ch20.Sample;

public class BigString {
    // '큰 문자'의 배열
    // 배열 선언
    private BigChar[] bigchars;

    // 생성자 
    public BigString(String string) { // "1212123"
        // 공장 얻음
        BigCharFactory factory = BigCharFactory.getInstance(); 
        // 배열 생성-String 길이 만큼 배열을 만든다.
        bigchars = new BigChar[string.length()];
        // BigChar 생성을 공장에게 위임(직접 BigChar를 만들지 않는다.)
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i)); // i번째 문자를 가져옴
            // 이미 있는 문자라면 그대로 return
        }
    }

    // 표시
    public void print() {
        for (BigChar bc: bigchars) {
            bc.print();
        }
    }
}
