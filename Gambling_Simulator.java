import java.util.Random;

 public class Gambling_Simulator{
     public static void main(String [] args){
          int stake = 100;
          int day = 1;
          int winAmount;
          int lostAmount;
          int r1,r2;
          Random r = new Random();
          while(day<=20){
           int winStake = 100;
           int lostStake = 100;

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
               winAmount=winStake-stake;
               lostAmount=stake-lostStake;
               System.out.println("Win amount of day"+day+" is :"+winAmount+" and Lost amount of day"+day+" is :"+lostAmount);
               day=day+1;
              }
            }
         }
