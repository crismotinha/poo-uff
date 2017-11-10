package fraseinvertida;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Mapao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua frase");
        String linhaLida = scan.nextLine();
        Map<String,Integer> palavras = new HashMap<>();
        for (String palavra : linhaLida.split(" ")){
            if (palavras.containsKey(palavra)){
                int qtd = palavras.get(palavra);
                palavras.put(palavra, (qtd+1));
            }
            else {
                palavras.put(palavra, 1);
            }
        }
        for (String palavra : palavras.keySet()){
            System.out.println("- "+palavra+" "+palavras.get(palavra)+"x vezes");
        }
    }
}
