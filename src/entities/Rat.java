package entities;

public class Rat extends Monster{


    public Rat(String name, String description, int level, int health, int max_health, int experience) {
        super(name, description, level, health, max_health, experience);
    }

    @Override
    public int attack() {
        return super.attack();
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
