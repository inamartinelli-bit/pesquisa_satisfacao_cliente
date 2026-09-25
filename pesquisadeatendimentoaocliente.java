import java.util.Scanner;
import javax.swing.JOptionPane;

public class pesquisadeatendimentoaocliente { //Início do programa

    public static void main(String[] args) { //Início da programação
        /*  As chaves representam a estrutura principal.
            Marcam o início do código,
            onde será inserida a codificação a ser desenvolvida.
         */
        //Processamento
        //Declaração das Variáveis
        String nome; //Variável para armazenamento do nome
        int idade;
        int opiniao;
      
        //Utilizando o leitor no início do código
        Scanner ler = new Scanner(System.in);
                   
        System.out.println("Pesquisa de Atendimento ao Cliente");
        System.out.println("==================================");

        
        //Laço de repetição for
        for (int i=1; i<=50; i=i+1) { //Laço de repetição For referente a opinião de 50 clientes  
            switch (i) {
            
            case 1: 
                JOptionPane.showMessageDialog(null, "+i<=10");
                break; 
            
            case 2: 
                JOptionPane.showMessageDialog(null, "Bom");
                break;
            
            case 3:
                JOptionPane.showMessageDialog(null,"+i<=10");
                break;
                            
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
                
            }
            
            System.out.println("Digite o seu nome: "+i);
            nome = ler.next();
            System.out.println("Digite a sua idade: ");
            idade = ler.nextInt();

            opiniao = Integer.parseInt(JOptionPane.showInputDialog("Dê a sua opinião quanto ao atendimento prestado"
                + "\n 1- EXCELENTE"
                + "\n 2- BOM"
                + "\n 3- RUIM"));  

                } //Fecha o laço de repetição for. 
       
    } //Fim da programação
    
} //Fim do programa
