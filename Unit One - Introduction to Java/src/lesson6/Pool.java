package lesson6;

import java.util.Scanner;
import java.lang.Math;
public class Pool {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

        System.out.println("Please input length of pool, shallow length, transition length, the depth of the shallow and deep end, the width, and cost of the liner.");

       int length = in.nextInt();
       int sLength = in.nextInt();
       int trans = in.nextInt();
       int sHeight = in.nextInt();
       int dHeight = in.nextInt();
       int width = in.nextInt();
       int linerCost = in.nextInt();

       //Volume of triangular prism

        int a = dHeight-sHeight;
        double b = Math.sqrt((trans*trans) - (a*a));
        int c = trans;
       double out = (0.25*width);
        double volumeT = out*(Math.sqrt((-a*a*a*a)+2*((a*b)*(a*b))+2*((a*c)*(a*c))-(b*b*b*b)+2*((b*c)*(b*c))-(c*c*c*c)));
        System.out.println(volumeT);
        double otherLength = (length - sLength);
        double volumeROne = (otherLength*width*sHeight);
        System.out.println(volumeROne);
        double volumeRTwo = (dHeight*sLength*width);
        System.out.println(volumeRTwo);
        double fullVol = volumeROne +  volumeRTwo + volumeT;
        System.out.println(fullVol);
    }
}
