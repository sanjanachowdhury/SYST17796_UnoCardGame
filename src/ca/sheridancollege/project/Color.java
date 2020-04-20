/*
 * *This Enum class is responsible for the colors of the Uno game cards.
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

        //An argument constructor for the index and name.

    private Color(int index, String name) {

        this.index = index;
        this.name = name;

    }
    //getters and setters for the index and name.

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

    //Overridding the toString method for Displaying the output.

    @Override
    public String toString() {

        return String.format("%s %s %.2f \n", this.name, "@", this.index);
    }

}
