import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		
		String strDate = df.format(d);
		System.out.println(strDate);
		
		try {
			Date d1 = df.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
