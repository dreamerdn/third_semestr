package L7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Visitor {
    JButton addButton, deleteButton, clearButton, similarButton;
    static JTextField newPaint, newArtist, newYear, newColor, newSize;
    static JLabel l1, l2, l3, l4, l5;

    JFrame frame;
    JPanel panelButton, panelButton1;
    JTable PaintTable;

    PaintTableModel atm;
    Paint paint = null;
    Paint paint1 = null, paint2 = null, paint3 = null, paint4 = null, paint5 =null;

    public Visitor() {
        frame = new JFrame("КАРТИННАЯ ГАЛЕРЕЯ");
        frame.setSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        addButton = new JButton("Добавить");
        addButton.addActionListener(new AddActionListener());
        deleteButton = new JButton("Удалить");
        deleteButton.addActionListener(new DeleteActionListener());

        clearButton = new JButton("Очистить");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atm.clear();
                atm.fireTableDataChanged();
            }
        });

        similarButton = new JButton("Поиск");
        similarButton.addActionListener(new SearchActionListener());

        atm = new PaintTableModel();
        PaintTable = new JTable(atm); // у этой таблицы будет вот такая модель
        frame.add(new JScrollPane(PaintTable), BorderLayout.CENTER);
        frame.setVisible(true);

        try {
            paint = new Paint("Звёздная ночь", "Ван Гог", "1889", "масляные", "120_80");
            paint1 = new Paint("Девятый вал", "Айвазовский", "1850", "акрил", "100_78");
            paint2 = new Paint("Утро в сосновом лесу", "Шишкин", "1889", "акварель", "60_80");
            paint3 = new Paint("Чёрный квадрат", "Малевич", "1951", "акрил", "50_70");
            paint4 = new Paint("Подсолнухи", "Ван Гог", "1878", "масляные", "69_92");
            paint5 = new Paint("Джаконда", "Леонардо да Винчи", "1503", "акрил", "110_87");
        } catch (DataExeption dataExeption) {
            dataExeption.getInfo();
        }
        atm.addData(paint);
        atm.addData(paint1);
        atm.addData(paint2);
        atm.addData(paint3);
        atm.addData(paint4);
        atm.addData(paint5);

        newPaint = new JTextField(15);
        newArtist = new JTextField(15);
        newYear = new JTextField(15);
        newColor= new JTextField(15);
        newSize = new JTextField(15);

        l1 = new JLabel("Картина");
        l2 = new JLabel("Автор");
        l3 = new JLabel("Год");
        l4 = new JLabel("Тип краски");
        l5 = new JLabel("Диагональ картины");

        panelButton = new JPanel();
        panelButton.setLayout(new GridLayout());

        panelButton.add(addButton);
        panelButton.add(similarButton);
        panelButton.add(deleteButton);
        panelButton.add(clearButton);
        panelButton.setVisible(true);
        frame.add(panelButton, BorderLayout.PAGE_END);

        panelButton1 = new JPanel();
        panelButton1.setLayout(new BoxLayout(panelButton1,BoxLayout.Y_AXIS));

        panelButton1.add(l1);
        panelButton1.add(newPaint);
        panelButton1.add(l2);
        panelButton1.add(newArtist);
        panelButton1.add(l3);
        panelButton1.add(newYear);
        panelButton1.add(l4);
        panelButton1.add(newColor);
        panelButton1.add(l5);
        panelButton1.add(newSize);

        panelButton.setVisible(true);
        frame.add(panelButton1, BorderLayout.LINE_END);
        frame.pack();
    }

    public class SearchActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String searchInfo = JOptionPane.showInputDialog(null, "Введите тип краски для поиска",
                    "Поиск", JOptionPane.QUESTION_MESSAGE);
            ArrayList<Paint> similarArrayList = atm.findSimilar(searchInfo);
            SimilarData similarData = new SimilarData(similarArrayList);
            similarData.setVisible(true);
            similarData.setLocationRelativeTo(null);
        }
    }
    public class AddActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String paint = newPaint.getText();
            String artist = newArtist.getText();
            String year = newYear.getText();
            String color = newColor.getText();
            String size= newSize.getText();

            try {
                atm.addData(new Paint(paint, artist, year, color, size));
            } catch (DataExeption dataExeption) {
                dataExeption.getInfo();
            }
            atm.fireTableDataChanged();
            newPaint.setText("");
            newArtist.setText("");
            newYear.setText("");
            newColor.setText("");
            newSize.setText("");
        }

    }
    public class DeleteActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int i = PaintTable.getSelectedRow();
            if(i>=0){
                atm.removeRow(i);
                atm.fireTableDataChanged();
            }
            else JOptionPane.showMessageDialog(null, "Выберите строку для удаления", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }
}
