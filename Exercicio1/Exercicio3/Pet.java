package Exercicio3;

import java.util.Objects;

public class Pet {
    private String nomePet;
    private String tipoPet;
    private String raca;
    private int tamanho;
    private String cor;

    public Pet(String nomePet, String tipoPet, String raca, int tamanho, String cor) {
        this.nomePet = nomePet;
        this.tipoPet = tipoPet;
        this.raca = raca;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getTipoPet() {
        return tipoPet;
    }

    public void setTipoPet(String tipoPet) {
        this.tipoPet = tipoPet;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return tamanho == pet.tamanho && Objects.equals(nomePet, pet.nomePet) && Objects.equals(tipoPet, pet.tipoPet) && Objects.equals(raca, pet.raca) && Objects.equals(cor, pet.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomePet, tipoPet, raca, tamanho, cor);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nomePet='" + nomePet + '\'' +
                ", tipoPet='" + tipoPet + '\'' +
                ", raca='" + raca + '\'' +
                ", tamanho=" + tamanho +
                ", cor='" + cor + '\'' +
                '}';
    }
}
