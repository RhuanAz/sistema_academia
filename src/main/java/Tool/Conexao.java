package Tool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    public Connection connectDB(){
        String url = ("jdbc:postgresql://200.18.128.54/aula");
        Connection con = null;
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Conexao -> connectDB: " + erro.getMessage());
        }
        
        return con;
    }
}

