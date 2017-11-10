package calculadora;

import java.util.Scanner;
import java.util.ArrayList;

public class Calculadora {
    public static int memory;
    public static boolean exit = false;
    
    public static ArrayList a;
    
    public static int showMenu(int memory) throws java.util.InputMismatchException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Estado da memória: " + memory);
        System.out.println("Opções:");
        System.out.println("(1) Somar\n(2) Subtrair\n(3) Multiplicar");
        System.out.println("(4) Dividir\n(5) Limpar memória"
                + "\n (6)Sair do programa");
        System.out.println("Qual opção você deseja?");
        try {
            return keyboard.nextInt();
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("Você deve escolher de 1 - 6");
            return showMenu(memory);
        }
    }
    public static int inputValue() throws java.util.InputMismatchException {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Insira o valor que você quer efetuar a operação:");
            return keyboard.nextInt();
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Você deve passar um número inteiro, tente novamente");
            return inputValue();
        }
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
    public static int divide(int x, int y) throws ArithmeticException {
        return x/y;
    }
    public static int divide(int value) throws ArithmeticException {
        return divide(memory, value);
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
                    try {
                        memory = divide(inputed);
                    }
                    catch (ArithmeticException e){
                        System.out.println("Error " + e);
                    }
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