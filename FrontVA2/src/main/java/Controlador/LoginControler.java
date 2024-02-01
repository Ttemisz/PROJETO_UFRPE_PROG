
package Controlador;

import Controlador.Helper.LoginHelper;
import Views.Login;
import models.Usuario;


public class LoginControler {

    private final Login view;
    private LoginHelper helper;
    
    public LoginControler(Login view){
       this.view = view;
       this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        
        Usuario usuario = helper.obterModelo();
        
        
        
    }
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensageem("Executei  o fiz tarefa");
    }
    
    
}
