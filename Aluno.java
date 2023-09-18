class Aluno {
    private String nome;
    private int matricula;
    private double[] notas;

    public Aluno(String nome, int matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[3];

        alunos[0] = new Aluno("Rennan", 01234, new double[]{7.0, 8.0, 5.0});
        alunos[0] = new Aluno("Arthur", 435678, new double[]{6.0, 7.0, 8.0});
        alunos[0] = new Aluno("Marina", 94567, new double[]{7.0, 8.0, 9.0});

        for (Aluno aluno : alunos) {
            double media = aluno.calcularMedia();
            if (media >= 7.0) {
                System.out.println("Aluno aprovado!");
                System.out.println("Nome: " + aluno.nome + ", Matrícula: " + aluno.matricula + ", Média: " + media);
            } else {
                System.out.println("Aluno reprovado");
                System.out.println("Nome: " + aluno.nome + ", Matrícula: " + aluno.matricula + ", Média: " + media);
            }
        }
    }
}
