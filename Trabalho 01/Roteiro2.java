import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Roteiro2 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel rot_input;
	private JLabel rot_dobro;
	private JLabel rot_triplo;
	
	private JTextField text_input;
	private JTextField text_dobro;
	private JTextField text_triplo;
	
	private int numero;
	private int dobro = numero * 2;
	private int triplo;
	
	private JButton botao;
	
	public Roteiro2() {
		super( "Roteiro 1: Dobro e triplo" );
		
		//------------------------------- First Text ---------------
		
		setLayout(null);
		rot_input = new JLabel("Número:");
		rot_input.setBounds(10, 10, 200, 30 );
		add(rot_input);
		
		text_input = new JTextField();
		text_input.setBounds(10, 40, 100, 20 );
		text_input.setText(Integer.toString(numero)); //Faz printar zero(pois a var está vazia, só pra não ficar o campo vazio)
		add(text_input);
		
		//-------------------------------- Second Text -------------------
		
		setLayout(null);
		rot_dobro = new JLabel("Dobro:");
		rot_dobro.setBounds(10, 80, 200, 30 );
		add(rot_dobro);
		
		text_dobro = new JTextField();
		text_dobro.setBounds(10, 110, 100, 20 );
		text_dobro.setText(Integer.toString(dobro)); //Faz printar zero(pois a var está vazia, só pra não ficar o campo vazio)
		add(text_dobro);
		
		//------------------------------- Third Text -----------------
		
		setLayout(null);
		rot_triplo = new JLabel("Triplo:");
		rot_triplo.setBounds(10, 150, 200, 30 );
		add(rot_triplo);
		
		text_triplo = new JTextField();
		text_triplo.setBounds(10, 180, 100, 20 );
		text_triplo.setText(Integer.toString(triplo)); //Faz printar zero(pois a var está vazia, só pra não ficar o campo vazio)
		add(text_triplo);
		
		//------------------------------------------------------------
		
		botao = new JButton( "Clique para calcular");
		botao.setBounds(280, 80, 150, 20 );
		botao.setActionCommand( "Calcular" );        // Quando eu apertar o botão, vou criar a AÇÃO = " Calcular "
		botao.addActionListener( acaoParaOBotao );  //  Este é o LISTENER
		add(botao);
		
		setSize(600,400);
		setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
	}
	
	ActionListener acaoParaOBotao = new ActionListener(){      //Criando o objeto ActionListener nomeado de "acaoParaOBotao"
														      //E dentro deste LISTENER tem a função do que fazer quando ele "escutar"
															 //
															//
		public void actionPerformed(ActionEvent arg0) {    //Esta função é obrigatória para o LISTENER

			if( arg0.getActionCommand().equals( "Calcular" ) ) {
				numero = Integer.parseInt(JOptionPane.showInputDialog(botao,"Entre com um número inteiro"));
				dobro  = numero * 2;
				triplo = numero * 3;
				
				text_input.setText(Integer.toString(numero));      //----------------------------------------------//
				text_dobro.setText(Integer.toString(dobro));      //métodos atualizando as variáveis nos JTextField
				text_triplo.setText(Integer.toString(triplo));   //-----------------------------------------------//
		
			} 	
		}
	};
	
	
	
	public static void main(String[] args) {
		Roteiro2 minhaJanela = new Roteiro2();
		minhaJanela.setVisible( true );
		
	}
}

