package org.example.Model;

public class ItensDaNotaDeEntrada {

    private int idNotaEntrada;
    private int idMaterial;
    private double quantidade;

    public ItensDaNotaDeEntrada(){
        this.idNotaEntrada = 0;
        this.idMaterial = 0;
        this.quantidade = 0.0;
    }

    public ItensDaNotaDeEntrada(int idNotaEntrada, int idMaterial, double quantidade){
        this.idNotaEntrada = idNotaEntrada;
        this.idMaterial = idMaterial;
        this.quantidade = quantidade;
    }

    public int getIdNotaEntrada() {
        return idNotaEntrada;
    }

    public void setIdNotaEntrada(int idNotaEntrada) {
        this.idNotaEntrada = idNotaEntrada;
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
        return "ItensDaNotaDeEntrada: " + '\'' +
                "idNotaEntrada: " + idNotaEntrada + '\'' +
                "idMaterial: " + idMaterial + '\'' +
                "quantidade: " + quantidade;
    }
}
