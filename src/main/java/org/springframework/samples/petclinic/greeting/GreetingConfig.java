package org.springframework.samples.petclinic.greeting;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingConfig {

    @Bean
    @ConditionalOnClass(Saluation.class)
    @ConditionalOnBean(GoodBye.class)
    public Greeting greeting() {
        return new Greeting("Salutations");
    }
}
