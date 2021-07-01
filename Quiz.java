package textio;
import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] CorrectInput = {"A", "B", "C", "D", "E"};
		
		do {
		String question = "What coffee beans are use in speciality coffee?\n";
		question += "A. Roasted\n";
		question += "B. Bleand\n";
		question += "C. Mocca\n";
		question += "D. Robusta\n";
		question += "E. Arabica\n";
		String answer = JOptionPane.showInputDialog(question);
		answer = answer.toUpperCase();
		
		if (!answer.equals("A") && !answer.equals("B") && !answer.equals("C") && !answer.equals("D") && !answer.equals("E")) {
			 JOptionPane.showMessageDialog(null,"Your anser is outside of range. Please chose between A, B, C, D, or E");
		}
		
		else if (answer.equals("E")) {
			JOptionPane.showMessageDialog(null,"You chose " + answer);
			break; 
		}
		else {
			JOptionPane.showMessageDialog(null,"Your answer is " + answer +". That is incorect. Try again:)");
			
		}
	
		
		}while(true);
		
			 JOptionPane.showMessageDialog(null,"Correct!");
	
	}

}
