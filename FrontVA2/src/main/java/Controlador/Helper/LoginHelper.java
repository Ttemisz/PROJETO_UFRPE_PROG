
package Controlador.Helper;

import Views.Login;
import models.Usuario;


public class LoginHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
        String nome = view.getCaixadetextoUsuario().getText();
        String senha = view.getCaixadetextosenha().getText();
        Usuario modelo = new Usuario(0,nome,senha);
        return modelo;
        
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getCaixadetextoUsuario().setText(nome);
        view.getCaixadetextosenha().setText(senha);
    }
    
    public void limparTela(){
        view.getCaixadetextoUsuario().setText("");
        view.getCaixadetextosenha().setText("");
    }
}
