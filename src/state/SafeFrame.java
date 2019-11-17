package state;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author liangxiong
 * @date 2019-11-16 20:14
 * @description 警报系统界面
 **/
public class SafeFrame extends Frame implements ActionListener, Context {

    /**
     * 显示当前时间
     */
    private TextField clockText = new TextField(60);

    /**
     * 显示报警中心日志记录
     */
    private TextArea screenText = new TextArea(10, 60);

    private Button buttonUse = new Button("使用金库");

    private Button buttonAlarm = new Button("按下警铃");

    private Button buttonPhone = new Button("正常通话");

    private Button buttonExit = new Button("结束");

    /**
     * 初始状态
     */
    private State state = DayState.getInstance();

    public SafeFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(clockText, BorderLayout.NORTH);
        clockText.setEditable(false);
        add(screenText, BorderLayout.CENTER);
        screenText.setEditable(false);
        // 界面添加按钮
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        // 配置界面
        add(panel, BorderLayout.SOUTH);
        // 显示
        pack();
        setVisible(true);
        // 设置监听器
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void setClock(int hour) {
        String clock = "现在时间是: ";
        if (hour < 10) {
            clock += "0" + hour + ":00";
        } else {
            clock += hour + ":00";
        }
        System.out.println(clock);
        clockText.setText(clock);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("从" + this.state + "状态变为了" + state + "状态");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String message) {
        screenText.append("call! " + message + "\n");
    }

    @Override
    public void recordLog(String message) {
        screenText.append("record..." + message + "\n");
    }

    /**
     * 监听按钮事件
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse) {
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }
}
