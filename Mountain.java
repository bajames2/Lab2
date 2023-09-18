public class Mountain {
    private String name;
    private double heightInFeet;
    private String mountainRange;
    private int yearFirstClimbed;

    // Constructor to initialize mountain properties
    public Mountain(){}
    
    public Mountain(String name, double heightInFeet, String mountainRange, int yearFirstClimbed) {
        this.name = name;
        this.heightInFeet = heightInFeet;
        this.mountainRange = mountainRange;
        this.yearFirstClimbed = yearFirstClimbed;
    }

    // Getter methods for accessing mountain properties
    public String getName() {
        return name;
    }

    public double getHeightInFeet() {
        return heightInFeet;
    }

    public String getMountainRange() {
        return mountainRange;
    }

    public int getYearFirstClimbed() {
        return yearFirstClimbed;
    }

    // Setter methods for modifying mountain properties
    public void setName(String name) {
        this.name = name;
    }

    public void setHeightInFeet(double heightInFeet) {
        this.heightInFeet = heightInFeet;
    }

    public void setMountainRange(String mountainRange) {
        this.mountainRange = mountainRange;
    }

    public void setYearFirstClimbed(int yearFirstClimbed) {
        this.yearFirstClimbed = yearFirstClimbed;
    }

    @Override
    public String toString() {
        return "Mountain Name: " + name + "\n" +
               "Height (feet): " + heightInFeet + "\n" +
               "Year First Climbed: " + yearFirstClimbed + "\n" +
               "Mountain Range: " + mountainRange;
    }
}
