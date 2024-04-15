package binarytree;

import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //tree.setRaiz(tree.insercao(new Item(05), tree.getRaiz()));
//
//        tree.setRaiz(tree.insercao(new Item(03), tree.getRaiz()));
//
//        tree.setRaiz(tree.insercao(new Item(02), tree.getRaiz()));
//
//        tree.setRaiz(tree.insercao(new Item(04), tree.getRaiz()));
//
//        tree.setRaiz(tree.insercao(new Item(06), tree.getRaiz()));
//
//        tree.setRaiz(tree.insercao(new Item(07), tree.getRaiz()));
//
//        tree.setRaiz(tree.insercao(new Item(15), tree.getRaiz()));
//
//        tree.setRaiz(tree.insercao(new Item(17), tree.getRaiz()));
//
//        tree.setRaiz(tree.insercao(new Item(16), tree.getRaiz()));
        //Adicionando numeros aleatorios na árvore com retorno
        BinaryTree tree = new BinaryTree();

        tree.setRaiz(tree.insercao(new Item(10), tree.getRaiz()));
        tree.setRaiz(tree.insercao(new Item(5), tree.getRaiz()));
        tree.setRaiz(tree.insercao(new Item(3), tree.getRaiz()));
        tree.setRaiz(tree.insercao(new Item(6), tree.getRaiz()));
        tree.setRaiz(tree.insercao(new Item(7), tree.getRaiz()));
        tree.setRaiz(tree.insercao(new Item(4), tree.getRaiz()));
        tree.setRaiz(tree.insercao(new Item(2), tree.getRaiz()));
        tree.setRaiz(tree.insercao(new Item(13), tree.getRaiz()));
        tree.setRaiz(tree.insercao(new Item(16), tree.getRaiz()));
        
        System.out.println("Impressão por iteração: ");
        tree.imprimeIteracao();
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("Impressão por recursividade: ");
        tree.imprimeOrdemCrescente();
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        No aux = tree.retira(new Item(x), tree.getRaiz());

        System.out.println("A nova raiz é: " + aux.item);
        System.out.println("Impressão por iteração: ");
        tree.imprimeIteracao();
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("Impressão por recursividade: ");
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
//        tree.getNoArvore().remove(tree.retira(new Item(x), tree.getRaiz()));
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
