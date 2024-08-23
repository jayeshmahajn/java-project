import java.util.Scanner;
public  class guesser_Game_project {
    public static class guesser {
            int guessernum;
            public int takeNumberGuesser() //take number form guesser 
            {
                System.out.println("Guesser guess a Number : ");
                Scanner sc = new Scanner(System.in);
                guessernum = sc.nextInt();
                return guessernum;
            }
    }
    public  static class  player {
        int playernum;
        public int takeNumberplayer() //take numbet from  3 player
            {
                System.out.println("player guess a Number : ");
                Scanner sc = new Scanner(System.in);
                playernum = sc.nextInt();
                return playernum;
            }
       
        
    }
     public static class umpire{

            int  numfromguesser;
            int  numformplayer1;
            int  numformplayer2;
            int  numformplayer3;

        public void colletfromGuesser() // this method is use to take data from guesser
        {
            guesser g=new guesser();
            numfromguesser=g.takeNumberGuesser();

        }
        public void colletfromplayer(){     // this method is use to take data from player
            player p1 =new player();
            numformplayer1=p1.takeNumberplayer();

            player p2 =new player();
            numformplayer2=p2.takeNumberplayer();

            player p3 =new player();
            numformplayer3=p3.takeNumberplayer();
        }
        public void campare(){                 // this method is use to compare player data to guesser
            
            // compare player 1 to guesser 

            if(numformplayer1==numfromguesser)
            {
            if(numformplayer2==numfromguesser && numformplayer3==numfromguesser)
            {
                System.out.println("All player won the Game ");
            }
            else if(numformplayer2==numfromguesser)
            {
                System.out.println("Only player 1 and player 2 Won the Game");
            }
            else if(numformplayer3== numfromguesser)
            {
                System.out.println("Only player 1 and player 3 won the Game");
            }
            else{
                System.out.println("Player 1 Won the Game");
            }
            }

            // compare playet 2 to guesser

            else if(numformplayer2==numfromguesser)
            {
                if(numformplayer3==numfromguesser)
                {
                    System.out.println("Only player 2 and player 3 Won the Game");
                }
                else{
                    System.out.println("Player 2 Won the Game");
                }
            }

            // compare player 3 to guesser 

            else if(numformplayer3==numfromguesser)
            {
                System.out.println(" player 3  Won the Game");
            }
            else{
                System.out.println("No Player Won the Game ");
            }
        }
    }
   
   
    public static  void main(String[] args) {
        // function calling 
        umpire u = new umpire();
        u.colletfromGuesser();
        u.colletfromplayer();
        u.campare();
    }
}
