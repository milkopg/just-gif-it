package schultz.dustin.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;

@SpringBootApplication(exclude = {JacksonAutoConfiguration.class, JmsAutoConfiguration.class})
public class VideoToGifApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoToGifApplication.class, args);
	}
	

}
