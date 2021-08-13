package textio;

import java.awt.*;
import javax.swing.*;

public abstract class Question {

	static int nQuestions = 0; // Class variables
	 
	 static int nCorrect = 0;
	 
	 //String question;
	 QuestionDialog question;
	 String correctAnswer;
		String ask() {
			
			question.setVisible(true);
			return question.answer;
		}
		Question(String question) {
			this.question = new QuestionDialog();
			this.question.setLayout(new GridLayout(2,1));
			this.question.add(new JLabel("   "+question+"    ",JLabel.CENTER));
		}
	 
		void initQuestionDialog() {
			this.question.setModal(true);
			this.question.pack();
			this.question.setLocationRelativeTo(null);
		}
	 void check() {
		 nQuestions++;
		 String answer = ask();
		 if (answer.equals(correctAnswer)) {
		 JOptionPane.showMessageDialog(null,"Correct!");
		 nCorrect++;
		 } else {
		 JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is "+correctAnswer+".");
		 }
		 }
	 void showResults() {
		 JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
