import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
    
public class Main {
    
    public static void main(String[] args) throws ParseException{
    	Locale.setDefault(Locale.US);
    	Scanner scanner = new Scanner(System.in);
    	
    	double valorDoJogador;
    	double pontuacaoMinimaNecessaria;
    	double mediaJogador;
    	int rodadaAtual;
    	double pontuacaoParaNaoDesvalorizar;
    	double novaPontuacao;
    	
    	System.out.println("Informe o valor do jogador:  ");
    	valorDoJogador = scanner.nextDouble();
    	
    	pontuacaoMinimaNecessaria = valorDoJogador * 0.4;
    	
    	System.out.println("Média de pontuação (Valor do jogador X 0.4): " + pontuacaoMinimaNecessaria);
    	
    	System.out.println("Informe a média de pontuação do jogador: ");
    	mediaJogador = scanner.nextDouble();
    	
    	System.out.println("Informe a rodada atual: ");
    	rodadaAtual = scanner.nextInt();
    	
    	pontuacaoParaNaoDesvalorizar = mediaJogador / rodadaAtual;
    	
    	while((pontuacaoParaNaoDesvalorizar + mediaJogador) / rodadaAtual > pontuacaoMinimaNecessaria){
    		pontuacaoParaNaoDesvalorizar = pontuacaoParaNaoDesvalorizar - 0.1;
    	};
    	
    	
    	System.out.println(pontuacaoParaNaoDesvalorizar);
    	
    	
    	
    	
    	
    	
    	
        }
}