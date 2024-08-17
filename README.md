# Magical_Arena
The Code of Magical Arena is divided into 2 Parts :
1. Player.java 
    A. This File contains the Player Class which holds the Attributes of a player (Health,Strength & Attack).
    B. Health is a Private Variable of Player Class and since Strength and Attack Attribute remains Constant of a Player throughout the Program they are final type variables; 
    C. the player class contains Getter and Setter Method to get and Update the Private memeber(Health) of a Player.

2. Main.java 
  A. This file use Player Class to define 2 objects/instances Player1 and Player2 and assign values 
     and checks for the Valid Values of Player Attributes.
  B. We have a Turn boolean variable [if player1 health is less than player2 health Turn is True else False]
  C. We have a round variable to keep a count of Total fight between Player1 and Player 2;
  D. We have a Health check : [if player1 health<=0  and player2 health>0 ] Player2 health is still above 0 
        hence Player2 Won.  and Vice Versa Check.
  E. If turn value is true Player A Attacks. if Turn value is False player B Attacks.after every While loop evaluation we switch the value of turn.
  F. We evaluate the Attacking_dice and Defending_dice value irrespective of turn value to avoid data Redundancy.
  G. We evaluate the Attacking_value and defending_value and damage value if damage<0 we update the health of defending player-> health = health-damage.
  H. The Loop continues untill one of the player health is exhausted.
  
  -------------------------------------------------THEEND----------------------------------------------------