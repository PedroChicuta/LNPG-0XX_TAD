public class Peca {
    String tipo;
    String cor;
    int posicao;

    public void moverPeca(int NovaPosicacao){
        this.posicao = NovaPosicacao;
    }
    public void capturarPeca(Peca pecaAdvesaria){
        String adv = pecaAdvesaria.tipo;
        System.out.printf("%s foi capturado", adv);
    }
    public boolean podeMover(int posicao){
        if(posicao>0 || posicao<=64){
            return true;
        }return false;
    }
    
    public String[] infoPeca(){
        String[] arr = new String[3];
        arr[0] = this.tipo;
        arr[1] = this.cor;
        arr[2] = Integer.toString(this.posicao);
        return arr;
    }
}
