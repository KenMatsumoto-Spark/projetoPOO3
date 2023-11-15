package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Quarto;

public class DaoQuarto {

    private Connection conn;
    
    public DaoQuarto(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Quarto quarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbquarto(NUMERO, VALORDIARIA, TIPO) VALUES(?,?,?,?,?)");
            ps.setInt(1, quarto.getNumero());
            ps.setDouble(2, quarto.getValorDiaria());
            ps.setString(3, quarto.getTipo());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Quarto quarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbhospede set NUMERO = ?, VALORDIARIA = ?, TIPO = ?" +
                                                 "where numero = ?");
            System.out.println(quarto.getNumero());
            System.out.println(quarto.getValorDiaria());
            System.out.println(quarto.getTipo());
            
            ps.setInt(3, quarto.getNumero());
            ps.setDouble(1, quarto.getValorDiaria());
            ps.setString(2, quarto.getTipo());

           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Quarto consultar (int numero) {
        Quarto quarto = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbquarto where " +
                                                 "numero = ?");
            
            ps.setInt(1, numero);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                quarto = new Quarto (numero, rs.getString("tipo"), rs.getDouble("valorDiaria"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (quarto);
    }    
     
     public void excluir(Quarto quarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbquarto where numero = ?");
            
            ps.setInt(1, quarto.getNumero());
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
