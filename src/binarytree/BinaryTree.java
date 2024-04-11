package binarytree;

public class BinaryTree {

    //Uma arvore binaria tem um os nós a esquerda e a direita, começando pela raiz. 
    No raiz;

    public BinaryTree() {
        this.raiz = null;
    }

    //Os metodos que um árvore pode ter é: Inserção, remoção, busca, balanceamento, imprimir árvore.
    
    //Metodos de inserir: 
    
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

    public void insercaoSemRetorno(Item item, No no) {
        if (no == null) {
            raiz = new No(item);
        } else {
            if (item.comparaItem(raiz.item) < 0) {
                if (no.esq != null) {
                    insercaoSemRetorno(item, raiz.esq);
                } else {
                    raiz.esq = new No(item);
                }
            } else if (item.comparaItem(raiz.item) > 0) {
                if (no.dir != null) {
                    insercaoSemRetorno(item, raiz.dir);
                } else {
                    raiz.dir = new No(item);
                }
            } else {
                System.out.println("Erro: Ja tem esse item " + item + " na árvore.");
            }
        }
    }
    
    public No insercaoComIteração (Item item, No no){
        No aux = no;
        while (aux != null){
            if(item.comparaItem(no.item)<0){
                if(no.esq != null){
                    break;
                } else{
                    aux.esq = new No(item);
                    return aux;
                }
            } else if(item.comparaItem(no.item)>0){
                if(no.dir != null){
                    break;
                } else{
                    aux.dir = new No(item);
                    return aux;
                }
            } else {
                System.out.println("Erro: Ja tem esse item " + item + " na árvore.");
            }
        }
        aux = new No(item);
        return aux;
    }

    //Metodos de inserir: 
    
    //Metodos de pesquisa: 
    
    public Item pesquisa(Item item) {
        return this.pesquisa(item, this.raiz);
    }

    private Item pesquisa(Item item, No no) {
        if (no == null) {
            return null;
        } else if (item.comparaItem(no.item) < 0) {
            return pesquisa(item, no.esq);
        } else if (item.comparaItem(no.item) > 0) {
            return pesquisa(item, no.dir);
        }
        return no.item;
    }

    public Item pesquisaIte(Item item) {
        return this.pesquisaIte(item, this.raiz);
    }

    private Item pesquisaIte(Item item, No no) {
        while (no != null) {
            if (item.comparaItem(no.item) < 0) {
                no = no.esq;
            } else if (item.comparaItem(no.item) > 0) {
                no = no.dir;
            } else {
                return no.item;
            }
        }
        return null;
    }
    
    //Metodos de pesquisa: 

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
            centralOrdemAleatoriaPelaEsquerda(no.esq);
            centralOrdemAleatoriaPelaEsquerda(no.dir);
        }
    }

    public void imprimeOrdemAleatoriaPelaDireita() {
        this.centralOrdemDecrescente(this.raiz);
    }

    private void centralOrdemAleatoriaPelaDireita(No no) {
        if (no != null) {
            System.out.println(no.item.toString());
            centralOrdemAleatoriaPelaDireita(no.dir);
            centralOrdemAleatoriaPelaDireita(no.esq);
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
