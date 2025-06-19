package Code;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Phone", "Electronics")
        };

        Product result1 = SearchUtility.linearSearch(products, "Watch");
        System.out.println("Linear Search: " + (result1 != null ? result1 : "Not Found"));

        SearchUtility.sortByName(products);
        Product result2 = SearchUtility.binarySearch(products, "Watch");
        System.out.println("Binary Search: " + (result2 != null ? result2 : "Not Found"));
    }
}
