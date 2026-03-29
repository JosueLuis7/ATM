// Josué Luís Pimenta Alecrim
// 1261948087
// 29/03/2026
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
       double SaldoInicial = 1000;
       int Caixa = 0;
       double SaldoTotal, deposito, sacar, opcao;
    do {
         System.out.println("=== CAIXA ELETRÔNICO ===\n1 - Depositar\n2 - Sacar\n3 - Consultar saldo\n0 - Sair");
       System.out.println("Escolha uma das opções acima.");
       opcao = entrada.nextInt();

       
       
       switch ((int)opcao) {
       case 1:
           System.out.println("qual valor do deposito?");
           deposito = entrada.nextDouble();
           
           if (deposito > 0) {
           SaldoTotal = SaldoInicial + deposito;
           SaldoInicial += deposito; 
           System.out.println("Deposito realizado com sucesso");
           } else {
            System.out.println("Deposito recusado");
           }
           System.out.println("Saldo Total" + "=" + SaldoInicial + "reais");
           
           break;
           
       case 2:
           System.out.println("Qual o valor do Saque?");
           sacar = entrada.nextDouble();

           if (sacar <= SaldoInicial) {
           SaldoTotal = SaldoInicial - sacar;
           SaldoInicial -= sacar;
           System.out.println("Transação realizada com sucesso");
           } else {
            System.out.println("Ausência de saldo");
           }
           System.out.println("SaldoTotal" + "=" + SaldoInicial + "reais");
           
           break;

       case 3:
           System.out.println("Consultar Saldo");
           System.out.println("Saldo" + "=" + SaldoInicial + "reais");
           break;

       case 0:
           System.out.println("Obrigado. Até logo!");
           break;
       }
    } while (opcao != 0);
    }
}
    

