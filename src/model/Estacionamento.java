package model;

public class Estacionamento implements Comparable {
    private int id;
    private int razaoSocial;
    private String nomeFantasia;
    private String endereco;
    private String cidade;

    public Estacionamento(){
    }

    @Override
    public String toString() {
        return "Estacionamento{" +
                "id=" + id +
                ", razaoSocial=" + razaoSocial +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }

    public Estacionamento(int id, int razaoSocial, String nomeFantasia, String endereco, String cidade) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public Estacionamento(int id, String nomeFantasia, String endereco) {
        this.id = id;
        this.nomeFantasia = nomeFantasia;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(int razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
