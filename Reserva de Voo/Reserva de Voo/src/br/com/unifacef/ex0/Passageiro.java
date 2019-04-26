package br.com.unifacef.ex0;
import java.util.ArrayList;
public class Passageiro {
    private String nome;
    private String cpf;
    private ArrayList<Mala> malas;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.malas= new ArrayList(); //Aloca espaço na memória
        
    }
    
    public Passageiro(){
        this.malas = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }
    
    
    //Associa mala ao passageiro
    public void adicionaMala(Mala mala){
        this.malas.add(mala);
        
    }
    //Remove uma mala do passageiro
    public boolean removeMala(Mala mala){
        return this.malas.remove(mala);
    }    
    //Busca posição da mala
    public int buscaMala(int codigo){
        for (int i=0; i<this.malas.size();i++){
            if (this.malas.get(i).getCodigo() == codigo){
                return i; //Achou
               
            }
        }
    return -1; //Não achou
    }
    //Atualilza mala
    public boolean atualizaMala(Mala nova){
        int pos = this.buscaMala(nova.getCodigo());
        if (pos != -1){ //Achou
            this.malas.set(pos,nova);
            return true;
        }
        else return false;
        
    }
    
    
}
