package model;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import model.dao.CustomerDAOJdbc;
@Service
public class CustomerService {
	@Autowired
	private CustomerDAO customerDao;
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("yutingTest.xml");
		
		CustomerService service = (CustomerService) context.getBean("customerService");
		CustomerBean bean = service.login("Alex", "A");
		System.out.println("bean="+bean);	
		
		boolean result = service.changePassword("Ellen", "E", "EEE");
		System.out.println("result="+result);	
		
		((ConfigurableApplicationContext) context).close();
	}
	public CustomerBean login(String username, String password) {
		CustomerBean bean = customerDao.select(username);
		if(bean!=null) {
			if(password!=null && password.length()!=0) {
				byte[] pass = bean.getPassword();
				byte[] temp = password.getBytes();
				if(Arrays.equals(pass, temp)) {
					return bean;
				}
			}
		}
		return null;
	}
	public boolean changePassword(String username, String oldPassword, String newPassword) {
		CustomerBean bean = this.login(username, oldPassword);
		if(bean!=null) {
			byte[] temp = newPassword.getBytes();
			return customerDao.update(temp, bean.getEmail(), bean.getBirth(), username);
		}
		return false;
	}
}
