// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Calendar[] calendar = new Calendar[12];
        for (int i = 0; i < 12; i++)
            calendar[i] = new Calendar(i + 1);
        ChooseMonth chooseMonth = new ChooseMonth(calendar);


    }
}