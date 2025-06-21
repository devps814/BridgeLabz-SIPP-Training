package Built_In;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Date_Arithmetic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        LocalDate date = LocalDate.parse(inputDate);

        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        updatedDate = updatedDate.minusWeeks(3);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Final Date after operations: " + updatedDate.format(formatter));

	}

}
