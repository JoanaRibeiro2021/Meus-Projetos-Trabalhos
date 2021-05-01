package br.edu.univas;
import java.io.IOException;
import java.util.Scanner;


public class polignos {
	
		public static void main(String[] args)throws IOException  {

	        boolean Sair = false;
	        int dados;
	        int X;
	System.out.println(
	                "Você está utilizando um programa para resolução de áreas de Polígonos.");
	        
	        while(Sair == false) { //enquanto (Sair for falso)
	        	System.out.println("\nSelecione o tipo de polígono:");
	        	System.out.println("1.Triângulo");
	             System.out.println("2.Quadrado");
	             System.out.println("3.Paralelogramo");
	             System.out.println("4.Trapézio");
	             System.out.println("9.Sair");
	        	Scanner leitura = new Scanner(System.in); //ler é um scanner
	        	dados = leitura.nextInt(); // dados é igual aos dados do scanner
	        if(dados == 1) {/*se digitaram 1 para Triângulo*/
	        	System.out.println("Você escolheu Triângulo, digite o valor da base: ");
	        	int b = leitura.nextInt();
	          	System.out.println("Agora o valor da altura: ");
	        	int h =leitura.nextInt();      	
	        	X = (b * h)/2;
	        	System.out.println("A área do Triângulo é: "+X);
	        }
	        else if(dados == 2) {/*se digitaram 2 para Quadrado*/
	        	System.out.println("Você escolheu Quadrado, digite o valor de um dos Lados: ");
	        	int y = leitura.nextInt();
	        	X = y * y;
	        	System.out.println("A área do Quadrado é: "+X);}
	        else if(dados == 3) {/*se digitaram 3 para Paralelogramo*/
	        	System.out.println("Você escolheu Paralelogramo, digite o valor da base: ");
	        	int b = leitura.nextInt();
	          	System.out.println("Agora o valor da altura: ");
	        	int h =leitura.nextInt(); 
	        	X = b * h;
	        	System.out.println("A área do Paralelogramo é: "+X);
	        }
	        else if(dados == 4) {/*se digitaram 4 para Trapézio*/
	          	System.out.println("Você escolheu Trapézio, digite o valor da base maior: ");
	        	int B = leitura.nextInt();
	          	System.out.println("Agora o valor da base menor: ");
	        	int b = leitura.nextInt();
	          	System.out.println("E por último o valor da altura: ");
	        	int h =leitura.nextInt(); 
	        	X = ((B + b)*h)/2;
	        	System.out.println("A área do Trapézio é: "+X);
	        }
	        else if(dados == 9) {/*para sair*/Sair = true; continue;}
	        else System.out.println("Opção inválida! Por favor, digite uma opção correta!");
	      
	        while (true) {
	    	System.out.println("\n0. Voltar ao menu \n9. Sair");
	    	int m = leitura.nextInt();
	    	if(m == 0) {break;}
	    	else if(m == 9) {Sair = true; break;}
	    	else {System.out.println("Opção inválida! Por favor, digite uma opção correta!");
	    	}} }
	        System.out.println("obrigada :) Saindo..."); } }



