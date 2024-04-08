/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Senai
 */
public class ProjetoWebbean {
    //tabela usuarios--------
    private int idUsuario;
    private String nome;
    private String senha;
    private String email;
    private String telefone;
    private String cpf;
    //----------------------
    //tabela produtos-------
    private int idProdutos;
    private String nome_produtos;
    private String categoria;
    private String descricao;
    private int preco;
    private int quantidade;
    private byte[] imagens;
    //---------------------------
    //tabela estoque----------
    private int idEstoque;
    private String nome_estoque;
    private String categoria_estoque;
    private int preco_estoque;
    private int quantidade_estoque;
    //-------------------------
    //tabela carrinho----------
    private int idCarrinho;
    private String nome_carrinho;
    private String categoria_carrinho;
    private String descricao_carrinho;
    private int preco_carrinho;
    private int quantidade_carrinho;
    private int idProdutos_carrinho;
    //--------------------------

    public ProjetoWebbean() {
    }

    public ProjetoWebbean(int idUsuario, String nome, String senha, String email, String telefone, String cpf, int idProdutos, String nome_produtos, String categoria, String descricao, int preco, int quantidade, byte[] imagens, int idEstoque, String nome_estoque, String categoria_estoque, int preco_estoque, int quantidade_estoque, int idCarrinho, String nome_carrinho, String categoria_carrinho, String descricao_carrinho, int preco_carrinho, int quantidade_carrinho, int idProdutos_carrinho) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.idProdutos = idProdutos;
        this.nome_produtos = nome_produtos;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.imagens = imagens;
        this.idEstoque = idEstoque;
        this.nome_estoque = nome_estoque;
        this.categoria_estoque = categoria_estoque;
        this.preco_estoque = preco_estoque;
        this.quantidade_estoque = quantidade_estoque;
        this.idCarrinho = idCarrinho;
        this.nome_carrinho = nome_carrinho;
        this.categoria_carrinho = categoria_carrinho;
        this.descricao_carrinho = descricao_carrinho;
        this.preco_carrinho = preco_carrinho;
        this.quantidade_carrinho = quantidade_carrinho;
        this.idProdutos_carrinho = idProdutos_carrinho;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdProdutos() {
        return idProdutos;
    }

    public void setIdProdutos(int idProdutos) {
        this.idProdutos = idProdutos;
    }

    public String getNome_produtos() {
        return nome_produtos;
    }

    public void setNome_produtos(String nome_produtos) {
        this.nome_produtos = nome_produtos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public byte[] getImagens() {
        return imagens;
    }

    public void setImagens(byte[] imagens) {
        this.imagens = imagens;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public String getNome_estoque() {
        return nome_estoque;
    }

    public void setNome_estoque(String nome_estoque) {
        this.nome_estoque = nome_estoque;
    }

    public String getCategoria_estoque() {
        return categoria_estoque;
    }

    public void setCategoria_estoque(String categoria_estoque) {
        this.categoria_estoque = categoria_estoque;
    }

    public int getPreco_estoque() {
        return preco_estoque;
    }

    public void setPreco_estoque(int preco_estoque) {
        this.preco_estoque = preco_estoque;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public int getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    public String getNome_carrinho() {
        return nome_carrinho;
    }

    public void setNome_carrinho(String nome_carrinho) {
        this.nome_carrinho = nome_carrinho;
    }

    public String getCategoria_carrinho() {
        return categoria_carrinho;
    }

    public void setCategoria_carrinho(String categoria_carrinho) {
        this.categoria_carrinho = categoria_carrinho;
    }

    public String getDescricao_carrinho() {
        return descricao_carrinho;
    }

    public void setDescricao_carrinho(String descricao_carrinho) {
        this.descricao_carrinho = descricao_carrinho;
    }

    public int getPreco_carrinho() {
        return preco_carrinho;
    }

    public void setPreco_carrinho(int preco_carrinho) {
        this.preco_carrinho = preco_carrinho;
    }

    public int getQuantidade_carrinho() {
        return quantidade_carrinho;
    }

    public void setQuantidade_carrinho(int quantidade_carrinho) {
        this.quantidade_carrinho = quantidade_carrinho;
    }

    public int getIdProdutos_carrinho() {
        return idProdutos_carrinho;
    }

    public void setIdProdutos_carrinho(int idProdutos_carrinho) {
        this.idProdutos_carrinho = idProdutos_carrinho;
    }
    
}
