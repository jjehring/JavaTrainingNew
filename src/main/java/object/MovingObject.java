package object;

public class MovingObject {

    private double posX  ;
    private double posY  ;
    private double velX  ;
    private double velY  ;
    private double borderX = 20;
    private double borderY = 20;

    // First Constructer
    public MovingObject(double posX, double posY,double velX, double velY ) {
        this.posX = posX;
        this.posY = posY;
        this.velX = velX;
        this.velY = velY;

    }
    // escond Constructer
    public MovingObject( ) {
        this.posX = 0;
        this.posY = 0;
        this.velX = 0;
        this.velY = 0;

    }

    public void mvObj() {
        if ( ((posX + velX) > borderX) || ( (posX + velX) < 0)) {
            velX = velX * -1;
        }
        if ( ((posY + velY) > borderY) || ( (posY + velY) < 0)) {
            velY = velY * -1;
        }
        this.posX = posX + velX;
        this.posY = posY + velY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double getVelX() {
        return velX;
    }

    public double getCelY() {
        return velY;
    }
}
