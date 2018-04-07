package booter;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jn
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController

//@ComponentScan(basePackages = {"com.edu.msc.consul.*"})
public class SpringBootStartApplication extends SpringBootServletInitializer {

    @RequestMapping("hi")
    public String sayHello(){
        return "Hi姜楠您好！";
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootStartApplication.class);
    }
}