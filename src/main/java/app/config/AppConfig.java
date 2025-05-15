package app.config;

import app.model.Animal;
import app.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

//    @Bean
//    public Dog dog () {
//        return new Dog("Buch");
//    }
//@Bean
//    public Animal animal() {
//        Animal animal = new Animal();
//        animal.setDog(dog());
//        return animal;
}


