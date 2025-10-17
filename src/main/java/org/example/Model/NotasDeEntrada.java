package org.example.Model;

import java.time.LocalDate;

public class NotasDeEntrada {

    private int id;
    private int idFornecedor;
    private LocalDate dataEntrada;

    public NotasDeEntrada(){
        this.idFornecedor = 0;
        this.dataEntrada = null;
    }

    public NotasDeEntrada(int idFornecedor, LocalDate dataEntrada){
        this.idFornecedor = idFornecedor;
        this.dataEntrada = dataEntrada;
    }

    public NotasDeEntrada(int id, int idFornecedor, LocalDate dataEntrada){
        this.id = id;
        this.idFornecedor = idFornecedor;
        this.dataEntrada = dataEntrada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    @Override
    public String toString() {
        return "NotasDeEntrada: " + '\'' +
                "id: " + id + '\'' +
                "idFornecedor: " + idFornecedor + '\'' +
                "dataEntrada: " + dataEntrada;
    }
}
