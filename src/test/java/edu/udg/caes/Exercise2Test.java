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
        b.add(2);
        b.add(3);

    }


}
