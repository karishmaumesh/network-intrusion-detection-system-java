import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class LogMonitor {

    Map<String, Integer> requestCount = new HashMap<>();
    static final int REQUEST_THRESHOLD = 5;

    void analyzeLogs(String filePath) {

        try {

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");

                String ip = parts[0];
                String action = parts[1];

                requestCount.put(ip, requestCount.getOrDefault(ip, 0) + 1);

                if (requestCount.get(ip) > REQUEST_THRESHOLD) {
                    System.out.println("ALERT: Suspicious activity detected from IP: " + ip);
                }

                if (action.equalsIgnoreCase("FAILED_LOGIN")) {
                    System.out.println("Warning: Multiple failed login attempts from " + ip);
                }
            }

            reader.close();

        } catch (Exception e) {
            System.out.println("Error reading log file: " + e.getMessage());
        }
    }
}