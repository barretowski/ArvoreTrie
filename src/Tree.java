public class Tree {
    private No raiz;

    public void insereNaArvore(String palavra){
        No ponteiro = raiz;
        int pos;

        char letra;
        for(int i=0; i< palavra.length(); i++){
            letra = ponteiro.getLetra();
            pos = palavra.charAt(i)-'a';
            if(ponteiro.getVLig(pos)==null) {
                ponteiro.setvLig(pos, new No(palavra.charAt(i),false));
            }
            ponteiro = ponteiro.getVLig(pos);
        }
        ponteiro.setFlag(true);
    }

    private No criaNo(char letra) {
        return null;
    }

    private No buscaPosVLig(No ponteiro) {
        return null;
    }
}
