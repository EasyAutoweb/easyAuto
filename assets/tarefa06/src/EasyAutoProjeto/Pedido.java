/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EasyAutoProjeto;

import java.util.Date;
/**
 *
 * 
 */
public class Pedido {
    
    private int idPedido;
    private int numeroPedido;
    private char statusPedido;
    private Date dataPedido;//perguntar sobre classe de Data
    private float valorTotalPedido;
    private float valorFretePedido;

    public Pedido() {
    }

    public Pedido(int idPedido, int numeroPedido, char statusPedido, Date dataPedido, float valorTotalPedido, float valorFretePedido) {
        this.idPedido = idPedido;
        this.numeroPedido = numeroPedido;
        this.statusPedido = statusPedido;
        this.dataPedido = dataPedido;
        this.valorTotalPedido = valorTotalPedido;
        this.valorFretePedido = valorFretePedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public char getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(char statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public float getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(float valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public float getValorFretePedido() {
        return valorFretePedido;
    }

    public void setValorFretePedido(float valorFretePedido) {
        this.valorFretePedido = valorFretePedido;
    }
    
    public boolean finalizaCompra(){
       
         if (this.dataPedido != null && this.numeroPedido != 0  && this.statusPedido != 0 && 
                 this.valorFretePedido != 0 && this.valorTotalPedido != 0 )
        {
            return true;
        }
              return false;
    }
    
    public boolean confirmaCompra(){
       
         if (this.numeroPedido != 0 && this.statusPedido != 0 )
        {
            return true;
        }
              return false;
    }
    public boolean cancelaCompra(){
       
         if (this.numeroPedido != 0 && this.statusPedido != 0 )
        {
            return true;
        }
              return false;
    }
    
    public boolean estornaPagamento(){
       
         if (this.dataPedido != null && this.numeroPedido != 0  && this.statusPedido != 0 && 
                 this.valorFretePedido != 0 && this.valorTotalPedido != 0 )
        {
            return true;
        }
              return false;
    }
    public boolean enviaCompra(){
       
         if (this.statusPedido != 0)
        {
            return true;
        }
              return false;
    }
    
    public boolean enviaConfirmacaoCompra(){
       
         if(this.statusPedido != 0)
        {
            return true;
        }
              return false;
    }
}
