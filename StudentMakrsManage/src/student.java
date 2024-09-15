
public class student {
    private String name;
    private int[] marks;

    // Constructor
    public student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // Calculate total marks
    public int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Calculate average marks
    public double getAverageMarks() {
        return (double) getTotalMarks() / marks.length;
    }

    // Get highest mark
    public int getHighestMark() {
        int highest = marks[0];
        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }
        return highest;
    }

    // Get lowest mark
    public int getLowestMark() {
        int lowest = marks[0];
        for (int mark : marks) {
            if (mark < lowest) {
                lowest = mark;
            }
        }
        return lowest;
    }
}
