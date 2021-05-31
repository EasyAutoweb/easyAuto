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
public class Cliente extends Usuario {
    
    private int idCliente;
    private int numeroCliente;
    private String nomeCliente;
    private String emailCliente;
    private String telefoneFixoCliente;
    private String cpfCliente;
    

    public Cliente() {
    }
    
    public Cliente(int idCliente, int numeroCliente, String nomeCliente, String emailCliente, String telefoneFixoCliente, String cpfCliente) {
        this.idCliente = idCliente;
        this.numeroCliente = numeroCliente;
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.telefoneFixoCliente = telefoneFixoCliente;
        this.cpfCliente = cpfCliente;
    }
    
    public Cliente(int idCliente, int numeroCliente, String nomeCliente, String emailCliente, String telefoneFixoCliente, String cpfCliente, int idUsuario, char tipoUsuario, int senhaUsuario, String loginUsuario) {
        super(idUsuario, tipoUsuario, senhaUsuario, loginUsuario);
        this.idCliente = idCliente;
        this.numeroCliente = numeroCliente;
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.telefoneFixoCliente = telefoneFixoCliente;
        this.cpfCliente = cpfCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTelefoneFixoCliente() {
        return telefoneFixoCliente;
    }

    public void setTelefoneFixoCliente(String telefoneFixoCliente) {
        this.telefoneFixoCliente = telefoneFixoCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    
    public boolean informaEndereco(){
       
         if ( this.emailCliente != null && this.nomeCliente != null && 
                 this.numeroCliente != 0 && this.telefoneFixoCliente != null && this.loginUsuario())
        {
            return true;
        }
              return false;
    }
    
    
    
}
