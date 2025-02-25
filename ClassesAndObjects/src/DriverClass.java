public class DriverClass {
    public static void main(String[] args) {
        House h = new House();
        h.setNbwindows(3);
        h.setNbdoors(5);
        h.setTypeOfRoof("asphalt");
        h.setTypeOfWall("yajour");

        System.out.println(h.getNbdoors() +" "+h.getNbwindows() +" "+h.getTypeOfRoof() +" "+h.getTypeOfWall());

    }
}
