import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Exemplo10 extends JFrame implements KeyListener 
{

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   private JTextArea textArea;

   public Exemplo10()
   {

      textArea = new JTextArea(10, 15);
      textArea.setText("Aperte uma tecla...");
      textArea.setEnabled(false);
      textArea.setDisabledTextColor(Color.BLACK);
      add(textArea);
      addKeyListener(this); 
   } 

   @Override
   public void keyPressed(KeyEvent event) {
	   textArea.setText(String.format("Tecla pressionada: %s", KeyEvent.getKeyText(event.getKeyCode())));
   }

   @Override
   public void keyReleased(KeyEvent event) {
	   textArea.setText(String.format("Você pressionou e soltou a tecla: %s",KeyEvent.getKeyText(event.getKeyCode())));
   }

   @Override
   public void keyTyped(KeyEvent event){
	   textArea.setText(String.format("Você pressionou a tecla: %s", event.getKeyChar()));
   }
   
}


