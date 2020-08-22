import java.util.Arrays;
import java.util.Random;

 public class Gambling_Simulator{

     public static void get30DaysReport(){
           int winAmount = 0;
           int lostAmount = 0;
       do{
          int stake = 100;
          int day = 1;
          int r1,r2;
          //int maxAmountWin=Integer.MIN_VALUE;
          //int maxAmountLost=Integer.MAX_VALUE;
          //int luckiestDay=0;
          //int unluckiestDay=0;
          int arr[] = new int[30];
          int dailyWin = 0;
          //int totalWin = 0;
          //int totalLost = 0;
          Random r = new Random();

          while( day <= 30 ){

           int winStake = 100;
           int lostStake = 100;
           //int winAmount;
           //int lostAmount;

          while( winStake<150 || lostStake>50 ){

             int random = r.nextInt(stake);
             r1 = random % 10;
             r2 = r1 % 2;

             if(r2 == 0){
                 lostStake = lostStake - 1;
                 dailyWin = dailyWin - 1;
                 arr[day-1] = dailyWin;
                }
             else{
                 winStake = winStake+1;
                 dailyWin = dailyWin+1;
                 arr[day-1] = dailyWin;
                }
            }

               winAmount = winStake-stake;
               lostAmount = stake-lostStake;
               //totalWin = totalWin+winAmount;
               //totalLost = totalLost+lostAmount;
               System.out.println("-----------------------------------------------------------------------");
               System.out.println("Win amount of day"+day+" is :"+winAmount+" and Lost amount of day"+day+" is :"+lostAmount);

               if( winAmount > lostAmount ){
                  System.out.println("Day"+day+" win by "+(winAmount-lostAmount));
                 }
             else{
                  System.out.println("Day"+day+" lost by "+(lostAmount-winAmount));
                 }

                day = day+1;
              }
               //System.out.println("Luckiest Day of month is "+luckiestDay+" and won amount "+maxAmountWin);
               //System.out.println("Unluckiest Day of month is "+unluckiestDay+" and won amount "+maxAmountLost);
               GetLuckyAndUnluckytDay(arr);
              }while( winAmount > lostAmount );
           }
               public static void GetLuckyAndUnluckytDay(int arr[]){

                int luckyDay = 0;
                int unluckyDay = 0;
                int high = arr[0];
                int low = arr[0];
                for (int i = 1; i < arr.length; i++)
                {
                        if( high < arr[i] )
                         {
                                high = arr[i];
                                luckyDay = i+1;
                        }
                        if( low > arr[i] )
                        {
                                low = arr[i];
                                unluckyDay = i+1;
                        }


                }
                System.out.println("Luckiest day is day : "+luckyDay+" and He won : "+high);
                System.out.println("Unluckiest day is day : "+unluckyDay+" and He lost : "+low);

        }



             public static void main(String [] args){
                 get30DaysReport();
              }
          }
