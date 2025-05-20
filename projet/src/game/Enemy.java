package game;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Enemy {

    /**
     * Attribut de la classe Enemy
     */
    private double posX;
    private double posY;
    private double vX;

    private ImageView sprite;
    private Image[] sprites;
    private int currentFrame;

    private boolean collided = false;

    /**
     * Constructeur de la classe Enemy
     * @param width largeur de l'écran
     * @param height hauteur de l'écran
     */
    public Enemy(double width, double height) {
        this.posX = width / 2;
        this.posY = height / 2;
        this.vX = height;
    }

    /**
     * Permet le déplacememnt des monstres
     * @param width largeur de l'écran
     * @param secondes temps depuis la dernière itération
     */
    public void move(int width, double secondes) {
        posX = posX - vX * secondes;

        // si on sort ecran
        if (posX < 0)
            posX = 0;
    }

    public void updateSprite() {
        if (collided) {
            // gérer animation de destruction
        } else {
            currentFrame = (currentFrame + 1) % 5;
            sprite.setImage(sprites[currentFrame]);
        }
    }
}
