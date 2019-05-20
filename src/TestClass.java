import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String date = "02/02/2019";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate stringToDate = LocalDate.parse(date, formatter);
		System.out.println(stringToDate);
		
		
		LocalDate sekarang = LocalDate.now();
		LocalDate birthDate = LocalDate.of(2000, 12, 6);
		
		long years = birthDate.until(sekarang, ChronoUnit.YEARS);
		sekarang = sekarang.plusYears(years);
		
		System.out.println(years);
	}

}
