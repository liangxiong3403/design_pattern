package state;

/**
 * @author liangxiong
 * @date 2019-11-16 19:50
 * @description 管理状态和联系报警中心
 **/
public interface Context {

    /**
     * 设置时间
     *
     * @param hour
     */
    void setClock(int hour);

    /**
     * 修改金库状态
     *
     * @param state
     */
    void changeState(State state);

    /**
     * 呼叫报警中心
     *
     * @param message 通话信息
     */
    void callSecurityCenter(String message);

    /**
     * 报警中心记录日志
     *
     * @param message 日志信息
     */
    void recordLog(String message);
}
