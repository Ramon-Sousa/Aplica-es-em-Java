package uniface.exe1;
public class Pedra extends Mao{
    
    @Override
    public String quemSouEu(){
        return "Pedra";
    }
    @Override
    public String compara (Mao mao){
        //Quem está sendo passado como paramentro
        String quem = mao.quemSouEu(); //Polimorfismo
        switch (quem){
            case "Pedra": return "Pedra empata com Pedra";
            case "Papel": return "Pedra perde para Papel";
            case "Tesoura": return "Pedra ganha de Tesoura";
            default: return "Não sabemos responder";
        }
    }
}
