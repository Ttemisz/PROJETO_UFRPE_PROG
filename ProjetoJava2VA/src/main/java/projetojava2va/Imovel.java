
package projetojava2va;

public class Imovel {
  
    private String tipo;
    private double tamanho;
    private double valor;
    private Endereco endereco;  
    private int comodos;
    private int banheiros;
    private boolean salaDeEstar;
    private boolean varanda;

   
    public Imovel(String tipo, double tamanho, double valor, Endereco endereco,
                  int comodos, 
                  int banheiros, boolean salaDeEstar, boolean varanda) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.valor = valor;
        this.endereco = endereco;
        this.comodos = comodos;
        this.banheiros = banheiros;
        this.salaDeEstar = salaDeEstar;
        this.varanda = varanda;
    }

 
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getComodos() {
        return comodos;
    }

    public void setComodos(int comodos) {
        this.comodos = comodos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public boolean isSalaDeEstar() {
        return salaDeEstar;
    }

    public void setSalaDeEstar(boolean salaDeEstar) {
        this.salaDeEstar = salaDeEstar;
    }

    public boolean isVaranda() {
        return varanda;
    }

    public void setVaranda(boolean varanda) {
        this.varanda = varanda;
    }

    
}

