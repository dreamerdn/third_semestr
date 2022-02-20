package L7;

import javax.swing.*;
public class DataExeption extends Exception{
    private String info;

    public DataExeption (String str){
        info = str;
    }

    public void getInfo(){
        JOptionPane.showMessageDialog(null, this.info, "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
}
