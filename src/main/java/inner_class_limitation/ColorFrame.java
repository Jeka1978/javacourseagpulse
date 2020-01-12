package inner_class_limitation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {
    public ColorFrame(int[] counter) throws HeadlessException {
        JButton button = new JButton("click to change color");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ColorFrame.this.getContentPane().setBackground(Color.BLUE);
                System.out.println(counter[0]++);
            }
        });

        this.add(button, BorderLayout.NORTH);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ColorFrame(new int[]{0});
    }
}
