
/**
 * Escreva uma descrição da classe Emprestimo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner; 
public class Emprestimo
{
   public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Olá, cliente! Por favor, escolha qual ação você quer realizar."); 
        System.out.println("Digite o número correspondente á operação.");
        System.out.println("1 – Incluir Clinte");
        System.out.println("2–  Mostrar clientes cadastrados");
        System.out.println("3 – Pesquisar cliente por nome");
        System.out.println("4 – Incluir equipamento"); 
        System.out.println("5 – Mostrar equipamentos");  
        System.out.println("6 – Pesquisar equipamento por nome"); 
        System.out.println("7 – Retirar equipamento");  
        System.out.println("8 – Devolver equipamento");  
        System.out.println("9 – Quantidade total de equipamento disponíveis no sistema de empréstimo"); 
        System.out.println("10 - A definir"); 
        System.out.println("11 - Sair do programa"); 
        int opcao= sc.nextInt();
        
        switch(opcao){
            case 1:
                
            case 2:
                
            case 3:
                
            case 4:
                
            case 5:
                
            case 6:
                
            case 7:
            
            case 8:
                
            case 9:
            
            case 10:
            System.out.println("Obrigado!");
            System.exit(0);
            break;
        }
   }
   
   public static String nomeCliente(){
}
  
}
