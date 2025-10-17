package org.example.View;

import java.util.Scanner;

public class View {

    static Scanner leia = new Scanner(System.in);

    public static int Menu(){
        System.out.println("""
                1 - Cadastrar Fornecedor
                2 - Cadastrar Material
                3 - Registrar Nota de Entrada
                4 - Criar Requisição de Material
                5 - Atender Requisição
                6 - Cancelar Requisição
                ---------------------------------
                Digite uma opção:
                >
                """);
        int opcao = leia.nextInt();
        return opcao;
    }

    public static String nomeFornecedor(){
        System.out.println("Digite o nome do fornecedor: ");
        String nome = leia.nextLine();
        return nome;
    }
}
