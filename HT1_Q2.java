public class HT1_Q2{
    public static void main(String[] args) {
        int nValues = 50;

        label:
        for(int i = 2; i <=nValues; i++){
            for (int j = 2; j < Math.sqrt(i); j++){
                if (i % j == 0){
                    continue label;
                }
            }
            System.out.println(i);
        }
    }
}