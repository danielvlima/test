package lima.daniel.testegradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;
@SpringBootApplication
public class TesteGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteGradleApplication.class, args);
		Date novaData = new Date();
		System.out.println("aqweqewqe" + novaData);
	}

}
