
package Views;

import models.Cliente;
import models.Servico;
import models.Usuario;

public class Test {
    public static void main(String[] args){
        String nome = "tiago";
        System.out.println(nome);
        
        Servico casa = new Servico(1,"casa",30);
        
        System.out.println(casa.getDescricao());
              
        Usuario usuario = new Usuario(2,"barbeiro","basdsa");
        System.out.println(usuario.getRg());
    }
}