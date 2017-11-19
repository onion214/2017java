package demo.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.net.UnknownHostException;

@Configuration
@EnableMongoRepositories({"demo.model"})
@ComponentScan({"demo.service"})
public class MongoConfigContext {

    @Bean
    public MongoDbFactory mongoDbFactory() throws UnknownHostException{
        return new SimpleMongoDbFactory(new MongoClient("127.0.0.1"),"demo");
    }

    @Bean
    public MongoTemplate mongoTemplate() throws  UnknownHostException{
        return new MongoTemplate(mongoDbFactory());
    }
}
