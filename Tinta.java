
/**
 * Desafio 1 para entregar em 13/09.
 *  * Número de matrícula : 242004307
 * @timoteo.xavier
 * @1.1 (um número da versão ou uma data)
 */
 
import java.util.Scanner;
public class Tinta
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\f");
        
        /** Nessa etapa, o usuário passa todos os dados que virão a ser necessários */
        
        System.out.println("Por favor, utilize as medidas em metros.");
        System.out.println("Digite o comprimento de um dos lados do prédio 1");
        double lado1 = sc.nextDouble();
        System.out.println("Digite o comprimento do raio da escultura");
        double raio2 = sc.nextDouble();
        System.out.println("Digite o comprimento do terreno.");
        double comp = sc.nextDouble();
        System.out.println("Digite a largura do terreno.");
        double larg = sc.nextDouble();
        System.out.println("Digite o comprimento do prédio 3.");
        double lado3 = sc.nextDouble();
        System.out.println("Digite a largura do prédio 3.");
        double lado4 = sc.nextDouble();
        System.out.println("Digite o valor de uma caixa de cerâmica individual.");
        double caixavalor = sc.nextDouble();
        
        /** cálculo do valor da tinta */
        double x = lado1*lado1*6;
        x = x - 0.2*x;
        double y = Math.pow(raio2, 2)*Math.PI*4;
        double preco1 = (x + y)/0.5*216;
        System.out.println("O valor necessário, para comprar a tinta será de R$ " +preco1 + ".");
        
        /** cálculo da quantidade de caixas e valor total da cerãmica **/
        double areat = comp*larg;
        double z = areat - Math.pow(lado1,2) - Math.PI*Math.pow(raio2,2) - lado3*lado4;
        /** não tinha convertido as medidas da peça de cerâmica para metros, agora foi resolvido */
        double c = z/(10*0.8*0.6);
        c = Math.ceil(c + 0.05*c);
        double preco2 = caixavalor*c;
        
        /** Observação: O cálculo do preço das tintas poderia ser um método separado, bem como o da quantidade de caixas
        *O preço da cerâmica poderia fazer na main() mesmo
        */
        System.out.println("A quantidade de caixas de cerÂmica é de " +c +" caixas.");
        System.out.println("O valor total das caixas será de R$ " +preco2 +".");
        

        
    }
}
