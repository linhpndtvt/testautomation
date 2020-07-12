package helper;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetCurrentTime {
    public static String getCurrentDate(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime localDateTime = LocalDateTime.now();
        return dateTimeFormatter.format(localDateTime);
    }

    public static void main(String[] args) {
        System.out.println(getCurrentDate());
    }
}
