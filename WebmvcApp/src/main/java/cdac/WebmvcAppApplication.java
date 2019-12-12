package cdac;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebmvcAppApplication implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(WebmvcAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hey bro");
	}

}
