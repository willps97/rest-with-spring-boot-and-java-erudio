package br.com.erudio.math;



public class SimpleMath {

	public Double Sum(Double numberOne, Double numberTwo) { 
		
		return numberOne + numberTwo;
	}

	//Subtração
	public Double Sub(Double numberOne, Double numberTwo) {
		
		return numberOne - numberTwo;
	}
	
	//Divisão
	public Double Div(Double numberOne, Double numberTwo) {
		
		return numberOne / numberTwo;
	}
	
	//Multiplicação

	public Double Time(Double numberOne, Double numberTwo) {
		
		return numberOne * numberTwo;
	}
	
	//Raiz Quadrada
	public Double Sqrt(Double numberOne){
		
		return Math.sqrt(numberOne);
	}	
}
