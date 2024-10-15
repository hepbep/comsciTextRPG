package textrpg;
import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);
    
    static Player player;
    
    public static boolean isRunning;
    
    // story tracker
    public static int place = 0, act = 1;
    public static String[] places = {"Act 1", "Act 2", "Act 3", "Act 4"};
    
    // random encounters :D
    public static String[] encounters = {"Battle", "Battle", "Battle", "Battle", "Rest", "Battle"};
    
    // enemies names
    public static String[] enemies = {"Wild Dog", "Wild Dog", "Rat", "Wild Boar", "Giant Enemy Spider"};
    
    // Method to get user input from console
    public static int readInt(String prompt, int userChoices) {
        int input; 
        
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter an integer!");
            }
        } while(input < 1 || input > userChoices);
        
        return input;
    
    }
    
    // Method to simulate clearing the console
    public static void clearConsole() {
        for(int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
    
    // method to print a separator with length n 
    public static void printSeparator(int n) {
        for(int i = 0; i < n; i++) 
            System.out.print("-");
        System.out.println();
    }
    
    // method to print a heading
    public static void printHeading(String title) {
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }
    
    // method to stop the game until the user inputs something
    public static void anythingToContinue() {
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    }
    
    // method to start the game
    public static void startGame(){
        boolean nameSet;
        nameSet = false;
        String name;
        // print title screan
        clearConsole();
        printSeparator(40);
        printSeparator(30);
        System.out.println("Castle of the Undead King ");
        System.out.println("Game by Shiv and Leon");
        printSeparator(30);
        printSeparator(40);
        anythingToContinue();
        
        // get player name
        do {
            clearConsole();
            printHeading("What is your name?");
            name = scanner.next();
            // checking with player if name is correct
            clearConsole();
            printHeading("Your name is " + name + "\nIs that correct?");
            System.out.println("(1) Yes!");
            System.out.println("(2) No, I want to change my name.");
            int input = readInt("-> ", 2);
            if(input == 1){
                nameSet = true;
            }
            
        } while (!nameSet);
        
        // print the story
        Story.printIntro();
        
        // new player object with name
        player = new Player(name);
        
        // print first act
        Story.printFirstActIntro();
        
        //set isRunning to true so that game loop can continue
        isRunning = true;
        
        // main game loop
        gameLoop();
    }
    
    // method to continue journey
    public static void continueJourney(){
        // check the prgress of the story
        checkAct(); // dont touch this shiv....
        
        // check if the story is at the end
        if (act != 4){
            randomEncounter(); // i do later... dont touch this shiv....
        }
    }
    
    public static void checkAct(){
        // changes the act based on xp
        if(player.xp >= 10 && act == 1){
            // change value and print sotry ACT 2
            act = 2;
            place = 1;
            Story.printFirstActOutro();
            
            // level up
            player.chooseTrait();
            // more story
            Story.printSecondActIntro();
            
            // assign new enemy values
            enemies[0] = "Little Monkey";
            enemies[1] = "Big Monkey";
            enemies[2] = "Little Monkey";
            enemies[3] = "Giant Enemy Spider";
            enemies[4] = "Squirrel";
            
            // set the encounters
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Rest";
            encounters[4] = "Battle";
            encounters[5] = "Battle";
        } else if(player.xp >= 25 && act == 2){
            // ACT 3 
            act = 3;
            place = 2;
            player.maxHp = 50;
            Story.printSecondActOutro();
            
            player.chooseTrait();
            Story.printThirdActIntro();
            // assign new enemy values
            enemies[0] = "Moutain Goat";
            enemies[1] = "Hawk 1";
            enemies[2] = "Hawk 2";
            enemies[3] = "Mountain Goat";
            enemies[4] = "Charlie";
            
            // set the encounters
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Battle";
            encounters[4] = "Shop";
            encounters[5] = "Rest";
            
            // heal the player because we are nice
            player.hp = player.maxHp;
        } else if(player.xp >= 50 && act == 3){
            // ACT 4 
            act = 4;
            place = 3;
            Story.printThirdActOutro();
            
            // player.chooseTrait();
            
            // give player item of this area
            player.numAtkUpgrades = 2;
            player.numDefUpgrades = 2;
            Story.printFourthActIntro();
            
            // heal the player because we are nice
            player.hp = player.maxHp;
            
            // FINAL BATTLE!!!~!~~!~!!~!~~~~ DATTEBAYO!!!!
            finalBattle();
        }
    }
    
    // calculating random encounters -- done lil bro..,,, dont touch this shiv.....
    public static void randomEncounter(){
        // randnum between 0 and array length
        int encounter = (int) (Math.random()* encounters.length);
        
        if(encounters[encounter].equals("Battle")){
            randomBattle();
            
        } else if(encounters[encounter].equals("Rest")){
            takeRest();
            
        } else {
            shop();
        }
    }
    
    public static void characterInfo(){
        clearConsole();
        printHeading("CHARACTER INFORMATION");
        System.out.println(player.name + "\tHP: " + player.hp + "/" + player.maxHp);
        printSeparator(20);
        System.out.println("XP: " + player.xp + "\tGold: " + player.gold);
        printSeparator(20);
        System.out.println("Potions: " + player.potions);
        System.out.println("Rests left: " + player.restsLeft);
        printSeparator(20);
        
        // printing traits
        if(player.numAtkUpgrades > 0){
            System.out.println("Offense: " + player.atkUpgrades[player.numAtkUpgrades]);
            printSeparator(20);
            
        }
        if(player.numDefUpgrades > 0){
            System.out.println("Defense: " + player.defUpgrades[player.numDefUpgrades]);
            
        }
        anythingToContinue();
    }
    
    // shops / wandering trader
    public static void shop(){
        clearConsole();
        printHeading("You met a wandering trader on your journey.\nHe offers you something...");
        int price = 5;
        System.out.println("-> Normal Potion: " + price + " gold. - Restores health to full.");
        printSeparator(20);
        //ask if you wanna buy
        System.out.println("Do you wish to buy one?\n(1) Yes!\n(2) No thanks.");
        int input = readInt("-> ", 2);
        if (input == 1){
            clearConsole();
            // check gold
            if(player.gold >= price){
                printHeading("You bought 1 Normal Potion for " + price + " gold!");
                player.potions++;
                player.gold -= price;
            } else {
                printHeading("You do not have enough gold for this item!");
            }
            anythingToContinue();
        }
    }
    
    // resting
    public static void takeRest(){
        clearConsole();
        if(player.restsLeft >= 1){
            printHeading("Do you want to take a rest? (" + player.restsLeft + " rest(s) left.)");
            System.out.println("(1) Yes\n(2) Maybe later");
            int input = readInt("->", 2);
            if (input == 1){
                clearConsole();
                if(player.hp < player.maxHp){
                    int hpRestored = (int) (Math.random()*(player.xp/4 + 1) + 10);
                    player.hp += hpRestored;
                    if(player.hp > player.maxHp){
                        player.hp = player.maxHp;
                    }
                    System.out.println("You took a rest and restored " + hpRestored + " HP!");
                    System.out.println("You are now at " + player.hp + "/" + player.maxHp + " HP.");
                    player.restsLeft--;
                } else {
                    System.out.println("You are already at full health. You don't need to rest!");
                }
            }
            anythingToContinue();
        }
    }
    
    // printing main menu
    public static void printMenu(){
        clearConsole();
        printHeading(places[place]);
        System.out.println("Current XP: " + player.xp);
        printSeparator(20);
        System.out.println("Choose an action");
        printSeparator(20);
        System.out.println("(1) Continue your journey");
        System.out.println("(2) Character information");
        System.out.println("(3) Exit Game");
        System.out.println("(4) Help");
    }
    
    // dead player
    public static void playerDied(){
        clearConsole();
        printHeading("You died...");
        printHeading("You earned " + player.xp + " XP on your journey. Try get more next time!");
        System.out.println("Thank you for playing. We hope you enjoyed!\n - from Shiv and Leon");
        isRunning = false;
    }
    
    public static void gameLoop(){
        while(isRunning){
            printMenu();
            int input = readInt("->", 4);
            if(input == 1){
                continueJourney();
            } else if (input == 2){
                characterInfo();
            } else if (input == 3) {
                clearConsole();
                printHeading("Are you sure you want to quit?");
                System.out.println("(1) Yes, I would like to quit\n(2) No, I want to keep playing");
                input = readInt("-> ", 2);
                if (input == 1){
                    System.out.println("Thank you for playing, hope you enjoyed!");
                    isRunning = false;
                } else {
                    System.out.println("You decide to keep playing.");
                    anythingToContinue();
                }
            } else {
                printHelp();
            }
            
        }
    }
    
    public static void printHelp(){
        clearConsole();
        printHeading("HELP");
        System.out.println("XP Boundaries for Acts\nAct 1 - 10 XP\nAct 2 - 50 XP\nAct 3 - 75 XP\nAct 4 (Final Act) - 100 XP");
        printSeparator(20);
        System.out.println("XP: " + player.xp);
        printSeparator(20);
        
        anythingToContinue();
    }
    
    // random battles
    public static void randomBattle(){
        clearConsole();
        printHeading("You have encountered an enemy. You have to fight it!");
        anythingToContinue();
        // enemy object with random name
        battle(new Enemy(enemies[(int)(Math.random()*enemies.length)], player.xp));
    }
    
    // battle method
    public static void battle(Enemy enemy){
        // battle loop!!!!!
        while(true){
            clearConsole();
            printHeading(enemy.name + "\nHP: " + enemy.hp + "/" + enemy.maxHp);
            printHeading(player.name + "\nHP: " + player.hp + "/" + player.maxHp);
            System.out.println("Choose an action: ");
            printSeparator(20);
            System.out.println("(1) Fight\n(2) Use Item\n(3) Flee");
            int input = readInt("->", 3);
            //react to player input
            if(input == 1){
                // Fight option
                // calcuate damage and damage taken (from enemy attack)
                int dmg = player.attack() - enemy.defend();
                int dmgTook = enemy.attack() - player.defend();
                // check if dmg is negative
                if (dmgTook < 0){
                    dmg -= dmgTook/2;
                    dmgTook = 0;
                }
                if (dmg < 0) {
                    dmg = 0;
                }
                // giving damage to both
                player.hp -= dmgTook;
                enemy.hp -= dmg;
                // show round info
                clearConsole();
                printHeading("BATTLE");
                System.out.println("You did " + dmg + " damage to the " + enemy.name + ".");
                printSeparator(15);
                System.out.println("The " + enemy.name + " did " + dmgTook + " damage to you.");
                anythingToContinue();
                // check if player dead
                if(player.hp <= 0){
                    playerDied();
                    break;
                } else if (enemy.hp <= 0){
                    // player won yahoo and give some xp too
                    clearConsole();
                    printHeading("You defeated the " + enemy.name + "!");
                    player.xp += enemy.xp;
                    System.out.println("You earned " + enemy.xp + " XP!");
                    
                    boolean addRest = (Math.random()*5 + 1 <= 2.25);
                    int goldEarned = (int) (Math.random()*enemy.xp);
                    if(addRest){
                        player.restsLeft++;
                        System.out.println("You earned the chance to gain an additional rest!");
                    }
                    if(goldEarned > 0){
                        player.gold += goldEarned;
                        System.out.println("You collected " + goldEarned + " gold from the " + enemy.name + " !");
                    }
                    
                    anythingToContinue();
                    break;
                }
            }else if (input == 2) {
                // potion
                clearConsole();
                if(player.potions > 0 && player.hp < player.maxHp){
                    // can use
                    printHeading("Do you want to drink a potion? (" + player.potions + " left.)");
                    System.out.println("(1) Yes\n(2) No, maybe later");
                    input = readInt("-> ", 2);
                    if(input == 1){
                        // player took potion
                        player.hp = player.maxHp;
                        clearConsole();
                        printHeading("You used a potion. It restored your health back to " + player.maxHp + ".");
                        anythingToContinue();
                    } else {
                        
                    }
                } else if (player.potions == 0) {
                    // cant use
                    printHeading("You don't have any potions.");
                    anythingToContinue();
                } else if (player.hp == player.maxHp){
                    printHeading("You are already at full health!");
                    anythingToContinue();
                } else if (player.potions == 0 && player.hp == player.maxHp){
                    printHeading("You have no potions and you are already at full health!");
                    anythingToContinue();
                }
                
            } else {
                // run away!!!
                clearConsole();
                if(act != 4){
                    if(Math.random()*10 + 1 <= 4.0){ //40% escape chance
                    printHeading("You ran away from the " + enemy.name + "!");
                    break;
                }else{
                    printHeading("Your escape route got blocked, and you couldn't escape the " + enemy.name + "!");
                    int dmgTook = enemy.attack();
                    //punishment >:)
                    System.out.println("In your attempt to escape, you took " + dmgTook + " damage!");
                    anythingToContinue();
                    if(player.hp <= 0){
                        playerDied();
                        break;
                    }
                }
                }else{
                    printHeading("You cannot escape from this battle!");
                    anythingToContinue();
                }
            }
        }
    }
    
    // FINAL BATTLE OF THE WHOLE ENTIRE GAME
    public static void finalBattle(){
        battle(new Enemy("Undead King Yeoh", 300));
        // print ending
        Story.printEnd(player);
        isRunning = false;
    }
}