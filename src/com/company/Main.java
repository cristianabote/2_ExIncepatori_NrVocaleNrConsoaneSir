package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // Scrie un program care numara cate vocale si cate consoane sunt intr-un sir dat.Daca nr vocalelor >nr consoanelor afiseaza TRUE altfel FALSE.
        String sir1 = "Acesta e textul dat";
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti textul dorit: ");
        String sir=scan.nextLine();
        int nrVocale = 0, nrConsoane = 0;
        sir = sir.toLowerCase();
        for (int i = 0; i < sir.length(); i++) {
            switch (sir.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    nrVocale++;
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    break;
                case ' ':
                case '_':
                case '-':
                case '#':
                case '@':
                case '!':
                case '$':
                case '%':
                case '.':
                case ';':
                case ':':
                case ',':
                case '?':
                    break;

                default:
                    nrConsoane++;
            }
        }
        if (nrVocale > nrConsoane){
                System.out.println("Numarul vocalelor din sir este mai mare decat numarul consoanelor : TRUE");}
            else
                if (nrConsoane>nrVocale)
                    System.out.println(" FALSE");
                else
                    System.out.println("Numarul vocalelor din sir este egal cu numarul consoanelor");




    }
}