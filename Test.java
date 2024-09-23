import java.util.Scanner;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws Exception {



        //create enemies to test
        EnemyInfo enemy1 = new EnemyInfo(5, 1, 1);
        EnemyInfo enemy2 = new EnemyInfo(7, 1, 2);
        EnemyInfo enemy3 = new EnemyInfo(8, 2, 2);

        //test display of their stats
        System.out.println("Enemy 1 stats: HP = " + enemy1.getEnemyHP() + " DEF = " + enemy1.getEnemyDEF() + " ATK = " + enemy1.getEnemyATK());
        System.out.println("Enemy 2 stats: HP = " + enemy2.getEnemyHP() + " DEF = " + enemy2.getEnemyDEF() + " ATK = " + enemy2.getEnemyATK());
        System.out.println("Enemy 3 stats: HP = " + enemy3.getEnemyHP() + " DEF = " + enemy3.getEnemyDEF() + " ATK = " + enemy3.getEnemyATK());

        //do the same with player
        PlayerInfo player1 = new PlayerInfo(10, 5, 3);

        //display their stats
        System.out.println("Player stats: HP = " + player1.getPlayerHP() + " DEF = " + player1.getPlayerDEF() + " ATK = " + player1.getPlayerATK());

    }
}

//EnemyInfo class for enemies
class EnemyInfo {
    private int EnemyHP;
    private int EnemyDEF;
    private int EnemyATK;
    //eventually, images of the enemy will be included and called upon in the same manner

    public EnemyInfo(int hp, int def, int atk) {
        this.EnemyHP = hp;
        this.EnemyDEF = def;
        this.EnemyATK = atk;
    }

    public int getEnemyHP() {
        return EnemyHP;
    }

    public int getEnemyDEF() {
        return EnemyDEF;
    }

    public int getEnemyATK() {
        return EnemyATK;
    }

    public void setEnemyHP(int hp) {
        this.EnemyHP = hp;
    }

    public void setEnemyDEF(int def) {
        this.EnemyDEF = def;
    }

}

//PlayerInfo class for the player
class PlayerInfo {
    private int PlayerHP;
    private int PlayerDEF;
    private int PlayerATK;
    //the game will be from the players pov like in classic rpgs, such as earthbound. so the players image wont be displayed on the screen at all, at least in battle settings.

    public PlayerInfo(int hp, int def, int atk) {
        this.PlayerHP = hp;
        this.PlayerDEF = def;
        this.PlayerATK = atk;
    }

    public int getPlayerHP() {
        return PlayerHP;
    }

    public int getPlayerDEF() {
        return PlayerDEF;
    }

    public int getPlayerATK() {
        return PlayerATK;
    }

    public int setPlayerHP(int hp) {
        this.PlayerHP = hp;
    }

    class Battle {
        public void startBattle(PlayerInfo player, EnemyInfo enemy) {
            Scanner scanner = new Scanner(System.in); // Moved scanner initialization here
            
            while (enemy.getEnemyHP() > 0 && player.getPlayerHP() > 0) {
                System.out.println("Player's turn!");
                System.out.println("What would you like to do?");
                System.out.println("Type 'A' to Attack!");
                System.out.println("Type 'D' to Defend!");
                System.out.println("Type 'W' for a Wild Attack!");
                String choice = scanner.nextLine();
    
                if (choice.equalsIgnoreCase("A")) {
                    // Attack: subtract player's ATK from enemy's HP
                    int newEnemyHP = enemy.getEnemyHP() - player.getPlayerATK();
                    enemy.setEnemyHP(newEnemyHP); // Enemy HP is updated
    
                    System.out.println("You attacked the enemy! Enemy HP is now: " + newEnemyHP);
                }
    
                // You can add other actions like Defend or Wild Attack here
                if (choice.equalsIgnoreCase("D")) {
                    int 
                }
            }
            scanner.close(); // Close the scanner when done
        }
    }
    
}
