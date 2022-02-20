package L7;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Collections;
public class PaintTableModel extends AbstractTableModel{
    private int columnCount = 5;
    private ArrayList<Paint> dataArrayList;

    public PaintTableModel(){
        dataArrayList = new ArrayList<Paint>();
    }
    @Override
    public int getRowCount() {
        return dataArrayList.size(); // количество строк
    }

    public Paint getRow(int i) {
        return dataArrayList.get(i); // возвращает строку с данными объекта
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Paint rows = dataArrayList.get(rowIndex);
        switch(columnIndex){
            case 0: return rows.getPaint();
            case 1: return rows.getArtist();
            case 2: return rows.getYear();
            case 3: return rows.getColor();
            case 4: return rows.getSize();
        }
        return "";
    }
    @Override
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "Картина";
            case 1: return "Автор";
            case 2: return "Год";
            case 3: return "Тип краски";
            case 4: return "Диагональ картины";
        }
        return "";
    }

    public void addData(Paint row){
        dataArrayList.add(row);
        Collections.sort(dataArrayList);
    }

    public ArrayList<Paint> findSimilar(String artist){
        ArrayList<Paint> similarArrayList = new ArrayList<Paint>();
        for(int i = 0; i < dataArrayList.size();i++) {
            Paint row = dataArrayList.get(i);
            String currArtist = (String) row.getArtist();
            if (currArtist.equals(artist)){
                similarArrayList.add(row);
            }
        }
        return similarArrayList;
    }

    public void clear() {
        dataArrayList.clear();
    }

    public void removeRow(int i) {
        dataArrayList.remove(i);
    }
}