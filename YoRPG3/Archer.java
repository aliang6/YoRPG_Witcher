//Team Witcher - Andy Liang, Shariar Kabir, Stanley Zeng
//APCS1 pd5
//HW30 -- Ye Olde Role Playing Game
//2015-11-14 */
public class Archer extends Character{
    private String name;
    //private int arrow;

    public Archer(String name){ //Constructor for Archer. Name is the input 
 name = name;
 health = 100;
 strength = 7;
 defense = 6;
 attack_rating = 0.8;
 //arrow = 15;
 
    }

 
    public String getName(){ //Returns name of the Archer
 return name;
    }

 

    public void specialize(){ //Prepares for a special attack. Lose 3 arrows and some defense and increase strength
 defense *= .5;
 strength *= 1.7;

    }

    public void normalize(){ //Prepares for a normal attack. Lose 1 arrow, Resets defense and strength to original values.
 defense *= 2;
 strength *= (1/1.7);

    }
}
