package aula;

import java.util.Scanner;

public class Calculadora {
	  
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        boolean loop = true;
        int num1, num2,valorFinal;
		int operacao;

        While(loop);{
            System.out.print("Escolha a opera��o:\n"
            + "1 - Adi��o\n"
            + "2 - Subtra��o\n"
            + "3 - Multiplica��o\n"
            + "4 - Divis�o\n"
            + "5 - Sair");
            operacao = entrada.nextInt();
        switch (operacao) {
            case 1:
                System.out.println("informe o primeiro valor: ");
                num1 = entrada.nextInt();
                System.out.println("informe o Segundo valor: ");
                num2 = entrada.nextInt();
                valorFinal = num1 + num2;
                System.out.println("O Valor da soma �: "+valorFinal);
            case 2:
                System.out.println("informe o primeiro valor: ");
                num1 = entrada.nextInt();
                System.out.println("informe o Segundo valor: ");
                num2 = entrada.nextInt();
                valorFinal = num1 - num2;
                System.out.println("O Valor da subtra��o �: "+valorFinal);
                break;
            case 3:
                System.out.println("informe o primeiro valor: ");
                num1 = entrada.nextInt();
                System.out.println("informe o Segundo valor: ");
                num2 = entrada.nextInt();
                valorFinal = num1*num2;
                System.out.println("O Valor da multiplica��o �: "+valorFinal);
                break;
            case 4:
                System.out.println("informe o primeiro valor: ");
                num1 = entrada.nextInt();
                System.out.println("informe o Segundo valor: ");
                num2 = entrada.nextInt();
                valorFinal = num1/num2;   
                System.out.println("O Valor da divis�o �: "+valorFinal);
                break;
            default:
            	loop = false;
                break;
                
        }   
        }
}

	private static void While(boolean loop) {
		// TODO Auto-generated method stub
		
	}
    

    }