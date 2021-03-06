package chapter12.C1206;

import java.util.Scanner;
//
public class Hex2Dec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		try{
			System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
		}
		catch(NumberFormatException ex){
			System.out.println(ex.getMessage());
		}
	}

	public static int hexToDecimal(String hex)  {
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	public static int hexCharToDecimal(char ch) throws NumberFormatException {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else if(ch>='0' && ch<='9'){
			return ch - '0';
			}
		else{
			 throw new NumberFormatException("String is not in the range of Hexadecimal number");
		}
	}
}