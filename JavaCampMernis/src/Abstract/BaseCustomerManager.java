package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
	

	

	public void Save(Customer customer) throws Exception {
		System.out.println("Saved to Db "+customer.firstName);
	}
}
