package org.springframework.samples.petclinic.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.samples.petclinic.greeting.Greeting;

@Profile({"experimental", "development"})
public class ProfileConfig {

	@Bean
	public Greeting greeting() {
		return new Greeting("hello with profile");
	}
}
