import java.util.*;
public class PerameterConvert {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    double meter = in.nextDouble();

    /*
    public static final double METER_TO_MILE = 0.000621371;
    public static final double METER_TO_FEET = 3.28084;
    public static final double METER_TO_INCHES = 39.3701;
     */
        double inches = meter * Constant.METER_TO_INCHES;
        double mile = meter * Constant.METER_TO_MILE;
        double feet = meter * Constant.METER_TO_FEET;
        System.out.println("METER IN INCHES : " +inches );
        System.out.println(" METER IN MILE  : " + mile);
        System.out.println("METER IN FEET : " + feet);
    }
}
