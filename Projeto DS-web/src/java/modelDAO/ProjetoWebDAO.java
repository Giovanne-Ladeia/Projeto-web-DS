/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.ProjetoWebbean;

/**
 *
 * @author Senai
 */
public class ProjetoWebDAO {
        public List<ProjetoWebbean> readUsers() {
        List<ProjetoWebbean> usuarios = new ArrayList();
       
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
           
            stmt = conexao.prepareStatement("SELECT * FROM Usuario");
            rs = stmt.executeQuery();
           
            while(rs.next()) {
                ProjetoWebbean usuario = new ProjetoWebbean();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setCpf(rs.getString("cpf"));
               
               
                usuarios.add(usuario);
            }
           
            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return usuarios;
    }
        
        public List<ProjetoWebbean> readProdutos() {
        List<ProjetoWebbean> produtos = new ArrayList();
       
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
           
            stmt = conexao.prepareStatement("SELECT * FROM Produtos");
            rs = stmt.executeQuery();
           
            while(rs.next()) {
                ProjetoWebbean produto = new ProjetoWebbean();
                produto.setIdProdutos(rs.getInt("idProdutos"));
                produto.setNome_produtos(rs.getString("nome_produtos"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getInt("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
               produto.setImagens(rs.getBytes("imagens"));
               
                produtos.add(produto);
            }
           
            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return produtos;
    }
        
        public List<ProjetoWebbean> readEstoque() {
        List<ProjetoWebbean> produtos = new ArrayList();
       
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
           
            stmt = conexao.prepareStatement("SELECT * FROM Estoque");
            rs = stmt.executeQuery();
           
            while(rs.next()) {
                ProjetoWebbean estoque = new ProjetoWebbean();
                estoque.setIdEstoque(rs.getInt("idEstoque"));
                estoque.setNome_estoque(rs.getString("nome_estoque"));
                estoque.setCategoria_estoque(rs.getString("categoria_estoque"));
                estoque.setPreco_estoque(rs.getInt("preco_estoque"));
                estoque.setQuantidade_estoque(rs.getInt("quantidade_estoque"));             
               
                produtos.add(estoque);
            }
           
            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return produtos;
    }
        
        public List<ProjetoWebbean> readCarrinho() {
        List<ProjetoWebbean> produtos = new ArrayList();
       
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
           
            stmt = conexao.prepareStatement("SELECT * FROM Carrinho");
            rs = stmt.executeQuery();
           
            while(rs.next()) {
                ProjetoWebbean estoque = new ProjetoWebbean();
                estoque.setIdCarrinho(rs.getInt("idCarrinho"));
                estoque.setNome_carrinho(rs.getString("nome_carrinho"));
                estoque.setCategoria_carrinho(rs.getString("categoria_carrinho"));
                estoque.setDescricao_carrinho(rs.getString("descricao_carrinho"));
                estoque.setPreco_carrinho(rs.getInt("preco_carrinho"));
                estoque.setQuantidade_carrinho(rs.getInt("quantidade_carrinho"));
                estoque.setIdProdutos_carrinho(rs.getInt("idProdutos_carrinho"));
               
                produtos.add(estoque);
            }
           
            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return produtos;
    }
        
    public void criarUser(ProjetoWebbean user) {
       try {
         Connection conexao = Conexao.conectar();
         PreparedStatement stmt = null;
         
         stmt = conexao.prepareStatement("INSERT INTO Usuario (nome, senha, email, telafone, cpf) VALUES ( ?, ?, ?, ?, ?)");
         stmt.setString(1, user.getNome());
         stmt.setString(2, user.getSenha());
         stmt.setString(3, user.getEmail());
         stmt.setString(4, user.getTelefone());
         stmt.setString(5, user.getCpf());
         stmt.executeUpdate();

         
         
         stmt.close();
         conexao.close();
         JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
       } catch (SQLException e){
            e.printStackTrace();
       }
    }
        
     public void criarProd(ProjetoWebbean prod) {
       try {
         Connection conexao = Conexao.conectar();
         PreparedStatement stmt = null;
         
         stmt = conexao.prepareStatement("INSERT INTO Produtos (nome_produtos, categoria, descricao, preco, quantidade, imagens) VALUES ( ?, ?, ?, ?, ?, ?)");
         stmt.setString(1, prod.getNome_produtos());
         stmt.setString(2, prod.getCategoria());
         stmt.setString(3, prod.getDescricao());
         stmt.setInt(4, prod.getPreco());
         stmt.setInt(5, prod.getQuantidade());
         stmt.setBytes(6, prod.getImagens());
         stmt.executeUpdate();

         
         
         stmt.close();
         conexao.close();
         JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
       } catch (SQLException e){
            e.printStackTrace();
       }
    }
     
    public void criarEstoque(ProjetoWebbean estoque) {
       try {
         Connection conexao = Conexao.conectar();
         PreparedStatement stmt = null;
         
         stmt = conexao.prepareStatement("INSERT INTO Estoque (nome_estoque, categoria_estoque, preco_estoque, quantidade_estoque) VALUES ( ?, ?, ?, ?)");
         stmt.setString(1, estoque.getNome_estoque());
         stmt.setString(2, estoque.getCategoria_estoque());
         stmt.setInt(3, estoque.getPreco_estoque());
         stmt.setInt(4, estoque.getQuantidade_estoque());
         stmt.executeUpdate();

         
         
         stmt.close();
         conexao.close();
         JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
       } catch (SQLException e){
            e.printStackTrace();
       }
    }
    
    public void criarCarrinho(ProjetoWebbean carrinho) {
       try {
         Connection conexao = Conexao.conectar();
         PreparedStatement stmt = null;
         
         stmt = conexao.prepareStatement("INSERT INTO Carrinho (nome_carrinho, categoria_carrinho, descricao_carrinho, preco_carrinho, quantidade_carrinho) VALUES ( ?, ?, ?, ?, ?)");
         stmt.setString(1, carrinho.getNome_carrinho());
         stmt.setString(2, carrinho.getCategoria_carrinho());
         stmt.setString(3, carrinho.getDescricao_carrinho());
         stmt.setInt(4, carrinho.getPreco_carrinho());
         stmt.setInt(5, carrinho.getQuantidade_carrinho());
         stmt.executeUpdate();

         
         
         stmt.close();
         conexao.close();
         JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
       } catch (SQLException e){
            e.printStackTrace();
       }
    }
    
    public void atualizauser(ProjetoWebbean atualizar){
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
           
            stmt = conexao.prepareStatement("UPDATE Usuario SET nome = ?, senha = ?, email = ?, telefone = ? WHERE idUsuario = ?");
            stmt.setString(1, atualizar.getNome());
            stmt.setString(2, atualizar.getSenha());
            stmt.setString(3, atualizar.getEmail());
            stmt.setString(4, atualizar.getTelefone());
           
           
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Estoque Atualizado");
           
            stmt.close();
            conexao.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizaprod(ProjetoWebbean atualizarprod){
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
           
            stmt = conexao.prepareStatement("UPDATE Produtos SET nome_produtos = ?, categoria = ?, descricao = ?, preco = ?, quantidade = ? WHERE idProdutos = ?");
            stmt.setString(1, atualizarprod.getNome_produtos());
            stmt.setString(2, atualizarprod.getCategoria());
            stmt.setString(3, atualizarprod.getDescricao());
            stmt.setInt(4, atualizarprod.getPreco());
            stmt.setInt(5, atualizarprod.getQuantidade());
           
           
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Estoque Atualizado");
           
            stmt.close();
            conexao.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizaEstoque(ProjetoWebbean atualizarestoque){
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
           
            stmt = conexao.prepareStatement("UPDATE estoque SET nome_estoque = ?, categoria_estoque = ?, preco_estoque = ?, quantidade_estoque = ? WHERE idEstoque = ?");
            stmt.setString(1, atualizarestoque.getNome_estoque());
            stmt.setString(2, atualizarestoque.getCategoria_estoque());
            stmt.setInt(3, atualizarestoque.getPreco_estoque());
            stmt.setInt(4, atualizarestoque.getQuantidade_estoque());
           
           
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Estoque Atualizado");
           
            stmt.close();
            conexao.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizaCarrinho(ProjetoWebbean atualizarcarrinho){
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
           
            stmt = conexao.prepareStatement("UPDATE carrinho SET nome_carrinho = ?, categoria_carrinho = ?, descricao_carrinho = ?, preco_carrinho = ?, quantidade_carrinho = ? WHERE idCarrinho = ?");
            stmt.setString(1, atualizarcarrinho.getNome_estoque());
            stmt.setString(2, atualizarcarrinho.getCategoria_estoque());
            stmt.setString(3, atualizarcarrinho.getDescricao_carrinho());
            stmt.setInt(4, atualizarcarrinho.getPreco_estoque());
            stmt.setInt(5, atualizarcarrinho.getQuantidade_estoque());
           
           
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Estoque Atualizado");
           
            stmt.close();
            conexao.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public void deleteUser(ProjetoWebbean deletar) {
        try {
         Connection conexao = Conexao.conectar();
         PreparedStatement stmt = null;
         
         stmt = conexao.prepareStatement("DELETE FROM Usuario WHERE idUsuario = ?");
         stmt.setString(1, Integer.toString(deletar.getIdUsuario()));
         
         stmt.executeUpdate();
         
         stmt.close();
         conexao.close();
         
         JOptionPane.showMessageDialog(null, "Filme deletado com sucesso!");
       
        }catch (SQLException e){
            e.printStackTrace();
    }
    }

    public void deleteProd(ProjetoWebbean deletar) {
        try {
         Connection conexao = Conexao.conectar();
         PreparedStatement stmt = null;
         
         stmt = conexao.prepareStatement("DELETE FROM Produtos WHERE idProdutos = ?");
         stmt.setString(1, Integer.toString(deletar.getIdProdutos()));
         
         stmt.executeUpdate();
         
         stmt.close();
         conexao.close();
         
         JOptionPane.showMessageDialog(null, "Filme deletado com sucesso!");
       
        }catch (SQLException e){
            e.printStackTrace();
    }
    }
        public void deleteEstoque(ProjetoWebbean deletar) {
        try {
         Connection conexao = Conexao.conectar();
         PreparedStatement stmt = null;
         
         stmt = conexao.prepareStatement("DELETE FROM Estoque WHERE idEstoque = ?");
         stmt.setString(1, Integer.toString(deletar.getIdEstoque()));
         
         stmt.executeUpdate();
         
         stmt.close();
         conexao.close();
         
         JOptionPane.showMessageDialog(null, "Filme deletado com sucesso!");
       
        }catch (SQLException e){
            e.printStackTrace();
    }
    }
      
        public void deleteCarrinho(ProjetoWebbean deletar) {
        try {
         Connection conexao = Conexao.conectar();
         PreparedStatement stmt = null;
         
         stmt = conexao.prepareStatement("DELETE FROM Carrinho WHERE idCarrinho = ?");
         stmt.setString(1, Integer.toString(deletar.getIdCarrinho()));
         
         stmt.executeUpdate();
         
         stmt.close();
         conexao.close();
         
         JOptionPane.showMessageDialog(null, "Filme deletado com sucesso!");
       
        }catch (SQLException e){
            e.printStackTrace();
    }
    }
}
