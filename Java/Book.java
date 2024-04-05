public class Book {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private int quantidadeDeCopias;

    public void emprestarLivro(){
        this.quantidadeDeCopias--;
    }
    public void devolverLivro(){
        quantidadeDeCopias++;
    }
    public boolean copiaDisponivel(){
        if(this.quantidadeDeCopias>0){
            return true;
        }
        else{
            return false;
        }
    }
    public String informacao(){
        String txt = String.format("Autor: %s;\nTitulo:%s;\nAno de publicação:%d;\nQuantidade de copias disponíveis:%d", this.titulo,this.autor,this.anoDePublicacao,this.quantidadeDeCopias);
        return txt;
    }
}