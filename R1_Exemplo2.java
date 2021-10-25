import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class R1_Exemplo2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JLabel minhaLabel1;
	private final JLabel minhaLabel2;
	
	public R1_Exemplo2(){
		
		setLayout(new FlowLayout());
		
		minhaLabel1 = new JLabel("Minha label 1");
		minhaLabel1.setToolTipText("Essa é a minha label1");
		add(minhaLabel1);
	
		minhaLabel2 = new JLabel("Minha label 2");
		minhaLabel2.setToolTipText("Essa é a minha label2");
		add(minhaLabel2);
		
	}
	
}
