import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exemplo5 extends JFrame {

	private final JTextField tf;
	private final JCheckBox checkbox1;
	private final JCheckBox checkbox2;
	
	public Exemplo5(){
		
		setLayout(new FlowLayout());
		
		tf = new JTextField("Texto de exemplo", 20);
		tf.setFont(new Font("Serif", Font.PLAIN, 14));
		add(tf);
		
		checkbox1 = new JCheckBox("Verdana");
		checkbox2 = new JCheckBox("Arial");
		add(checkbox1);
		add(checkbox2);
		
		TratamentoCheckbox tcheck = new TratamentoCheckbox();
		checkbox1.addItemListener(tcheck);
		checkbox2.addItemListener(tcheck);
		
	}
	
	private class TratamentoCheckbox implements ItemListener{
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			Font font = null;
			if (checkbox1.isSelected() && checkbox2.isSelected()){
		JOptionPane.showMessageDialog(null, "Opção não disponível ao selecionar os dois itens. Desmarque uma das opções.");
			} else if (checkbox1.isSelected()){
				font = new Font("Verdana", Font.PLAIN, 14);
			} else if (checkbox2.isSelected()){
				font = new Font("Arial", Font.PLAIN, 14);
			}
			
			tf.setFont(font);
		}	
	}	
}


