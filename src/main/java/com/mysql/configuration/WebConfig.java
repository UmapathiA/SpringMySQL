package com.mysql.configuration;

import com.mysql.domain.Ride;
import com.mysql.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

@EnableWebMvc
@ComponentScan("com.mysql")
@Configuration
public class WebConfig {

    @Autowired
    DriverManagerDataSource driverManagerDataSource;

    @Bean
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/DemoDb");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("Password2012!");

        return driverManagerDataSource;
    }

    @Bean
    public JdbcTemplate getTemplate() {
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(driverManagerDataSource);
        return jdbcTemplate;
    }

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();

        internalResourceViewResolver.setPrefix("/WEB-INF/views/");
        internalResourceViewResolver.setSuffix(".jsp");

        return internalResourceViewResolver;
    }
}
