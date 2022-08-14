package br.com.lucas.service;

import org.springframework.stereotype.Service;

import br.com.lucas.exceptions.UnsupportedMathOperationException;

@Service
public class MathService {

	private Double convertToDouble(String str) {
		if(str == null) return 0D;
		String number = str.replaceAll(",", ".");
		if(isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}

	private boolean isNumeric(String str) {
		if(str == null) return false;
		String number = str.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
		
	}
	
	private void lancarEx (String n1, String n2) {
		
		if(!isNumeric(n1) || !isNumeric(n2)){
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		
	}
	
	public Double sun(String n1, String n2) {
		
		lancarEx(n1, n2);
		
		return convertToDouble(n1) + convertToDouble(n2);
		
	}
	
	public Double divi(String n1, String n2) {
		
		lancarEx(n1, n2);
		
		return convertToDouble(n1) / convertToDouble(n2);
		
	}
	
	public Double mult(String n1, String n2) {
		
		lancarEx(n1, n2);
		
		return convertToDouble(n1) * convertToDouble(n2);
		
	}
	
	public Double mean(String n1, String n2) {
		
		lancarEx(n1, n2);
		
		return (convertToDouble(n1) + convertToDouble(n2))  / 2;
		
	}
	
	public Double sub(String n1, String n2) {
		
		lancarEx(n1, n2);
		
		return convertToDouble(n1) - convertToDouble(n2);
		
	}
	
	public Double sqr(String n1) {
		
		lancarEx(n1, "0");

		return Math.sqrt(convertToDouble(n1));
		
	}
}
