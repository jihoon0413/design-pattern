package org.example.design_pattern._19_state;

public class DayState implements State{
    private static DayState singleton = new DayState();

    private DayState() {}

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if(hour < 9 || hour >= 17) {
            context.changeState(NightState.getInstance());
        } else if (12 <= hour && hour < 13) {
            context.changeState(NoonState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고 사용(주간)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurity("비상벨(주간)");
        context.changeState(UrgentState.getInstance());
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurity("일반 통화(주간)");
    }

    @Override
    public String toString() {
        return "[주간]";
    }
}
