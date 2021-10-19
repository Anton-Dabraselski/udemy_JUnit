package mockitoIntegration.teststubs;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

import mockitoIntegration.teststubs.Customer;
import mockitoIntegration.teststubs.CustomerNotFoundException;
import mockitoIntegration.teststubs.CustomerRepository;
import mockitoIntegration.teststubs.CustomerService;
import mockitoIntegration.teststubs.SimpleCustomerService;

class SaboteurDemo {

	@Test
	public void testInvalidCustomer() {

	  Customer customer = new Customer();
	  CustomerRepository customerRepository = mock(CustomerRepository.class);

	  when(customerRepository.getCustomerById(anyLong()))
	    					 .thenThrow(new CustomerNotFoundException());

	  CustomerService customerService = new SimpleCustomerService(customerRepository);
	  assertThrows(CustomerNotFoundException.class, () -> customerService.getCustomerById(customer.getId()));
	}
}
