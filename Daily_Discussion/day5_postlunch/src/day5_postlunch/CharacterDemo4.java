package day5_postlunch;

public class CharacterDemo4 {

	public static void main(String[] args) {
		
		// Character charObje=new Character("asdf"); // We dont have a character constructor with String 
		// We are converting from primitive char to Character object
		Character charObj=new Character('a');
		System.out.println(charObj);
		char c=charObj.charValue();
		System.out.println(c);
		
		char c1='1';
		boolean b1=Character.isAlphabetic(c1);
		System.out.println(b1);
		boolean b2=Character.isDigit(c1);
        System.out.println(b2);
	}

}
