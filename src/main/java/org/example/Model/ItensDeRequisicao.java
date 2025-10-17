package org.example.Model;

public class ItensDeRequisicao {

    private int idRequisicao;
    private int idMaterial;
    private double quantidade;

    public ItensDeRequisicao(){
        this.idRequisicao = 0;
        this.idMaterial = 0;
        this.quantidade = 0.0;
    }

    public ItensDeRequisicao(int idRequisicao, int idMaterial, double quantidade){
        this.idRequisicao = idRequisicao;
        this.idMaterial = idMaterial;
        this.quantidade = quantidade;
    }

    public int getIdRequisicao() {
        return idRequisicao;
    }

    public void setIdRequisicao(int idRequisicao) {
        this.idRequisicao = idRequisicao;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItensDeRequisicao: " + '\'' +
                "idRequisicao: " + idRequisicao + '\'' +
                "idMaterial: " + idMaterial + '\'' +
                "quantidade: " + quantidade;
    }
}
