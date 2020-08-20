import java.util.Random;

 public class Gambling_Simulator{
     public static void main(String [] args){
          int stake = 100;
          int day = 1;
          int winStake = 100;
          int lostStake = 100;
          int r1,r2;
          Random r = new Random();
          while(day == 1){
             int random = r.nextInt(stake);
             r1 = random%10;
             r2 = r1%2;
             if(r2 == 0){
                 lostStake = lostStake-1;
                 System.out.println("Stake after lost ="+lostStake);
                }
             else{
                 winStake = winStake+1;
                 System.out.println("Stake after win ="+winStake);
                }
             day = day+1;
            }
          }
        }
