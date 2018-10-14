package edu.udg.caes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.util.InputMismatchException;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise2Test {

    Vector a = new Vector();
    Vector b = new Vector();
    Vector c = null;
    Vector d = null;
    Vector e = new Vector();


    @BeforeEach
    public void initialize() throws Exception
    {
        a.add(1);
        a.add(2);
        b.add(2);
        b.add(3);
        e.add(new Time(1,1,1));
    }

    //Ara com que hi ha repetits i la funció 'union' no posa elements repetits el següent test falla.
    @Test
    public void testUnionWithDuplicates()
    {
        Vector<Integer> expected = new Vector();
        expected.add(1);
        expected.add(2);
        expected.add(2);
        expected.add(3);

        final Vector union = new Exercise2().union(a,b);

        assertEquals(union, expected);
    }

    //El vector c és null, per tant, no té elements i el resultat de la funció hauria de retornar una llista buida
    @Test
    public void testUnionWithOneNullVector()
    {
        final Vector union = new Exercise2().union(c,b);

        assertEquals(union.size(), 0);
    }

    //El vector c i el d són null, per tant, no té elements i la funció hauria de retornar una llista buida
    @Test
    public void testUnionWithBothNullVector()
    {
        final Vector union = new Exercise2().union(c,d);

        assertEquals(union.size(), 0);
    }


}
