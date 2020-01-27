import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class runner
	{
		static String result;
		static JFrame frame;
		public static void main(String[] args)
			{
				frame= new JFrame("JFrame Name");
				JOptionPane.showMessageDialog(frame, "Let's Start",
					"Theatre Job",
					JOptionPane.QUESTION_MESSAGE
					);
				int answer1 =0;
				//JFrame  = new JFrame();
				Object[] questionOne = {"Introverted", "Extroverted","Both"};
				
				String n = (String)JOptionPane.showInputDialog(frame,"What are you?", "Personality", JOptionPane.QUESTION_MESSAGE,null, questionOne, questionOne[0]);
				
//				 chosenClass = JOptionPane.showOptionDialog(frame, "Choose your class.",
//							"CHARACTER CREATION",
//							JOptionPane.YES_NO_CANCEL_OPTION,
//							JOptionPane.QUESTION_MESSAGE,
//							icon, chooseClassChoice, chooseClassChoice[0]);
				if(n.equals("d"))
					{
						
					}
				
				
//				
			}
		public static void confirm()
		{
			int confirm = JOptionPane.showConfirmDialog(null, "Choose your "+ result, "choose",
					JOptionPane.YES_NO_OPTION);
		}

	}
