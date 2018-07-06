package com.fun.view;

import javax.swing.*;
import java.awt.*;

/**
 * @program: PojoTools
 * @description: 数据库信息界面
 * @author: Mengqiu.Liu
 * @email: blackblackline@163.com
 * @create: 2018-07-06 15:57
 **/
public class DbView {

    public void drawFrame() {
        // TODO Auto-generated method stub
        JFrame f = new JFrame();
        Container con = f.getContentPane();//生成一个容器
        con.setLayout(new GridLayout(7, 1));
        JPanel pan1 = new JPanel();//生成一个新的版面
        JLabel title = new JLabel("");
        title.setFont(new Font("宋体", Font.BOLD, 20));
        pan1.add(title);
        con.add(pan1);
        //最上面的登陆文字

        JPanel ulrPan = new JPanel();//生成一个新的版面
        JLabel url = new JLabel("数据库URL:");
        ulrPan.add(url);
        TextField tf_url = new TextField(20);
        tf_url.setText("请输入URL");
        ulrPan.add(tf_url);
        con.add(ulrPan);
        //用户名及其文本框放置在第二个版面上

        JPanel namePan = new JPanel();//生成一个新的版面
        JLabel name = new JLabel("数据库URL:");
        namePan.add(name);
        TextField tf_name = new TextField(20);
        tf_name.setText("请输入URL");
        namePan.add(tf_name);
        con.add(namePan);


        JPanel pan3 = new JPanel();//生成一个新的版面
        JLabel pass = new JLabel("用户名:");
        pan3.add(pass);
        JPasswordField password = new JPasswordField(15);
        password.setEchoChar('*');
        pan3.add(password);
        con.add(pan3);
//密码及其密码域放在第三个版面上


        JPanel pan4 = new JPanel();
        JButton b_log = new JButton("登陆");
        pan4.add(b_log);
        JButton b_exit = new JButton("退出");
        pan4.add(b_exit);
        con.add(pan4);
//登陆和退出这两个按钮放在第四个版面上

        JPanel pan5 = new JPanel();
        con.add(pan5);
        JPanel pan6 = new JPanel();
        con.add(pan6);

        //空白版面
        f.setTitle("系统登录界面");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setExtendedState(JFrame.NORMAL);
        f.setVisible(true);

        //设置窗口的大小和位置
        f.setSize(400, 400);
        f.setLocation(200, 200);
    }
}
