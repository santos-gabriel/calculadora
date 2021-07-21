// pacote
package calculadora;

import java.util.Scanner;
import calculadora.Operacao;

// classe
public class Principal {
    
    public static void main(String [] ags) {
        /* comentário por bloco */
        // comentário por linha
        // System.out.println("Hello World!");
        Operacao obj1 = new Operacao();
        Operacao obj2 = new Operacao();
        
        double valor1;
        double valor2;
        double total;
        String operacao;
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Informe o valor 1: ");
        valor1 = scanner.nextDouble();
        
        System.out.println("Informe o valor 2: ");
        valor2 = scanner.nextDouble();
        
        System.out.println("Informe a operação matemática: ");
        operacao = scanner.next();
        
        obj1.setValor1(valor1);
        obj1.setValor2(valor2);
        obj1.setTipoOperacao(operacao);
                
        total = obj1.calculaValor();    
        // total = calcula(valor1, valor2, operacao);
        System.out.println("O valor total da soma é: "+total);        
        
    }
            
}
