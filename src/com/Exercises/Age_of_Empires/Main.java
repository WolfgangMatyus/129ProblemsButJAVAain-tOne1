package com.Exercises.Age_of_Empires;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Your age: ");
        int age = sc.nextInt();

        System.out.printf("%%d:   ~%d~\n", age);
        System.out.printf("%%+d:  ~%+d~\n", age);
        System.out.printf("%% d:  ~% d~\n", age);
        System.out.printf("%%5d:  ~%5d~\n", age);
        System.out.printf("%%05d: ~%05d~\n", age);
        System.out.printf("%%-5d: ~%-5d~\n", age);
        System.out.printf("%%#x:  ~%#x~\n", age);

    }
}

/*
Schreiben Sie ein Java-Programm, das nach der Eingabe Ihres Alters diese unterschiedlich formatiert Alter wieder ausgibt.

 Hierfür soll das Alter unterschiedlich formatiert werden:
Format 	Hinweis
%d 	Zahl
%+d 	Zahl mit Vorzeichen
% d 	Zahl mit Platzhalter für Voreichen
%5d 	Zahl, 5 Stellen
%05d 	Zahl, 5 Stellen & führende 0
%-5d 	Zahl, 5 Stellen linksbündig
%#x 	Zahl, Hexadezimal


    Vergessen Sie bitte nicht das \n am Ende von System.out.printf() Anweisungen!
    Die ~ dient der “Begrenzung” der Ausgabe.

 */
