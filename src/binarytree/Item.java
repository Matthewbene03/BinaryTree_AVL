package binarytree;

public class Item {

    private Integer chave;
    
    public Item (Integer chave){
        this.chave = chave;
    }
    
    public Integer comparaItem(Item item){
         if(this.chave<item.chave){
             return -1;
         } else if (this.chave>item.chave){
             return 1;
         }
        return 0;
    }
    
    public void alteraChave (Object chave){
        Integer ch = (Integer) chave;
        this.chave = ch.intValue();
    }
    
    public Object recuperaChave(){
        return this.chave;
    }    
    
    public String toString(){
        return "" + chave;
    }
}
