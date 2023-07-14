package FizzBuzz.fizzbuzz;
import FizzBuzz.fizzbuzz.Controllers.MonController;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MonControllerTest {

    @Test
    void testGetFizzBuzzList() {
        MonController monController = new MonController();
        //dans MonController number doit valoir 15 !!
        List<String> expectedList = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");

        List<String> actualList = monController.getFizzBuzzList();

        assertEquals(expectedList, actualList);
    }
}
