package ch15.A2.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
  private PageMaker() {
  }

  public static void makeWelcomePage(String mailaddr, String filename) {
    try {
      Properties mailprop = Database.getProperties("maildata");
      String username = mailprop.getProperty(mailaddr);
      HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
      writer.title(username + "'s web page");
      writer.paragraph("Welcome to " + username + "'s web page!");
      writer.paragraph("Nice to meet you!");
      writer.mailto(mailaddr, username);
      writer.close();
      System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void makeLinkPage(String filename) {
    try {
      HtmlWriter writer = new HtmlWriter(new FileWriter(filename)); // web page 파일 이름을 받음.

      writer.title("Link page");

      Properties mailprop = Database.getProperties("maildata"); // maildata의 내용을 가져옴.

      for (String mailaddr : mailprop.stringPropertyNames()) { // stringPropertyNames: 프로퍼티의 key만 문자열로 return
        // 원소 : 컬렉션 으로, 하나씩 접근
        String username = mailprop.getProperty(mailaddr, "(unknown)");  // mailaddr을 이용해서 프로퍼티에 접근
        // mailaddr로 찾았는데, 값이 없다면 기본값으로 (unknown)을 설정하겠음
        writer.mailto(mailaddr, username);
      }

      writer.close();
      System.out.println(filename + " is created.");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
