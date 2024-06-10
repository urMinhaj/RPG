package textbasedrpg;
public class Enemy {
    private String name;
    private int health;
    private int attackPower;
    public Enemy(String name, int health, int attackPower) {
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
    public void attack(Player player) {
        System.out.println("The " + name + " attacks you for " + attackPower + 
                " damage.");
        player.takeDamage(attackPower);
    }
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("The " + name + " takes " + damage + 
                " damage. Health is now " + health + ".");
    }
}

