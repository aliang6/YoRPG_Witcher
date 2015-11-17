/* Andy Liang, Stanley Zeng, Shariar Kabir - Team Witcher
 APCS1 pd5
 HW29 -- Ye Olde Role Playing Game, Improved
 2015-11-12 */

public abstract class Character{
  protected int health, strength, defense;
  protected double attack_rating;
  protected String name;
  
  public boolean isAlive(){
    return (health > 0);
  }
  
  public int getDefense(){
    return defense;
  }
  
  public String getName(){
    return name;
  }
  
  public int lowerHP(int damage){
    health -=damage;
    return health;
  }
  
  public int attack(Character character){
    int damage = (strength * defense) - character.getDefense();
    lowerHP(damage);
    return damage;
  }
  
  public abstract void normalize(){
    
  }
  
  public abstract void specialize(){
    
  }
  
  public abstract static void about(Character character){
    
  }
  
}
