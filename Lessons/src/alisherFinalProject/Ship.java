package alisherFinalProject;

public enum Ship {
    SHIP("🚣"), HIT("🎆"), MISS("⚓"), WATTER("♒");

    //  🎆,⚓,🏊,♒,🚣

    private String designation;

    Ship(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return designation +" ";
    }
}
