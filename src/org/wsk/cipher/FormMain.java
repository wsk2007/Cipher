package org.wsk.cipher;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormMain extends JFrame {
    private JPanel contentPane;

    /**
     * Launch the application.
     */


    /**
     * Create the frame.
     */
    public FormMain() {
        setTitle("\u52A0\u89E3\u5BC6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 446, 170);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JLabel lblNewLabel = new JLabel("\u6B22\u8FCE\u4F7F\u7528\u52A0\u89E3\u5BC6\u5DE5\u5177\uFF01");
        contentPane.add(lblNewLabel, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JButton load = new JButton("\u52A0\u8F7D\u5DF2\u6709\u79D8\u94A5");
        load.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                //TODO
            }
        });
        load.setFont(new Font("宋体", Font.BOLD, 30));
        panel.add(load);

        JButton create = new JButton("\u521B\u5EFA\u65B0\u79D8\u94A5");
        create.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //TODO
            }
        });
        create.setFont(new Font("宋体", Font.BOLD, 30));
        panel.add(create);
    }
}
