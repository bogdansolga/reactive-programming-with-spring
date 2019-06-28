package net.safedata.reactive.spring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A very small Spring WebFlux demo
 *
 * @author bogdan.solga
 */
@SpringBootApplication
public class SpringWebFluxIntroApplication {

	public static void main(String[] args) {
		final SpringApplication springApplication = new SpringApplication(SpringWebFluxIntroApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.setLogStartupInfo(true);
		springApplication.setWebApplicationType(WebApplicationType.REACTIVE);
		springApplication.run(args);
	}
}
