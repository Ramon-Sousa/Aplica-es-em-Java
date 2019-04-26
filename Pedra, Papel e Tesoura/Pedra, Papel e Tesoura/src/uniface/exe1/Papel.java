package uniface.exe1;

public class Papel extends Mao {
    @Override
    public String quemSouEu(){
        return"Papel";
    }
    @Override
    public String compara (Mao mao){
        //Quem está sendo passado como paramentro
        String quem = mao.quemSouEu(); //Polimorfismo
        switch (quem){
            case "Papel": return "Papel empata com Papel";
            case "Pedra": return "Papel ganha de Pedra";
            case "Tesoura": return "Papel perde para Tesoura";
            default: return "Não sabemos responder";
        }
    }
}
