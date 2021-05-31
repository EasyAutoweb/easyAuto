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
public class Usuario {
    
    private int idUsuario;
    private char tipoUsuario;
    private int senhaUsuario;
    private String loginUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, char tipoUsuario, int senhaUsuario, String loginUsuario) {
        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
        this.senhaUsuario = senhaUsuario;
        this.loginUsuario = loginUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public char getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(char tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(int senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }
    
    
    public boolean cadastroUsuario(){
       
         if (this.loginUsuario != null && this.senhaUsuario != 0)
        {
            return true;
        }
              return false;
    }
    
    public boolean loginUsuario(){
       
         if (this.loginUsuario != null && this.senhaUsuario != 0)
        {
            return true;
        }
              return false;
    }
    
    public boolean redefinirSenhaUsuario(){
       
         if (this.loginUsuario != null && this.senhaUsuario != 0)
        {
            return true;
        }
              return false;
    }
}
