package aula;

import java.util.Scanner;

public class Calculadora {
	  
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double num1, num2, resultado = 0;
		int operacao;
		
		
		
        while (true){
            System.out.print("\n\nEscolha a operação:\n"
            + "1 - Adição\n"
            + "2 - Subtração\n"
            + "3 - Multiplicação\n"
            + "4 - Divisão\n"
            + "5 - Sair\n");
            
            operacao = entrada.nextInt();
            
            if (operacao == 1) {
            	System.out.print("Digite o Primeiro Valor: ");
        		num1 = entrada.nextDouble();		
        		System.out.print("Digite o Segundo Valor: ");
        		num2 = entrada.nextDouble();
            	resultado = num1 + num2;
            	break;
            } else if (operacao == 2) {
            	System.out.print("Digite o Primeiro Valor: ");
        		num1 = entrada.nextDouble();		
        		System.out.print("Digite o Segundo Valor: ");
        		num2 = entrada.nextDouble();
            	resultado = num1 - num2;
            	break;
            } else if (operacao == 3) {
            	System.out.print("Digite o Primeiro Valor: ");
        		num1 = entrada.nextDouble();		
        		System.out.print("Digite o Segundo Valor: ");
        		num2 = entrada.nextDouble();
            	resultado = num1 * num2;
            	break;
            } else if (operacao == 4) {
            	System.out.print("Digite o Primeiro Valor: ");
        		num1 = entrada.nextDouble();		
        		System.out.print("Digite o Segundo Valor: ");
        		num2 = entrada.nextDouble();
            	while (num2 == 0) {
            		System.out.print("Operação Inválida. Divisão por 0 \n");
            		System.out.print("Digite o Segundo Valor diferente que 0: \n");
            		num2 = entrada.nextDouble();
            	}
            	
            	resultado = num1 / num2;
            	break;
            } else if (operacao == 5) {
            	System.out.print("FIM DO PROGRAMA\n");
            	resultado = 0;
            	break;
            } else {
            	System.out.print("Comando Inválido\n");
            } 
        }
        
        System.out.print("Resultado é: " + resultado+"\n");
}

	private static void While(boolean loop) {
		// TODO Auto-generated method stub
		
	}
    

    }
