import com.sun.jdi.Type;
import com.sun.jdi.Value;
import com.sun.jdi.VirtualMachine;
import lesson8.WeekDays;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class WeekDaysTest {


    @Test
    public void correctDays1() {
        WeekDays weekDays = new WeekDays();
        assertEquals(weekDays.getDay(1), "Sunday");
    }

    @Test
    public void correctDays2(){
        WeekDays weekDays = new WeekDays();
        assertEquals(weekDays.getDay(2), "Monday");
    }
    @Test
    public void correctDays3(){
        WeekDays weekDays = new WeekDays();
        assertEquals(weekDays.getDay(3), "Tuesday");
    }
    @Test
    public void correctDays4(){
        WeekDays weekDays = new WeekDays();
        assertEquals(weekDays.getDay(4), "Wednesday");
    }
    @Test
    public void correctDays5(){
        WeekDays weekDays = new WeekDays();
        assertEquals(weekDays.getDay(5), "Thursday");
    }
    @Test
    public void correctDays6(){
        WeekDays weekDays = new WeekDays();
        assertEquals(weekDays.getDay(6), "Friday");
    }
    @Test
    public void correctDays7(){
        WeekDays weekDays = new WeekDays();
        assertEquals(weekDays.getDay(7), "Saturday");
    }

    @Test
    public void incorrectValue() {
        WeekDays weekDays = new WeekDays();
        assertEquals(weekDays.getDay(0), "The number should be equal or larger than 1");
    }

    @Test
    public void longValueDay() {
        WeekDays weekDays = new WeekDays();
        assertEquals(weekDays.getDay(8), "The number should be equal or smaller than 7");
    }

    @Test
    public void negativeValueDay() {
        WeekDays weekDays = new WeekDays();
        assertEquals(weekDays.getDay(-1), -1);
    }
    @Test
    public void negativeValueDay2() {
        WeekDays weekDays = new WeekDays();
        assertEquals(weekDays.getDay(-2), -2);
    }


    @Test
    @DisplayName("Null pointer Exception test")
    public void errorTest() {
        WeekDays weekDays = new WeekDays();
        assertThrows(NullPointerException.class, () -> {
            weekDays.getDay(null);
        });
    }

}





















