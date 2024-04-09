package binarytree;

import java.util.Random;

public class main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Random r = new Random();

        int num1 = 1 + r.nextInt(101);
        tree.setRaiz(tree.insercao(new Item(num1), tree.getRaiz()));
        for (int i = 1; i <= 10; i++) {
            int num2 = 1 + r.nextInt(101);
            if (num2 != num1) {
                tree.setRaiz(tree.insercao(new Item(num2), tree.getRaiz()));
            }

        }
        System.out.println("A raiz dessa árvore é: " + num1);
        System.out.println("--------------------------------------");
        System.out.println("Ordem crescente: ");
        tree.imprimeOrdemCrescente();
        System.out.println("--------------------------------------");

        System.out.println("\n--------------------------------------");
        System.out.println("Ordem decrescente: ");
        tree.imprimeOrdemDecrescente();
        System.out.println("--------------------------------------");

        System.out.println("\n--------------------------------------");
        System.out.println("Ordem pela esquerda: ");
        tree.imprimeOrdemAleatoriaPelaEsquerda();
        System.out.println("--------------------------------------");

        System.out.println("\n--------------------------------------");
        System.out.println("Ordem pela direita: ");
        tree.imprimeOrdemAleatoriaPelaDireita();
        System.out.println("--------------------------------------");
    }
}

//public static void main(String[] args) {
//
//        //instância um objeto da classe Random usando o construtor padrão
//        Random gerador = new Random();
//        
//        //imprime sequência de 10 números inteiros aleatórios
//        for (int i = 0; i < 10; i++) {
//            System.out.println(gerador.nextInt());
//        }
//    }
