package org.lessons.java.snacks;

public class Studente {
    // Attributi
    private String nome;
    private String cognome;
    private int età;

    // Metodi

    public Studente(String nome, String cognome, int età) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.equals("")) {
            this.nome = nome;
        }
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        if (cognome != null && !cognome.equals("")) {
            this.cognome = cognome;
        }
    }

    public int getEtà() {
        return this.età;
    }

    public void setEtà(int età) {
        if (età > 0 && età < 120) {
            this.età = età;
        }
    }

    public String getAllInformations() {
        String output = String.format("Studente: %s %s, %d", this.nome, this.cognome, this.età);
        return output;
    }
}
