package cn.luozc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "cn.luozc", exclude = {org.activiti.spring.boot.SecurityAutoConfiguration.class,org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
@EnableSwagger2
@EnableTransactionManagement
public class EasyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyWebApplication.class, args);
    }
}
