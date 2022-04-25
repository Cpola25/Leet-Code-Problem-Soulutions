

public class palindromNum {
    public static void main (String[] args){
        int num =121;
        System.out.println(isPalindromeNum(num));

    }

    public static boolean isPalindromeNum(int x){
        boolean ispali = true;
        String number = Integer.toString(x);
        int counter = 0;
        for(int i = number.length()-1; i >= 0; i--){
            if(counter != number.length()){
                if(number.charAt(i) != number.charAt(counter)){
                  ispali = false;
                }
            }
            counter++;
           }

            return ispali;

        }

}
