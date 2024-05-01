package api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class DigitalCurrencyControllerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DigitalCurrencyControllerApplication.class, args);
    }
}
