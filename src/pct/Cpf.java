/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Cpf {
    public static void main(String[] args) {
        
        int soma = 0, idx = 0, d1, d2;
        String Cpf;
        //Objeto de entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\t\t\t validador de Cpf\n");
        
        //Entrada
        System.out.println("informe o Cpf");
        Cpf = entrada.next();
        
        if(Cpf.length()==11){
        //varrer a string para acumular o produto do digito pelo seu próprio índice
            for (int i = 10; i > 2; i--) {
           soma += Character.getNumericValue(Cpf.charAt(idx))*i;
           idx++;
        }
        //Obter o resto inteiro da divisão
        d1 = soma%11;
        //verificando se o d1 é maior ou igual a 2
        if(d1>=2){
            d1 = 11 - d1;
        }else{
            d1 = 0;
        }    
        
        //varrer o valor da string para acumular o produto do digito pelo seu indice 
        soma = 0;
        idx = 0;
            for (int i = 11; i < 2; i--) {
            soma += Character.getNumericValue(Cpf.charAt(idx))*i;
            idx++;
            }
                
        // achando o resto inteiro da divisao por 11
        d2 = soma % 11;
        //verificando se o resto da divisao é maior ou igual a 2
        if(d2>=2){
            d2 = 11 - d2;
        }else{    
        d2 = 0;
        }
        //Resposta
        if(d1 == Character.getNumericValue(Cpf.charAt(9))&& d2 == Character.getNumericValue(Cpf.charAt(10)));
            System.out.println("Cpf valido!");
             
        else
            System.out.println("Cpf invalido!");
            
        }else{ 
            System.err.println("\"Cpf:\" + Cpf + \" tem a quantidade de dígitos incorreto!\"");    
                
           
      }
        
    }
}    
