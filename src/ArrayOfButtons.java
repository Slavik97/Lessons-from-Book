import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArrayOfButtons extends JFrame {

    static JFrame frame = new JFrame();

    static JButton [][] btn = new JButton[10][10];
    static JButton btn1 = new JButton("Start");

    static int [][] btns = new int[10][10];

    public static int i,j,k,l,m;

    public static void main(String[] args) {
        frame.setBounds(400,420,350,350);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(null);

        for (i = 0; i < 10; i++){
            for (j = 0; j < 10; j++){
                btn[i][j] = new JButton();
                btn[i][j].setBounds(10 + i * 20, 20 + j * 20, 15, 15);
                frame.add(btn[i][j]);
            }
        }

        btn1.setBounds(220,100,100,30);
        frame.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (i = 0; i < 10; i++){
                    for (j = 0; j < 10; j++){
                        if (i % 2 == 0 || j % 2 == 0){
                            btn[i][j].setBackground(Color.RED);
                        } else if (i % 2 != 0 | j % 2 != 0){
                            btn[i][j].setBackground(Color.MAGENTA);
                        }
                    }
                }
            }
        });

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                btn[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        for (i = 0; i < 10; i++) {
                            for (j = 0; j < 10; j++) {
                               if (i % 2 == 0 || j % 2 ==0) {
                                   btn[i][j].setBackground(Color.YELLOW);
                               }
                               else if (i % 2 != 0 || j % 2 != 0){
                                   btn[i][j].setBackground(Color.BLACK);
                               }

                            }
                        }
                    }
                });
            }

        }

        frame.setVisible(true);
    }
}
