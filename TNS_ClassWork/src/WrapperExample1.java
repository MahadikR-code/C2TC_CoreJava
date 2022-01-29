
public class WrapperExample1 {

	public static void main(String[] args) {
		Boolean b= new Boolean("yes");
		Boolean c= new Boolean("True");
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(b.equals(c));
	}

}
