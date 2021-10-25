import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class Exemplo8 extends JFrame 
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private final JList<String> coresJList; // list to display colors
   private final JList<String> pintarJList;
   private static final String[] listaCores = {"Preto", "Azul", "Verde", "Rosa", "Vermelho", "Branco", "Amarelo"};
   private static final Color[] cores = {Color.BLACK, Color.BLUE, Color.GREEN, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};

   public Exemplo8()
   {
      setLayout(new FlowLayout()); 

      coresJList = new JList<String>(listaCores);
      pintarJList = new JList<>();
     
      coresJList.setVisibleRowCount(5);     
      coresJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

      add(new JScrollPane(coresJList));
      add(new JScrollPane(pintarJList));

      coresJList.addListSelectionListener(new ListSelectionListener(){   
            @Override
            public void valueChanged(ListSelectionEvent event) {
            	pintarJList.setBackground(cores[coresJList.getSelectedIndex()]);
            } 
         } 
      ); 
   } 
}

