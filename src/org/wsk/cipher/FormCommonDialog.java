package org.wsk.cipher;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class FormCommonDialog extends JDialog {
    private final JPanel contentPanel = new JPanel();




    /**
     * Create the dialog.
     */
    public FormCommonDialog(String msg) {
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setTitle("\u63D0\u793A");
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setLayout(new FlowLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        {
            JScrollPane scrollPane = new JScrollPane();
            scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
            contentPanel.add(scrollPane);
            {
                JTextArea textArea = new JTextArea();
                textArea.setText(msg);
                textArea.setEditable(false);
                scrollPane.setViewportView(textArea);
            }
        }
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }
}
