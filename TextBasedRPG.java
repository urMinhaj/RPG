package textbasedrpg;
import java.util.Scanner;
public class TextBasedRPG {
    private Scanner scanner;
    private Player player;
    public TextBasedRPG() {
        scanner = new Scanner(System.in);
        player = new Player("Hero", 100, 10);
    }
    public void start() {
        System.out.println("Welcome to the Text-Based RPG!");
        System.out.println("You are " + player.getName() + " with "
                + player.getHealth() + " health and " + player.getAttackPower() 
                + " attack power.");
        boolean running = true;
        while (running) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Explore");
            System.out.println("2. View Stats");
            System.out.println("3. Quit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    explore();
                    break;
                case 2:
                    viewStats();
                    break;
                case 3:
                    running = false;
                    System.out.println("Thanks for playing!");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
    private void explore() {
        System.out.println("You venture into the unknown...");
        Enemy enemy = new Enemy("Goblin", 30, 5);
        System.out.println("A wild " + enemy.getName() + " appears!");
        while (enemy.getHealth() > 0 && player.getHealth() > 0) {
            System.out.println("\n1. Attack");
            System.out.println("2. Run");
            int choice = scanner.nextInt();
            if (choice == 1) {
                player.attack(enemy);
                if (enemy.getHealth() > 0) {
                    enemy.attack(player);
                }
            } else if (choice == 2) {
                System.out.println("You run away!");
                break;
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
        if (player.getHealth() <= 0) {
            System.out.println("You have been defeated...");
        } else if (enemy.getHealth() <= 0) {
            System.out.println("You defeated the " + enemy.getName() + "!");
        }
    }
    private void viewStats() {
        System.out.println("Player Stats:");
        System.out.println("Name: " + player.getName());
        System.out.println("Health: " + player.getHealth());
        System.out.println("Attack Power: " + player.getAttackPower());
    }
    public static void main(String[] args) {
        TextBasedRPG game = new TextBasedRPG();
        game.start();
    }
}
    
    

