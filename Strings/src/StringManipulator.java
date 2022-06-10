
public class StringManipulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Hello");
		
		int len = str.length();
		System.out.println("Lenght of the String " + len);
		char ch = str.charAt(2);
		System.out.println(ch);
		int index = str.indexOf('o');
		System.out.println(index);
		String str2 = str.concat(" World");//Hello World - anonymous string -> str2
		
		System.out.println("str2 - " + str2);
		System.out.println("str - " + str); //Hello
		
		System.out.println(str.contains("LL"));

	}

}
