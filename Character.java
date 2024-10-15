package textrpg;

public abstract class Character {
    
    // attributes that every character will have 
    public String name;
    public int maxHp, hp, xp; 
    
    // constructor for character
    public Character(String name, int maxHp, int xp){
        this.name = name;
        this.maxHp = maxHp;
        this.xp = xp;
        this.hp = maxHp;
    }
    
    // methods that every character will have
    public abstract int attack();
    public abstract int defend();
    
}