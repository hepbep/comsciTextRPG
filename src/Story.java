package textrpg;

// story class does nothing, only has methods to print out story parts
public class Story {
    
    public static void printIntro(){
        
        // dont touch this
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("STORY");
        GameLogic.printSeparator(30);
        
        //this will be the intro
        System.out.println("There was once a benevolent king who was known throughout the lands by the name 'King Yeoh'.");
        System.out.println("He was known as a great ruler, who brought peace to his nation, and made"
                + " great advances in it's economy.");
        System.out.println("However, disaster struck when an aggressive nation suddenly"
                + " flooded the southern border, starting a 10 year long war.");
        System.out.println("As a result of this, his family was kidnapped while he was away at war,"
                + " before he too was ultimately killed in a battle.");
        System.out.println("Nearly 100 years on, it is said that his soul still roams the lands, searching for"
                + " the family he once loved. \n\nUntil one day, when he found the perfect match.");
        
        // shiv dont touch this
        GameLogic.anythingToContinue();
        
    }
    
    // make as many acts/parts as you want, just name them like this and change the
    // "STORY - ACT I" to the part you are up to
    public static void printFirstActIntro(){
        
        // dont touch this
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("STORY - ACT I Intro");
        GameLogic.printSeparator(30);
        
        // touch this
        System.out.println("You're awaken by a cold gust of wind sweeping through the doors in the middle of the night.");
        System.out.println("As the tip of your tongue runs across your parched lips, you think to youself 'I need some water.'");
        System.out.println("While you are tip-toeing down the hallway of your house, "
                + "you realise that a couple doors are left ajar.");
        System.out.println("You decide to peer in, thinking that your family may have just forgot to close the doors fully,"
                + "\nbut as your eyes scan across the room, a silhouette in the window quickly runs away, seemingly carrying your family with it.");
        System.out.println("You hurriedly rush to gather your clothes on to run to the town elder. He tells you that "
                + "\nthe legend of the Undead King is true, and that you must"
                + "find the Sunblade, and find the King in the now abandoned Eastern Castle.");
        System.out.println("The town elder entrusts you with a set of items, a stone sword and some leather armour,\n"
                + "that would help you along the way, "
                + "\nas well as a blessing that would keep you satiated on your journey.");
        System.out.println("He gives you a special book that would let you pick an item to upgrade after 2 days, as well as a "
                + "\nsingle potion that heals you completely.");
        System.out.println("The town elder warns you of the grave dangers that you will experience along the way, "
                + "\nwith all sorts of creatures around trying to kill you. \nWill you accept this journey?");
        // dont touch this
        GameLogic.anythingToContinue();
        
    }
    
    public static void printFirstActOutro(){
        
        // dont touch this 
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("STORY - ACT I Outro");
        GameLogic.printSeparator(30);
        
        // touch this
        System.out.println("After countless hours of sprinting across the vast northern plains and narrowly surviving some attacks, "
                + "\nyou realise how unathletic you are when you suddenly collapse on the ground.");
        System.out.println("Looking up, you see the edges of a dense forest, right in the way of your path.");
        System.out.println("Knowing what you will have to endure the next day, "
                + "you let out one long sigh and \nbegin crawling to somewhere a little more sheltered.");
        System.out.println("Initially, you fight the need to sleep, thinking to yourself that it would be too dangerous.");
        System.out.println("However, despite your attempts, you eventually succumb to the exhaustion, \neventually completely passing out, drifting out of lucidity...");
        // dont touch this
        GameLogic.anythingToContinue();
        
    }
    
    public static void printSecondActIntro(){
        
        // shiv dont touch this 
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("STORY - ACT II Intro");
        GameLogic.printSeparator(30);
        
        // shiv touch this
        System.out.println("Your eyes suddenly snap open. It's the crack of dawn, \nand you are awoken by a strange animal licking at your face."
                + "\nYou quickly brush it away from you and get yourself up and organised.");
        System.out.println("After scavenging for a handful of berries, you feel energised enough to start walking again.");
        System.out.println("You decide to climb up on one of the taller trees in the forest, just to get a good look at \nwhere you were headed to.");
        System.out.println("Looking ahead, you see the tips of a mountain where the sun was rising behind. "
                + "\nYou think to youself, 'This has to be the Eastern Castle.'");
        System.out.println("You quickly struggle down the tree as you realise you had been sitting"
                + "\nin a bird's nest, and quickly start walking again before any bird notices.");
        
        // shiv dont touch this
        GameLogic.anythingToContinue();
        
    }
    
    public static void printSecondActOutro(){
        
        // shiv dont touch this 
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("STORY - ACT II Outro");
        GameLogic.printSeparator(30);
        
        // shiv touch this
        System.out.println("After a long and arduous journey through the dense forest, you finally make it"
                + "\nto the end. ");
        System.out.println("The forest slowly fades out into a more rocky landscape, gradually becoming thinner and thinner.");
        System.out.println("You feel confused as to why the terrain suddenly became so hilly, so you decide to look up."
                + "\nAs your head slowly tilts up, the feeling of dread suddenly dawns on you.");
        System.out.println("You realise that you have finally reached the base of the Great Mountain, but the climb up looks "
                + "\nnearly vertical. Surely any encounter with a creature would prove deadly here.");
        System.out.println("There are a couple small flat spots that you had noticed while looking up. You decide that those"
                + "\nspots could be somewhere you could rest.");
        System.out.println("'That's enough thinking', you say to yourself, 'I need to hurry up and get up there!'");
        System.out.println("Your journey continues...");
        // shiv dont touch this
        GameLogic.anythingToContinue();
        
    }
    
    public static void printThirdActIntro(){
        
        // shiv dont touch this 
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("STORY - ACT III Intro");
        GameLogic.printSeparator(30);
        
        // shiv touch this
        System.out.println("After climbing for all of yesterday, you wake up nearly at the top.");
        System.out.println("Exhausted from all the tight encounters with the creatures, you finally trudge your way"
                + "\nto the highest point. But as you look out, there is no castle to be seen.");
        System.out.println("You are filled with despair. 'Was this all... for nothing?'");
        System.out.println("Despite there seemingly being nothing ahead of you, you think to yourself"
                + "\nthat you can't give up now.");
        System.out.println("'There's no way the castle doesn't exist, right? Theres no way the "
                + "\nTown Elder would lie about such a thing!'");
        System.out.println("Just as you begin to walk again, a beam from the sun strikes you, and you"
                + "\nfeel completely rejuvenated.");
        System.out.println("Filled with a new-found determination, you decide to follow the rising sun east,"
                + "\naimlessly walking towards an empty horizon...");
        
        GameLogic.printSeparator(30);
        GameLogic.printHeading("Your maximum HP has been increased to 50 HP!");
        GameLogic.printSeparator(30);
        // shiv dont touch this
        GameLogic.anythingToContinue();
        
    }
    
    public static void printThirdActOutro(){
        
        // shiv dont touch this 
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("STORY - ACT III Outro");
        GameLogic.printSeparator(30);
        
        // shiv touch this
        System.out.println("After walking so close to the sun for so long, you are relieved to see that"
                + "\nthe sun is starting to fall below the horizon.");
        System.out.println("As the sun begins to set, a bright blue glowing structure gradually emerges from"
                + "\nthe night sky. The Eastern Castle is right in front of you.");
        System.out.println("The castle was truly in ruins, with toppled walls and pillars, as well as"
                + "\nparts of the roof that had caved in.");
        System.out.println("But of course, the most important ruin in the castle was the Undead King.");
        System.out.println("");
        
        // shiv dont touch this
        GameLogic.anythingToContinue();
        
    }
    
    public static void printFourthActIntro(){
        
        // shiv dont touch this 
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("STORY - ACT IV Intro");
        GameLogic.printSeparator(30);
        
        // shiv touch this
        System.out.println("You tell Aidan Yeoh that taking your family isn't going to get him anywhere. He should stop bothering people and continue searching for his own.");
        System.out.println("He tells you about how he lost his wife, and the grief he felt. Destined the roam the plains for someone he knows he can't have, he just has to make someone else's family his.");
        System.out.println("Knowing there's no way out of this, you challenge Aidan Yeoh to a Pokerman Battle. One final battle, to put his soul to rest.");
        
        // shiv dont touch this
        GameLogic.anythingToContinue();
        
    }
    
    public static void printFourthActOutro(){
        
        // shiv dont touch this 
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("STORY - ACT VI Outro");
        GameLogic.printSeparator(30);
        
        // shiv touch this
        System.out.println("The Undead King slumps over, accepting defeat as his soul slowly dissipates.");
        System.out.println("It seems he's glad that you've finally freed him from his curse. As his soul goes to rest, with one shake of his hand, you feel yourself start to evaporate.");
        System.out.println("However, you feel as if this is a good thing. As you feel yourself drifting away... you close your eyes....");
        System.out.println("And wake up. You're sprawled outside your house, in a jumbled heap along with your family. As your family talks about how they just had the weirdest dream, you can't help but smile.");
        System.out.println("As you and your family walk inside, you look backwards one time, remembering the legacy of King Aidan Yeoh. He's in a better place now.");
        System.out.println("'Urgh.. what an adventure...' You think to yourself as you turn around and enter your house with the rest of your family, marking the end of a journey.");
        // shiv dont touch this
        GameLogic.anythingToContinue();
        
    }
    
    // this is the end of the game story
    public static void printEnd(Player player){
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("Congratulations, " + player.name + "! You have defeated Aidan Yeoh and saved your family!");
        GameLogic.printSeparator(30);
        System.out.println("This game was developed by Leon Leonard and Shiv Pathania for the Year 10 ComSci IA.");
        System.out.println("We hope you enjoyed.");
        System.out.println("And we also hope Mr Freeman gives us 7s!!");       
    }
}