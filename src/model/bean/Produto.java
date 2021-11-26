/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Luis
 */
public class Produto {
    
    private int Id;
    private String Nome;
    private String Descrição;
    private int Estoque;
    private float Preço;
    private String Marca;
    private String DataFabricação;
    private int IdCategorias;
    private int IdTags;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String Descrição) {
        this.Descrição = Descrição;
    }

    public int getEstoque() {
        return Estoque;
    }

    public void setEstoque(int Estoque) {
        this.Estoque = Estoque;
    }

    public float getPreço() {
        return Preço;
    }

    public void setPreço(float Preço) {
        this.Preço = Preço;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getDataFabricação() {
        return DataFabricação;
    }

    public void setDataFabricação(String DataFabricação) {
        this.DataFabricação = DataFabricação;
    }

    public int getIdCategorias() {
        return IdCategorias;
    }

    public void setIdCategorias(int IdCategorias) {
        this.IdCategorias = IdCategorias;
    }

    public int getIdTags() {
        return IdTags;
    }

    public void setIdTags(int IdTags) {
        this.IdTags = IdTags;
    }
    
}
