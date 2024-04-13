package binarytree;

public class No implements Comparable<No>{
    public Item item;
    public No esq, dir;
    
    public No (){
        this.item = null;
        this.esq = null;
        this.dir = null;
    }
    
    public No (Item item){
        this.item = item;
        this.esq = null;
        this.dir = null;
    }

    @Override
    public int compareTo(No no) {
        return (this.item.recuperaChave() - no.item.recuperaChave());
    }
}
