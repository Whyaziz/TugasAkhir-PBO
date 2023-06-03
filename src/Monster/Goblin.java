package Monster;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;

public class Goblin extends entity.Entity implements IMovement{

    int actionCounter = 0;

    public Goblin(GamePanel gp) {
        super(gp);

        speed = 3;
        solidArea.x = 8;
        solidArea.y = 48;
        solidArea.width = 42;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;

        getImage();
        direction = "right";
    }

    public void getImage(){
        try {

            left1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/left1.png")));
            left2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/left2.png")));
            left3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/left3.png")));
            left4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/left4.png")));
            left5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/left1.png")));
            left6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/left2.png")));

            right1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/right1.png")));
            right2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/right2.png")));
            right3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/right3.png")));
            right4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/right4.png")));
            right5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/right1.png")));
            right6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/right2.png")));

            up1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/up1.png")));
            up2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/up2.png")));
            up3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/up3.png")));
            up4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/up4.png")));
            up5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/up1.png")));
            up6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/up2.png")));

            down1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/down1.png")));
            down2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/down2.png")));
            down3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/down3.png")));
            down4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/down4.png")));
            down5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/down1.png")));
            down6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Goblin/down2.png")));

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void setAction(){
        move();
    }

    @Override
    public void move() {
        actionCounter ++;
        Random random = new Random();
        int i = random.nextInt(100)+1;

        if (actionCounter == 50){
            if (i<=25){
                direction = "up";
            }
            else if (i<=50){
                direction = "down";
            }
            else if (i<=75){
                direction = "left";
            }
            else {
                direction = "right";
            }
            actionCounter = 0;
        }
    }
}
