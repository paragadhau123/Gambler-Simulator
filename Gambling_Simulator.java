import java.util.Random;

 public class Gambling_Simulator{
     public static void main(String [] args){
          int stake = 100;
          int day = 1;
          int winStake = 100;
          int lostStake = 100;
          int r1,r2;
          Random r = new Random();
          while(winStake<150 || lostStake>50){
             int random = r.nextInt(stake);
             r1 = random%10;
             r2 = r1%2;
             if(r2 == 0){
                 lostStake = lostStake-1;
                }
             else{
                 winStake = winStake+1;
                }
            }
              if(winStake==150){
                 System.out.println("Gambler win 50% of stake");
               }
             else{
                 System.out.println("Gambler loose 50% of stake");
                }
             }
         }
