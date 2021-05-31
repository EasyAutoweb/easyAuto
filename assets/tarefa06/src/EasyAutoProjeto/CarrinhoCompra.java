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
public class CarrinhoCompra extends Pedido {
    
    private int idCarrinhoCompra;

    public CarrinhoCompra() {
    }

    public CarrinhoCompra(int idCarrinhoCompra) {
        this.idCarrinhoCompra = idCarrinhoCompra;
    }

    public int getIdCarrinhoCompra() {
        return idCarrinhoCompra;
    }

    public void setIdCarrinhoCompra(int idCarrinhoCompra) {
        this.idCarrinhoCompra = idCarrinhoCompra;
    }
    
    
    
}
