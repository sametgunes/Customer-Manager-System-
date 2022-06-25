package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	ICustomerCheckService _CustomerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
	
		_CustomerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) throws Exception {
		
		if(_CustomerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			throw new Exception("Not a valid person");
		}
		
		
	}

	
	

}
