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
public class Fornecedores extends Usuario{
    
    private int idFornecedor;
    private String codigoFornecedor;
    private String razaoSocialFornecedor;
    private String cnpjFornecedor;
    private String telefoneFixoFornecedor;
    private String telefoneCelularFornecedor;
    private String emailFornecedor;

    public Fornecedores() {
    }

    public Fornecedores(int idFornecedor, String codigoFornecedor, String razaoSocialFornecedor, String cnpjFornecedor, String telefoneFixoFornecedor, String telefoneCelularFornecedor, String emailFornecedor) {
        this.idFornecedor = idFornecedor;
        this.codigoFornecedor = codigoFornecedor;
        this.razaoSocialFornecedor = razaoSocialFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
        this.telefoneFixoFornecedor = telefoneFixoFornecedor;
        this.telefoneCelularFornecedor = telefoneCelularFornecedor;
        this.emailFornecedor = emailFornecedor;
    }

    public Fornecedores(int idFornecedor, String codigoFornecedor, String razaoSocialFornecedor, String cnpjFornecedor, String telefoneFixoFornecedor, String telefoneCelularFornecedor, String emailFornecedor, int idUsuario, char tipoUsuario, int senhaUsuario, String loginUsuario) {
        super(idUsuario, tipoUsuario, senhaUsuario, loginUsuario);
        this.idFornecedor = idFornecedor;
        this.codigoFornecedor = codigoFornecedor;
        this.razaoSocialFornecedor = razaoSocialFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
        this.telefoneFixoFornecedor = telefoneFixoFornecedor;
        this.telefoneCelularFornecedor = telefoneCelularFornecedor;
        this.emailFornecedor = emailFornecedor;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(String codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public String getRazaoSocialFornecedor() {
        return razaoSocialFornecedor;
    }

    public void setRazaoSocialFornecedor(String razaoSocialFornecedor) {
        this.razaoSocialFornecedor = razaoSocialFornecedor;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public String getTelefoneFixoFornecedor() {
        return telefoneFixoFornecedor;
    }

    public void setTelefoneFixoFornecedor(String telefoneFixoFornecedor) {
        this.telefoneFixoFornecedor = telefoneFixoFornecedor;
    }

    public String getTelefoneCelularFornecedor() {
        return telefoneCelularFornecedor;
    }

    public void setTelefoneCelularFornecedor(String telefoneCelularFornecedor) {
        this.telefoneCelularFornecedor = telefoneCelularFornecedor;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }
    
    
    
    public boolean enviaPedido(){
       
         if ( this.cnpjFornecedor != null && this.emailFornecedor != null &&
                 this.razaoSocialFornecedor != null)
        {
            return true;
        }
              return false;
    }
    
    public boolean enviaMensagemEstoque(){
       
         if ( this.codigoFornecedor != null)
        {
            return true;
        }
              return false;
    }
    
    public boolean verificaEstoque(){
       
         if ( this.codigoFornecedor != null )
        {
            return true;
        }
              return false;
    }
    
}
