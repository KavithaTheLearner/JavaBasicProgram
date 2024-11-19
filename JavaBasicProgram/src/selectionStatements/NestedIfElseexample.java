package selectionStatements;

public class NestedIfElseexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//when the if condition has returned true and code inside the if block got executed skipping all the remaining else if and else blocks
		
		
int a = 6, b = 5, c=4, d=3, e=2; 
		
		if(a>b){
			
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
