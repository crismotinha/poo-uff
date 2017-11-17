package agendaswing;
import java.awt.*;
import javax.swing.*;

public class AgendaSwing {

    public static void main(String[] args) {
        // Painel Esquerdo
        String[] pessoas = { "Eu", "Você", "Ele", "Ela"}; 
        JList listaPessoas = new JList(pessoas);
        listaPessoas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);        
        JScrollPane painelEsquerdo = new JScrollPane(listaPessoas);
        
        // Painel Direito
        JPanel painelNome = new JPanel();
        JLabel labelNome = new JLabel("Nome:");
        JTextField inputNome = new JTextField(20);
        inputNome.setText("Cris");
        painelNome.add(labelNome);
        painelNome.add(inputNome);
        
        JPanel painelTel = new JPanel();
        JLabel labelTel = new JLabel("Telefone:");
        JTextField inputTel = new JTextField(20);
        inputTel.setText("25789654");
        painelTel.add(labelTel);
        painelTel.add(inputTel);
        
        JPanel painelDetalhes = new JPanel();
        JLabel labelDetalhes = new JLabel("Detalhes:");
        JTextArea inputDetalhes = new JTextArea(5, 20);
        inputDetalhes.setText("");
        painelDetalhes.add(labelDetalhes);
        painelDetalhes.add(inputDetalhes);
        
        JButton botaoAdd = new JButton("Adicionar");
        JButton botaoEdit = new JButton("Editar");
        JButton botaoDel = new JButton("Deletar");
  
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout());
        painelBotoes.add(botaoAdd);
        painelBotoes.add(botaoEdit);
        painelBotoes.add(botaoDel);
        
        JPanel painelDireito = new JPanel();
        painelDireito.setLayout(new GridLayout(0,1));
        painelDireito.add(painelNome);
        painelDireito.add(painelTel);
        painelDireito.add(painelDetalhes);
        
        painelDireito.add(painelBotoes);
        // -------------------------------
        
        JFrame janela = new JFrame("Janela");
        janela.setLayout(new GridLayout(1,2));
        janela.getContentPane().add(painelEsquerdo);
        janela.getContentPane().add(painelDireito);
        
        
        // -------------------------------
        botaoAdd.addActionListener();
        
        
        // -------------------------------
        janela.pack();
        janela.setVisible(true);
    }
}
