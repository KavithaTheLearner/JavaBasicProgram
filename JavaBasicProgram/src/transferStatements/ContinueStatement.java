package transferStatements;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//The  purpose of the continue statement is to skip the current iteration of a 
		//loop based on some condition and continue with the next iteration.Demonstrate on how to use continue; 
		//statements inside any loop statement
		
for(int i=0;i<5;i++){
			
			if(i%2==0)
			continue;
			
			System.out.println(i);
			
		}
	}

}
