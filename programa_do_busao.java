
//Crie uma classe para um ônibus turístico para levar pessoas de São Paulo até uma cidade turística.
//A classe deve armazenar o local atual, quantidade de paradas, capacidade do ônibus e quantas pessoas estão
//presentes nele. A classe deve também disponibilizar os seguintes métodos:
//Inicializa (método construtor), Entra (quando entra alguém), Sai (quando alguém desce do ônibus), Parar (o ônibus para de andar) e andar.Crie um prgrama que instacie essa classe três vezes, listando suas paradas.
//Dentro do programa, deve ser possível modificar cada um dos atributos do ônibus.

// ÔNIBUS PARA BADY BASSIT

public class Index {
    
    public static void main(String[] args) {
       int lugares, pessoas, paradas;
       Spring local_de_partida, local_de_destino;

        Busao.liga();
        Passageiros.entram();
        Assentos.preenchidos();        
    }
}
