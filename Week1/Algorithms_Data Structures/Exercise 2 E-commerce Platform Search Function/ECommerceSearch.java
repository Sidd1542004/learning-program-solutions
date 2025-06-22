import java.util.*;

public class ECommerceSearch{

    static class Product{
        int productId;
        String productName;
        String category;

        public Product(int productId,String productName,String category){
            this.productId=productId;
            this.productName=productName;
            this.category=category;
        }

        @Override
        public String toString(){
            return productId+"-"+productName+"("+category+")";
        }
    }

    public static Product linearSearch(Product[] products,int targetId){
        for(Product product:products){
            if(product.productId==targetId){
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products,int targetId){
        int left=0,right=products.length-1;
        while(left<=right) {
            int mid=left+(right-left)/2;
            if(products[mid].productId==targetId){
                return products[mid];
            }
            else if(products[mid].productId<targetId){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return null;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];
        System.out.println("Enter 5 Products (ID Name Category):");
        for(int i=0;i<5;i++){
            int id=sc.nextInt();
            String name=sc.next();
            String category=sc.next();
            products[i]=new Product(id,name,category);
        }
        System.out.print("Enter two product IDs to search: ");
        int targetId1=sc.nextInt();
        int targetId2=sc.nextInt();

        System.out.println("\nAvailable Products:");
        for(Product p:products){
            System.out.println(p);
        }
        System.out.println("\n Linear Search:");
        Product result1=linearSearch(products,targetId1);
        System.out.println("Searching for ID "+targetId1+": " +(result1!=null?result1: "Product not found"));

        Product result2=linearSearch(products,targetId2);
        System.out.println("Searching for ID "+targetId2 +": "+(result2!=null?result2: "Product not found"));

        Arrays.sort(products,Comparator.comparingInt(p->p.productId));
        System.out.println("\nSorted Products (for Binary Search):");
        for(Product p:products){
            System.out.println(p);
        }
        System.out.println("\n Binary Search:");
        Product result3=binarySearch(products,targetId1);
        System.out.println("Searching for ID "+targetId1+": "+(result3!=null?result3: "Product not found"));

        Product result4=binarySearch(products,targetId2);
        System.out.println("Searching for ID "+targetId2 +": "+(result4!=null?result4: "Product not found"));
    }
}
