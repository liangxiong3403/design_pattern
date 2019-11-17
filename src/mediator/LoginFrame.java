package mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author liangxiong
 * @date 2019-11-16 11:01
 * @description 具体仲裁者, 代表登录框
 **/
public class LoginFrame extends Frame implements ActionListener, Mediator {

    private ColleagueCheckbox checkGuest;

    private ColleagueCheckbox checkLogin;

    private ColleagueTextField textUsername;

    private ColleagueTextField textPassword;

    private ColleagueButton buttonOk;

    private ColleagueButton buttonCancel;

    public LoginFrame(String title) throws HeadlessException {
        // 设置标题
        super(title);
        // 设置背景色
        setBackground(Color.lightGray);
        // 设置窗口位置
        setLocation(900, 400);
        // 设置布局
        setLayout(new GridLayout(4, 2));
        // 生成colleague
        createColleagues();
        // 配置
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username: "));
        add(textUsername);
        add(new Label("Password: "));
        add(textPassword);
        add(buttonOk);
        add(buttonCancel);
        // 设置控件初始状态
        colleagueChanged();
        // 显示
        pack();
        setVisible(true);
    }

    /**
     * 创建控件
     */
    @Override
    public void createColleagues() {
        CheckboxGroup group = new CheckboxGroup();
        // 创建控件
        checkGuest = new ColleagueCheckbox("Guest", group, true);
        checkLogin = new ColleagueCheckbox("Login", group, false);
        textUsername = new ColleagueTextField("", 10);
        textPassword = new ColleagueTextField("", 10);
        textPassword.setEchoChar('*');
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");
        // 设置控件的仲裁者
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUsername.setMediator(this);
        textPassword.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        // 设置listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUsername.addTextListener(textUsername);
        textPassword.addTextListener(textPassword);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    /**
     * 仲裁事件
     */
    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            // 游客模式
            textUsername.setColleagueEnabled(false);
            textPassword.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        } else {
            // 登录模式
            textUsername.setColleagueEnabled(true);
            usernameAndPasswordChanged();
        }
    }

    /**
     * 用户名和密码发生改变
     */
    private void usernameAndPasswordChanged() {
        // 输入了用户名
        if (textUsername.getText().length() > 0) {
            // 启用密码文本框
            textPassword.setColleagueEnabled(true);
            if (textPassword.getText().length() > 0) {
                // 输入了密码
                buttonOk.setColleagueEnabled(true);
            } else {
                // 禁用按钮
                buttonOk.setColleagueEnabled(false);
            }
        } else {
            // 禁用按钮
            textPassword.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
