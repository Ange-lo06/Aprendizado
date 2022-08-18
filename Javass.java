/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javass;
import java.util.Scanner;
/**
 *
 * @author SENAI
 */
public class Javass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        String nomep;
        int quant;
        float preço;
        int formap;
        float total;
        float totalv;
        double porc;
        double porc2;
        double porc3;
        Scanner entrada = new Scanner(System.in);
         System.out.println("------- Digite seu nome -------");
         nome = entrada.nextLine();
         System.out.println("------- Digite o nome do produto que deseja -------");
         nomep = entrada.nextLine();
         System.out.println("------- Digite a quantidade do produto -------");
         quant = entrada.nextInt();
         System.out.println("------- Digite o preço do produto -------");
         preço = entrada.nextFloat();
         total = (preço*quant);
         System.out.println("----- O total da compra é:R$" + total + "-----");
         
         //Forma de pagamento
         System.out.println("---------- Opções de pagamento ----------");
         System.out.println("--- 1 = Á vista com 10% de desconto ---");
         System.out.println("--- 2 = Pix com 5% de desconto ---");
         System.out.println("--- 3 = Cartão de crédito com 5% de juros ---");
         System.out.println("Escolha entre as formas de pagamento 1 , 2 ou 3");
         formap = entrada.nextInt();
         
         //Resultado
         if(formap == 1) {
             porc = total - (total * 0.10);
             System.out.println("----- " + nome + " sua compra de um(a) " + nomep + " -----");
             System.out.println("----- O valor total do pagamento foi:" + porc + "-----");
         }
         else if (formap == 2){
             porc2 =  total -(total * 0.05);
             System.out.println("----- " + nome + " sua compra de um(a) " + nomep + " -----");
             System.out.println("----- O valor total do pagamento foi:" + porc2 + "-----");
         }
         else if (formap == 3){
             porc3 = total + (total * 0.05);
             System.out.println("----- " + nome + " sua compra de um(a) " + nomep + " -----");
             System.out.println("----- O valor total do pagamento foi: " + porc3 + " -----");
         }
    }
         

}