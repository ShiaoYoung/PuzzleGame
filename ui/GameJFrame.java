package ui;

import javax.swing.*;
import java.awt.*;

public class GameJFrame extends JFrame{

    public GameJFrame(){
        //初始化窗口
        initJFrame();

        //初始化菜单
        initMenu();

        //添加图片
        initImage();


        //窗口可见
        this.setVisible(true);
    }

    private void initImage() {
        //
        ImageIcon image = new ImageIcon("D:\\JAVA\\PazzleGame\\image\\animal\\animal3\\all.jpg");

        //
        JLabel jLabel = new JLabel(image);

        //
        this.add(jLabel);
    }

    private void initMenu() {
        //新建JMenuBar
        JMenuBar jMenuBar = new JMenuBar();
        //新建JMenu
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        //新建JMenuItem
        JMenuItem replayItem = new JMenu("重新游戏");
        JMenuItem reLoginItem = new JMenu("重新登陆");
        JMenuItem exitItem = new JMenu("关闭游戏");

        JMenuItem aboutItem = new JMenu("公众号");

        //把JMenuItem放到JMenu内
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(exitItem);

        aboutJMenu.add(aboutItem);

        //再把JMenu放到JMenuBar内
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //设置JMenuBar菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置窗口宽高
        this.setSize(603,680);
        //设置标题
        this.setTitle("拼图小游戏");
        //设置置顶
        this.setAlwaysOnTop(true);
        //设置居中
        this.setLocationRelativeTo(null);
        //设置关闭窗口的操作
        this.setDefaultCloseOperation(3);
    }
}
