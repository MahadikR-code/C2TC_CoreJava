
public class Param_Const {

	
		int id;
		String name;
		
		//creating parameterized constructor
		Param_Const(int i, String n){
			id=i;
			name=n;
		}
		
		//method to display the values
		void display() {
			System.out.println(id+" "+name);
		}
		public static void main(String[] args) {
			Param_Const s1= new Param_Const(1,"Rohit");	
			Param_Const s2= new Param_Const(2,"Ramesh");	
			Param_Const s3= new Param_Const(3,"Sanik");	
			Param_Const s4= new Param_Const(4,"Omkar");	
			
			//Displaying values
			s1.display();
			s2.display();
			s3.display();
			s4.display();
}

}
