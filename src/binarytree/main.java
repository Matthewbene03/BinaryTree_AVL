package binarytree;

import java.util.Random;

public class main {

    public static void main(String[] args) {

        //Adicionando numeros aleatorios na árvore por iteração
        BinaryTree tree = new BinaryTree();
        Random r = new Random();
        int num1 = 1 + r.nextInt(101);
        tree.insercaoComIteracao(new Item(num1), tree.getRaiz()); // Adiciono um numero a raiz
        for (int i = 1; i <= 10; i++) {
            int num2 = 1 + r.nextInt(101);
            if (num2 != num1) {
                tree.insercaoComIteracao(new Item(num2), tree.getRaiz()); // Adiciono outros elementos a árvore
            }

        }

        //Vou imprimir a árvore de varias formas possiveis. 
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

/*
        //Adicionando numeros aleatorios na árvore sem retorno
        BinaryTree tree = new BinaryTree();
        Random r = new Random();
        int num1 = 1 + r.nextInt(101);
        tree.insercaoSemRetorno(new Item(num1), tree.getRaiz()); // Adiciono um numero a raiz
        for (int i = 1; i <= 10; i++) {
            int num2 = 1 + r.nextInt(101);
            if (num2 != num1) {
                tree.insercaoSemRetorno(new Item(num2), tree.getRaiz()); // Adiciono outros elementos a árvore
            }

        }
*/

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
*/