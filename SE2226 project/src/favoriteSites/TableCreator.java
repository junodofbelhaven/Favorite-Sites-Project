/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package favoriteSites;

/**
 *
 * @author anil
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

public class TableCreator extends AbstractTableModel {

    private ResultSet resultSet;
    private Statement statement;

    public TableCreator(ResultSet rs, Statement stmt) {
        this.resultSet = rs;
        this.statement = stmt;
    }

    @Override
    public int getRowCount() {
        try {
            resultSet.last();
            int rowCount = resultSet.getRow();
            resultSet.beforeFirst(); 
            return rowCount;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    @Override
    public int getColumnCount() {
        try {
            if (resultSet == null) {
                return 0;
            } else {
                return resultSet.getMetaData().getColumnCount();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            resultSet.absolute(rowIndex + 1); 
            return resultSet.getObject(columnIndex + 1);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    
    @Override
    public String getColumnName(int column) {
        try {
            return resultSet.getMetaData().getColumnName(column + 1);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "";
        }
    }

}