package edu.udg.caes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise2Test {

    Vector a = new Vector();
    Vector b = new Vector();
    Vector c = null;


    @BeforeEach
    public void initialize() throws Exception
    {
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(3);
        b.add(4);

    }

    @Test
    public void testUnion()
    {
        Vector<Integer> expected = new Vector();
        for(int i=1; i<=4; i++) expected.add(i);

        final Vector union = new Exercise2().union(a,b);

        assertEquals(union, expected);
    }

}
