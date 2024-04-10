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
    
        public void insercaoSemRetorno(Item item, No raiz) { //no = raiz
        if (raiz == null) {
            this.raiz = new No();
            this.raiz.item = item;
            this.raiz.esq = null;
            this.raiz.dir = null;
        } else if (item.comparaItem(raiz.item) < 0) {
            this.raiz.esq = insercao(item, raiz.esq);
        } else if (item.comparaItem(raiz.item) > 0) {
            this.raiz.dir = insercao(item, raiz.dir);
        } else {
            System.out.println("Erro: Ja tem esse item " + item + " na árvore.");
        }
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

    public void imprimeOrdemCrescente() {
        this.centralOrdemCrescente(this.raiz);
    }

    private void centralOrdemCrescente(No no) {
        if (no != null) {
            centralOrdemCrescente(no.esq);
            System.out.println(no.item.toString());
            centralOrdemCrescente(no.dir);
        }
    }

    public void imprimeOrdemDecrescente() {
        this.centralOrdemDecrescente(this.raiz);
    }

    private void centralOrdemDecrescente(No no) {
        if (no != null) {
            centralOrdemDecrescente(no.dir);
            System.out.println(no.item.toString());
            centralOrdemDecrescente(no.esq);
        }
    }

    public void imprimeOrdemAleatoriaPelaEsquerda() {
        this.centralOrdemCrescente(this.raiz);
    }

    private void centralOrdemAleatoriaPelaEsquerda(No no) {
        if (no != null) {
            System.out.println(no.item.toString());
            centralOrdemCrescente(no.esq);
            centralOrdemCrescente(no.dir);
        }
    }

    public void imprimeOrdemAleatoriaPelaDireita() {
        this.centralOrdemDecrescente(this.raiz);
    }

    private void centralOrdemAleatoriaPelaDireita(No no) {
        if (no != null) {
            System.out.println(no.item.toString());
            centralOrdemDecrescente(no.dir);
            centralOrdemDecrescente(no.esq);
        }
    }

    public void balanceamento() {

    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public No getRaiz() {
        return this.raiz;
    }
}
