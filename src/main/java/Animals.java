public class Animals {
//    This represents the fields
    String name;
    boolean isLandAnimal;
    boolean isAirborne;
    // The constructors will allow us to bring these fields and for any methods into any subclasses
    public Animals(String name, boolean isLandAnimal, boolean isAirborne) {
        this.name = name;
        this.isLandAnimal = isLandAnimal;
        this.isAirborne = isAirborne;


    }
    //This is an empty constructor.
    // This will allow you to create an instance of this class without requiring any parameters to be passed in.
    public Animals(){}
    //This sets the Getters and Setters
    // Command N
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLandAnimal() {
        return isLandAnimal;
    }

    public void setLandAnimal(boolean landAnimal) {
        isLandAnimal = landAnimal;
    }

    public boolean isAirborne() {
        return isAirborne;
    }

    public void setAirborne(boolean airborne) {
        isAirborne = airborne;
    }
}

