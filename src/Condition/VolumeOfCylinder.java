package Condition;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        double height =2;
        double raduis =2;

        if (raduis>0 && height>0) {
            double volume = 3.141*(height*raduis);
            System.out.println(volume);
        }
        else {
            System.out.println("Enter valid number");
        }
    }
}
