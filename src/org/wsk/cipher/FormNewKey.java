package org.wsk.cipher;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class FormNewKey extends JFrame {
    private JPanel contentPane;


    /**
     * Create the frame.
     */
    public FormNewKey() {
        setTitle("\u52A0\u89E3\u5BC6---\u521B\u5EFA\u65B0\u79D8\u94A5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 259, 132);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblNewLabel = new JLabel("\u4F60\u8981\u521B\u5EFA\u54EA\u4E2A\u79D8\u94A5\uFF1F");

        JButton newAESKey = new JButton("AES");

        JButton newRSAKey = new JButton("RSA");
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(26)
                                .addComponent(newAESKey)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(newRSAKey)
                                .addGap(33))
                        .addGroup(GroupLayout.Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                .addContainerGap(63, Short.MAX_VALUE)
                                .addComponent(lblNewLabel)
                                .addGap(62))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNewLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(newAESKey)
                                        .addComponent(newRSAKey))
                                .addContainerGap(333, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
