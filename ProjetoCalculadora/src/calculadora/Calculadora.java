
package calculadora;

        import javax.swing.JOptionPane;
     

public class Calculadora {

       
   
    public static void main(String[] args) {
        
        // Váriáveis utilizadas. n1 representa o primeiro valor digitado, n2 é o segundo valor, op variável de escolha de operação.     
        float n1, n2;
        int op;
        
        // Esta seção constrói o ambiente grafico ja com as opções de operações inseridas.
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: ")); // recebe o primeiro valor.
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: ")); // recebe o segundo valor.
        op = Integer.parseInt(JOptionPane.showInputDialog(" escolha a operação! Digite [1] para soma, [2] para subtração, [3] para multiplicação, [4] divisão.")); // recebe o comando de operação!
        
        // Estrutura de múltipla escolha:
            switch (op) {
            
                case 1: op = (int) (n1+n2);
                    
                    JOptionPane.showMessageDialog(null, " O valor da soma é: " + op);
                         break; // Recebe os dados e efetua a operação da soma.
                    
                        case 2: op = (int) (n1-n2);
                            JOptionPane.showMessageDialog(null, " O valor da subtração é: " + op);
                                break; // Recebe os dados e efetua a operação da subtração.
                                
                                case 3: op = (int) (n1*n2);
                                    JOptionPane.showMessageDialog(null, " O valor da multiplicação é: " + op);
                                         break; // recebe os dados e efetua a operação da multiplicação.
                                     
                                        case 4: op = (int) (n1/n2);
                                            JOptionPane.showMessageDialog(null, " O valor da divisão é: " + op);
                                                break; // Recebe os dados e efetua a operação da divisão.
                                                
                                        default: JOptionPane.showMessageDialog(null, " Opção inválida! tente novamente!"); // Retorna erro na escolha da opção e pede para executar novamente.
                                                       
                                            
                                            
                                        }
            
            }
    }
    

