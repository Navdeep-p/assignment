package boot.Employee.util;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Utils {

    public UUID generateUuid() {
        UUID randomUuid =  UUID.randomUUID();
        return randomUuid;
    }

}
