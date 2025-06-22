import java.util.Scanner;

interface Document{
    void open();
}
class WordDocument implements Document{
    public void open(){
        System.out.println("Opening a Word document...");
    }
}
class PdfDocument implements Document{
    public void open(){
        System.out.println("Opening a PDF document...");
    }
}
class ExcelDocument implements Document{
    public void open(){
        System.out.println("Opening an Excel document...");
    }
}
abstract class DocumentFactory{
    public abstract Document createDocument();
}
class WordDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        return new WordDocument();
    }
}
class PdfDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        return new PdfDocument();
    }
}
class ExcelDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        return new ExcelDocument();
    }
}

public class App{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose document type to open:");
        System.out.println("1. Word");
        System.out.println("2. PDF");
        System.out.println("3. Excel");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();
        DocumentFactory factory;

        switch (choice){
            case 1:
                factory=new WordDocumentFactory();
                break;
            case 2:
                factory=new PdfDocumentFactory();
                break;
            case 3:
                factory=new ExcelDocumentFactory();
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        Document document=factory.createDocument();
        document.open();
    }
}
