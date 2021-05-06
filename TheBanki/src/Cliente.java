public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private Endereco endereco;

    public Cliente (Endereco endereco) {
        this.endereco = endereco;

        System.out.println("Criando um Cliente, com um endereço");
    }
    public boolean validanome()
    {
        if(this.nome != "")
        {
            return true;
        }
        return false;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
