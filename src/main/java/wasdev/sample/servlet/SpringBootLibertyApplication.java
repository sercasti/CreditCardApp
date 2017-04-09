package wasdev.sample.servlet;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = MessageSourceAutoConfiguration.class)
@EntityScan(basePackages = "creditCards.entity")
@EnableJpaRepositories(basePackages = "creditCards.repository")
public class SpringBootLibertyApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		application.web(false);
		return application.sources(SpringBootLibertyApplication.class);
	}

}
