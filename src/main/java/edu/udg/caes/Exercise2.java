package edu.udg.caes;

import java.util.Vector;

public class Exercise2 {

    /**
     * Vector union operation
     *
     *  @param a first vector
     *  @param b second vector
     *  @return objects that are in either one of the two argument vectors
     */
    public static Vector union (Vector a, Vector b)
    {
        Vector union = new Vector();

        if(a==null || b==null) return union;
        else{
            for(int i=0;i<a.size();i++){
                union.add(a.get(i));
            }
            for(int i=0;i<b.size();i++){
                union.add(b.get(i));
            }
            return union;
        }

    }

}
