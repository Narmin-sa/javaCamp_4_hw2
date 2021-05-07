	
import java.time.LocalDate;
import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {


	public static void main(String[] args){
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer());
		
		Customer customer = new Customer(1, "Nərmin", "Sadıqova", "00000000000", LocalDate.of(2004, 1, 9));
		
	}

}
