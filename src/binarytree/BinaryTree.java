package binarytree;

public class BinaryTree {

    //Uma arvore binaria tem um os nós a esquerda e a direita. 
    No raiz;

    //Os metodos que um árvore pode ter é: Inserção, remoção, busca, balanceamento, imprimir árvore.
    public BinaryTree() {
        this.raiz = null;
    }

    public Item pesquisa(Item item) {
        return this.pesquisa(item, this.raiz);
    }

    public Item pesquisa(Item item, No no) {
        if (no == null) {
            return null;
        } else if (item.comparaItem(no.item) < 0) {
            return pesquisa(item, no.esq);
        } else if (item.comparaItem(no.item) > 0) {
            return pesquisa(item, no.dir);
        }
        return no.item;
    }

    public No insercao(Item item, No raiz) { //no = raiz
        if (raiz == null) {
            raiz = new No();
            raiz.item = item;
            raiz.esq = null;
            raiz.dir = null;
        } else if (item.comparaItem(raiz.item) < 0) {
            raiz.esq = insercao(item, raiz.esq);
        } else if (item.comparaItem(raiz.item) > 0) {
            raiz.dir = insercao(item, raiz.dir);
        } else {
            System.out.println("Erro: Ja tem esse item " + item + " na árvore.");
        }
        return raiz;
    }

    private No antecessor(No q, No r) {
        if (r.dir != null) {
            r.dir = antecessor(q, r.dir);
        } else {
            q.item = r.item;
            r = r.esq;
        }
        return r;
    }

    private No retira(Item item, No no) {
        if (no == null) {
            System.out.println("Erro: Registro não encontrado!");
        } else if (item.comparaItem(no.item) < 0) {
            no.esq = retira(item, no.esq);
        } else if (item.comparaItem(no.item) > 0) {
            no.dir = retira(item, no.dir);
        } else {
            if (no.dir == null) {
                no = no.esq;
            } else if (no.esq == null) {
                no = no.dir;
            } else {
                no.esq = antecessor(no, no.esq);
            }
        }
        return no;
    }

    public void imprime() {
        this.central(this.raiz);
    }

    private void central(No no) {
        if (no != null) {
            central(no.esq);
            System.out.println(no.item.toString());
            central(no.dir);
        }
    }

    public void balanceamento() {

    }

    public No getRaiz() {
        return this.raiz;
    }
}
