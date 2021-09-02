package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		Random sorteio = new Random();
		
		Scanner leitor = new Scanner (System.in);
		  
	
		   
		   
		   int escolhaser;
		     
		   
		 System.out.print("escolha um numero (1=pedra) (2=papel) (3=tesoura):");
		 escolhaser = leitor.nextInt();
		
	     int escolhapc = sorteio.nextInt(3)+1;
	     System.out.println("escolha do pc =  "+escolhapc);
	     System.out.println("sua ecolha foi = "+escolhaser);
		   
			 
			  
		if(escolhaser==1) {
			if(escolhapc==1) {
				System.out.println("empate");
			}else if(escolhapc==2) {
				System.out.println("derrota sua");
			}else {
				System.out.println("vitoria sua1");
			}
				
		}else if(escolhaser==2) {
			if(escolhapc==2) {
				System.out.println("empate");
			}else if(escolhapc==1) {
				System.out.println("vitoria sua ");
			}else {
				System.out.println("derrota sua ");
			}
		}else if(escolhaser==3) {
			if(escolhapc==3) {
				System.out.println("empate");
			}else if(escolhapc==1) {
				System.out.println("vitoria pc");
			}else if(escolhapc==2) {
				System.out.println("vitoria sua");
			}else {
				System.out.println("derrota");
			}
		}else if (escolhaser>=4){
			System.out.println("err0,escolha um numero entre 1 e 3.");
		}
		
			
		
	}
 }

