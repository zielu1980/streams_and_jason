package jason.Zad2;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            MenuResponse response = objectMapper.readValue(new File("menuitem.json"), MenuResponse.class);
            response.getMenuItems().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}