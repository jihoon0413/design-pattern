package org.example.design_pattern._19_state;

public class UrgentState implements State{
    private static UrgentState singleton = new UrgentState();

    private UrgentState() {};

    public static UrgentState getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {

    }

    @Override
    public void doUse(Context context) {
        context.callSecurity("비상: 비상시 금고 사용!");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurity("비상벨(비상)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurity("일반 통화(비상시)");
    }

    @Override
    public String toString() {
        return "[비상시]";
    }
}
