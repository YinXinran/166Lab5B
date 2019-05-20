import java.util.*;
import java.time.*;
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
		if(year % 4 == 0)
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
	
	public static void main(String[] args) {
		//set global variables
		Scanner scanner = new Scanner(System.in);
		
		//Menu Start
		while(true)
		{
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
				case 3: //Date difference
					break;
				case 4: //Calculate Speed
					System.out.println("Input Distance (km): ");
					double distance = scanner.nextDouble();
					System.out.println("Input Time (hour): ");
					double time = scanner.nextDouble();
					scanner.nextLine();
					speed(distance, time);
					
					break;
				case 5: //Leap year check
					System.out.println("Input Tahun: ");
					int year = scanner.nextInt();
					scanner.nextLine();
					checkLeapYear(year);
					break;
				case 6: //Age Difference
					break;
				case 7: //Exit
					System.exit(0);
					break;
				default:
					System.out.println("Tolong input 1-6: ");
					break;
				}
		}
		
		
		
		
	}
	
}
