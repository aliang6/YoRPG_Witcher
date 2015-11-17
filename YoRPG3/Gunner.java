/* Team Witcher - Andy Liang, Shariar Kabir, Stanley Zeng
   APCS1 pd5
   HW28 -- Ye Olde Role Playing Game
   2015-11-11 */
public class Gunner extends Character{
    private String name;

    public Gunner(String name){ //Constructor for gunner. Name is the input 
 name = name;
 health = 100;
 strength = 6;
 defense = 5;
 attack_rating = 0.8;
    }

 
    public String getName(){ //Returns name of the Gunner
 return name;
    }

 

    public void specialize(){ //Prepares for a special attack. Lowers defense and increases strength
 defense *= .5;
 strength *= 3;
    }

    public void normalize(){ //Prepares for a normal attack. Resets defense and strength to original values.
 defense *= 2;
 strength *= .33;
    }
    
    public static String about(){
 System.out.println("Name: " + name);
 System.out.println("Class: " + Gunner);
 System.out.println("Heath: " + health);
 System.out.println("Strength: " + strength);
 System.out.println("Defense: " + defense);

    }
}
