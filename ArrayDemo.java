package ClassSum;

public class ArrayDemo {
	public static void main(String[]args) {
		String s1=new String("WHO AM I");
		String s2=new String("IAM A CULPRIT");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length()); //to check length
		System.out.println(s2.length());
		System.out.println(s1.charAt(6)); //to check characters
		System.out.println(s2.charAt(4));
		System.out.println(s1.concat(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s2.equalsIgnoreCase(s1));
	}
}
