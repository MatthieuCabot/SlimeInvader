
package game;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Player {

    /**
     * Attribut de Player
     */
    private double posX;
    private double posY;

    private double vY;

    private ImageView sprite;
    private Image[] sprites;
    private int currentFrame = 0;

    private static final double playerTaille = 40;

    /**
     * Constructeur de la classe Player
     * @param width largeur de l'écran
     * @param height hauteur de l'écran
     */
    public Player(double width, double height) {
        this.posX = width / 2;
        this.posY = height / 2;
        this.vY = height;
    }

    /**
     * Méthode de déplacement vers le haut
     * @param height hauteur de l'écran
     * @param seconde temps écouler avec le der,ier déplacement
     */
    public void deplacementHaut(double height, double seconde) {
        posY = posY + vY * seconde;

        if (posY > height) {
            posY = height;
        }
    }

    /**
     * Méthode de déplacement vers le bas
     * @param height
     * @param seconde
     */
    public void deplacementBas(double height, double seconde) {
        posY = posY - vY * seconde;

        if (posY < 0) {
            posY = 0;
        }
    }

    /**
     * Permet le changement de sprite
     */
    public void updateSprite() {
        currentFrame = (currentFrame + 1) % sprites.length;
        sprite.setImage(sprites[currentFrame]);
    }

    /**
     * Guetter de l'attribut posX
     * @return la position X
     */
    public double getPosX() {
        return posX;
    }

    /**
     * Guetter de l'attribut posY
     * @return la position Y
     */
    public double getPosY() {
        return posY;
    }


}
