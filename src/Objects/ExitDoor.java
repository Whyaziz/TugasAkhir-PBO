package Objects;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class ExitDoor extends SuperObjects{

    public ExitDoor(){
        name = "ExitDoor";
        try {
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Objects/door_iron.png")));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        collision = true;
    }
}
