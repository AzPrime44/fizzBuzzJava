package FizzBuzz.fizzbuzz.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jeuFizzBuzz")
public class MonController {
    @GetMapping
    public List<String> getFizzBuzzList() {
        List<String> fizzBuzzList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzzList.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzzList.add("Buzz");
            } else {
                fizzBuzzList.add(String.valueOf(i));
            }
        }
        return fizzBuzzList;
    }
}
