package binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTree {

    //Uma arvore binaria tem um os nós a esquerda e a direita, começando pela raiz. 
    No raiz;
    private ArrayList<No> noArvore;

    public BinaryTree() {
        this.raiz = null;
        this.noArvore = new ArrayList();
    }

    //Os metodos que um árvore pode ter é: Inserção, remoção, busca, balanceamento, imprimir árvore.
    //(inicio)Metodos de inserir: 
    public No insercao(Item item, No raiz) { //87 - 16 - 61 - 
        if (raiz == null) {
            raiz = new No();
            raiz.item = item;
            raiz.esq = null;
            raiz.dir = null;
            raiz.altura = 0;
            this.noArvore.add(raiz);
        } else if (item.comparaItem(raiz.item) < 0) {
            raiz.esq = insercao(item, raiz.esq);
        } else if (item.comparaItem(raiz.item) > 0) {
            raiz.dir = insercao(item, raiz.dir);
        }

        //Calcula a altura do no.
        raiz.altura = maior(alturaDoNo(raiz.esq), alturaDoNo(raiz.dir)) + 1;

        //Faz o balanceamento
        raiz = balanceamento(raiz);

        return raiz;
    }

    public void insercaoSemRetorno(Item item, No no) {//10 - 
        if (no == null) {
            raiz = new No(item);
            this.noArvore.add(raiz);
        } else {
            if (item.comparaItem(no.item) < 0) {
                if (no.esq != null) {
                    insercaoSemRetorno(item, no.esq);
                } else {
                    no.esq = new No(item);
                    this.noArvore.add(no.esq);
                }
            } else if (item.comparaItem(no.item) > 0) {
                if (no.dir != null) {
                    insercaoSemRetorno(item, no.dir);
                } else {
                    no.dir = new No(item);
                    this.noArvore.add(no.dir);
                }
            }
        }

        //Calcula a altura do no.
        raiz.altura = maior(alturaDoNo(raiz.esq), alturaDoNo(raiz.dir)) + 1;

        //Faz o balanceamento
        //raiz = balanceamento(raiz);
    }

    //(Fim)Metodos de inserir: 
    //(Inicio)Metodos de pesquisa: 
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

    //(Fim)Metodos de pesquisa: 
    private No antecessor(No q, No r) {
        if (r.dir != null) {
            r.dir = antecessor(q, r.dir);
        } else {
            q.item = r.item;
            r = r.esq;
        }
        return r;
    }

    public No retira(Item item, No no) {
        if (no == null) {
            System.out.println("Erro: Registro não encontrado!");
        } else if (item.comparaItem(no.item) < 0) {
            no.esq = retira(item, no.esq);
        } else if (item.comparaItem(no.item) > 0) {
            no.dir = retira(item, no.dir);
        } else {
            if (no.dir == null) {
                this.noArvore.remove(no);
                no = no.esq;
            } else if (no.esq == null) {
                this.noArvore.remove(no);
                no = no.dir;
            } else {
                this.noArvore.remove(no);
                no.esq = antecessor(no, no.esq);
            }
        }

        //Calcula a altura do no.
        no.altura = maior(alturaDoNo(no.esq), alturaDoNo(no.dir)) - 1;
        //Faz o balanceamento
        //no = balanceamento(no);

        return no;
    }

    //(Inicio)Metodos para imprimir: 
    public void imprimeOrdemCrescente() {
        this.centralOrdemCrescente(this.raiz);
    }

    private void centralOrdemCrescente(No no) {
        if (no != null) {
            centralOrdemCrescente(no.esq);
            System.out.print("[" + no.item.toString() + "] ");
            centralOrdemCrescente(no.dir);
        }
    }

    public void imprimeOrdemDecrescente() {
        this.centralOrdemDecrescente(this.raiz);
    }

    private void centralOrdemDecrescente(No no) {
        if (no != null) {
            centralOrdemDecrescente(no.dir);
            System.out.print("[" + no.item.toString() + "] ");
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

    public void imprimeIteracao() {
        this.centralIteracao(this.raiz);
    }

    private void centralIteracao(No no) {
        this.ordenarArray();
        for (No noAr : noArvore) {
            System.out.print("[" + noAr.item + "] ");
        }
    }

    private void ordenarArray() {
        Collections.sort(noArvore);
    }

    public void centralImprimir(No no, int nivel) {
        this.imprimeArvore(no, nivel);
    }

    private void imprimeArvore(No no, int nivel) {
        if (no != null) {
            imprimeArvore(no.dir, nivel + 1);
            System.out.print("\n\n");

            for (int i = 0; i < nivel; i++) {
                System.out.print("\t");
            }

            System.out.print(no.item);
            imprimeArvore(no.esq, nivel + 1);
        }
    }

    //(Fim)Metodos para imprimir: 
    //Parte da árvore AVL (Inicio): 
    //(Inicio)Metodos para calcular altura: 
    public Integer alturaArvore(No no) { //Altura da árvore por completo
        if (no == null) {
            return -1;
        } else {
            int esquerda = alturaArvore(no.esq);
            int direita = alturaArvore(no.dir);
            if (esquerda > direita) {
                return esquerda + 1;
            } else {
                return direita + 1;
            }
        }
    }

    private Integer maior(Integer a, Integer b) {
        return (a > b) ? a : b;
    }

    private Integer alturaDoNo(No no) {
        if (no == null) {
            return -1;
        } else {
            return no.altura;
        }
    }

    //(Fim)Metodos para calcular altura:
    //Parte da árvore AVL (Inicio): 
    private No rotacaoDireita(No raiz) {
        No futuraRaiz, filho;

        futuraRaiz = raiz.esq;
        filho = futuraRaiz.dir;

        futuraRaiz.dir = raiz;
        raiz.esq = filho;

        return futuraRaiz;
    }

    private No rotacaoEsquerda(No raiz) {
        No futuraRaiz, filho;

        futuraRaiz = raiz.dir;
        filho = futuraRaiz.esq;

        futuraRaiz.esq = raiz;
        raiz.dir = filho;

        return futuraRaiz;
    }

    private No rotacaoDireitaEsquerda(No raiz) {
        this.rotacaoDireita(raiz.dir);
        return this.rotacaoEsquerda(raiz);
    }

    private No rotacaoEsquerdaDireita(No raiz) {
        this.rotacaoEsquerda(raiz.esq);
        return this.rotacaoDireita(raiz);
    }

    private Integer fatorDeBalanceamento(No no) {
        if (no != null) {
            return (this.alturaDoNo(no.esq) - this.alturaDoNo(no.dir));
        } else {
            return 0;
        }
    }

    private No balanceamento(No no) {
        int fb = fatorDeBalanceamento(no);
        
        if (fb<-1 && fatorDeBalanceamento(no.dir)<=0) {
            this.rotacaoEsquerda(no);
        } else if (fb>1 && fatorDeBalanceamento(no.esq) >=0) {
            this.rotacaoDireita(no);
        } else if (fb>1 && fatorDeBalanceamento(no.esq)<0) {
            this.rotacaoDireitaEsquerda(no);
        } else if (fb<-1 && fatorDeBalanceamento(no.dir)>0){
            this.rotacaoEsquerdaDireita(no);
        }
        return no;
    }

    //Parte da árvore AVL (Fim): 
    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public No getRaiz() {
        return this.raiz;
    }

    public ArrayList<No> getNoArvore() {
        return this.noArvore;
    }
}
