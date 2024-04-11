package binarytree;

public class AlturaArvore {

    private Integer alturaEsq;
    private Integer alturaDir;

    public AlturaArvore() {
        this.alturaDir = 0;
        this.alturaEsq = 0;
    }

    public void alturaArvoreDir() {
        this.alturaDir++;
    }

    public void alturaArvoreEsq() {
        this.alturaEsq++;

    }

    public Integer getAlturaEsq() {
        return alturaEsq;
    }

    public Integer getAlturaDir() {
        return alturaDir;
    }
}
