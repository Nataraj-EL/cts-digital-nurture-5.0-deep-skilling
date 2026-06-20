public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Book", "Education"),
                new Product(105, "Shoes", "Fashion"),
                new Product(102, "Phone", "Electronics"),
                new Product(104, "Watch", "Accessories")
        };


        Product[] sortedProducts = {

                new Product(101, "Book", "Education"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Laptop", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Shoes", "Fashion")
        };


        int targetId = 104;

        Product linearResult = SearchAlgorithms.linearSearch(products, targetId);

        if (linearResult != null) {
            System.out.println("Linear Search: Product Found - " + linearResult.productName);
        } else {
            System.out.println("Linear Search: Product Not Found");
        }


        Product binaryResult = SearchAlgorithms.binarySearch(sortedProducts, targetId);

        if (binaryResult != null) {
            System.out.println("Binary Search: Product Found - " + binaryResult.productName);
        } else {
            System.out.println("Binary Search: Product Not Found");
        }
    }
}