
/**
 * Desafio 2 do trabalho de Introdução a programação.
 * Número de matrícula : 242004307
 * @timóteo.xavier
 * @1.0
 */
import java.util.Scanner;
public class Paintball
{
    public static void main(String [] args){
        // entrada de dados para caĺculo do preço */
        Scanner sc = new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Olá! Vamos calcular o aluguel do paintball.");
        System.out.println("Digite a hora inicial.");
        int hora1 = sc.nextInt();
        System.out.println("Digite a hora de término do aluguel.");
        int hora2 = sc.nextInt();
        System.out.println("Digite a quantidade de jogadores.");
        int quant = sc.nextInt();
        
        //Condicionais para averiguar como será feito o cálculo do preço /
        
        if (quant > 20) {
            // Caso o usuário queira alugar para mais de 20 pessoas (lotação máxima) /
            System.out.println("Lotação máxima ultrapassada. Tente novamente");
        }
        // quant > 0 && quant >= 10 simplificado para quant < 11)
        else if(quant < 11){
            // Se há até 11 participantes /
            int tempo = 0;
            // Cálculo de horas de uso /
            if (hora2 > hora1){
                tempo = hora2 - hora1;
            } else {
                tempo = 24 - hora1 + hora2;
            }
            // Cálculo final do preço /
            double total = 100 + (tempo - 1)*60;
            // Caso o aluguel seja após as 20hs, há um aumento de 20% no preço /
            if(hora1 >= 20){
                total += total*0.2;
                System.out.println("O valor total a ser pago é de R$ " +total);
            } else {
                 System.out.println("O valor total a ser pago é de R$ " +total);
            }
        }
        else if(quant > 10 && quant >= 20){
            // Estrutura de código idêntica para a segunda condicional, apenas valores alterados */ 
            int tempo = 0;
            if (hora2 > hora1){
                tempo = hora2 - hora1;
            } else {
                tempo = 24 - hora1 + hora2;
            }
            double total = 180 + (tempo - 1)*102;
            if(hora1 >= 20){
                total += total*0.2;
                System.out.println("O valor total a ser pago é de R$ " +total);
            } else {
                 System.out.println("O valor total a ser pago é de R$ " +total);
            }
        } 
    }
        
}
