import java.util.Scanner;
public class IntrusionDetectionSystem{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Network Intrusion Detection System");
        System.out.println("Enter log file path:");

        String path= scanner.nextLine();
        LogMonitor monitor =new LogMonitor();
        
        monitor.analyzeLogs(path);

        System.out.println("Log analysis completed.");
    }
}

