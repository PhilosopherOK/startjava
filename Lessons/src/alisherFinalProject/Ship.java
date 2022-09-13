package alisherFinalProject;

public enum Ship {
    SHIP("🚣"), HIT("🎆"), MISS("⚓"), WATTER("♒"), OREOL("\uD83C\uDFE5"), KILL("\uD83D\uDC80");

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
