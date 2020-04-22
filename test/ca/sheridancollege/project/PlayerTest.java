/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 * For checkUnique, we did not add a boundary test because it is
 * not applicable here.
 * 
 * @author Lina, 2020
 */
public class PlayerTest {

    public PlayerTest() {
    }

    /**
     * Test of checkLength method, of class Player. This test gives a good input
     * of , which should easily be long enough to be a good length.
     */
    @Test
    public void testCheckIdGood() {
        System.out.println("checkId");
        String name = "aliii";
        boolean expResult = true;
        boolean result = Player.checkId(name);
        assertEquals(expResult, result);
    }

    /**
     * A test that gives the checkId() a bad password and expects a bad result
     */
    @Test
    public void testCheckIdBad() {
        System.out.println("checkId");
        String name = "";
        boolean expResult = false;
        boolean result = Player.checkId(name);
        assertEquals(expResult, result);

    }

    /**
     * A test that checks that when we give a user id of exactly length 3, we
     * see a pass.
     *
     * @Test
     */
    public void testCheckIdBoundary() {
        System.out.println("checkId");
        String name = "ali";
        boolean expResult = true;
        boolean result = Player.checkId(name);
        assertEquals(expResult, result);

    }

    /**
     * Checks that the checkChar() method will return true on a valid value
     */
    @Test
    public void testCheckCharGood() {
        System.out.println("checkChar");
        String name = "aliUno@";
        boolean expResult = true;
        boolean result = Player.checkChar(name);
        assertEquals(expResult, result);

    }

    /**
     * A test that gives the checkChar() a bad id and expects a bad result
     */
    @Test
    public void testCheckCharBad() {
        System.out.println("checkChar");
        String name = "";
        boolean expResult = false;
        boolean result = Player.checkChar(name);
        assertEquals(expResult, result);
    }

    /**
     * A method that checks that id contains at least one special character
     */
    @Test
    public void testCheckCharBoundary() {
        System.out.println("checkChar");
        String name = "ali@";
        boolean expResult = true;
        boolean result = Player.checkChar(name);
        assertEquals(expResult, result);
    }

    /**
     * Checks that the checkUnique method will return true if the id is unique
     *
     */
    @Test
    public void testCheckUniqueGood() {
        System.out.println("checkUnique");
        String name = "aliiii@";
        boolean expResult = true;
        boolean result = Player.checkChar(name);
        assertEquals(expResult, result);

    }

    /**
     * A test that gives the checkUnique() a bad id and expects a bad result
     */
    @Test
    public void testCheckUniqueBad() {
        System.out.println("checkUnique");
        String name = "";
        boolean expResult = false;
        boolean result = Player.checkChar(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlayerID method, of class Player.
     */
    @Test
    public void testSetPlayerID() {
        System.out.println("setPlayerID");
        String givenID = "";
        Player instance = new Player();
        instance.setPlayerID(givenID);

    }

}
