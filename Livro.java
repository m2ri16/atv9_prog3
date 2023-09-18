class Livro {
    private String titulo;
    private String autor;   
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String verificarDisponibilidade() {
        if (disponivel) {
            return "Disponível.";
        } else {
            return "Não está disponível.";
        }
    }
    
    public static void main(String[] args) {
        Livro livro1 = new Livro("Emma", "Jane Austen");
        Livro livro2 = new Livro("Um estudo em vermelho", "Sir Arthur Conan Doyle");

        // Define o status de disponibilidade dos livros
        livro1.setDisponivel(true); // Livro 1 está disponível
        livro2.setDisponivel(false); // Livro 2 não está disponível

        // Chama o método verificarDisponibilidade para cada livro e exibe a mensagem correspondente
        System.out.println(livro1.verificarDisponibilidade());
        System.out.println(livro2.verificarDisponibilidade());
    }

}
