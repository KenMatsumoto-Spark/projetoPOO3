package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.ServicoQuarto;

public class DaoServicoQuarto {
    private Connection conn;
    
    public DaoServicoQuarto(Connection conn) {
         this.conn = conn;
    }
    
    public  ServicoQuarto consultar (int codigo) {
        ServicoQuarto servicoQuarto = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbservicoquarto where " +
                                                 "codigo = ?");
            
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                servicoQuarto = new ServicoQuarto (codigo, rs.getString("descricao"));
                servicoQuarto.setValor(rs.getDouble("valor"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (servicoQuarto);
    }    
    
    public void inserir(ServicoQuarto servicoQuarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbservicoquarto(codigo, valor, descricao) VALUES(?,?,?)");
            ps.setInt(1, servicoQuarto.getCodigo());
            ps.setDouble(2, servicoQuarto.getValor());
            ps.setString(3, servicoQuarto.getDescricao());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(ServicoQuarto servicoQuarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbservicoquarto set valor = ?, descricao = ? " +
                                                 "where codigo = ?");
            
            ps.setDouble(1, servicoQuarto.getValor());
            ps.setString(2, servicoQuarto.getDescricao());
            ps.setInt(3, servicoQuarto.getCodigo());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(ServicoQuarto servicoQuarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbservicoquarto where codigo = ?");
            
            ps.setInt(1, servicoQuarto.getCodigo());
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
