/* Team Witcher - Andy Liang, Shariar Kabir, Stanley Zeng
   APCS1 pd5
   HW28 -- Ye Olde Role Playing Game
   2015-11-11 */
public class Monster extends Character{ //The attributes

  
  public Monster(){ //Sets the attributes
    health=150;
    int interval = (64-20)+1;
    strength= (int)(Math.random() * interval) + 20;
    defense=20;
    attack_rating=1.0;
    name = "Super cool dragon";
    
  }
  


  public static String about(){
 System.out.println("Name: " + name);
 System.out.println("Class: " + Monster);
 System.out.println("Heath: " + health);
 System.out.println("Strength: " + strength);
 System.out.println("Defense: " + defense);

    }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}