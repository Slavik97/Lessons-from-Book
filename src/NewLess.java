import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewLess extends JFrame {

    private static JFrame frame = new JFrame("Interface");

    private static JTextField tf1 = new JTextField();
    private static JTextField tf2 = new JTextField();
    private static JTextField tf3 = new JTextField();

    private static JButton btn1 = new JButton("Click me");
    private static JButton btn2 = new JButton("Select color");

    public static void main(String[] args) {
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setBounds(100, 50, 300, 300);
    frame.setVisible(true);

        tf1.setBounds(50, 50, 100,25);
        frame.add(tf1);

        tf2.setBounds(50, 85,100,25);
        frame.add(tf2);

        btn1.setBounds(150,50,100,25);
        frame.add(btn1);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (tf2.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Пустое поле!");
                } else {
                    System.out.println(tf1.getText());
                }

                if (tf1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Пустое поле!");
                } else {
                    btn1.setText("" + tf2.getText());
//                    tf2.setText("");
                }

            }
        });

        tf3.setBounds(50,120,100,25);
        frame.add(tf3);
        btn2.setBounds(150,120,100,25);
        frame.add(btn2);

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf3.getText();

                switch (s){

                    case "Red" :
                        btn2.setText(s);
                        btn2.setBackground(Color.RED);
                    break;

                    case "Green":
                        btn2.setText(s);
                        btn2.setBackground(Color.GREEN);
                    break;

                    case "Yellow":
                        btn2.setText(s);
                        btn2.setBackground(Color.YELLOW);
                     break;

                    case "Cyan" :
                        btn2.setText(s);
                        btn2.setBackground(Color.CYAN);
                     break;

                    case "Magenta" :
                        btn2.setText(s);
                        btn2.setBackground(Color.MAGENTA);
                     break;

                     default:
                         JOptionPane.showMessageDialog(null, "Неизвестный цвет");
                      break;
                }
            }
        });



    }
}
