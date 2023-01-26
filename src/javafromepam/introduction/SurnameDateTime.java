package javafromepam.introduction;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SurnameDateTime {

    //Вывести фамилию разработчика, дату и время получения задания, а также дату и время сдачи задания.

    public static void showSurnameAndDateTime(String surname, String pattern) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        String stringCurrentDateTime = currentDateTime.format(DateTimeFormatter.ofPattern(pattern));
        System.out.println(surname + " " + stringCurrentDateTime);
    }

    public static void main(String[] args) {
        showSurnameAndDateTime("Zalialiev", "yyyy MM dd HH:mm:ss");
    }
}
