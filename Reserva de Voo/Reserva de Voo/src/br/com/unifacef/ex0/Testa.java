package br.com.unifacef.ex0;
import java.util.Date;
import javax.swing.JOptionPane;
public class Testa {
    public static void main(String[] args) {
            
        Passageiro passageiro = new Passageiro();
        passageiro.setNome("Ramon Sousa");
        passageiro.setCpf("123456789-10");
        Voo voo= new Voo();
        voo.setDestino("São Paulo");
        voo.setNumero("777");
        
        
        Reserva reserva = new Reserva(123, new Date(),passageiro,voo);
        JOptionPane.showMessageDialog(null,reserva.toString());
        

    }
    
}
