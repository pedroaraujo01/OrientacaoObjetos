//4 - Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade
// do carro.
public class Carro {
    String modelo;
    int ano;
    String cor;
    int idade;

    void exibirFichaCarro(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + idade);
    }
    public int calcularIdade(){
        idade = 2025 - ano;
        return idade;
    }
}
