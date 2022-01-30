
public class Def_construct {
	int id;
	String name;
	
	//creating method to display the values of id and name
	void display() {
		System.out.println(id+""+name);
	}
	public static void main(String[] args) {
		// creating objects
		Def_construct s1= new Def_construct();
		Def_construct s2= new Def_construct();
		Def_construct s3= new Def_construct();
		
		//displaying value of objects
		s1.display();
		s2.display();
		s3.display();
	}

}
