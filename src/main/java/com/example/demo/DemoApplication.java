package com.example.demo;

import com.example.demo.repository.OrderRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        OrderRepository bean = context.getBean(OrderRepository.class);
        bean.findByOrderId(1l);
        synchronized (DemoApplication.class) {
            DemoApplication.class.wait();
        }
    }

}
