import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exemplo4 extends JFrame {

	private final JButton meuBotao1;
	private final JButton meuBotao2;
	
	public Exemplo4(){
		setLayout(new FlowLayout());
		meuBotao1 = new JButton("Botão 1");
		add(meuBotao1);
		meuBotao2 = new JButton("Botão 2");
		add(meuBotao2);
		TratamentoBotao tb = new TratamentoBotao();
		meuBotao1.addActionListener(tb);
		meuBotao2.addActionListener(tb);
	}
	
	private class TratamentoBotao implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(Exemplo4.this, String.format("Você clicou: %s", e.getActionCommand()));
		}
		
	}
	
}

