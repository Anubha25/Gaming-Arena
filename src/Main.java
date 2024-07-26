package src;

import java.util.Scanner;

public class Main {
     public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health,strength,attack;                
        while(true)                                             //Player 1 Attributes Section
         { 
            System.out.println("Input Player 1 Attributes :");
            System.out.print("Health :");
            health = scanner.nextInt();
            System.out.print("strength :");
            strength = scanner.nextInt();
            System.out.print("Attack :");
            attack = scanner.nextInt();
            if(strength<=0 || health<=0 || attack<=0 )
            {System.out.println("A Player can have Positive Attributes only, please try again !");}
            else break;
         }   
        Player player1 = new Player(health,strength,attack);

        while(true)                                             //Player 2 Attributes Section
         { 
            System.out.println("Input Player 2 Attributes :");
            System.out.print("Health :");
            health = scanner.nextInt();
            System.out.print("strength :");
            strength = scanner.nextInt();
            System.out.print("Attack :");
            attack = scanner.nextInt();
            if(strength<=0 || health<=0 || attack<=0 )
            {System.out.println("A Player can have Positive Attributes only, please try again !");}
            else break;
         }
        Player player2= new Player(health,strength,attack);
        boolean turn;
        if(player1.getHealth()<player2.getHealth())
          turn=true;
        else turn=false;

        while(true)
        {   if(player1.getHealth()<=0 && player2.getHealth()>0)
            {  System.out.println("Player 1 Health Exhausted!, Player 2 WON!!!!!!");  
               break;   }
            if(player2.getHealth()<=0 && player1.getHealth()>0)    
               {  System.out.println("Player 2 Health Exhausted!, Player 1 WON!!!!!!");  
                  break;   }
            int attacking_dice= 0 + (int) (Math.random() * (6 - 0 + 1));
            int defending_dice= 0 + (int) (Math.random() * (6 - 0 + 1));
            System.out.println(attacking_dice);
            System.out.println(defending_dice);
            break;
        }

          
    
    
    }
}





