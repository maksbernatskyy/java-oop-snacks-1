package org.lessons.java.snacks;

public class RegistroStudenti {
    private Studente[] registro;

    public RegistroStudenti() {
        this.registro = new Studente[0];
    }

    public Studente[] getRegistro() {
        return this.registro;
    }

    public void setRegistro(Studente[] registro) {
        this.registro = registro;
    }

    // Aggiunta studenti
    public void addStudente(Studente studente) {
        // Crea un nuovo registro lungo come quello di prima + 1
        Studente[] registroAggiornato = new Studente[this.registro.length + 1];

        // Copio il vecchio registro
        for (int i = 0; i < this.registro.length; i++) {
            registroAggiornato[i] = this.registro[i];
        }

        // Aggiungo alla fine dell'array l'ultimo studente
        registroAggiornato[registroAggiornato.length - 1] = studente;

        // Sovvrascrivo il vecchio registro con quello nuovo
        this.registro = registroAggiornato;
    }
    
    @Override
    public String toString() {
        String output = "Registro studenti :";
        for(Studente studente : this.registro) {
            output += String.format(" %s;", studente.getAllInformations());
        }
        return output;
    }
}
