package binarytree;

import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.setRaiz(tree.insercao(new Item(10), tree.getRaiz())); // Adiciono um numero a raiz
        tree.setRaiz(tree.insercao(new Item(5), tree.getRaiz())); // Adiciono um numero a raiz
        tree.setRaiz(tree.insercao(new Item(3), tree.getRaiz())); // Adiciono um numero a raiz

//        tree.setRaiz(tree.insercao(new Item(15), tree.getRaiz())); // Adiciono um numero a raiz

        System.out.println(tree.getRaiz().altura);
        tree.imprimeOrdemCrescente();
        System.out.println();

//        Random r = new Random();
//        int num1 = 1 + r.nextInt(101);
//        tree.setRaiz(tree.insercao(new Item(num1), tree.getRaiz())); // Adiciono um numero a raiz
//        for (int i = 1; i <= 10; i++) {
//            int num2 = 1 + r.nextInt(101);
//            tree.setRaiz(tree.insercao(new Item(num2), tree.getRaiz())); // Adiciono outros elementos a árvore
//        }
//        System.out.println("Raiz: " + num1);
//
//        System.out.println("Impressão por iteração: ");
//        tree.imprimeIteracao();
//        System.out.println();
//        System.out.println("------------------------------------------------");
//        System.out.println("Impressão por recursividade: ");
//        tree.imprimeOrdemCrescente();
//        System.out.println();
//
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        tree.retira(new Item(x), tree.getRaiz());
//
//        System.out.println("Impressão por iteração: ");
//        tree.imprimeIteracao();
//        System.out.println();
//        System.out.println("------------------------------------------------");
//        System.out.println("Impressão por recursividade: ");
//        tree.imprimeOrdemCrescente();
//        System.out.println();
    }
}

/*
        //Adicionando numeros aleatorios na árvore com retorno
        BinaryTree tree = new BinaryTree();
        Random r = new Random();
        int num1 = 1 + r.nextInt(101);
        tree.setRaiz(tree.insercao(new Item(num1), tree.getRaiz())); // Adiciono um numero a raiz
        for (int i = 1; i <= 10; i++) {
            int num2 = 1 + r.nextInt(101);
            if (num2 != num1) {
                tree.setRaiz(tree.insercao(new Item(num2), tree.getRaiz())); // Adiciono outros elementos a árvore
            }

        }

        //Vou imprimir a árvore de varias formas possiveis. 
        System.out.println("A raiz dessa árvore é: " + 10);
        System.out.println("--------------------------------------");
        System.out.println("Ordem crescente: ");
        tree.imprimeOrdemCrescente();
        System.out.println("--------------------------------------");

        System.out.println("Busca recursiva: ");
        //Buscar um item (metodo pesquisa recursivo)
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Item i = tree.pesquisa(new Item(num));
        if (i == null) {
            System.out.println("Valor não encontrado!");
        } else {
            System.out.println("valor encontrado: " + i.toString());
        }
        //Buscar um item (metodo pesquisa recursivo)

        System.out.println("--------------------------------------");

        System.out.println("Busca iterativa: ");
        //Buscar um item (metodo pesquisa iterativo)
        num = sc.nextInt();
        i = tree.pesquisaIte(new Item(num));
        if (i == null) {
            System.out.println("Valor não encontrado!");
        } else {
            System.out.println("valor encontrado: " + i.toString());
        }
        //Buscar um item (metodo pesquisa iterativo)
 */
