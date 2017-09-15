package poo;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Pessoas {
    static public void main (String []args){
        Scanner keyboard = new Scanner(System.in);
        final int PEOPLE = 3;
        String[] name = new String[PEOPLE];
        int[] age = new int[PEOPLE];
        
        for (int i=0; i<PEOPLE; i++){
            System.out.println("Insira o nome da "+ (i+1) + "a pessoa: \n");
            name[i] = keyboard.nextLine();
            System.out.println("Insira a idade da "+ (i+1) + "a pessoa: \n");
            age[i] = keyboard.nextInt();
            keyboard.nextLine();
        }
        for (int i=0; i<name.length; i++){
            System.out.println("Pessoa "+ (i+1) + "= "+ name[i]
                    + " com " + age[i] + " anos. \n");
        }
        for (int j=0; j<PEOPLE; j++) {
            for (int i=0; i<(PEOPLE-1); i++){
                if(name[i].compareTo(name[i+1]) > 0){
                    String auxString = name[i+1];
                    name[i+1] = name[i];
                    name[i] = auxString;
                    int auxInt = age[i+1];
                    age[i+1] = age[i];
                    age[i] = auxInt;
                }
            }
        }
        System.out.println("Ordenado em ordem alfabética:\n");
        for (int i=0; i<name.length; i++){
            System.out.println((i+1)+ ") "+ name[i]
                    + " com " + age[i] + " anos. \n");
        }
        for (int j=0; j<PEOPLE; j++) {
            for (int i=0; i<(PEOPLE-1); i++){
                if(age[i]>age[i+1]){
                    String auxString = name[i+1];
                    name[i+1] = name[i];
                    name[i] = auxString;
                    int auxInt = age[i+1];
                    age[i+1] = age[i];
                    age[i] = auxInt;
                }
            }
        }
        System.out.println("Ordenado em ordem de idade:\n");
        for (int i=0; i<name.length; i++){
            System.out.println((i+1)+ ") "+ name[i]
                    + " com " + age[i] + " anos. \n");
        }
    }
}
