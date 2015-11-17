/* Team Witcher - Andy Liang, Shariar Kabir, Stanley Zeng
   APCS1 pd5
   HW30 -- Ye Olde Role Playing Game
   2015-11-14 */
public class Mage extends Character{
    private String name;
    protected int mana;

    public Mage(String name){ //Constructor for Mage . Name is the input 
 name = name;
 health = 100;
 strength = 3;
 defense = 5;
 mana = 100;
 attack_rating = 0.8;
    }

 
    public String getName(){ //Returns name of the Mage
 return name;
    }

    public void specialize(){ //Prepares for a special attack. Lose Health in order to gain mana
 health -= 35;
 mana += 50;
    }

    public void normalize(){ //Prepares for a normal attack. Gains a bit of health back and subtracts mana
 health += 20;
 mana -= 50;
    }
    
}
