import java.util.Random;

 public class Gambling_Simulator{

     public static void main(String [] args){

          int stake = 100;
          int day = 1;
          int r1,r2;
          int maxAmountWin=Integer.MIN_VALUE;
          int maxAmountLost=Integer.MAX_VALUE;
          int luckiestDay=0;
          int unluckiestDay=0;
          Random r = new Random();

          while(day<=30){

           int winStake = 100;
           int lostStake = 100;
           int winAmount;
           int lostAmount;

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

               winAmount = winStake-stake;
               lostAmount = stake-lostStake;

               System.out.println("Win amount of day"+day+" is :"+winAmount+" and Lost amount of day"+day+" is :"+lostAmount);

               if( winAmount > lostAmount ){
                System.out.println("Day"+day+" win by "+(winAmount-lostAmount));
                }
             else{
                System.out.println("Day"+day+" lost by "+(lostAmount-winAmount));
                }

                 if(winAmount>maxAmountWin){
                     maxAmountWin=winAmount;
                     luckiestDay=day;
                   }
                else if(lostAmount<maxAmountLost){
                     maxAmountLost=lostAmount;
                     unluckiestDay=day;
                   }

                day=day+1;
              }
               System.out.println("Luckiest Day of month is "+luckiestDay+" and won amount "+maxAmountWin);
               System.out.println("Unluckiest Day of month is "+unluckiestDay+" and won amount "+maxAmountLost);

             }
         }
