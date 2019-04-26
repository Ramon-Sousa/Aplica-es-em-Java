package uniface.exe1;

import java.util.Random;
import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) {
        //Escolha do usuario
        String opcaoUsuario = JOptionPane.showInputDialog("Escolha"+
                "\n 1. Papel \n 2.pedra \n 3. Tesoura");
        Mao usuario;
        switch (opcaoUsuario) {
            case "1": usuario = new Papel(); break;
            case "2": usuario = new Pedra(); break;
            case "3": usuario = new Tesoura(); break;
            default: usuario = new Papel();
        }
        // Escolha PC
        Random random = new Random();
        int opcaoPC = random.nextInt(3); //Gera 0,1 ou 2
        Mao pc;
        switch (opcaoPC){
            case 0: pc = new Papel(); break;
            case 1: pc = new Pedra(); break;
            case 2: pc = new Tesoura(); break;
            default: pc = new Papel();
            
        }
        //Polimorfismo
        JOptionPane.showMessageDialog(null, usuario.compara(pc));
    }
    
}
 
