package proceduralne;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import java.util.Arrays;

public class StringAndDates {
    public static void main(String[] args) {
        String text = "Ala ma kota";
        String text2 = "  ";
        String text3 = "";
        System.out.println(text2.isEmpty());
        System.out.println(text3.isEmpty());
        System.out.println(text2.isBlank());
        System.out.println(text3.isBlank());

        String[] result = text.split(" ");
        System.out.println(Arrays.toString(result));


        System.out.println(text
                .replace("ma","nie ma")
                .toUpperCase()
                .concat(". ")
                .repeat(3)
        );

        text = text.substring(0, 5);
        System.out.println(text);

        //daty
        String dzisString = "33.09.25r";
        String dzisString2 = "2025-09-23";
        LocalDate dzis = LocalDate.now();
        System.out.println(dzis);
        LocalDate data = LocalDate.of(2025, 9, 30);
        System.out.println(data.plusWeeks(3));
        System.out.println(dzis.until(data, ChronoUnit.DAYS));
        LocalDate parsedDate = LocalDate.parse(dzisString2);
        System.out.println(parsedDate);

        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        //czas w milisekundach od 1970 roku - niezależnie od strefy czasowej
        System.out.println(System.currentTimeMillis());
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.toEpochMilli());

        //BigDecimal - praca na dużych liczbach z pełną dokładnościa
        //BigInteger - liczby całkowite
    }
}
