package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService)
	{
		this._customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) 
	{
		if(_customerCheckService.checkIfRealPerson(customer))
		{
			super.save(customer);
		}
		else
		{
			System.out.println("Not a valid person.");
		}
			
	}

}
