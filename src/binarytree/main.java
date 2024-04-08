package binarytree;

public class main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        No no = null;
        tree.insercao(new Item(10), tree.raiz);//Aqui a minha raiz ela vai ser criada
        tree.insercao(new Item(5), tree.raiz);
        tree.insercao(new Item(15), tree.raiz);

        tree.imprime();
    }
}
