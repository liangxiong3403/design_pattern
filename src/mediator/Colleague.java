package mediator;

/**
 * @author liangxiong
 * @date 2019-11-16 10:42
 * @description 组员接口
 **/
public interface Colleague {

    /**
     * 设置仲裁者
     *
     * @param mediator 仲裁者实例
     */
    void setMediator(Mediator mediator);

    /**
     * 执行仲裁者指示
     *
     * @param enabled true:启动控件,false:禁用控件
     */
    void setColleagueEnabled(boolean enabled);
}
