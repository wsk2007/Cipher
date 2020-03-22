/*
 *
 *     WSKCipher
 *     A tool to encrypt and decrypt text.
 *     Copyright (c) 2020 wsk
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 *     Contact me : Wechat: vic20070927 Phone: 18514463331
 *
 *     WSKCipher
 *     加解密工具
 *     版权所有（C）2020 wsk
 *     本程序为自由软件，在自由软件联盟发布的GNU通用公共许可协议的约束下，你可以对其进行再发布及修改。协议版本为第三版或（随你）更新的版本。
 *     我们希望发布的这款程序有用，但不保证，甚至不保证它有经济价值和适合特定用途。详情参见GNU通用公共许可协议。
 *     你理当已收到一份GNU通用公共许可协议的副本，如果没有，请查阅<http://www.gnu.org/licenses/>
 *
 *     联系方式： 微信：vic20070927 电话：18514463331
 */

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
