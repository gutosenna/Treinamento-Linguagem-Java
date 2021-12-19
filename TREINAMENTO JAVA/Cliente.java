

public class Cliente {
    public String nome;
    public int rg;
    public long cpf;   
    

    Cliente(String nome, int rg, long cpf) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }   
    public Cliente(Telefone telefone) {
    }
    public Cliente(Endereco endereco) {
    }
    public String getNome_cliente() {
        return this.nome;
    }
    public int getRg_cliente() {
        return this.rg;
    }
    public long getCpf_cliente() {
        return this.cpf;
    }
    
    
}
