import javax.swing.JOptionPane;

public class ConfirmDialog1 {

    public static void main(String[] args) {

        int input = JOptionPane.showConfirmDialog(null, "Do you like bacon?");
// 0 = да, 1 = нет, 2 = отменить
        //System.out.println(input);

    }
}