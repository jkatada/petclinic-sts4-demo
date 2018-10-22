package org.springframework.samples.petclinic.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({ "experimental", "development" })
public class ProfileConfig {

    @Bean
    public String profileMessage() {
        return "hello with profile";
    }
}
