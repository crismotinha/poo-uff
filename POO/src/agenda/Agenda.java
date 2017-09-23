package agenda;

import java.util.Scanner;

public class Agenda {
    private Pessoa[] pessoas;
    
    public Agenda(int numeroPessoas){
        this.pessoas = new Pessoa[numeroPessoas];
    }
    
    public void preenche(){
        Scanner keyboard = new Scanner(System.in);
        
        for (int i=0; i<pessoas.length; i++){
            System.out.println("Insira o nome da "+ (i+1) + "a pessoa: \n");
            String nome = keyboard.nextLine();
            System.out.println("Insira a idade da "+ (i+1) + "a pessoa: \n");
            int idade = keyboard.nextInt();
            keyboard.nextLine();
            pessoas[i] = new Pessoa(nome,idade);
        }
    }
    
    public void ordena(byte criterio) {
        for (int j=0; j<pessoas.length; j++) {
            for (int i=0; i<(pessoas.length-1); i++){
                if(pessoas[i].compara(pessoas[i+1], criterio)>0){
                    Pessoa aux = pessoas[i];
                    pessoas[i] = pessoas[i+1];
                    pessoas[i+1] = aux;
                }
            }
        }
    }
    
    public void exibe(){
        for (int i = 0; i< pessoas.length; i++){
            System.out.println(pessoas[i].toString());
        }
    }
    
    public static void main(String[] args){
        Agenda minhaAgenda = new Agenda(3);
        minhaAgenda.preenche();
        minhaAgenda.ordena(Pessoa.COMPARA_NOME);
        minhaAgenda.exibe();
        minhaAgenda.ordena(Pessoa.COMPARA_IDADE);
        minhaAgenda.exibe();
    }
}
