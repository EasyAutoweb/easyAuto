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
public class ItemPedido {
    
    private int idItemPedido;
    private float valorUnitario;
    private int quantidadeItemPedido;

    public ItemPedido() {
    }

    public ItemPedido(int idItemPedido, float valorUnitario, int quantidadeItemPedido) {
        this.idItemPedido = idItemPedido;
        this.valorUnitario = valorUnitario;
        this.quantidadeItemPedido = quantidadeItemPedido;
    }

    public int getIdItemPedido() {
        return idItemPedido;
    }

    public void setIdItemPedido(int idItemPedido) {
        this.idItemPedido = idItemPedido;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidadeItemPedido() {
        return quantidadeItemPedido;
    }

    public void setQuantidadeItemPedido(int quantidadeItemPedido) {
        this.quantidadeItemPedido = quantidadeItemPedido;
    }
    
    
    
    
}
