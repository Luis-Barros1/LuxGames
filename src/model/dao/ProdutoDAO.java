/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Produto;

/**
 *
 * @author Luis
 */
public class ProdutoDAO {
    
    public void create(Produto p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            stmt = con.prepareStatement("INSERT INTO produto(idProduto, Nome, Descrição, Estoque, Preço, Marca, DataFabricação, idCategorias, idTags) VALUES(?,?,?,?,?,?,?,?,?,)");
            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getNome());
            stmt.setString(3, p.getDescrição());
            stmt.setInt(4, p.getEstoque());
            stmt.setFloat(5, p.getPreço());
            stmt.setString(6, p.getMarca());
            stmt.setString(7, p.getDataFabricação());
            stmt.setInt(8, p.getIdCategorias());
            stmt.setInt(9, p.getIdTags());
            
            stmt.execute();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con);
        }
        
    }
    
    
    public List<Produto> listar(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Produto> produtos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();
            while(rs.next()){
                Produto produto = new Produto();
                produto.setId(rs.getInt("idProduto"));
                produto.setNome(rs.getString("Nome"));
                produto.setDescrição(rs.getString("Descrição"));
                produto.setEstoque(rs.getInt("Estoque"));
                produto.setPreço(rs.getFloat("Preço"));
                produto.setMarca(rs.getString("Marca"));
                produto.setDataFabricação(rs.getDate("DataFabricação").toString());
                produto.setIdCategorias(rs.getInt("idCategorias"));
                produto.setIdTags(rs.getInt("idTags"));  
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produtos;
    }
    
}
