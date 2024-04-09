public class Empregado {
    String nome;
    int id;
    String cargo; 
    float salario;
    String Departamento;
    public void atualizarDados(String nome,String cargo,float salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    public void mudarDepartamento(String novoDep){
        this.Departamento = novoDep;
    }
    public String InfoDepartamento(Empregado empregado){
        return empregado.Departamento;
    }
}
