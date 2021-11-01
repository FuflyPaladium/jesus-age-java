import java.util.Calendar;

public class JesusUtils {
	
	public static void main(String[] args) {
		System.out.println(getJesusAge()); //example
	}
	
	public static int getJesusAge() {
		Calendar c = Calendar.getInstance(); 
		c.setTimeInMillis(System.currentTimeMillis());
		int age = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH); 
		int d = c.get(Calendar.DAY_OF_MONTH);
		if(m < 12 && d < 25)
			age--;
		
		return age;
	}

}
