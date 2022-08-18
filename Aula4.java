/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;
import java.util.Scanner;
/**package
 *
 * @author SENAI
 */
public class Aula4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    int cont =0;
    int num2;
    int result;
    String oper;
    System.out.println("------ Bem vindo a tabuada ----- ");
    while (cont <=10){
        System.out.println("----- Digite o operador que de desejar: -----");
        oper = ent.nextLine();
        System.out.println("----- Digite o número da tabuada -----");
        num2 = ent.nextInt();
        if (oper != "+"){
            System.out.println("Operador invalido, digite novamente");
        }
            else if (oper != "-"){
            System.out.println("Operador invalido, digite novamente");
        }
            else if (oper != "*"){
            System.out.println("Operador invalido, digite novamente");
        }
            else if (oper != "/"){
            System.out.println("Operador invalido, digite novamente");
        }
        switch(oper){
            case "*":
                while (cont <=10){
        result = cont * num2;
        System.out.println("--- " + cont + "*"+ num2 + "=" + result + " ---" );
            cont = cont + 1;
                }
            break;
        
        case "/":
            while (cont <=10){
        result = cont / num2;
        System.out.println("--- " + cont + "/"+ num2 + "=" + result + " ---" );
            cont = cont + 1;
            }
      break;
    case "+":
        while (cont <=10){
        result = cont + num2;
        System.out.println("--- " + cont + "+"+ num2 + "=" + result + " ---" );
            cont = cont + 1;
        }
     break;
    case "-":
        while (cont <=10){
        result = cont - num2;
        System.out.println("--- " + cont + "-"+ num2 + "=" + result + " ---" );
            cont = cont + 1;
        }
   
    
    
    }
    
}
    }
    }