package org.lessons.java.snacks;

public class Main {
    public static void main(String[] args) {
        Studente Maks = new Studente("Maks", "Bernatskyy", 19);
        RegistroStudenti registroStudenti = new RegistroStudenti();

        System.out.println(registroStudenti);

        registroStudenti.addStudente(Maks);

        System.out.println(registroStudenti);
    }
}
