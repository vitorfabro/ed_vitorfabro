
package ArvoreSimples;


public class No {
    private int codigo;
    private No filhoD;
    private No filhoE;
    
    public No(int codigo)
    {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public No getFilhoD() {
        return filhoD;
    }

    public void setFilhoD(No filhoD) {
        this.filhoD = filhoD;
    }

    public No getFilhoE() {
        return filhoE;
    }

    public void setFilhoE(No filhoE) {
        this.filhoE = filhoE;
    }
}
