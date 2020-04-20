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
public enum Color {

    RED(0, "Red"),
    YELLOW(1, "Yellow"),
    GREEN(2, "Green"),
    BLUE(3, "Blue"),;

    private int index;
    private String name;

    private Color(int index, String name) {

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
