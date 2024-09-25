public class HT1_Q4{
    public static void main(String[] args) {
        
       String text = "To be or not to be, that is the question;"
        +"Whether `tis nobler in the mind to suffer" 
        +" the slings and arrows of outrageous fortune,"
        +" or to take arms against a sea of troubles,"
        +" and by opposing end them?";
        
        String[] charac = text.split("\\W+"); 

        for (int i = 0; i < charac.length - 1; i++){
            for (int j = 0; j < charac.length - i - 1; j++) {
                if (charac[j].compareTo(charac[j + 1]) > 0) {
                    String temp = charac[j];
                    charac[j] = charac[j + 1];
                    charac[j + 1] = temp;
                }
            }
        }

        System.out.println("The sorted words are:");
        for (String word : charac) {
        System.out.println(word);
        }


    }
}