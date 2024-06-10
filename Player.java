package textbasedrpg;
public class Player {
    private String name;
    private int health;
    private int attackPower;
    public Player(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getAttackPower() {
        return attackPower;
    }
    public void attack(Enemy enemy) {
        System.out.println("You attack the " + enemy.getName() + " for " 
                + attackPower + " damage.");
        enemy.takeDamage(attackPower);
    }
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("You take " + damage + " damage. Health is now " 
                + health + ".");
    } 
}




