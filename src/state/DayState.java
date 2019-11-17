package state;

/**
 * @author liangxiong
 * @date 2019-11-16 19:59
 * @description 表示白天的状态
 **/
public class DayState implements State {

    private static DayState state = new DayState();

    private DayState() {
    }

    public static DayState getInstance() {
        return state;
    }

    @Override
    public void doClock(Context context, int hour) {
        int start = 9;
        int end = 17;
        if (hour < start || hour >= end) {
            // 下班时间
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库(白天)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(白天)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话(白天)");
    }

    @Override
    public String toString() {
        return "DayState{}";
    }
}
