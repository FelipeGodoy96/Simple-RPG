package entities;

public class Player {
    private String name;
    private int level = 1;
    private int experience = 0;
    private int max_experience = 100;
    private int gold = 0;
    private int health = 10;
    private int max_health = 10;

    public Player() {
    }

    public int attack () {
        return (int)(Math.random() * (this.level * 5));
    }

    public int takeDamage (int damage) {
        this.health = (this.getHealth() - damage);
        return damage;
    }

    public int gainExperience (int exp) {
        this.experience += exp;
        return exp;
    }

    public void checkStatus () {
        checkForlevelUp();
        System.out.println("Personagem: { nome: " + this.name + " }, Status { nível: " + this.level + ", experiência: " + this.experience + ", exp. próx. nível: " + (this.max_experience - this.experience) + ", vida: " + this.health + ", vida máxima: " + this.max_health + ", ouro: " + this.gold + " }");
    }

    public void rest () throws InterruptedException {
        if (this.health < this.max_health) {
            System.out.println("Descansando por 5 segundos.");
            Thread.sleep(5000);
            this.health = this.health + this.level;
            if (this.health > this.max_health)
                this.health = this.max_health;
            System.out.println("Você recuperou " + this.level + " de vida.");
            checkStatus();
        }
        else {
            System.out.println("Você já está descansado.");
        }
    }


    public void checkForlevelUp () {
        int remainingExp;
        while (this.experience >= this.max_experience) {
            remainingExp = this.experience - this.max_experience;
            this.level += 1;
            this.max_experience *= 2;
            this.max_health *= 2;
            this.health = this.max_health;
            this.experience = remainingExp;
        }
//        if (this.experience >= this.max_experience) {
//            remainingExp = this.experience - this.max_experience;
//            this.level += 1;
//            this.max_experience *= 2;
//            this.experience = 0 + (remainingExp);
//            this.max_health *= 2;
//            this.health = this.max_health;
//            System.out.println("Parabéns! Você evoluiu de nível.");
//        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getMax_experience() {
        return max_experience;
    }

    public void setMax_experience(int max_experience) {
        this.max_experience = max_experience;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMax_health() {
        return max_health;
    }

    public void setMax_health(int max_health) {
        this.max_health = max_health;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", experience=" + experience +
                ", gold=" + gold +
                ", health=" + health +
                ", max_health=" + max_health +
                '}';
    }
}
