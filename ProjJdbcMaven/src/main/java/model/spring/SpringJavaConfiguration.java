package model.spring;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import model.CustomerBean;
import model.CustomerDAO;

@Configuration
@ComponentScan(basePackages = { "model" })
public class SpringJavaConfiguration {

	@Bean
	public DataSource datasource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		dmds.setPassword("passw0rd");
		dmds.setUsername("sa");
		dmds.setUrl("jdbc:sqlserver://localhost:1433;database=java");
		return dmds;
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfiguration.class);

		CustomerDAO dao = (CustomerDAO) context.getBean("customerDAOJdbc");
		CustomerBean bean = dao.select("Alex");
		System.out.println(bean);
		((ConfigurableApplicationContext) context).close();
	}

}
