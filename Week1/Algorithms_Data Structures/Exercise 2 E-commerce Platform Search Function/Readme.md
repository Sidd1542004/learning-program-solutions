Purpose:
Implements linear and binary search algorithms to find products by their IDs in an e-commerce application context.
Used In:
ECommerceSearch.java
Technical Highlights:

    Product Class: Encapsulates product details like productId, productName, and category.

    Linear Search: Scans the array sequentially to find a match (O(n) time complexity).

    Binary Search: Operates on a pre-sorted array (by productId) for faster lookup (O(log n) time complexity).

    Sorting with Comparator: Arrays.sort() with Comparator.comparingInt(...) ensures binary search validity.

    User Interaction: Displays available products and search results based on input product IDs.
 Benefits:

    Demonstrates practical use of search algorithms in e-commerce systems.

    Highlights the trade-off between algorithmic complexity and data preprocessing.

    Forms the foundation for building product search, filtering, and recommendation engines.

    Helps students and developers understand search behavior in different scenarios.
