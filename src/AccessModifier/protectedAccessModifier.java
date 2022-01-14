package AccessModifier;
class acessspecifiers {

	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}

public class protectedAccessModifier extends acessspecifiers{
	public static void main(String[] args) {
		 protectedAccessModifier obj = new   protectedAccessModifier();   
	       obj.display();  
	}


}
