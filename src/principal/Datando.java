package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Datando {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss" );
		Date atual = Date.from(Instant.parse("2020-08-08T18:57:07Z"));
		Date atual2 = new Date(System.currentTimeMillis());
		Date y1 = sdf2.parse("08/08/2020 18:38:21");
		System.out.println(sdf2.format(y1));
		System.out.println("Data atual: "+sdf2.format(atual));
		System.out.println("Data atual Millis: "+sdf2.format(atual));
		
		System.out.println("Data atual: "+sdf2.format(atual));
		Calendar cal = Calendar.getInstance();
		cal.setTime(atual);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		System.out.println("Data atual: "+sdf2.format(atual));
	}


}
