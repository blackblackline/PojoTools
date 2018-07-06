package com.fun.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program: PojoTools
 * @description: 数据库信息界面
 * @author: Mengqiu.Liu
 * @email: blackblackline@163.com
 * @create: 2018-07-06 15:57
 **/
public class DbView {

    private String userName;
    private String pwd;
    private String dbUrl;
    private String dbType;

    public void drawFrame() {
        // TODO Auto-generated method stub
        JFrame f = new JFrame();
        final Container con = f.getContentPane();//生成一个容器
        con.setLayout(new GridLayout(7, 1));
        JPanel pan1 = new JPanel();//生成一个新的版面
        JLabel title = new JLabel("");
        title.setFont(new Font("宋体", Font.BOLD, 20));
        pan1.add(title);
        con.add(pan1);
        //最上面的登陆文字

        final JPanel ulrPan = new JPanel();//生成一个新的版面
        final JLabel url = new JLabel("        URL:");
        ulrPan.add(url);
        final JTextField tf_url = new JTextField(20);
        tf_url.setText("请输入URL");
        ulrPan.add(tf_url);
        con.add(ulrPan);
        //用户名及其文本框放置在第二个版面上

        JPanel namePan = new JPanel();//生成一个新的版面
        JLabel name = new JLabel("    用户名:");
        namePan.add(name);
        final JTextField tf_name = new JTextField(20);
        tf_name.setText("请输入用户名");
        namePan.add(tf_name);
        con.add(namePan);


        JPanel pan3 = new JPanel();//生成一个新的版面
        JLabel pass = new JLabel("        密码:");
        pan3.add(pass);
        final JTextField password = new JTextField(20);
        pan3.add(password);
        con.add(pan3);
        //密码及其密码域放在第三个版面上

        JPanel pan5 = new JPanel();//生成一个新的版面
        JLabel typeLabel = new JLabel("        类型:");
        pan5.add(typeLabel);
        String[] items = {"                 ORACLE                 ","                 MYSQL                 "};
        final JComboBox<String> jComboBox = new JComboBox(items);  //参数是下拉列表的选项
        jComboBox.setBounds(0,0,400,20);
        pan5.add(jComboBox);
        con.add(pan5);

        JPanel pan4 = new JPanel();
        JButton b_log = new JButton("登陆");
        b_log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbUrl = tf_url.getText();
                userName = tf_name.getText();
                pwd = password.getText();
                dbType = (String) jComboBox.getSelectedItem();
                System.out.println(dbUrl+'-'+userName+'-'+pwd+'-'+dbType);
                con.removeAll();
                con.repaint();

            }
        });

        JPanel pan6 = new JPanel();
        JLabel tabLabel = new JLabel("        表名:");
        pan6.add(tabLabel);
        JTextField tabName = new JTextField(20);
        pan6.add(tabName);
        con.add(pan6);


        pan4.add(b_log);
        JButton b_exit = new JButton("退出");
        b_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        pan4.add(b_exit);
        con.add(pan4);
//登陆和退出这两个按钮放在第四个版面上


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
