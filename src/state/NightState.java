package state;

/**
 * @author liangxiong
 * @date 2019-11-16 20:04
 * @description 表示晚上的状态
 **/
public class NightState implements State {

    private static NightState state = new NightState();

    private NightState() {
    }

    public static NightState getInstance() {
        return state;
    }

    @Override
    public void doClock(Context context, int hour) {
        int start = 9;
        int end = 17;
        if (start <= hour && hour < end) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("使用金库(晚上)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(晚上)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("通话录音(晚上)");
    }

    @Override
    public String toString() {
        return "NightState{}";
    }
}
