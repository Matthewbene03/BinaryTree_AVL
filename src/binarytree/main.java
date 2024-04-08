package binarytree;

import java.util.Random;

public class main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Random r = new Random();
        No no = null;
        int num1 = 1 + r.nextInt(101);
        tree.raiz = tree.insercao(new Item(num1), tree.raiz);
        for (int i = 1; i <= 10; i++) {
            int num2 = 1 + r.nextInt(101);
            if (num2 != num1) {
                tree.raiz = tree.insercao(new Item(num2), tree.raiz);
            }

        }
        System.out.println("A raiz dessa árvore é: " + num1);
        tree.imprime();
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
