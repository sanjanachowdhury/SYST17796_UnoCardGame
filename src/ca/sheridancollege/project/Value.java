/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Hoda Abokhadra
 */
public enum Value {
    
    ZERO(0, "Zero"),
    ONE(1, "One"),
    TWO(2, "Two"),
    THREE(3, "Three"),
    FOUR(4, "Four"),
    FIVE(5, "Five"),
    SIX(6, "Six"),
    SEVEN(7, "Seven"),
    EIGHT(8, "Eight"),
    NINE(9, "Nine"),
    SKIP(10, "Skip"),
    REVERSE(11, "Reverse"),
    DRAWTWO(12, "Draw two"),
    DRAWFOUR(13, "Draw four"),
    WILDCARD(14, "Wildcard"),;

    private int index;
    private String name;

    private Value(int index, String name) {

        this.index = index;
        this.name = name;

    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Displaying the toString output.
    @Override
    public String toString() {

        return String.format("%s %s %.2f \n", this.name, "@", this.index);
    }

}
