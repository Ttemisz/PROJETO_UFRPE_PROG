
package projetojava2va;
import java.time.LocalDate;

public class Locacao {

    private String imovel;
    private float preco;
    private String usuario;
    private LocalDate datainicio;
    private LocalDate datafim;    
    private String tipoContratual;
    private String locacao;

    public Locacao(String imovel,float preco,String usuario,
    LocalDate datainicio,LocalDate datafim,String tipoContratual,String locacao){
        this.imovel = imovel;
        this.preco = preco;
        this.usuario = usuario;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.tipoContratual = tipoContratual;
        this.locacao = locacao;
    
    }
    
    public void setImovel(String imovel){
        this.imovel = imovel;
    }
    
    
    public String getImovel() {
        return imovel;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }
    
    public void setDatainicio(LocalDate datainicio) {
        this.datainicio = datainicio;
    }

    public LocalDate getDatainicio() {
        return datainicio;
    }
    
    public void setDatafim(LocalDate datafim) {
        this.datafim = datafim;
    }

    public LocalDate getDatafim() {
        return datafim;
    }
    
    public void setTipoContratual(String tipoContratual) {
        this.tipoContratual = tipoContratual;
    }

    public String getTipoContratual() {
        return tipoContratual;
    }
    
    public void setLocacao(String locacao) {
        this.locacao = locacao;
    }

    public String getLocacao() {
        return locacao;
    }
   
}
