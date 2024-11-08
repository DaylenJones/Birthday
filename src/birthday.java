import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

    public class birthday {
        public static void main(String[] args) {

            LocalDateTime fakeBirthday = LocalDateTime.of(2000, 5, 15, 10, 0, 0);


            ZonedDateTime parisTime = fakeBirthday.atZone(ZoneId.of("Europe/Paris"));


            System.out.println("Fake Birthday in Paris time: " + parisTime);
        }
    }


