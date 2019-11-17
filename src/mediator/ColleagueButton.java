package mediator;

import java.awt.*;

/**
 * @author liangxiong
 * @date 2019-11-16 10:43
 * @description 组员具体类, 代表按钮
 **/
public class ColleagueButton extends Button implements Colleague {

    /**
     * 仲裁者
     */
    private Mediator mediator;

    /**
     * 设置控件名称
     *
     * @param label 控件名称
     * @throws HeadlessException
     */
    public ColleagueButton(String label) throws HeadlessException {
        super(label);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
