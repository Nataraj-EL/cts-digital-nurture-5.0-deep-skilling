public class SearchAlgorithms {
 
    // linear search
    public static Product linearSearch(Product[] products, int targetId) {

        for (Product product : products) {

            if (product.productId == targetId) {
                return product;
            }
        }

        return null;
    }

    // binary search
    public static Product binarySearch(Product[] products, int targetId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            }

            if (targetId < products[mid].productId) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return null;
    }
}