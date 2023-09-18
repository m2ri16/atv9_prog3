import java.util.ArrayList;
import java.util.List;

public class Funcionario{
    public String nome;
    public double salarioAnual; 
    public int idade;

    public Funcionario(String nome, double salarioAnual, int idade) {
        this.nome = nome;
        this.salarioAnual = salarioAnual;
        this.idade = idade;
    } 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Arthur", 48000, 19));
        funcionarios.add(new Funcionario("Rennan", 52000, 20));
        funcionarios.add(new Funcionario("Marina", 60000, 19));

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.salarioAnual > 50000 && funcionario.idade < 30) {
                System.out.println(funcionario.nome);
            }
        }
        
    }
}