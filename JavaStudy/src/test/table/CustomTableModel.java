package test.table;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class CustomTableModel extends AbstractTableModel {
    private List<Object[]> data;
    private String[] columnNames;

    public CustomTableModel(List<Object[]> data, String[] columnNames) {
        this.data = data;
        this.columnNames = columnNames;
    }

	@Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data.get(rowIndex)[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}