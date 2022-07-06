import lesson7.M8Assignment;
import static org.junit.jupiter.api.Assertions.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;


public class getDayTests {





//assertEquals(int a, );

    @Test
    public void sundayTest (){
        Integer day = 1;
        String actualResult = M8Assignment.getDay(1);
        String expectedResult = "Sunday";
        assertEquals(expectedResult, actualResult,  "Result is incorrect");
    }

    @Test
    public void mondayTest (){
        Integer day = 2;
        String actualResult = M8Assignment.getDay(2);
        String expectedResult = "Monday";
        assertEquals(expectedResult, actualResult, "Result is incorrect");
    }
    @Test
    public void tuesdayTest (){
        Integer day = 3;
        String actualResult = M8Assignment.getDay(3);
        String expectedResult = "Tuesday";
        assertEquals(expectedResult, actualResult, "Result is incorrect");
    }
    @Test
    public void wednesdayTest (){
        Integer day = 4;
        String actualResult = M8Assignment.getDay(4);
        String expectedResult = "Wednesday";
        assertEquals(expectedResult, actualResult,  "Result is incorrect");
    }
    @Test
    public void thursdayTest (){
        Integer day = 5;
        String actualResult = M8Assignment.getDay(5);
        String expectedResult = "Thursday";
        assertEquals(expectedResult, actualResult,  "Result is incorrect");
    }
    @Test
    public void fridayTest (){
        Integer day = 6;
        String actualResult = M8Assignment.getDay(6);
        String expectedResult = "Friday";
        assertEquals(expectedResult, actualResult, "Result is incorrect");
    }

    @Test
    public void saturdayTest (){
        Integer day = 7;
        String actualResult = M8Assignment.getDay(7);
        String expectedResult = "Saturday";
        assertEquals(expectedResult, actualResult,  "Result is incorrect");
    }

    @Test
    @DisplayName("Nullpointer exception test")
    public void errorTest(){
        assertThrows(NullPointerException.class, () -> {M8Assignment.getDay(null);});
    }

@ParameterizedTest
    @ValueSource (ints = {-34898, -1, -7, 0})
    public void negativeValues (int a) {
        String actualResult = M8Assignment.getDay(a);
        String expectedResult = "The number should be equal or larger than 1";
        assertEquals(expectedResult, actualResult);
}

    @ParameterizedTest
    @ValueSource (ints = {34898, 8, 10})
    public void PositiveValues (int a) {
        String actualResult = M8Assignment.getDay(a);
        String expectedResult = "The number should be equal or smaller than 7";
        assertEquals(expectedResult, actualResult);
    }

@ParameterizedTest
    @ValueSource (ints = {1, 2, 3, 4, 5, 6, 7})
    public void positiveCase (int a) {
        String weekDay = M8Assignment.getDay(a);
        assertTrue(a>1 || a<7);
}







}
