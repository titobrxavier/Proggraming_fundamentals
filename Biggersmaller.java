package lista2setembro;


/**
 * Escreva uma descrição da classe Yolo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Biggersmaller
{
   public static void main(String [] args){
       Scanner entry = new Scanner(System.in);
       System.out.println("\f");
       System.out.println("Type three numbers"); 
       double number1 = entry.nextDouble(); 
       double number2 = entry.nextDouble();
       double number3 = entry.nextDouble(); 
       
       if (number1 > number2 && number1 > number3){
           System.out.println(number1 + " is the biggest number");
       }
       else if (number2 > number1 && number2 > number3){
           System.out.println(number2 + " is the biggest number");
       }
       else if (number3 > number2 && number3 > number1){
           System.out.println(number3 + " is the biggest number");
       }
       else {
           System.out.println("Equal numbers have been typed"); 
       }
       
       
       
       
   }
}
