import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Exemplo6 extends JFrame 
{
   /**
	 * 
	 */
   private static final long serialVersionUID = 1L;

   private JTextField textField; 
   private Font arialFont; 
   private Font consolasFont;
   private Font verdanaFont;
   private JRadioButton arialRB; 
   private JRadioButton consolasRB;
   private JRadioButton verdanaRB; 
   private ButtonGroup radioGroup; 

 
   public Exemplo6()
   {
      setLayout(new FlowLayout()); 

      textField = new JTextField("Exemplo de texto", 25);
      add(textField);

      arialRB = new JRadioButton("Arial", true);
      consolasRB = new JRadioButton("Consolas", false);
      verdanaRB = new JRadioButton("Verdana", false);
      add(arialRB); 
      add(consolasRB); 
      add(verdanaRB);



      radioGroup = new ButtonGroup(); 

           radioGroup.add(arialRB); 

           radioGroup.add(consolasRB); 

           radioGroup.add(verdanaRB); 

           arialFont = new Font("Arial", Font.PLAIN, 14);

           consolasFont = new Font("Consolas", Font.PLAIN, 14);

           verdanaFont = new Font("Verdana", Font.PLAIN, 14);

           textField.setFont(arialFont);



           arialRB.addItemListener(new TratamentoRadioButton(arialFont));

           consolasRB.addItemListener(new TratamentoRadioButton(consolasFont));

           verdanaRB.addItemListener(new TratamentoRadioButton(verdanaFont));

        } 



        private class TratamentoRadioButton implements ItemListener 

        {

           private Font font; 



           public TratamentoRadioButton(Font f)

           {

              font = f; 

           } 

        

           public void itemStateChanged(ItemEvent event)

           {

              textField.setFont(font); 

           } 

        } 

     }



     
