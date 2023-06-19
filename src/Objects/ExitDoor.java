package Objects;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class ExitDoor extends SuperObjects{

    public ExitDoor(){
        getImage();
        collision = true;
    }

    @Override
    public void getImage() {
        name = "ExitDoor";
        try {
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Objects/door_iron.png")));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
