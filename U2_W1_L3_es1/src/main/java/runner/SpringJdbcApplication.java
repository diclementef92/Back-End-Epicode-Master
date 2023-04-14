package runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJdbcApplication
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		SpringApplication.run(SpringJdbcApplication.class, args);
    }
}
