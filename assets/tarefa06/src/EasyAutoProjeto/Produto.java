/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EasyAutoProjeto;

/**
 *
 * 
 */
public class Produto {
    
    private int idProduto;
    private int codigoProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private float pesoProduto;

    public Produto() {
    }

    public int getIdProduto() {
        return idProduto;
    }

    public Produto(int idProduto, int codigoProduto, String nomeProduto, String descricaoProduto, float pesoProduto) {
        this.idProduto = idProduto;
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.pesoProduto = pesoProduto;
    }
    

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public float getPesoProduto() {
        return pesoProduto;
    }

    public void setPesoProduto(float pesoProduto) {
        this.pesoProduto = pesoProduto;
    }
    
    public boolean pesquisaProduto(){
       
         if ( this.nomeProduto != null && this.codigoProduto != 0 
                 && this.descricaoProduto != null)
        {
            return true;
        }
              return false;
    }
    
    public boolean adicionarCarrinho(){
       
         if ( this.codigoProduto != 0)
        {
            return true;
        }
              return false;
    }
    
}
