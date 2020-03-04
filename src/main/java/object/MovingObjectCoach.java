package object;

import java.awt.*;

public class MovingObjectCoach {
    private double x, y, vx, vy;
    private int rb;

    public MovingObjectCoach(double x, double y, double vx, double vy, int rb) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.rb = rb;
    }

    public void move() {
        double newx = x + vx;
        double newy = y + vy;

        if (newx < 0 || newx > 800) {
            vx = -vx;
        }

        if (newy < 0 || newy > 600) {
            vy = -vy;
        }

        x = x + vx;
        y = y + vy;

    }

    public void draw(Screen screen) {
        double newx = x + vx;
        double newy = y + vy;


        if (newx < 0 || newx > 800) {
            vx = -vx;
        }

        if (newy < 0 || newy > 600) {
            vy = -vy;
        }

        x = x + vx;
        y = y + vy;

        screen.circle((int)x , (int)y ,rb);
    }





    public static void main(String[] args) {
        Screen screen = new Screen(810,620);
       // screen.line(80,80,400,400);
        //screen.circle(234,234,150);
        MovingObjectCoach mv = new MovingObjectCoach(800, 600, -2, -1, 5 );

        MovingObjectCoach [ ] mvArray = new MovingObjectCoach[10]  ;

        for (int i = 0 ; i < mvArray.length; i++) {
            mvArray[i] = new MovingObjectCoach((int)(Math.random() * 500)  , (int)(Math.random() * 500) , (int)(Math.random() * 30), (int)(Math.random() * 50), (int)(Math.random() * 100));
        }

        while(true) {
            System.out.println(mv.x+ " " +mv.y);
            screen.clear();
            for (int i = 0 ; i < mvArray.length; i++) {

                mvArray[i].move();
                mvArray[i].draw(screen);
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}