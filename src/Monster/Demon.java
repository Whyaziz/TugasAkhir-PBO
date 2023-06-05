package Monster;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;

public class Demon extends entity.Entity implements IMovement {

    int actionCounter = 0;

    public Demon(GamePanel gp) {
        super(gp);

        speed = 7;
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

            left1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f0_left.png")));
            left2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f1_left.png")));
            left3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f2_left.png")));
            left4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f3_left.png")));
            left5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f1_left.png")));
            left6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f3_left.png")));

            right1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f0.png")));
            right2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f1.png")));
            right3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f2.png")));
            right4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f3.png")));
            right5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f1.png")));
            right6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f3.png")));

            up1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f0_left.png")));
            up2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f1_left.png")));
            up3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f2_left.png")));
            up4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f3_left.png")));
            up5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f1_left.png")));
            up6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f3_left.png")));

            down1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f0.png")));
            down2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f1.png")));
            down3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f2.png")));
            down4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f3.png")));
            down5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f1.png")));
            down6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Demon/big_demon_run_anim_f3.png")));

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
            if (i<=50){
                direction = "left";
            }
            else {
                direction = "right";
            }
            actionCounter = 0;
        }
    }

}
