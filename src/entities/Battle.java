package entities;

public class Battle {

    Monster monster;

    public void startBattle (Player player) throws InterruptedException {
        summonMonsterTo(player);
        while (true) {
            if (monster != null) {
                Thread.sleep(300);
                System.out.println("Você desferiu " + monster.takeDamage(player.attack()) + " de dano ao " + monster.getName() + ".");
                Thread.sleep(1500);
                if (monster.getHealth() > 0) {
                    System.out.println("Você sofreu " + player.takeDamage(monster.attack()) + " de dano devido ao ataque do " + monster.getName() + ".");
                    Thread.sleep(1500);
                }
                if (player.getHealth() <= 0) {
                    System.out.println("Você morreu.");
                    break;
                }
                if (monster.getHealth() <= 0) {
                    System.out.println("Você matou o " + monster.getName() + ".");
                    Thread.sleep(1000);
                    System.out.println("Você ganhou " + player.gainExperience(monster.getExperience()) + " de experiência.");
                    Thread.sleep(1000);
                    player.checkStatus();
                    break;
                }
            }
        }
    }

    public void summonMonsterTo (Player player) {
        switch (player.getLevel()) {
            case 1:
                System.out.println("Você encontrou um rato.");
                monster = new Rat("rato", "um rato cinza.", 1, 10, 10, 25);
                break;
            case 2:
                System.out.println("Você encontrou um javali.");
                monster = new Boar("javali", "um javali selvagem.", 2, 20, 20, 45);
                break;
            case 3:
                System.out.println("Você encontrou um goblin.");
                monster = new Goblin("goblin", "um goblin verde e asqueroso.", 3, 35, 35, 65);
                break;
            default:
                System.out.println("Não há monstro para invocar baseado em seu nível.");
                break;
        }
    }
}


