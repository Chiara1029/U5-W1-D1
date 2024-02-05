package it.chiarapuleio.exdayone.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ExerciseApplication.class);
	}

}
