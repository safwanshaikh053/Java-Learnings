
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 12345;   
	        int reversed = 0;  
	        int temp = num;    

	        while (temp != 0) {
	            int digit = temp % 10;      
	            reversed = reversed * 10 + digit; 
	            temp = temp / 10;          
	        }
	        System.out.println(reversed);
	}

}
