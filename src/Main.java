import GUI.MainView;
import entities.Battle;
import entities.Player;


import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws InterruptedException {
//        new MainView();  // don't need this right now, yet to be implemented a GUI.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Simples RPG.");
        System.out.println("Vamos começar com a criação de seu personagem.");
        System.out.print("Insira o nome desejado: ");
        String newPlayerName = scanner.next();
        Player player = new Player();
        player.setName(newPlayerName);
        System.out.println("Personagem criado com sucesso!");
        while (true) {
            Thread.sleep(500);
            System.out.println("O que quer fazer agora?");
            Thread.sleep(200);
            System.out.print("\"[1]caçar\", \"[2]descansar\" ou \"[3]visitar a loja\"? ");
            String playerOption = scanner.next();

            if (playerOption.equals("caçar") || playerOption.equals("1")) {
                Battle battle = new Battle();
                battle.startBattle(player);
                Thread.sleep(1500);
            }
            if (playerOption.equals("descansar") || playerOption.equals("2")) {
                player.rest();
            }
            if (player.getHealth() <= 0) {
                System.out.println("Game over.");
                break;
            };
            if (player.getLevel() == 4) {
                System.out.println("Você ganhou.");
                break;
            }
        }
    }
}
