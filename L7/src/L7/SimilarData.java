package L7;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class SimilarData extends JFrame{
    JTable similarTable;
    PaintTableModel stm;

    public SimilarData(ArrayList<Paint> similarArrayList){
        super("Similar paints");
        setSize(new Dimension(600, 300));
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        stm = new PaintTableModel();
        similarTable = new JTable(stm); // у этой таблицы будет вот такая модель
        add(new JScrollPane(similarTable), BorderLayout.CENTER);
        for(int i = 0; i < similarArrayList.size();i++){
            stm.addData(similarArrayList.get(i));
        }
    }
}