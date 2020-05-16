import java.text.DateFormatSymbols;
import java.util.Calendar;

public class CalendarValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt("2005"), Integer.parseInt("8")-1, Integer.parseInt("17"));
		int day = cal.get(Calendar.DAY_OF_WEEK);
		//String dayOfTheWeek = get
		System.out.println(day);
		DateFormatSymbols dfs = new DateFormatSymbols();
		String weekDay = dfs.getWeekdays()[day];
		System.out.println(weekDay.toUpperCase());

	}

}
