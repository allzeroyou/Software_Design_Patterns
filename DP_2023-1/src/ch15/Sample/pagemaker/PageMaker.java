package ch15.Sample.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
  private PageMaker() {
  }

  public static void makeWelcomePage(String mailaddr, String filename) {
    try {
      Properties mailprop = Database.getProperties("maildata"); // 프로퍼티 읽어옴

      String username = mailprop.getProperty(mailaddr); // key: 메일주소, value: 사람 이름 반환.

      HtmlWriter writer = new HtmlWriter(new FileWriter(filename)); // 실제 웹 페이지 제작. FileWriter을 이용
      writer.title(username + "'s web page");

      writer.paragraph("Welcome to " + username + "'s web page!");
      writer.paragraph("Nice to meet you!");
      writer.mailto(mailaddr, username);

      writer.close();

      System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
    } catch (IOException e) { // 여기서 예외받음.
      e.printStackTrace();
    }
  }
}
