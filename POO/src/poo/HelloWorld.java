/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class HelloWorld {

    public static void main(String[] args) {
        Scanner keyword = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int cents = keyword.nextInt();
        int one = cents/100;
        cents = cents - (one*100);
        int fifty = (cents/50);
        cents = cents - (fifty*50);
        int quarter = (cents/25);
        cents = cents - (quarter*25);
        int ten = (cents/10);
        cents = cents - (ten*10);
        int five = (cents/5);
        cents = cents - (five*5);
        int onecent = cents;        
        
        System.out.println("Moedas: \n1 real: " + one + "\n50: " + fifty
                + "\n25: " + quarter + "\n10: " + ten + "\n5: " + five
                + "\n1: " + onecent);
        
    }
    
}
