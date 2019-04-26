package br.com.unifacef.ex0;
public class Mala {
    private int codigo;
    private String cor;
    private float peso;

    public Mala() {
    }

    public Mala(int codigo, String cor, float peso) {
        this.codigo = codigo;
        this.cor = cor;
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Mala{" + "codigo=" + codigo + ", cor=" + cor + ", peso=" + peso + '}';
    }
    
    
    
}
