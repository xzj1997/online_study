package cn.cqgcxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "cn.cqgcxy.filter")
public class OnlineStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineStudyApplication.class, args);
    }
}
