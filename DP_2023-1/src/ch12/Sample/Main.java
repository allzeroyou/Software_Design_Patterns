package ch12.Sample;

public class Main {
  public static void main(String[] args) {
    // 중심을 생성
    Display b1 = new StringDisplay("Hello, world.");

    // 중심을 장식-> 장식한 결과물이 내용물(장식 대상)이 될 수 있음.
    Display b2 = new SideBorder(b1, '#');
    Display b3 = new FullBorder(b2);


    b1.show();
    b2.show();
    b3.show();

    // 23.04.25 화 09:16~
    Display b5 = new FullBorder(b1);
    b5.show();
    Display b6 = new FullBorder(b5);
    b6.show();


    Display b4 = new SideBorder( // 다양한 장식자로 장식 가능. 어떻게 장식하느냐에 따라 새로운 결과
        new FullBorder( // 
            new FullBorder( // 
                new SideBorder( // 
                    new FullBorder( // 
                        new StringDisplay("Hello, world.")), // 중심
                    '*'))),
        '/');
    b4.show();
  }
}
