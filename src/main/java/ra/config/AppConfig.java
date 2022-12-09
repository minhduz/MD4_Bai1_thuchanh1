package ra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"ra.controller",})
public class AppConfig {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resourceView = new InternalResourceViewResolver();
        resourceView.setPrefix("/views/");
        resourceView.setSuffix(".jsp");
        return resourceView;
    }
}
