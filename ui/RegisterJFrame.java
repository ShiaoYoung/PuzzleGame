package ui;

import javax.swing.*;
import java.util.ResourceBundle;

public class RegisterJFrame extends JFrame{

    public RegisterJFrame(){
        //设置窗口宽高
        this.setSize(488,500);
        //设置标题
        this.setTitle("拼图小游戏");
        //设置置顶
        this.setAlwaysOnTop(true);
        //设置居中
        this.setLocationRelativeTo(null);
        //设置关闭窗口的操作
        this.setDefaultCloseOperation(3);

        //窗口可见
        this.setVisible(true);
    }
}
