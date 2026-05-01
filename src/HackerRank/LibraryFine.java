package HackerRank;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LibraryFine {
    public static void TotalFine(){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter date (yyyy/MM/dd): ");

        String input = in.nextLine();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy/MM/dd");

        LocalDate date = LocalDate.parse(input, formatter);

    }

    public static void main(String[] args) {
        TotalFine();
    }
}
