package mineSweeperGame;

import java.util.Scanner;
public class Main {


public static void main(String[] args) {
    Scanner tara = new Scanner(System.in);
    System.out.println("L�tfen sat�r say�s�n� giriniz : ");
    int a=tara.nextInt();
    System.out.println("L�tfen s�tun say�s�n� giriniz : ");
    int b=tara.nextInt();
    MineSweeper mayin = new MineSweeper(a, b);
    mayin.run();
    System.out.println("");
 }
}