/* Team Witcher - Andy Liang, Shariar Kabir, Stanley Zeng
   APCS1 pd5
   HW28 -- Ye Olde Role Playing Game
   2015-11-11 */
public class Warrior extends Character{
    private String name;

    public Warrior(String name){ //Constructor for warrior. Name is the input 
 name = name;
 health = 100;
 strength = 10;
 defense = 8;
 attack_rating = 0.8;
    }

 
    public String getName(){ //Returns name of the Warrior
 return name;
    }

 

    public void specialize(){ //Prepares for a special attack. Lowers defense and increases strength
 defense *= .5;
 strength *= 2;
    }

    public void normalize(){ //Prepares for a normal attack. Resets defense and strength to original values.
 defense *= 2;
 strength *= .5;
    }
    
    public static String about(){
 System.out.println("Name: " + name);
 System.out.println("Class: " + Warrior);
 System.out.println("Heath: " + health);
 System.out.println("Strength: " + strength);
 System.out.println("Defense: " + defense);

    }
}
