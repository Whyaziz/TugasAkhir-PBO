package Objects;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class TeleportUngu extends SuperObjects{

    public TeleportUngu() {
        getImage();
        collision = true;
        name = "teleportUngu";
    }

    @Override
    public void getImage() {
        try {
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Portal/portalUngu.png")));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
