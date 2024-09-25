class HT1_Q1{
    public static void main(String[] args) {

        double ED = 7600.0;
        double ER = ED / 2.0;
        System.out.println("The volume of Earth : " + String.format("%.2f", volume(ER)) + " cubic miles");

        double SD = 865000.0;
        double SR = SD / 2.0;
        System.out.println("The volume of Sun : " + String.format("%.2f",volume(SR)) + " cubic miles");
        
        double ratio = volume(SR)/volume(ER);
        
    System.out.println("The ratio of the volume of the Sun to the volume of the Earth is: " + String.format("%.2f", ratio));
    }

    public static double volume(double radius){
        
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        return volume; 
    }
}
