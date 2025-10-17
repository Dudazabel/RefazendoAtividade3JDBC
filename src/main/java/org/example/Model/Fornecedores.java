package org.example.Model;

public class Fornecedores {

    private int id;
    private String nome;
    private String cnpj;

    public Fornecedores(){
        this.nome = "";
        this.cnpj = "";
    }

    public Fornecedores(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Fornecedores(int id, String nome, String cnpj){
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Fornecedores: " + '\'' +
                "id: " + id + '\'' +
                "nome: " + nome + '\'' +
                "cnpj: " + cnpj ;
    }
}
