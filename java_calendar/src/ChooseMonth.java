import javax.swing.*;

public class ChooseMonth extends JFrame {
    int width=500;
    int height=500;
    public ChooseMonth(Calendar[] calendar){
        this.setTitle("ChooseMonth");
        this.setLayout(null);
        this.setSize(width, height);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label=new JLabel("Enter month:");
        label.setBounds(10,250,100,20);
        this.add(label);
        JTextField text = new JTextField();
        text.setText(" ");
        text.setBounds(10+100, 250, 50, 20);
        JButton button = new JButton("Enter!");
        button.setBounds(10+100+100, 225, 100, 50);
        button.addActionListener(e ->{
            if (text.getText().trim() != "") {
                calendar[(Integer.valueOf(text.getText().trim()))].setVisible(true);

            }
        });
        this.add(text);
        this.add(button);



    }
}
