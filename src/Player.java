package textrpg;

import static textrpg.GameLogic.*;

class Player extends Character{
    
    // integers to store number of upgrades in each path
    public int numAtkUpgrades, numDefUpgrades;
    
    // additional stats
    int gold, restsLeft, potions;
    
    // arrays to store skill names
    public String[] atkUpgrades = {"Bare fists", "Steel Blade", "Magicbane", "Sunblade", "Blade of the Ruined King"};
    public String[] defUpgrades = {"Cotton shirt", "Leather Armour", "Thornmail", "Sunfire Aegis", "Shield of the Sol", "Crown of the Shattered Queen"};
    
    // player specific constructor
    public Player(String name){
        // calling constructor of superclass
        super(name, 25, 0);
        // setting number of upgrades to 1 (starting with Stone sword and leather armour)
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;
        this.gold = 5;
        this.restsLeft = 1;
        this.potions = 0;
        // let the player choose a trait (pokemon) when creating a new character
        chooseTrait();
        // disable this feature for now will work better for game
    }

    
    // dont touch this shiv.... 
    // damage calculations
    // player specific methods
    @Override
    public int attack() {
        // TODO Auto-generated method stub
        return (int) (Math.random()*(xp/4 + numAtkUpgrades*3 + 3) + xp/10 + numAtkUpgrades*2 + numDefUpgrades + 1);
    }
    @Override
    public int defend() {
        // TODO Auto-generated method stub
        return (int) (Math.random()*(xp/4 + numDefUpgrades*3 + 3) + xp/10 + numDefUpgrades*2 + numAtkUpgrades + 1);
    }
    
    // let the player choose a trait of either skill path 
    public void chooseTrait(){
        GameLogic.clearConsole();
        GameLogic.printHeading("Choose an item to upgrade: ");
        System.out.println("(1) " + atkUpgrades[numAtkUpgrades] + " -> " + atkUpgrades[numAtkUpgrades + 1]);
        System.out.println("(2) " + defUpgrades[numDefUpgrades] + " -> " + defUpgrades[numDefUpgrades + 1]);
        // get player input 
        int input = GameLogic.readInt("-> ", 2);
        // clear console after selection
        GameLogic.clearConsole();
        
        //deal with both cases
        if(input == 1){
            GameLogic.printHeading("You got a " + atkUpgrades[numAtkUpgrades + 1] + "!");
            numAtkUpgrades++;
        }if (input == 2){
            GameLogic.printHeading("You got a " + defUpgrades[numDefUpgrades + 1] + "!");
            numDefUpgrades++;
        }
        GameLogic.anythingToContinue();
        
    }
}
