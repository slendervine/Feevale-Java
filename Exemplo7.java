import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class Exemplo7 extends JFrame 
{
   /**
	 * 
	 */
   private static final long serialVersionUID = 1L;
   private final JComboBox<String> nomesJComboBox;
   private final JLabel label;

   private static final String[] nomes = {"","Daniel", "João",  "Maria", "Carlos"};
 
   public Exemplo7(){
      setLayout(new FlowLayout());     

      nomesJComboBox = new JComboBox<String>(nomes);
      nomesJComboBox.setMaximumRowCount(3);

      nomesJComboBox.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent event)
            {
                  if (event.getStateChange() == ItemEvent.SELECTED)
                  	label.setText(nomes[nomesJComboBox.getSelectedIndex()]);
            } 
      }); 

      add(nomesJComboBox);
      label = new JLabel();
      add(label);
   }
}
