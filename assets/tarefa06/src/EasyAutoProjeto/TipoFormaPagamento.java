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
public class TipoFormaPagamento {
    
    private int idTipoFormaPagamento;
    private String codigoTipoFormaPagamento;
    private String nomeTipoFormaPagamento;

    public TipoFormaPagamento() {
    }

    public TipoFormaPagamento(int idTipoFormaPagamento, String codigoTipoFormaPagamento, String nomeTipoFormaPagamento) {
        this.idTipoFormaPagamento = idTipoFormaPagamento;
        this.codigoTipoFormaPagamento = codigoTipoFormaPagamento;
        this.nomeTipoFormaPagamento = nomeTipoFormaPagamento;
    }

    public int getIdTipoFormaPagamento() {
        return idTipoFormaPagamento;
    }

    public void setIdTipoFormaPagamento(int idTipoFormaPagamento) {
        this.idTipoFormaPagamento = idTipoFormaPagamento;
    }

    public String getCodigoTipoFormaPagamento() {
        return codigoTipoFormaPagamento;
    }

    public void setCodigoTipoFormaPagamento(String codigoTipoFormaPagamento) {
        this.codigoTipoFormaPagamento = codigoTipoFormaPagamento;
    }

    public String getNomeTipoFormaPagamento() {
        return nomeTipoFormaPagamento;
    }

    public void setNomeTipoFormaPagamento(String nomeTipoFormaPagamento) {
        this.nomeTipoFormaPagamento = nomeTipoFormaPagamento;
    }
    
    
    
}
