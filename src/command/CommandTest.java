package command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author liangxiong
 * @date 2019-11-17 10:19
 * @description
 **/
public class CommandTest extends JFrame implements ActionListener {

    /**
     * 历史命令集合
     */
    private MacroCommand history = new MacroCommand();

    /**
     * 绘制区域
     */
    private DrawCanvas canvas = new DrawCanvas(800, 400, history);

    /**
     * 删除按钮
     */
    private JButton clearButton = new JButton("clear");

    /**
     * 撤销按钮
     */
    private JButton undoButton = new JButton("undo");

    /**
     * 切换画笔颜色
     */
    private JButton changColorButton = new JButton("changColor");

    public CommandTest(String title) throws HeadlessException {
        super(title);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        canvas.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Command command = new DrawCommand(canvas, e.getPoint());
                history.append(command);
                command.execute();
            }
        });
        clearButton.addActionListener(this);
        undoButton.addActionListener(this);
        changColorButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(undoButton);
        buttonBox.add(changColorButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new CommandTest("Command Pattern Sample");
    }

    /**
     * 监听按钮事件
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            // 清除事件
            history.clear();
            canvas.repaint();
        } else if (e.getSource() == undoButton) {
            // 撤销上一次操作
            history.undo();
            canvas.setColor(Color.red);
            canvas.repaint();
        } else if (e.getSource() == changColorButton) {
            // 切换颜色
            ColorCommand command = new ColorCommand(Color.blue, canvas);
            command.execute();
        }
    }

}
