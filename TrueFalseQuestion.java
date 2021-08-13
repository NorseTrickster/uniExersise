package textio;


import javax.swing.*;

public class TrueFalseQuestion extends Question {

	TrueFalseQuestion (String question, String answer){
		/*this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(2,1));
		this.question.add(new JLabel("   "+question+"    ",JLabel.CENTER));*/
		super(question);
		JPanel buttons = new JPanel();
		correctAnswer = answer;
		addButton(buttons,"TRUE");
		addButton(buttons,"FALSE");
	}
	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
		
		this.question.add(buttons);
		initQuestionDialog();
		/*this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);*/
		
	}
	
	/*String ask() {
	
		question.setVisible(true);
		return question.answer;
		
		 *
		 * Instead of removing old statements I'll keep them for future studies as e comment.
		 * while (true) {
			 String answer = JOptionPane.showInputDialog(question);
			 
			 boolean valid = (answer.equals("f") || answer.equals("false") ||
			answer.equals("False") || answer.equals("FALSE") || answer.equals("n") ||
			answer.equals("no") || answer.equals("No") || answer.equals("NO") || 
			answer.equals("t") || answer.equals("T") || answer.equals("true") || 
			answer.equals("F") || answer.equals("True") || answer.equals("TRUE") || 
			answer.equals("y") ||answer.equals("Y") || answer.equals("yes") ||
			answer.equals("Yes") || answer.equals("YES"));
			answer = answer.toUpperCase();
			
			 if (valid) {
				 if (answer.equals("NO") || answer.equals("N") || answer.equals("F") ||answer.equals("FALSE")) {
					 answer = "FALSE";
					 
					 return answer;
				 }
				 else {
					 answer = "TRUE";
					
					 return answer;
				 }
				 
			 }else
			 {
			 JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE.");
			 }
			 
		// TODO Auto-generated method stub
		//return null;
		 * 
		 
	}*/

}

