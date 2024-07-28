package src;

import java.util.Scanner;

public class Main {
     public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health,strength,attack;                
        while(true)                                             //Player 1 Attributes Section
         { 
            System.out.println("Input Player A Attributes :");
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
            System.out.println("Input Player B Attributes :");
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
        boolean turn; int round=0;
        if(player1.getHealth()<player2.getHealth())  // code to attack the higher health value player first
          turn=true;
        else turn=false;

        while(round>=0)
        { round+=1;   
         if(player1.getHealth()<=0 && player2.getHealth()>0)
            {  System.out.println("Player A Health Exhausted!, Player B WON!!!!!!");  
               break;   }
            if(player2.getHealth()<=0 && player1.getHealth()>0)    
               {  System.out.println("Player B Health Exhausted!, Player A WON!!!!!!");  
                  break;   }
            int Attacking_dice= 1 + (int) (Math.random() * (6 - 1 + 1));
            int Defending_dice= 1 + (int) (Math.random() * (6 - 1 + 1));
         if(turn)
            { System.out.println("    ---Get Ready for ROUND " +round+"    ---");
              System.out.println("Player A Attacks and rolls die. Die roll "+Attacking_dice);
              System.out.println("Player B Defends and rolls die. Die roll "+Defending_dice);
              
              int attacking_value = Attacking_dice*player1.attack;
              int defending_value= Defending_dice*player2.strength;
              int damage= defending_value - attacking_value;
              System.out.println("Attack Damage is "+ Attacking_dice +'*'+ player1.attack +'='+attacking_value);
              System.out.println("Defending Strength ="+Defending_dice+'*'+player2.strength +'='+defending_value);
              if(damage<0)
               {
                 System.out.print("Player B Health value reduced by "+ -1*damage + " to ");
                 player2.health_harm(damage);
                 System.out.println(player2.getHealth());
               }
            }
            else
            {
              System.out.println("    ---Get Ready for ROUND " +round+"   ---");
              System.out.println("Player B Attacks and rolls die. Die roll "+ Attacking_dice);
              System.out.println("Player A Defends and rolls die. Die roll "+ Defending_dice);
              
              int attacking_value = Attacking_dice*player2.attack;
              int Defending_value= Defending_dice*player1.strength;
              int damage= Defending_value - attacking_value;
              System.out.println("Attack Damage is "+ Attacking_dice +'*'+ player2.attack +'='+attacking_value);
              System.out.println("Defending Strength ="+Defending_dice+'*'+player1.strength +'='+Defending_value);
              if(damage<0)
               {
                 System.out.print("Player A Health value reduced by "+ -1*damage + " to ");
                 player1.health_harm(damage);
                 System.out.println(player1.getHealth());
               }
            }
            turn=!turn;
         }
      }}



