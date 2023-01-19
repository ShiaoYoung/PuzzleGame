package ui;

import javax.swing.*;

public class LoginJFrame extends JFrame{

    public LoginJFrame(){
        //设置窗口宽高
        this.setSize(488,430);
        //设置标题
        this.setTitle("登录");
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
