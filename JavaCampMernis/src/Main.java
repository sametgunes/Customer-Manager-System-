import java.util.Date;
import java.util.Scanner;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer=new Customer();
		customer.setDateOfBirth(1997);
		customer.setFirstName("Samet");
		customer.setLastName("Güneş");
		customer.setNationalityId(47713794192L);
		
		customerManager.Save(customer);
			
		

	}

}
