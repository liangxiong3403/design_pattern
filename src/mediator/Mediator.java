package mediator;

/**
 * @author liangxiong
 * @date 2019-11-16 10:37
 * @description 仲裁者接口
 **/
public interface Mediator {

    /**
     * 创建组员
     */
    void createColleagues();

    /**
     * 组员上报事件
     */
    void colleagueChanged();
}
