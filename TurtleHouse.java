/*public class TurtleDrawer {
public static void main(String[] args){

}
    {
        //Turtle bob = new Turtle();
        /*for(int i=0;i<360;i++)
        {
            bob.forward(i*1.25);
            bob.left(90.25);
        }
         */
        /*If you don't know what a for loop is yet this is equivalent to repeating lines 17 & 18 4 times in a row.*/
        /*Turtle bob = new Turtle();
        bob.penColor("red");
        bob.width(10);
        for(int i=0;i<4;i++)
        {
            bob.forward(50);
            bob.left(90);
        }
     }/* */
    /*public static void drawPolygon(Turtle t, int sideLength) { 
        for(int i=0;i<2;i++);
    }
    public static void drawBody(Turtle t, int size){
        
    }
    public static void drawRoof(Turtle t, int size){ 

    }
    public static void drawHouse(Turtle t, int size){ 

    }
    public static void main(String[] args){
        
    }
        /*Turtle t = new Turtle();
}/* */

import java.awt.Color;

public class TurtleHouse {

    public static void drawPolygon(Turtle t, int sides, int length) {
        for (int i = 0; i < sides; i++) {
            t.forward(length);
            t.left(360 / sides);
        }
    }

    public static void drawBody(Turtle t, int size) {
        t.penColor(Color.BLUE);
        t.width(3);
        drawPolygon(t, 4, size);
    }

    public static void drawRoof(Turtle t, int size) {
        t.penColor(Color.RED);
        t.width(3);

        t.up();
        t.forward(size);
        t.down();

        t.left(30);
        t.forward(size);
        t.left(120);
        t.forward(size);
        t.left(120);
        t.forward(size);
        t.left(90);

        t.up();
        t.backward(size);
        t.down();
    }

    public static void drawDoor(Turtle t, int size) {
        t.penColor(Color.ORANGE);

        t.up();
        t.forward(size / 3);
        t.down();

        for (int i = 0; i < 2; i++) {
            t.forward(size / 3);
            t.left(90);
            t.forward(size / 2);
            t.left(90);
        }

        t.up();
        t.backward(size / 3);
        t.down();
    }

    public static void drawWindow(Turtle t, int size) {
        t.penColor(Color.CYAN);

        t.up();
        t.left(90);
        t.forward(size / 2);
        t.right(90);
        t.forward(size / 2);
        t.down();

        drawPolygon(t, 4, size / 4);

        t.up();
        t.backward(size / 2);
        t.right(90);
        t.forward(size / 2);
        t.left(90);
        t.down();
    }

    public static void drawChimney(Turtle t, int size) {
        t.penColor(Color.GRAY);

        t.up();
        t.forward(size * 3 / 4);
        t.left(90);
        t.forward(size);
        t.right(90);
        t.down();

        for (int i = 0; i < 2; i++) {
            t.forward(size / 5);
            t.left(90);
            t.forward(size / 3);
            t.left(90);
        }

        t.up();
        t.right(90);
        t.forward(size);
        t.left(90);
        t.backward(size * 3 / 4);
        t.down();
    }

    public static void drawHouse(Turtle t, int size) {
        drawBody(t, size);
        drawRoof(t, size);
        drawDoor(t, size);
        drawWindow(t, size);
        drawChimney(t, size);
    }    public static void main(String[] args) {
        Turtle t = new Turtle();

        // Four polygons
        t.penColor(Color.RED);
        t.width(2);
        drawPolygon(t, 3, 40);

        t.up();
        t.forward(80);
        t.down();
        t.penColor(Color.BLUE);
        drawPolygon(t, 4, 40);

        t.up();
        t.forward(80);
        t.down();
        t.penColor(Color.GREEN);
        drawPolygon(t, 5, 40);

        t.up();
        t.forward(80);
        t.down();
        t.penColor(Color.MAGENTA);
        drawPolygon(t, 6, 40);

        // Move house 
         t.up();
        t.backward(280);
        t.right(90);
        t.forward(150);
        t.left(90);
        t.down();

        drawHouse(t, 100);
    }
}
