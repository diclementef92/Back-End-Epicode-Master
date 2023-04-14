package runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import model.User;
import model.UserConfiguration;

@Component
public class UserRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		createUserRunner();
	}

	private void createUserRunner() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(UserConfiguration.class);

		User u1 = (User) appContext.getBean("newFakeUser");
		System.out.println("utente creato " + u1);

		appContext.close();
	}

}
