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
public class Pagamento {
    
    private int idPagamento;
    private String tipoPagamento;
    private Date dataPagamento;//perguntar sobre classe de data
    private int statusPagamento;

    public Pagamento() {
    }

    public Pagamento(int idPagamento, String tipoPagamento, Date dataPagamento, int statusPagamento) {
        this.idPagamento = idPagamento;
        this.tipoPagamento = tipoPagamento;
        this.dataPagamento = dataPagamento;
        this.statusPagamento = statusPagamento;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public int getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(int statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
    
    public boolean selecionaFormaPagamento(){
       
         if ( this.dataPagamento != null && this.statusPagamento != 0 && 
                 this.tipoPagamento != null)
        {
            return true;
        }
              return false;
    }
    
    public boolean validaPagamento(){
       
         if ( this.statusPagamento != 0)
        {
            return true;
        }
              return false;
              
    }
    
    public boolean faturaPagamento(){
       
         if ( this.statusPagamento != 0)
        {
            return true;
        }
              return false;
    }
}
