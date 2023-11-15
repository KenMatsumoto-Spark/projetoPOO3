package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Recepcionista;

public class DaoRecepcionista {
    
 private Connection conn;
    
    public DaoRecepcionista (Connection conn) {
         this.conn = conn;
    }
    
   public void inserir(Recepcionista recepcionista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbrecepcionista(REGFUNC, NOME, ENDERECO, TELEFONE, TURNO) VALUES(?,?,?,?,?)");
            ps.setInt(1, recepcionista.getRegFunc());
            ps.setString(2, recepcionista.getNome());
            ps.setString(3, recepcionista.getEndereco());
            ps.setString(4, recepcionista.getTelefone());
            ps.setString(5, recepcionista.getTurno());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Recepcionista recepcionista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbhospede set NOME = ?, ENDERECO = ?, TELEFONE = ?, TURNO = ? " +
                                                 "where regfunc = ?");
            System.out.println(recepcionista.getRegFunc());
            System.out.println(recepcionista.getNome());
            System.out.println(recepcionista.getEndereco());
            System.out.println(recepcionista.getTelefone());
            System.out.println(recepcionista.getTurno());
            
            ps.setInt(5, recepcionista.getRegFunc());
            ps.setString(1, recepcionista.getNome());
            ps.setString(2, recepcionista.getEndereco());
            ps.setString(3, recepcionista.getTelefone());
            ps.setString(4, recepcionista.getTurno());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Recepcionista consultar (int regfunc) {
        Recepcionista recepcionista = null;
        
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbrecepcionista where " +
                                                 "REGFUNC = ?");
            
            ps.setInt(1, regfunc);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                recepcionista = new Recepcionista (regfunc, rs.getString("nome"));
                recepcionista.setEndereco( rs.getString("endereco"));
                recepcionista.setTelefone(rs.getString("telefone"));
                recepcionista.setTurno(rs.getString("turno"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (recepcionista);
    }    
     
     public void excluir(Recepcionista recepcionista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbrecepcionista where regfunc = ?");
            
            ps.setInt(1, recepcionista.getRegFunc());
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
} 
