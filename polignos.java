package br.edu.univas;
import java.io.IOException;
import java.util.Scanner;


public class polignos {
	
		public static void main(String[] args)throws IOException  {

	        boolean Sair = false;
	        int dados;
	        int X;
	System.out.println(
	                "Voc� est� utilizando um programa para resolu��o de �reas de Pol�gonos.");
	        
	        while(Sair == false) { //enquanto (Sair for falso)
	        	System.out.println("\nSelecione o tipo de pol�gono:");
	        	System.out.println("1.Tri�ngulo");
	             System.out.println("2.Quadrado");
	             System.out.println("3.Paralelogramo");
	             System.out.println("4.Trap�zio");
	             System.out.println("9.Sair");
	        	Scanner leitura = new Scanner(System.in); //ler � um scanner
	        	dados = leitura.nextInt(); // dados � igual aos dados do scanner
	        if(dados == 1) {/*se digitaram 1 para Tri�ngulo*/
	        	System.out.println("Voc� escolheu Tri�ngulo, digite o valor da base: ");
	        	int b = leitura.nextInt();
	          	System.out.println("Agora o valor da altura: ");
	        	int h =leitura.nextInt();      	
	        	X = (b * h)/2;
	        	System.out.println("A �rea do Tri�ngulo �: "+X);
	        }
	        else if(dados == 2) {/*se digitaram 2 para Quadrado*/
	        	System.out.println("Voc� escolheu Quadrado, digite o valor de um dos Lados: ");
	        	int y = leitura.nextInt();
	        	X = y * y;
	        	System.out.println("A �rea do Quadrado �: "+X);}
	        else if(dados == 3) {/*se digitaram 3 para Paralelogramo*/
	        	System.out.println("Voc� escolheu Paralelogramo, digite o valor da base: ");
	        	int b = leitura.nextInt();
	          	System.out.println("Agora o valor da altura: ");
	        	int h =leitura.nextInt(); 
	        	X = b * h;
	        	System.out.println("A �rea do Paralelogramo �: "+X);
	        }
	        else if(dados == 4) {/*se digitaram 4 para Trap�zio*/
	          	System.out.println("Voc� escolheu Trap�zio, digite o valor da base maior: ");
	        	int B = leitura.nextInt();
	          	System.out.println("Agora o valor da base menor: ");
	        	int b = leitura.nextInt();
	          	System.out.println("E por �ltimo o valor da altura: ");
	        	int h =leitura.nextInt(); 
	        	X = ((B + b)*h)/2;
	        	System.out.println("A �rea do Trap�zio �: "+X);
	        }
	        else if(dados == 9) {/*para sair*/Sair = true; continue;}
	        else System.out.println("Op��o inv�lida! Por favor, digite uma op��o correta!");
	      
	        while (true) {
	    	System.out.println("\n0. Voltar ao menu \n9. Sair");
	    	int m = leitura.nextInt();
	    	if(m == 0) {break;}
	    	else if(m == 9) {Sair = true; break;}
	    	else {System.out.println("Op��o inv�lida! Por favor, digite uma op��o correta!");
	    	}} }
	        System.out.println("obrigada :) Saindo..."); } }



