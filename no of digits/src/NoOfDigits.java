
public class NoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=324;
		int count = 0;          
        int temp = num;        

      
            while (temp != 0) {
                temp = temp / 10;  
                count++;           
            }
            System.out.println(count);
        }
	}


