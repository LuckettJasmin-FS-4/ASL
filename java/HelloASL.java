import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloASL {
    public static void main(String[] args) {
        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Hello ASL!");
        System.out.println(
            "Current Date: " + LocalDateTime.now().format(formatter)
        );
    }
}
