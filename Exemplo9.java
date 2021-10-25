import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class Exemplo9 extends JFrame 
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   private final JList<String> cidades; 
   private final JList<String> cidadesConfirmadas;
   private JButton btnAdicionar;
   private static final String[] nomeCidades = {"Roma", "Florença", "Veneza","Milão", "Arezzo"};

   public Exemplo9()
   {
      setLayout(new FlowLayout());

      cidades = new JList<String>(nomeCidades);
      cidades.setVisibleRowCount(5);
      cidades.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(cidades)); 

      btnAdicionar = new JButton("Adicionar >>"); 
      btnAdicionar.addActionListener(new ActionListener(){  
            @Override
            public void actionPerformed(ActionEvent event){
            	cidadesConfirmadas.setListData(cidades.getSelectedValuesList().toArray(new String[0]));
            }
         } 
      ); 

      add(btnAdicionar); 
      cidadesConfirmadas = new JList<String>(); 
      cidadesConfirmadas.setVisibleRowCount(5); 
      cidadesConfirmadas.setFixedCellWidth(100); 
      cidadesConfirmadas.setFixedCellHeight(15); 
      cidadesConfirmadas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(cidadesConfirmadas));
   } 
}

