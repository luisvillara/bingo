/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.gui;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Luis
 */
public class ClientsTable extends AbstractTableModel {
    private String[] columnNames = {"#",
                        "IP",
                        "Nombre",
                        "Puerto"};
   
    private Vector data;
    
    public ClientsTable(){
        super();
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
       //all cells false
       return false;
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
    public String getColumnName(int columnIndex) {
      return columnNames[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ClientsTable.Data datos = (ClientsTable.Data) (data.elementAt(rowIndex));
        switch (columnIndex) {
        case 0:
          return datos.getNum();
        case 1:
          return datos.getIp();
        case 2:
          return datos.getNombre();
        case 3:
          return datos.getPuerto();
        }
        return new String();
    }
    
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        ClientsTable.Data datos = (ClientsTable.Data) (data.elementAt(rowIndex));
        switch (columnIndex) {
        case 0:
          datos.setNum((Integer) value);
          break;
        case 1:
          datos.setIp((String) value);
          break;
        case 2:
          datos.setNombre((String) value);
          break;
        case 3:
          datos.setPuerto((Integer) value);
          break;
        }
    }

    public void setData(Vector data) {
        this.data = data;
    }
    
    public class Data{
        private int num;
        private String ip;
        private String nombre;
        private int puerto;
        
        public Data(){
        }

        public Data(int num, String ip, String nombre, int puerto) {
            this.num = num;
            this.ip = ip;
            this.nombre = nombre;
            this.puerto = puerto;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getPuerto() {
            return puerto;
        }

        public void setPuerto(int puerto) {
            this.puerto = puerto;
        }
        

    }
}
