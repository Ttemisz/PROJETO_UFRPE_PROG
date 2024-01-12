package projetojava2va;
import java.time.LocalDate;


public class Usuario extends Endereco {
    
    private String nome;
    private String rg;
    private String cpf;
    private String contato;
    private LocalDate dataNascimento;
    private Endereco endereco;  
    
    public Usuario(String nome, String rg, String cpf, String contato, 
            LocalDate dataNascimento, Endereco endereco) {
        
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.contato = contato;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String obterDescricao() {
        return "Endereço Residencial: " +
               getRua() + ", " +
               getBairro() + ", " +
               getCidade() + ", " +
               getEstado() + ", " +
               getPais() + ", " +
               getCep();
    }
}
