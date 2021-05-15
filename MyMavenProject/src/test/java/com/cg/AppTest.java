package com.cg;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	 Employee e =new Employee(100,"King",25000.00);
        assertTrue( e.getSalary()>0 );
    }
}
