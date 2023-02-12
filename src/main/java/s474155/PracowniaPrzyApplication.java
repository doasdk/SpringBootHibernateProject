package s474155;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication

//@ComponentScan(basePackages = {"repository", "controller, model"})
public class PracowniaPrzyApplication {


		private final String url = "jdbc:postgresql://localhost/employee";
		private final String user = "postgres";
		private final String password = "i5ata8ZOi5";

		private void connect(){
			try(Connection connection = DriverManager.getConnection(url, user, password);){
				if(connection != null){
					System.out.println("Connected");
				}else {
					System.out.println("Failed");
				}
			}catch (SQLException e){
				e.printStackTrace();
			}


		}



		public static void main(String[] args) {
			PracowniaPrzyApplication sqlCon = new PracowniaPrzyApplication();
			sqlCon.connect();

			SpringApplication.run(PracowniaPrzyApplication.class, args);


		}

}
