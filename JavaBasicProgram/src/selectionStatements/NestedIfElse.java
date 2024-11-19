package selectionStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//when all the if and else if conditions have returned false and code inside the else block is executed 
		
				int a = 6, b = 5, c=4, d=3, e=2; 
				
				if(a<b){
					
					System.out.println("Inside if block");
					
				}else if(b<c){
					
					System.out.println("Inside first else if block");
					
				}else if(c<d){
					
					System.out.println("Inside second else if block");
					
				}else if(d<e){
					
					System.out.println("Inside third else if block");
					
				}else{
					
					System.out.println("Inside else block");
					
				}
	}
}
	


