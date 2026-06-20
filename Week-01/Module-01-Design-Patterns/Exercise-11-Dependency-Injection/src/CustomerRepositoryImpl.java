public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(String customerId) {

        // Simulating fetching customer details from a database

        return "Customer ID : " + customerId
                + "\nCustomer Name : Nataraj EL"
                + "\nCity : Chennai";

    }

}