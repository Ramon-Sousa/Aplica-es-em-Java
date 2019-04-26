package uniface.exe1;
public class Tesoura extends Mao {
     @Override
    public String quemSouEu(){
        return "Tesoura";
    }
    @Override
    public String compara (Mao mao){
        //Quem está sendo passado como paramentro
        String quem = mao.quemSouEu(); //Polimorfismo
        switch (quem){
            case "Tesoura": return "Tesoura empata com Tesoura";
            case "Papel": return "Tesoura ganha de Papel";
            case "Pedra": return "Tesoura perde para Pedra";
            default: return "Não sabemos responder";
        }
    }
}
