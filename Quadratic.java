package warmup;

import java.util.Set;
import java.util.HashSet;
import java.lang.Math;

public class Quadratic {

    /**
     * Find the integer roots of a quadratic equation, ax^2 + bx + c = 0.
     * @param a coefficient of x^2
     * @param b coefficient of x
     * @param c constant term.  Requires that a, b, and c are not ALL zero.
     * @return all integers x such that ax^2 + bx + c = 0.
     */
    public static Set<Integer> roots(int a, int b, int c) {
        double determinant=(double)b*(double)b-4*(double)a*(double)c;
        //System.out.println(determinant);
        Set<Integer> root = new HashSet<Integer>();
        if(determinant>=0 & Math.abs((double)a)>0) {
            double roots_1=(-b+Math.sqrt(determinant))/(2*a);
            double roots_2=(-b-Math.sqrt(determinant))/(2*a);
            if((double) (int) roots_1-roots_1==0 & (double) (int) roots_2-roots_2==0)
            {
                root.add((int)roots_1);
                root.add((int)roots_2);
            }
        }
        else if (Math.abs((double)a)==0)
        {
            double roots=-(double) c / (double) b;
            root.add((int)roots);
            
        }
        return root;
    }


    /**
     * Main function of program.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("For the equation x^2 - 4x + 3 = 0, the possible solutions are:");
        Set<Integer> result = roots(1, 2, 3);
        System.out.println(result);
    }

    /* Copyright (c) 2016 MIT 6.005 course staff, all rights reserved.
     * Redistribution of original or derived work requires explicit permission.
     * Don't post any of this code on the web or to a public Github repository.
     */
}
