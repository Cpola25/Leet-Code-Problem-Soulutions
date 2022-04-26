

public class ReverseInteger {
    public static void main (String[] args){
       // System.out.println(reverse(123));
        System.out.println(reverse(0));
    }
    public static int reverse(int x) throws NumberFormatException{

        StringBuilder tempString = new StringBuilder();
        int originalNum = x;

            if(originalNum < 0){
                originalNum *= -1;
            }
            for (int i = originalNum; i >=1; i/=10){

                if(i == originalNum && i%10 !=0)
                    tempString.append(i%10);

                else if (i!=originalNum) {
                    tempString.append(i % 10);
                }
            }

            try{
                Integer reverseNum = Integer.parseInt(tempString.toString());
                if(x < 0){
                    return reverseNum *-1;
                }
                return reverseNum;
            }catch(NumberFormatException numberFormatException){
                return 0;
            }

    }

}
