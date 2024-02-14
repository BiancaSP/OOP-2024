package ie.tudublin;

import ddf.minim.AudioOutput;
import ddf.minim.Minim;
import processing.core.PApplet;

public class MultiSensoryFoLoopExperience extends PApplet {
     

    int mode = 0;

    Minim minim;
    AudioOutput out;

    //-- Array to hold the color patterns
    float[][] colorPatterns;
    //--

    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
        colorMode(HSB);


        //---
        colorPatterns = new float[][] {
            // You will need to fill these arrays with the appropriate HSB values
            // For now, these are placeholders
            { 0, 100, 100 }, // Pattern 0
            { 30, 100, 100 }, // Pattern 1
            { 60, 100, 100 }, // Pattern 2
            { 90, 100, 100 }, // Pattern 3
            { 120, 100, 100 }, // Pattern 4
            { 150, 100, 100 }, // Pattern 5
            { 180, 100, 100 }, // Pattern 6
            { 210, 100, 100 }, // Pattern 7
            { 240, 100, 100 }, // Pattern 8
            { 270, 100, 100 } // Pattern 9
        };
        //---
    }

    public void draw()
    {
        background(0);
        stroke(255);
        switch(mode)
        {
            case 0:
                line(0, 0, width, height);
                //System.out.println("case 0");
                // Code goes here
                break;
            case 1:
                for (int i = 0 ; i < 10 ; i ++)
                {
                    // Code goes here
                    float[] pattern = colorPatterns[mode];
                    background(pattern[0], pattern[1], pattern[2]);

                }
                break;
            default:
                // Code goes here
                break;
        }
    }

    public void keyPressed()
    {
        
        if (key >= '0' && key <= '9')
        {
            mode = key - '0';
            System.out.println(mode);
        }
    }
 



 
}
