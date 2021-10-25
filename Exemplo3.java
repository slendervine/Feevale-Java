import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Exemplo3 extends JFrame {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JTextField tf1;
	private final JTextField tf2;
	private final JTextField tf3;
	private final JPasswordField pf1;
	
  public Exemplo3(){
      setLayout(new FlowLayout());
		
      tf1 = new JTextField(10);
      add(tf1);
      tf2 = new JTextField("Adicione seu texto");
      add(tf2);
      tf3 = new JTextField("Exemplo não editável", 20);
      tf3.setEditable(false);
      add(tf3);
      pf1 = new JPasswordField("Texto em formato de senha");
      add(pf1);

      TratamentoEventos tEventos = new TratamentoEventos();
      tf1.addActionListener(tEventos);
      tf2.addActionListener(tEventos);
      tf3.addActionListener(tEventos);
      pf1.addActionListener(tEventos);
      }

      private class TratamentoEventos implements ActionListener{

    	 public void actionPerformed(ActionEvent e) {
        	 String string = "";
        	 if(e.getSource() == tf1){
        		 string = String.format("Este campo contém: %s", e.getActionCommand());
        	 } else if (e.getSource() == tf2){
        		 string = String.format("Este campo contém: %s", e.getActionCommand());
        	 } else if (e.getSource() == tf3){
        		 string = String.format("Este campo contém: %s", e.getActionCommand());
        	 } else if (e.getSource() == pf1){
        		 string = String.format("Este campo contém: %s", e.getActionCommand());
        	 }
        	 JOptionPane.showMessageDialog(null, string);
    	 }
    }
}
