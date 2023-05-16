package ch20.Sample;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
  // 이미 만든 BigChar 인스턴스를 관리
  private Map<String, BigChar> pool = new HashMap<>(); // key와 value 쌍을 관리

  // Singleton 패턴
  private static BigCharFactory singleton = new BigCharFactory();

  // 생성자 // private
  private BigCharFactory() {
  }

  // 유일한 인스턴스를 얻는다
  public static BigCharFactory getInstance() {
    return singleton;
  }

  // ⭐️ BigChar 인스턴스 생성(공유)-FlyWeight 패턴의 핵심 부분!!
  public synchronized BigChar getBigChar(char charname) { // '1'
  //synchronized: 여러 스레드가 동시에 Char 요청시 한 스레드만 들어가서 작업가능
  
    
    // pool 에서 먼저 검색(get 메소드)
    BigChar bc = pool.get(String.valueOf(charname)); // 해시맵의 key:String // "1"


    if (bc == null) { // 검색한 결과가 없다면..

      // 여기서 BigChar 인스턴스를 생성
      bc = new BigChar(charname);
      pool.put(String.valueOf(charname), bc); // key, value로 해시맵에 삽입.
    }
    return bc;
  }
}
