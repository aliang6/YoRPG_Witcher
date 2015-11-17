 /* Team Witcher - Andy Liang, Shariar Kabir, Stanley Zeng
   APCS1 pd5
   HW28 -- Ye Olde Role Playing Game
   2015-11-11 */
public class Rogue extends Character{
    private String name;

    public Rogue(String name){ //Constructor for Rogue. Name is the input 
 name = name;
 health = 100;
 strength = 6;
 defense = 3;
 attack_rating = 0.8;
    }

 
    public String getName(){ //Returns name of the Rogue
 return name;
    }

 

    public void specialize(){ //Prepares for a special attack. Gets rid of defense and increases strength
 defense *= 0.1;
 strength *= 10;
    }

    public void normalize(){ //Prepares for a normal attack. Resets defense and strength to original values.
 defense *= 10;
 strength *= .1;
    }
    
}