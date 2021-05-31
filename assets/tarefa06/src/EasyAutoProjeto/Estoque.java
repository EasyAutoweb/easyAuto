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
public class Estoque {
    
    private int idEstoque;
    private int quantidadeEstoque;
    private String localEstoque;

    public Estoque() {
    }

    public Estoque(int idEstoque, int quantidadeEstoque, String localEstoque) {
        this.idEstoque = idEstoque;
        this.quantidadeEstoque = quantidadeEstoque;
        this.localEstoque = localEstoque;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getLocalEstoque() {
        return localEstoque;
    }

    public void setLocalEstoque(String localEstoque) {
        this.localEstoque = localEstoque;
    }
    
    public boolean verificaProduto(){
       
         if (this.quantidadeEstoque != 0 && this.localEstoque != null)
        {
            return true;
        }
              return false;
    }
    
    
}
