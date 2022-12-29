package entities;

public class Goblin extends Monster {


    public Goblin(String name, String description, int level, int health, int max_health, int experience) {
        super(name, description, level, health, max_health, experience);
    }

    @Override
    public int attack() {
        return (int)(Math.random() * (this.level * 2));
    }

    @Override
    public int takeDamage(int damage) {
        return super.takeDamage(damage);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public int getLevel() {
        return super.getLevel();
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public int getMax_health() {
        return super.getMax_health();
    }

    @Override
    public int getExperience() {
        return super.getExperience();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }
}
