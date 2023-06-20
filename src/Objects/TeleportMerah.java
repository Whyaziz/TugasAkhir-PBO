package Objects;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class TeleportMerah extends SuperObjects{

    public TeleportMerah() {
        getImage();
        collision = true;
        name = "teleportUngu";
    }

    @Override
    public void getImage() {
        try {
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Portal/portalMerah.png")));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
