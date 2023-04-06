package barbatos_rex1.laprivcore.personal_info.domain;

import barbatos_rex1.laprivcore.shared.utils.Validations;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
@EqualsAndHashCode
public class Day {

    private static final Map<Integer, Integer> MAP_OF_MONTHS = new HashMap<>();

    static {
        MAP_OF_MONTHS.put(1, 31);
        MAP_OF_MONTHS.put(2, 28);
        MAP_OF_MONTHS.put(3, 31);
        MAP_OF_MONTHS.put(4, 30);
        MAP_OF_MONTHS.put(5, 31);
        MAP_OF_MONTHS.put(6, 30);
        MAP_OF_MONTHS.put(7, 31);
        MAP_OF_MONTHS.put(8, 31);
        MAP_OF_MONTHS.put(9, 30);
        MAP_OF_MONTHS.put(10, 31);
        MAP_OF_MONTHS.put(11, 30);
        MAP_OF_MONTHS.put(12, 31);
    }


    private int year;
    private int month;
    private int day;

    private static boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return year % 4 == 0;
    }

    private static void isValidDate(int year, int month, int day) {
        Validations.isTrue(day * month * year > 0);
        Validations.isTrue(day < 32);
        Validations.isTrue(month < 13);
        if (isLeapYear(year) && (month == 2)) {
            Validations.isTrue(day <= MAP_OF_MONTHS.get(month) + 1);
        }
        Validations.isTrue(day <= MAP_OF_MONTHS.get(month));
    }


    public static Day from(int year, int month, int day) {
        isValidDate(year, month, day);
        return new Day(year, month, day);
    }


}
