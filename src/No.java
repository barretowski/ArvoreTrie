public class No implements Util{
    public No(char letra, boolean flag) {
        this.letra = letra;
        this.flag = flag;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    private char letra;
    private boolean flag;
    private No vLig[];

    public No(char letra, boolean flag, No[] vLig) {
        this.letra = letra;
        this.flag = flag;
        this.vLig = vLig;
    }

    public No getVLig(int pos) {
        return null;
    }

    public void setvLig(int pos, No no) {
    }
}
