package application.employee.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import platform.persistence.config.MongoConfigContext;

@Configuration
@EnableMongoRepositories({"application.employee.model"})
@ComponentScan({"application.employee"})
@Import({MongoConfigContext.class})
@PropertySource({"classpath:employee-service.properties"})
public class EmployeeConfigContext {

    @Bean
    public  static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        PropertySourcesPlaceholderConfigurer propConfig = new PropertySourcesPlaceholderConfigurer();
        propConfig.setLocalOverride(true);
        return propConfig;
    }
}
