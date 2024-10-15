package textrpg;

public class Enemy extends Character {
    
    // player current xp
    int playerXp;
    
    // enemy constructor
    public Enemy(String name, int playerXp) {
        super(name, (int) (Math.random()*playerXp + playerXp/3 + 5), (int) (Math.random()*(playerXp/4 + 2) + 1));
        // assign variable
        this.playerXp = playerXp;
        
    }
    
    // specific enemy attack and defense calculation - changes strength based on xp....,.,.,
    @Override
    public int attack() {
        return (int) (Math.random()*(playerXp/4 + 1) + xp/4 + 3);
    }
    @Override
    public int defend() {
        return (int) (Math.random()*(playerXp/4 + 1) + xp/4 + 3);
    }
    
    
}
