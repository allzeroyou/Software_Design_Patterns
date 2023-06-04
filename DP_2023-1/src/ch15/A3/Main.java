package ch15.A3;

public class Main {
  public static void main(String[] args) {
    String title = "Welcome!";
    String message = "Hello, world!";
    // 텍스트블록: 띄어쓰기 유지, 줄바꿈 유지된채로 사용됨.
    String html = """
        <!DOCTYPE html>
        <html>
            <head>
                <title>%s</title>
            </head>
            <body>
                <h1 style="text-align: center">%s</h1>
            </body>
        </html>
        """.formatted(title, message); // title: string하나가 들어감
    System.out.print(html); // 출력

    String myString = "my name is %s".formatted("ydy"); // TEST
    System.out.println(myString);
  }
}
