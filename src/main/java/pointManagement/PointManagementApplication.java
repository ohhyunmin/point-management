package pointManagement;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class PointManagementApplication {
    public static void main(String[] args){
        log.info("applicaiton Start");
        SpringApplication.run(PointManagementApplication.class, args);
    }
}
