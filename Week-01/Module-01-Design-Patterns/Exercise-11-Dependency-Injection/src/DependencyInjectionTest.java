public class DependencyInjectionTest {

    public static void main(String[] args) {

        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        CustomerService customerService = new CustomerService(customerRepository);

        System.out.println("Fetching Customer Details...\n");

        customerService.getCustomerDetails("CUST101");

    }

}