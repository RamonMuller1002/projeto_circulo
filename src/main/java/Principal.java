import model.Circulo;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Circulo tril = new Circulo();
        
        tril.setRaio(Float.parseFloat(JOptionPane.showInputDialog("Insira o Raio: ")));
        
        JOptionPane.showMessageDialog(null, "Area igual a " + tril.getArea());
    }
}
