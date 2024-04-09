public class Departamento{
    String nome;
    int quantidadeDeEmpregados;
    int id;
    String localizacao;
    public void adicionarEmpregado(){
        this.quantidadeDeEmpregados++;
    }
    public void removerEmpregado(){
        this.quantidadeDeEmpregados--;
    }
    public int empregadosInfo(){
        return this.quantidadeDeEmpregados;
    }
}