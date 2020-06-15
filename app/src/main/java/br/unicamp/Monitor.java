package br.unicamp;

import androidx.annotation.NonNull;

public class Monitor {

    private int ra;
    private String nome;
    private int horario;
    private int imagem;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    @NonNull
    @Override
    public String toString() {

        return ra + ", " + nome + ", " + horario + imagem;
    }
}
