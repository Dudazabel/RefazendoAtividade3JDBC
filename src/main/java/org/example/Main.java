package org.example;

import org.example.View.View;

public class Main {
    public static void main(String[] args) {
        inicio();
    }

    public static void inicio(){
        int opcao = View.Menu();

        switch (opcao){
            case 1 ->{
                cadastrarFornecedor();
            }
        }
    }

    public static void cadastrarFornecedor(){
        String nome = View.nomeFornecedor();

    }
}