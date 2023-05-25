import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Calendar extends JFrame {

    WeekDays[] weekDays = new WeekDays[7];
    Cell[][] cell = new Cell[5][7];
    Month month;
    boolean monthSelected=false;
    int width = 700;
    int height = 700;
    int ct=1;

    public Calendar(int num) {

        this.month=new Month(num);
        this.setTitle("Calendar");
        this.setLayout(null);
        this.setSize(width, height);
        //this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        for (int i = 0; i < 7; i++) {
            if (i == 0)
                weekDays[i] = new WeekDays("Sun");
            else if (i == 1)
                weekDays[i] = new WeekDays("Mon");
            else if (i == 2)
                weekDays[i] = new WeekDays("Tue");
            else if (i == 3)
                weekDays[i] = new WeekDays("Wen");
            else if (i == 4)
                weekDays[i] = new WeekDays("Thu");
            else if (i == 5)
                weekDays[i] = new WeekDays("Fri");
            else if (i == 6)
                weekDays[i] = new WeekDays("Sat");
            weekDays[i].setBounds(width / 7 * i, 0, width / 7, 50);

            this.add(weekDays[i]);
        }

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 7; j++) {
                if((i*7+j)>=month.starting&&ct<= month.ending) {
                    cell[i][j] = new Cell(Integer.toString(ct));
                    ct++;
                }
                else cell[i][j]= new Cell("");
                cell[i][j].setBounds(width / 7 * j, (height - 50) / 7 * i + 50,
                        width / 7 - 10, (height - 50) / 7 - 10);
                int finalI = i;
                int finalJ = j;
                if(cell[i][j].getText()!="")
                cell[i][j].addActionListener((e) -> {
                    JFrame frame = new JFrame();
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.setLayout(null);
                    frame.setSize(400, 400);
                    frame.setVisible(true);
                    JLabel label = new JLabel();
                    JTextField text = new JTextField();
                    text.setText(" ");
                    text.setBounds(10, 40, 300, 20);
                    JButton button = new JButton();
                    button.setBounds(50, 300, 100, 50);

                    if (cell[finalI][finalJ].task == "") {
                        label.setText("Add task for this day:");
                        frame.add(text);
                        button.setText("Set task!");
                        button.addActionListener(a -> {
                            if (text.getText().trim() != "") {
                                cell[finalI][finalJ].task = text.getText();
                                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                            }
                        });
                    } else {
                        label.setText("Task for this date is: " + cell[finalI][finalJ].task);
                        button.setText("Go back!");
                        button.addActionListener(a -> {
                            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                        });
                    }
                    label.setBounds(10, 20, 300, 20);


                    frame.add(label);
                    frame.add(button);
                    // if(cell.isOccupied)
                });
                this.add(cell[i][j]);
    }


    }

}
