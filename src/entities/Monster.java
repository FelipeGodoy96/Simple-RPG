package entities;

public abstract class Monster {

    protected String name;
    protected String description;
    protected int level;
    protected int health;
    protected int max_health;
    protected int experience;
    protected String[] loot;

    public Monster(String name, String description, int level, int health, int max_health, int experience) {
        this.name = name;
        this.description = description;
        this.level = level;
        this.health = health;
        this.max_health = max_health;
        this.experience = experience;
    }

    public int attack() {
        return (int)(Math.random() * (level * 2));
    }

    public int takeDamage(int damage) {
        health -= damage;
        return damage;
    }

    public String[] generateLoot () {
        loot = new String[]{"item1"};
        return loot;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getMax_health() {
        return max_health;
    }

    public int getExperience() {
        return experience;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
