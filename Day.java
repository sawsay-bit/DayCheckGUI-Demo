import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Day implements ActionListener{
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel enterDate;
    private static JTextField date;
    private static JButton button;
    private static JLabel answer;
    public static void main(String[] args){
        frame = new JFrame();
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.darkGray);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("day check");
        frame.setSize(300,180);
        frame.setBackground(Color.red);
        frame.add(panel);

        enterDate = new JLabel("Enter date");
        enterDate.setBounds(10,20,150,25);
        panel.add(enterDate);

        date = new JTextField(20);
        date.setBounds(100,20,80,25);
        panel.add(date);

        button = new JButton("Check");
        button.setBounds(100,70,70,25);
        button.addActionListener(new Day());
        panel.add(button);

        answer = new JLabel("");
        answer.setBounds(100,100,165,25);
        panel.add(answer);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(date.getText());
        switch(num){
            case 1:
                answer.setText("Monday");
                break;
            case 2:
                answer.setText("Tuesday");
                break;
            case 3:
                answer.setText("Wednesday");
                break;
            case 4:
                answer.setText("Thursday");
                break;
            case 5:
                answer.setText("Friday");
                break;
            case 6:
                answer.setText("Saturday");
                break;
            case 7:
                answer.setText("Sunday");
                break;
            default:
                answer.setText("Try again");
        }
    }
}