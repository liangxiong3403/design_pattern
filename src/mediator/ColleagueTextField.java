package mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * @author liangxiong
 * @date 2019-11-16 10:48
 * @description 组员具体类, 代表文本框
 **/
public class ColleagueTextField extends TextField implements TextListener, Colleague {

    /**
     * 仲裁者实例
     */
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) throws HeadlessException {
        super(text, columns);
    }

    /**
     * 文本框内容发生改变
     *
     * @param e
     */
    @Override
    public void textValueChanged(TextEvent e) {
        this.mediator.colleagueChanged();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        // 控制背景颜色
        setBackground(enabled ? Color.white : Color.lightGray);
    }
}
