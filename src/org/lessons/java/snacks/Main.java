package org.lessons.java.snacks;

public class Main {
    public static void main(String[] args) {
        Studente Maks = new Studente("Maks", "Bernatskyy", 19);
        Studente Luigi = new Studente("Luigi", "Jabbar", 38);
        Studente Patrizio = new Studente("Patrizio", "Bandolero", 89);

        Studente[] list = {Maks, Luigi, Patrizio};

        RegistroStudenti students = new RegistroStudenti(list);


    }
}
