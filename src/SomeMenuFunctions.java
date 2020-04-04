import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.math.*;
public class SomeMenuFunctions {

	//menu 1
	public static void greetings()
	{
		System.out.println("Selamat Hari Raya Idul Fitri, mohon maaf lahir dan batin");
		
	}
	
	//menu 2
	public static void greetingsWithName(String yourName)
	{
		System.out.println(yourName + ",Selamat Hari Raya Idul Fitri, mohon maaf lahir dan batin");
	}
	
	//menu 3
	public static void dayDifference(LocalDate dayOne, LocalDate dayTwo) 
	{
		long daysPeriod = ChronoUnit.DAYS.between(dayOne, dayTwo);
		System.out.println(daysPeriod);
	}
	//menu 4
	public static double speed(double distance, double time)
	{
		double speed = distance/time;
		System.out.println("Speed: " + speed);
		return speed;
	}
	
	//menu 5
	public static String checkLeapYear(int year)
	{
		String hasil = "";
		LocalDate mockDate = LocalDate.of(year, 1, 1);
		boolean kabisat = mockDate.isLeapYear();
		if(kabisat == true)
		{
			hasil = year + " adalah tahun kabisat";
			System.out.println(hasil);
		}
		else
		{
			hasil = year + " bukan tahun kabisat";
			System.out.println(hasil);
		}
		return hasil;
	}
	//menu 6
	public static void ageDifference(String nameOne, LocalDate tanggalSatu,
									 String nameTwo, LocalDate tanggalDua)
	{
		LocalDate today = LocalDate.now();
		int ageOne = (int)ChronoUnit.YEARS.between(today, tanggalSatu);
		int ageTwo = (int)ChronoUnit.YEARS.between(today, tanggalDua);
		
		int ageDifference = ageOne - ageTwo;
		
		if (ageDifference < 0)
		{
			ageDifference = (ageDifference * -1);
		}
		
		System.out.printf("Perbedaan umur antara %s dengan %s adalah %d tahun \n", 
				nameOne,nameTwo,ageDifference);
	}
	
	public static void main(String[] args) {
		//set global variables
		Scanner scanner = new Scanner(System.in);
		boolean bool = true;
		
		//Menu Start
		while(bool)
		{
			System.out.println("Hello from YinXinran");
			System.out.println("Menu Functions");
			System.out.println("1. Greetings");
			System.out.println("2. Greetings with name");
			System.out.println("3. Date Difference");
			System.out.println("4. Calculate Speed");
			System.out.println("5. Leap Year Check");
			System.out.println("6. Age Difference");
			System.out.println("7. Exit");
			
			System.out.println("Masukkan input (1-7): ");
			int menuInput = scanner.nextInt();
			scanner.nextLine();
			
			
				switch(menuInput)
				{
				case 1: //Greetings
					greetings();
					break;
				case 2: //Greetings with name
					System.out.println("Diucapkan untuk: ");
					String yourName = scanner.nextLine();
					greetingsWithName(yourName);
					break;
				case 3: //Day difference
					
					while (bool)
					{
						try
						{
							DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
							
							System.out.println("Input Tanggal Pertama (Misal: 13/04/2005)");
							String dateOne = scanner.nextLine();
							LocalDate stringToDateOne = LocalDate.parse(dateOne, formatter);
							
							System.out.println("Input Tanggal Kedua (Misal: 13/04/2005)");
							String dateTwo= scanner.nextLine();
							LocalDate stringToDateTwo = LocalDate.parse(dateTwo, formatter);
							
							dayDifference(stringToDateOne, stringToDateTwo);
	
						}
						catch (Exception exceptions)
						{
							System.out.println("Input tanggal Salah, Input Tanggal lagi");
						} break;
						
					} 
					
				case 4: //Calculate Speed
					System.out.println("Input Distance (km): ");
					double distance = scanner.nextDouble();
					System.out.println("Input Time (hour): ");
					double time = scanner.nextDouble();
					scanner.nextLine();
					speed(distance, time);
					
					break;
				case 5: //Leap year check
					try
					{
						System.out.println("Input Tahun");
						int year = scanner.nextInt();
						scanner.nextLine();
						checkLeapYear(year);
						break;
					}
					catch (Exception exceptions)
					{
						System.out.println("Input salah. Tolong Input lagi");
					}
				case 6: //Age Difference
					while(bool)
					{
						try 
						{
							DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
							
							//input tanggal pertama
							System.out.println("Input Nama 1: ");
							String nameOne = scanner.nextLine();
							System.out.println("Input Tanggal 1: ");
							String tanggalSatu = scanner.nextLine();

							LocalDate stringToDateOne = LocalDate.parse(tanggalSatu, formatter);
							
							//input tanggal kedua
							System.out.println("Input Nama 2: ");
							String nameTwo = scanner.nextLine();
							System.out.println("Input Tanggal 2: ");
							String tanggalDua = scanner.nextLine();

							LocalDate stringToDateTwo = LocalDate.parse(tanggalDua, formatter);
							
							ageDifference(nameOne, stringToDateOne,nameTwo,stringToDateTwo);
							break;
							
						}
						catch(Exception exceptions)
						{
							System.out.println("Input Salah. Tolong input lagi");
							bool = false;
						}
					}
				case 7: //Exit
					System.exit(0);
					break;
				default:
					System.out.println("Tolong input 1-7: ");
					break;
				}
		}
		
		
		
		
	}
	
}
