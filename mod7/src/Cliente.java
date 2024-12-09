public class Cliente {

    private String nome;
    private int codigo;
    private String atividade;
    private String endereco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public void cadastrarEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @see String getNome(String nome)
     * @return nome do cliente
     * @deprecated
     */
    public String metodoDeprecated() {
        return this.nome;
    }
}
