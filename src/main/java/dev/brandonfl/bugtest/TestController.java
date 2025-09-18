package dev.brandonfl.bugtest;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class TestController {

    @GetMapping
    public Object test() {
        return new Object() {
            @Getter
            private final TestDTO test = new TestDTO(true);
        };
    }
}
