import javax.swing.*;

public class Cell extends JButton {
boolean isOccupied;
String task;
    public Cell(String number){
        setText(number);
        isOccupied=false;
        task="";
    }

}
