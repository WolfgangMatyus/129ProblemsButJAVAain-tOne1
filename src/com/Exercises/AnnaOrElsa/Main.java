package com.Exercises.AnnaOrElsa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count, idx = 0;
        String input = "";
        Scanner sc = new Scanner(System.in);
        //System.out.printf("Hello AnnaOrElsa!\n");
        Question[] questions = new Question[8];

        addQuestion(questions, 0,"Winter?: ", 2,1);
        addQuestion(questions, 1,"Mutig?: ", 5,4);
        addQuestion(questions, 2,"Allein?: ", 3,4);
        addQuestion(questions, 3,"Abenteuer?: ", 4,6);
        addQuestion(questions, 4,"Rentiere?: ", 7,6);
        addQuestion(questions, 5,"Gehemnis?: ", 4,7);
        addQuestion(questions, 6,"ELSA",0,0);
        addQuestion(questions, 7,"ANNA", 0,0);

        while(idx < 7){
            System.out.print(questions[idx].text);
            input = sc.nextLine();
            if(input.equals("-")){
                idx = questions[idx].on_no;
            }else{
                idx = questions[idx].on_yes;
            }

        }
            if(idx == 7){
                System.out.println("ANNA");
            }else{
                System.out.println("ELSA");
            }
        sc.close();
        }

        public static Question[] addQuestion(Question[] questions, int idx, String text, int yes, int no){
            questions[idx] = new Question();
            questions[idx].text = text;
            questions[idx].on_yes = yes;
            questions[idx].on_no = no;
            return questions;
        }
    }

class Question {
    String text;
    int on_yes;
    int on_no;
}


/*
Finden Sie durch einfache Fragen heraus welche Schneekönigin Sie sind.
Einleitung

Im Filly Magazin1 erschien eine Anzeige zum Disney Film Die Eiskönigin -
Völlig unverfroren mit einem Test zum Herausfinden welche Eiskönigin man ist (siehe Abb. ).
Der Test besteht aus einer Einstiegsfrage und mehreren Folgefragen, die alle mit ja oder nein zu beantwotern sind und
letztendlich entweder zu Elsa oder Anna führen.

Die Disney Anzeige mit dem Test im Filly-Magazin 13/2013
Aufgabe

Implementieren Sie diesen Test als Konsolenaplikation. Die an der Konsole gestellten Fragen werden reduziert auf:

    Winter
    Mutig
    Allein
    Abenteuer
    Rentiere
    Geheimnis

Eingabe von Plus (+) soll ja bedeuten, Minus (-) nein.

Eine einzelne Frage soll als Objekt der Klasse Question dargestellt werden, die Fragen des Tests werden in einem Array von Fragen abgelegt.

class Question {
    String text;
    int on_yes;
    int on_no;
}

Die Komponenten on_yes bzw. on_no sind der Index der Frage zu der bei Antwort yes bzw. no gesprungen wird.
Die Ergebnisse Anna bzw. Elsa könnten z.B. als ungültige Indices repräsentiert werden.

Beispiele

(Text in rot = Benutzereingabe)

    Winter?: +
    Allein?:  +
    Abenteuer?:  -
    ELSA

    Winter?: -
    Mutig?:  -
    Rentiere?:  +
    ANNA

Fragen

Wie müßten Sie ihr Programm modifizieren, sodass es beliebige, nach dem selben Muster aufgebaute, Persönlichkeitstest ausführen kann?

 */