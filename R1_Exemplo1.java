import javax.swing.JOptionPane;
public class R1_Exemplo1 {
   public static void main(String[] args) {
	String meuNome;
	String meuSobrenome;
	meuNome = JOptionPane.showInputDialog("Digite o seu nome");
	meuSobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome");
	JOptionPane.showMessageDialog(null, "Nome completo: " + meuNome + " " + meuSobrenome, "Informativo de Nome", JOptionPane.PLAIN_MESSAGE);
   }
}
