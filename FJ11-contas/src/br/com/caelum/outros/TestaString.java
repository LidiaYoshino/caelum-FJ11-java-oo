package br.com.caelum.outros;

public class TestaString {

	public static void main(String[] args) {
		String s = " fj 11 ";
		String b = "batata";
		s = s.replaceAll("1", "2");
		boolean x = s.contains("22");
		StringBuilder bla;
		
		System.out.println(s);
		System.out.println(x);
		String semEspacos = s.trim();
		System.out.println(semEspacos);
		System.out.println("A string está vazia? " + s.isEmpty());
		System.out.println("A string tem " + s.length() + " caracteres");
		spell(b.toUpperCase());
		reverse(b);
		System.out.println("");
		reverse("Socorram-me, subi no onibus em Marrocos");
		System.out.println("");
		reverse("anotaram a data da maratona");
		System.out.println("");
		reverseStringBuilder(b);
	}
	
	public static void spell(String string){
		for (int i = 0; i < string.length(); i++) {
			System.out.println(string.charAt(i));
		}
	}
	
	public static void reverse(String string){
		for (int i = (string.length()-1); i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
	}
	
	public static void reverseStringBuilder(String string){
		StringBuilder n = new StringBuilder(string);
		System.out.println(n.reverse());
	}

}
