package ch19.Sample;

public class DayState implements State {
  private static DayState singleton = new DayState();

  private DayState() {
  }

  public static State getInstance() {
    return singleton;
  }

  @Override
  public void doClock(Context context, int hour) {
    if (hour < 8 || 9 <= hour) { // 야간에 해당되면
      context.changeState(NightState.getInstance()); // 야간 상태로 변경해라.
    }
  }

  @Override
  public void doUse(Context context) {
    context.recordLog("금고사용(주간)");
  }

  @Override
  public void doAlarm(Context context) {
    context.callSecurityCenter("비상벨(주간)");
  }

  @Override
  public void doPhone(Context context) {
    context.callSecurityCenter("일반 통화(주간)");
  }

  @Override
  public String toString() {
    return "[주간]";
  }
}
