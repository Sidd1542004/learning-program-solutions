import java.util.Scanner;

class Logger{
    private static Logger instance;
    private Logger(){
        System.out.println("Logger Initialized");
    }
    public static Logger getInstance() {
        if(instance==null){
            instance=new Logger();
        }
        return instance;
    }
    public void log(String message){
        System.out.println("Log message: "+message);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Logger logger1=Logger.getInstance();
        Logger logger2=Logger.getInstance();
        
        System.out.print("Enter first log message: ");
        String msg1=scanner.nextLine();
        logger1.log(msg1);

        System.out.print("Enter second log message: ");
        String msg2 = scanner.nextLine();
        logger2.log(msg2);

        if(logger1==logger2){
            System.out.println("Both logger instances are the same.Singleton verified.");
        }
        else{
            System.out.println("Different instances exist. Singleton pattern failed.");
        }
    }
}
