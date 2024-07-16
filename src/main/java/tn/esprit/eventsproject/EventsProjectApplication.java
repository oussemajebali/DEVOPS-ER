package tn.esprit.eventsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class EventsProjectApplication {
    // commit to test automatic build in jenkins

    public static void main(String[] args) {
        SpringApplication.run(EventsProjectApplication.class, args);
    }

}
