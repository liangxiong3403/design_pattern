package mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @author liangxiong
 * @date 2019-11-16 10:56
 * @description 组员具体类, 代表单选框
 **/
public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {

    /**
     * 仲裁者实例
     */
    private Mediator mediator;

    public ColleagueCheckbox(String label, CheckboxGroup group, boolean state) throws HeadlessException {
        super(label, group, state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    /**
     * 状态发生变化时通知仲裁者
     *
     * @param e
     */
    @Override
    public void itemStateChanged(ItemEvent e) {
        this.mediator.colleagueChanged();
    }
}
