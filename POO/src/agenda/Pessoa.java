package agenda;


public class Pessoa {
    public static final byte COMPARA_NOME = 1;
    public static final byte COMPARA_IDADE = 2;
    
    private String nome;
    private int idade;
    
    public int getIdade() {
        return idade;
    }
    public int setAge(int idade) {
        return this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public String setName(String nome) {
        return this.nome = nome;
    }
    
    public int compara(Pessoa outraPessoa, byte criterio){
        if (criterio == COMPARA_NOME){
            return this.nome.compareTo(outraPessoa.nome);
        }
        else {
            return this.idade - outraPessoa.idade;
        }
    }
    
    public Pessoa(String name, int age){
        this.nome = name;
        this.idade = age;
    }
    
    public String toString() {
        return(nome + "\t" + idade);
    }
}
