public class House {

    private  int nbwindows;
    private int nbdoors;
    private String typeOfRoof;
    private String typeOfWall;

    public House(int nbwindows, int nbdoors, String typeOfRoof, String typeOfWall) {
        this.nbwindows = nbwindows;
        this.nbdoors = nbdoors;
        this.typeOfRoof = typeOfRoof;
        this.typeOfWall = typeOfWall;
    }

    public House() {
    }

    public int getNbwindows() {
        return nbwindows;
    }

    public int getNbdoors() {
        return nbdoors;
    }

    public String getTypeOfRoof() {
        return typeOfRoof;
    }

    public String getTypeOfWall() {
        return typeOfWall;
    }

    public void setNbwindows(int nbwindows) {
        this.nbwindows = nbwindows;
    }

    public void setNbdoors(int nbdoors) {
        this.nbdoors = nbdoors;
    }

    public void setTypeOfRoof(String typeOfRoof) {
        this.typeOfRoof = typeOfRoof;
    }

    public void setTypeOfWall(String typeOfWall) {
        this.typeOfWall = typeOfWall;
    }
}
