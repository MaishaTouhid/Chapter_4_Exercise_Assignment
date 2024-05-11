public class PaperProperties {
    public static void main(String[] args) {

    /*
    public static final double INC_TO_MM = 25.4;
        public static final double WIDTH_IN_INC = 8.5;
        public static final double HIGHT_IN_INC = 11;
     */
        double width = Constant.WIDTH_IN_INC * Constant.INC_TO_MM;
        double hight = Constant.HIGHT_IN_INC * Constant.INC_TO_MM;
        double perimeter = 2 * (width + hight);
        double diagonalLength = Math.sqrt((Math.pow(width, 2)) + (Math.pow(hight, 2)));
        //print properties
        System.out.println("WIDTH: " + width + "mm");
        System.out.println("HIGHT: " + hight + "mm");
        System.out.println("PERIMETER : " + perimeter + "mm");
        System.out.println("DIAGONAL LENGTH : " + diagonalLength + "mm");
    }

}
