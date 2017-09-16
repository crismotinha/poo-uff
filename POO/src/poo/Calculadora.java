package poo;
import java.util.Scanner;


public class Calculadora {
    public static int memory;
    public static boolean exit = false;
    
    public static int showMenu(int memory){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Estado da memória: " + memory);
        System.out.println("Opções:");
        System.out.println("(1) Somar\n(2) Subtrair\n(3) Multiplicar");
        System.out.println("(4) Dividir\n(5) Limpar memória"
                + "\n (6)Sair do programa");
        System.out.println("Qual opção você deseja?");
        return keyboard.nextInt();
    }
    public static int inputValue(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insira o valor que você quer efetuar a operação:");
        return keyboard.nextInt();
    }
    public static int sum(int x, int y){
        return x+y;
    }
    public static int sum(int value){
        return sum(value, memory);
    }
    public static int sub(int x, int y){
        return x-y;
    }
    public static int sub(int value){
        return sub(value, memory);
    }
    public static int multiply(int x, int y){
        return x*y;
    }
    public static int multiply(int value){
        return multiply(value, memory);
    }
    public static int divide(int x, int y){
        return x/y;
    }
    public static int divide(int value){
        if (memory == 0){
            return 0;
        }
        return divide(value, memory);
    }
    public static int cleanMemory(){
        return 0;
    }
    public static void exitCalc(){
        exit = true;
    }
    
    public static void main(String[] args){
        while(exit == false){
            int option = showMenu(memory);
            int inputed;
            switch (option){
                case 1:
                    inputed = inputValue();
                    memory = sum(inputed);
                    break;
                case 2:
                    inputed = inputValue();
                    memory = sub(inputed);
                    break;
                case 3:
                    inputed = inputValue();
                    memory = multiply(inputed);
                    break;
                case 4:
                    inputed = inputValue();
                    memory = divide(inputed);
                    break;
                case 5:
                    memory = cleanMemory();
                    break;
                case 6:
                    exitCalc();
                    break;
                default:
                    System.out.println("Escolha de 1-6");
                    break;
            }
        }
    }
}
