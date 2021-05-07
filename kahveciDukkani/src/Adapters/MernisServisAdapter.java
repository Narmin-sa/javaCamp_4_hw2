package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class MernisServisAdapter implements ICustomerCheckService{
	@Override
	public boolean checkIfRealPerson(Customer customer) 
	{
		return true;
		 
	}

}
