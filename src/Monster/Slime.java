package Monster;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;


public class Slime extends entity.Entity implements IMovement{

    int actionCounter = 0;

    public Slime(GamePanel gp) {
        super(gp);

        speed = 1;
        solidArea.x = 3;
        solidArea.y = 18;
        solidArea.width = 42;
        solidArea.height = 48;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;

        getImage();
        direction = "right";
    }

    public void getImage(){
        try {

            left1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move1_left.png")));
            left2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move2_left.png")));
            left3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move3_left.png")));
            left4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move4_left.png")));
            left5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move5_left.png")));
            left6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move6_left.png")));

            right1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move1_right.png")));
            right2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move2_right.png")));
            right3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move3_right.png")));
            right4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move4_right.png")));
            right5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move5_right.png")));
            right6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move6_right.png")));

            up1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move1_left.png")));
            up2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move2_left.png")));
            up3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move3_left.png")));
            up4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move4_left.png")));
            up5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move5_left.png")));
            up6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move6_left.png")));

            down1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move1_right.png")));
            down2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move2_right.png")));
            down3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move3_right.png")));
            down4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move4_right.png")));
            down5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move5_right.png")));
            down6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Monster/move6_right.png")));

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

        if (actionCounter == 120){
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
