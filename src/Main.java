public class Main {
    public static void main(String[] args) {
        //1 - Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
        Pessoa pessoa = new Pessoa();
        pessoa.exibeOla();

        //2 - Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
        Calculadora calculadora = new Calculadora();
        System.out.println("O dobro de 10 e: " + calculadora.dobrarNumero(10));
        //3 - Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para
        // exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
        Musica musica = new Musica();
        musica.titulo="The Door";
        musica.artista="Ed. Sheeran";
        musica.anoLancamento=2022;
        musica.exibirFichaTecnica();
        musica.avaliarMusica(4.3);
        musica.avaliarMusica(3.3);
        musica.avaliarMusica(5.3);
        musica.calcularMediaAvaliacoes();
        musica.exibirFichaTecnica();
        //4 - Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
        Carro carro = new Carro();
        carro.modelo="Audi";
        carro.ano=2000;
        carro.cor="Preto";
        carro.exibirFichaCarro();
        carro.calcularIdade();
        carro.exibirFichaCarro();
        //5 - Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe
        // Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
        Aluno aluno = new Aluno();
        aluno.nome="Pedro";
        aluno.idade=28;
        aluno.exibeInformacoes();

    }
}