package binarytree;

import java.util.Random;

public class main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insercaoSemRetorno(new Item (10), tree.getRaiz());
        tree.insercaoSemRetorno(new Item (05), tree.getRaiz());
        tree.insercaoSemRetorno(new Item (15), tree.getRaiz());
        tree.insercaoSemRetorno(new Item (03), tree.getRaiz());
        tree.insercaoSemRetorno(new Item (16), tree.getRaiz());
        tree.insercaoSemRetorno(new Item (17), tree.getRaiz());
        
        
        System.out.println("Raiz: " + 10);
        tree.imprimeOrdemCrescente();
        
        System.out.println("Altura: " + tree.alturaArvore());
        System.out.println("Altura esq: " + tree.getAltura().getAlturaEsq());
        System.out.println("Altura dir: " + tree.getAltura().getAlturaDir());
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
