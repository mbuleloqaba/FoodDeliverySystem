import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private static final String DRIVERS_FILE = "drivers.txt";

    public static List<Driver> readDriverDetails() {
        List<Driver> drivers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(DRIVERS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length == 3) {
                    String name = details[0].trim();
                    String location = details[1].trim();
                    int load = Integer.parseInt(details[2].trim());
                    drivers.add(new Driver(name, location, load));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading driver details: " + e.getMessage());
        }

        return drivers;
    }
}
