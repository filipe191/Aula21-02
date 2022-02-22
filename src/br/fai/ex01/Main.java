package br.fai.ex01;

public class Main {


	public static void main(String[] args) {

		Main app = new Main();
		app.start();
		
	}
	
	private void start() {
		
		int idade = 15;
		
		
		System.out.println("A idade é de " + idade);
		
		idade = (idade + 5) * 2;
		
		System.out.println("Result 1: " + idade);
		
		idade = idade - 5;
		idade -= 5;
		
		System.out.println("Result 2: " + idade);
		
		if(idade > 20) {
			System.out.println("A idade é maior que 20.");
		}else {
			System.out.println("A idade é menor que 20");
		}
		
		
		
	}

}
