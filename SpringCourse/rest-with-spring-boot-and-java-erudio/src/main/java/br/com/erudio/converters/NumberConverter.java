package br.com.erudio.converters;

public class NumberConverter {
	
	public static Double convertToDouble(String stringNumber) {
		if(stringNumber == null) return 0D;
		// BR 10,25 US 10.25
		String number = stringNumber.replaceFirst(",",".");
		if(isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}

	public static boolean isNumeric(String stringNumber) {
		if(stringNumber == null) return false;
		String number = stringNumber.replaceFirst(",",".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
