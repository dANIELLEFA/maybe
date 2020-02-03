import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class runner
	{
		static String result;
		static JFrame frame;
		static String answer;
		static int confirm;
		static Object[] afraid = {"Mice", "Heights","Loud Noises", "All Of The Above", "None"};
		static Object[] goodAt = {"Building", "Electricals", "MakeUp", "Hair Styling","Lists", "Being Invisible", "I don't want to learn anything and I'm not good at that stuff"};
		static Object[] yearsDancing;
		public static void main(String[] args)
			{
				frame= new JFrame("JFrame Name");
				JOptionPane.showMessageDialog(frame, "Let's Start",
					"Theatre Job",
					JOptionPane.QUESTION_MESSAGE
					);
				//int answer1 =0;
				//JFrame  = new JFrame();
				personality();
			
				
				
				
//				 chosenClass = JOptionPane.showOptionDialog(frame, "Choose your class.",
//							"CHARACTER CREATION",
//							JOptionPane.YES_NO_CANCEL_OPTION,
//							JOptionPane.QUESTION_MESSAGE,
//							icon, chooseClassChoice, chooseClassChoice[0]);
				
				
//				
			}
		public static void personality()
		{
			Object[] personalityTypes = {"Introverted", "Extroverted","Both"};
		
			 answer = (String)JOptionPane.showInputDialog(frame,"What are you?", "Personality", JOptionPane.QUESTION_MESSAGE,null, personalityTypes, personalityTypes[0]);
			 if(answer.equals(personalityTypes[0]))
				 {
					 result =(String) personalityTypes[0];
					 confirm();
					 if(confirm == 0)
						 {
					 tech();
						 }
					 else
						 {
							personality(); 
						 }
					 
				 }
			 else if(answer.equals(personalityTypes[1]))
				 {
					 result =(String) personalityTypes[1];
					 confirm();
					 if(confirm == 0)
						 {
							 preformer();
						 }
					 else
						 {
							personality(); 
						 }
				 }
			 else if(answer.equals(personalityTypes[2]))
				 {
					 Object[] personalityTypes1 = {"Introverted", "Extroverted"};
					 answer = (String)JOptionPane.showInputDialog(frame,"Which are you more?", "Personality", JOptionPane.QUESTION_MESSAGE,null, personalityTypes1, personalityTypes1[0]);
					 if(answer.equals(personalityTypes1[0]))
						 {
					 result =(String) personalityTypes1[0];
					 confirm();
					 if(confirm == 0)
						 {
							 
							 tech();
						 }
					 else
						 {
							personality();
						 }
						 }
					 else
						 {
							 result =(String) personalityTypes1[1];
							 confirm();
							 if(confirm == 0)
								 {
									 
									 preformer();
								 }
							 else
								 {
									personality();
								 }
						 }
					 
				 }
		}
		public static void preformer()
		{
			JOptionPane.showMessageDialog(frame, "You would probably be best at acting!",
					"Theatre Job",
					JOptionPane.QUESTION_MESSAGE
					);
			confirm = JOptionPane.showConfirmDialog(null, "Do you have any experience at dancing?", "Final",
					JOptionPane.YES_NO_OPTION);
			if(confirm == 0)
				{
				//	personality();
				}
			else
				{
					System.out.println("goodbye");
				}
			
		}
		public static void tech()
		{
			
			if(confirm == 0)
				 {
					 answer = (String)JOptionPane.showInputDialog(frame,"What are you really afraid of?", "Fears", JOptionPane.QUESTION_MESSAGE,null, afraid, afraid[0]);
					 if(answer.equals(afraid[0]))
						 {
							 result =(String) afraid[0];
							 confirm();
							 if(confirm == 0)
								 {
									 sorry();
								 }
							 else
								 {
									 tech();
								 }
						 }
					 
					 if(answer.equals(afraid[1]))
						 {
							 result =(String) afraid[1];
							 confirm();
							 if(confirm == 0)
								 {
									 Object[] goodAt2 = {goodAt[0],goodAt[2],goodAt[3],goodAt[4],goodAt[5],goodAt[6]};
									 answer = (String)JOptionPane.showInputDialog(frame,"What are you good at or want to learn the most?", "Good At", JOptionPane.QUESTION_MESSAGE,null, goodAt2, goodAt2[0]);
									 if(answer.equals(goodAt2[0]))
										 {
											 result =(String) goodAt2[0];
											 confirm();
											 if(confirm == 0)
												 {
													 JOptionPane.showMessageDialog(frame, "You would probably be best for building crew and backstage crew!",
																"Theatre Job",
																JOptionPane.QUESTION_MESSAGE
																);
												 }
											 else
												 {
													 tech();

												 }
										 }
									 else if(answer.equals(goodAt2[1]))
										 {
											 result =(String) goodAt2[1];
											 confirm();
											 if(confirm == 0)
												 {
													 JOptionPane.showMessageDialog(frame, "You would probably be best for Makeup crew and Hair crew!",
																"Theatre Job",
																JOptionPane.QUESTION_MESSAGE
																);
												 }
											 else
												 {
													 tech();

												 }
										 }
									 else if(answer.equals(goodAt2[2]))
										 {
											 result =(String) goodAt2[2];
											 confirm();
											 if(confirm == 0)
												 {
													 JOptionPane.showMessageDialog(frame, "You would probably be best for Hair crew and Makeup crew!",
																"Theatre Job",
																JOptionPane.QUESTION_MESSAGE
																);
												 }
											 else
												 {
													 tech();

												 }
										 }
									 else if(answer.equals(goodAt2[3]))
										 {
											 result =(String) goodAt2[3];
											 confirm();
											 if(confirm == 0)
												 {
													 lists();
												 }
											 else
												 {
													 tech();

												 }
										 }
									 else if(answer.equals(goodAt2[4]))
										 {
											 result =(String)goodAt2[4];
											 confirm();
											 if(confirm == 0)
												 {
													 JOptionPane.showMessageDialog(frame, "You would probably be best for building crew and backstage crew!",
																"Theatre Job",
																JOptionPane.QUESTION_MESSAGE
																);
												 }
											 else
												 {
													 tech();

												 }
										 }
									 else if(answer.equals(goodAt2[5]))
										 {
											 result =(String)goodAt2[5];
											 confirm();
											 if(confirm == 0)
												 {
													sorry();
												 }
											 else
												 {
													 tech();

												 }
										 }
								 }
							 else
								 {
									 tech();

								 }
						 }
					 if(answer.equals(afraid[2]))
						 {
							result =(String) afraid[2];
							
							 confirm();
							
							 if(confirm == 0)
								 {
									 quiet();
								 }
							 else if(confirm == 1)
								 {
									 tech();

								 }
						 }
					 if(answer.equals(afraid[3]))
						 {
							 result =(String) afraid[3];
							 confirm();
							 if(confirm == 0)
								 {
									 sorry();
								 }
							 else
								 {
									 tech();
 
								 }
						 }
					 if(answer.equals(afraid[4]))
						 {
							 result =(String) afraid[4];
							 confirm();
							 if(confirm == 0)
								 {
									 answer = (String)JOptionPane.showInputDialog(frame,"What are you good at or want to learn the most?", "Good At", JOptionPane.QUESTION_MESSAGE,null, goodAt, goodAt[0]);
									 if(answer.equals(goodAt[0]))
										 {
											 result =(String) goodAt[0];
											 confirm();
											 if(confirm == 0)
												 {
													 JOptionPane.showMessageDialog(frame, "You would probably be best for building crew and backstage crew!",
																"Theatre Job",
																JOptionPane.QUESTION_MESSAGE
																);
												 }
											 else
												 {
													 tech();

												 }
										 }
									 else if(answer.equals(goodAt[1]))
										 {
											 result =(String) goodAt[1];
											 confirm();
											 if(confirm == 0)
												 {
													 lightsAndSound();
												 }
											 else
												 {
													 tech();

												 }
										 }
									 else if(answer.equals(goodAt[2]))
										 {
											 result =(String) goodAt[2];
											 confirm();
											 if(confirm == 0)
												 {
													 JOptionPane.showMessageDialog(frame, "You would probably be best for Makeup crew and Hair crew!",
																"Theatre Job",
																JOptionPane.QUESTION_MESSAGE
																);
												 }
											 else
												 {
													 tech();

												 }
										 }
									 else if(answer.equals(goodAt[3]))
										 {
											 result =(String) goodAt[3];
											 confirm();
											 if(confirm == 0)
												 {
													 JOptionPane.showMessageDialog(frame, "You would probably be best for Hair crew and Makeup crew!",
																"Theatre Job",
																JOptionPane.QUESTION_MESSAGE
																);
												 }
											 else
												 {
													 tech();

												 }
										 }
									 else if(answer.equals(goodAt[4]))
										 {
											 result =(String)goodAt[4];
											 confirm();
											 if(confirm == 0)
												 {
													lists();
												 }
											 else
												 {
													 tech();

												 }
										 }
									 else if(answer.equals(goodAt[5]))
										 {
											 result =(String)goodAt[5];
											 confirm();
											 if(confirm == 0)
												 {
													 JOptionPane.showMessageDialog(frame, "You would probably be best for building crew and backstage crew!",
																"Theatre Job",
																JOptionPane.QUESTION_MESSAGE
																);
												 }
											 else
												 {
													 tech();

												 }
										 }
									 else if(answer.equals(goodAt[6]))
										 {
											 result =(String)goodAt[6];
											 confirm();
											 if(confirm == 0)
												 {
													sorry();
												 }
											 else
												 {
													 tech();

												 }
										 }
								 }
							 else
								 {
									 tech();
 
								 }
						 }

				 }
			 else
				 {
					 personality();
				 }
		}
		
		public static void confirm()
		{
			 confirm = JOptionPane.showConfirmDialog(null, "Are you sure about "+ result + "?", "choose",
					JOptionPane.YES_NO_OPTION);
			
		}
		public static void sorry()
		{
			confirm = JOptionPane.showConfirmDialog(null, "You should probably not be in theatre."
					+ " Would you try again and see if you get a different answer?", "Final",
					JOptionPane.YES_NO_OPTION);
			if(confirm == 0)
				{
					personality();
				}
			else
				{
					System.out.println("goodbye");
				}
		}
		public static void quiet()
			{
				 Object[] newList = {goodAt[2],goodAt[3],goodAt[4],"Both MakeUp and Hair", "Nothing"};
				 answer = (String)JOptionPane.showInputDialog(frame,"What are you really great at or would like to learn about?", "Good At", 
						 JOptionPane.QUESTION_MESSAGE,null, newList, newList[0]);
				 if(answer.equals(newList[0]))
					 {
						 result =(String) newList[0];
						 confirm();
						 if(confirm == 0)
							 {
								 JOptionPane.showMessageDialog(frame, "You would probably be best for Hair crew and Makeup crew!",
											"Theatre Job",
											JOptionPane.QUESTION_MESSAGE
											);
							 }
						 else
							 {
								 tech();

							 }
					 }
				 else if(answer.equals(newList[1]))
					 {
						 result =(String) newList[1];
						 confirm();
						 if(confirm == 0)
							 {
								 JOptionPane.showMessageDialog(frame, "You would probably be best for Hair crew and Makeup crew!",
											"Theatre Job",
											JOptionPane.QUESTION_MESSAGE
											);
							 }
						 else
							 {
								 tech();

							 }
					 }
				 else if(answer.equals(newList[2]))
					 {
						 result =(String) newList[2];
						 confirm();
						 if(confirm == 0)
							 {
								lists();
							 }
						 else
							 {
								 tech();

							 }
					 }
				 else if(answer.equals(newList[3]))
					 {
						 result =(String) newList[3];
						 confirm();
						 if(confirm == 0)
							 {
								 JOptionPane.showMessageDialog(frame, "You would probably be best for Hair crew and Makeup crew!",
											"Theatre Job",
											JOptionPane.QUESTION_MESSAGE
											);
							 }
						 else
							 {
								 tech();

							 }
					 }
				 else if(answer.equals(newList[4]))
					 {
						 result =(String) newList[4];
						 confirm();
						 if(confirm == 0)
							 {
								sorry();
							 }
						 else
							 {
								 tech();

							 }
					 }
				
//				 else if(answer.equals(newList[5]))
//					 {
//						 result =(String) newList[5];
//						 confirm();
//						 if(confirm == 0)
//							 {
//								 sorry();
//							 }
//						 else
//							 {
//								 tech();
//
//							 }
//					 }
			}
		public static void lists()
		{
			 Object[] lists = {"Props","Bossing"};
			 answer = (String)JOptionPane.showInputDialog(frame,"What are you really great at or would like to learn about?", "Good At", 
					 JOptionPane.QUESTION_MESSAGE,null, lists, lists[0]);
			 if(answer.equals(lists[0]))
				 {
					 result =(String) lists[0];
					 confirm();
					 if(confirm == 0)
						 {
							 JOptionPane.showMessageDialog(frame, "You would probably be best for Props crew!",
										"Theatre Job",
										JOptionPane.QUESTION_MESSAGE
										);
						 }
					 else
						 {
							 tech();

						 }
				 }
			 else
				 {
					 result =(String) lists[1];
					 confirm();
					 if(confirm == 0)
						 {
							 JOptionPane.showMessageDialog(frame, "You would probably be best for a Stage Manager Position or being a Student Director!",
										"Theatre Job",
										JOptionPane.QUESTION_MESSAGE
										);
						 }
					 else
						 {
							 tech();

						 } 
				 }
			
		}
		public static void lightsAndSound()
		{
			 Object[] lists = {"Sound","Lights"};
			 answer = (String)JOptionPane.showInputDialog(frame,"What are you really great at or would like to learn about?", "Good At", 
					 JOptionPane.QUESTION_MESSAGE,null, lists, lists[0]);
			 if(answer.equals(lists[0]))
				 {
					 result =(String) lists[0];
					 confirm();
					 if(confirm == 0)
						 {
							 JOptionPane.showMessageDialog(frame, "You would probably be best for Sound crew!",
										"Theatre Job",
										JOptionPane.QUESTION_MESSAGE
										);
						 }
					 else
						 {
							 tech();

						 }
				 }
			 else
				 {
					 result =(String) lists[1];
					 confirm();
					 if(confirm == 0)
						 {
							 int confirm1 = JOptionPane.showConfirmDialog(null, "Are You afraid of high places?", "Question",
										JOptionPane.YES_NO_OPTION);
							 if(confirm1 == 1)
								 {
									 JOptionPane.showMessageDialog(frame, "You would probably be best for Light Board crew!",
												"Theatre Job",
												JOptionPane.QUESTION_MESSAGE
												);
								 }
							 else
								 {
									 JOptionPane.showMessageDialog(frame, "You would probably be best for the Spotlight or Light Board Crew!",
												"Theatre Job",
												JOptionPane.QUESTION_MESSAGE
												);
								 }
						 }
					 else
						 {
							 tech();

						 } 
				 }
		}
		

	}
