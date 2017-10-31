import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by fk1836ql on 10/24/2017.
 */
public class HelloGUI extends JFrame{
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;

    int timesClicked = 0;

    protected HelloGUI(){
        setTitle("My first GUI!");
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timesClicked++;
                myFirstLabel.setText("The button was clicked " + timesClicked + " times.");
            }
        });
    }
}
