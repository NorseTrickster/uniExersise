package textio;
import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		 Question question = new MultipleChoiceQuestion("What coffee beans "
		 		+ "are used in instant coffee?\n",
		 		"Arabica",
		 		"Robusta", 
		 		"Mokka",
		 		"Geisha",
		 		"Pass",
		 		"b");
	 
	 question.check();
	// question.showResults();
	 
	 	Question question1 = new MultipleChoiceQuestion("Where coffee is from?",
			 "Cuba",
			 "Central America",
			 "India",
			 "Ethiopia",
			 "Denmark",
			 "D");
		 question1.check();
		 //question1.showResults();
		 
		
		 Question question2 = new MultipleChoiceQuestion("Where does coffee grow?",
			 "The Orion Belt",
			 "The Belt of Sauron",
			 "Men Belt",
			 "The Coffee Belt",
			 "On the plantations",
			 "d");
	 	question2.check();
	 	//question2.showResults();
		
		
		Question question3 = new MultipleChoiceQuestion("Only ____ could enter Coffee shop in 17th & 18"
				+ "century England",
				 "Blond Women",
				 "Irish Women",
				 "Aristocratic Women",
				 "Working Women(Prostitute)",
				 "Women under age of 25",
				 "d");
	    question3.check();
	    //question3.showResults();
		
		Question question4 = new MultipleChoiceQuestion("What is the best Type of Coffee?",
				 "Espresso",
				 "Cappucino",
				 "Latte",
				 "Black Filter",
				 "Everyone have equel right to choose",
				 "e");
	   question4.check();

	 //question4.showResults();
	 
	 Question question5 = new TrueFalseQuestion("Coffee producers getting paid fairly", "FALSE");
	 question5.check();
	// question5.showResults();
	 
	 Question question6 = new TrueFalseQuestion("Coffee counsamption increasing", "TRUE");
	 question6.check();
	 //question6.showResults();
	 
	 Question question7 = new TrueFalseQuestion("Barista is underapricieted profesion", "TRUE");
	 question7.check();
	// question7.showResults();
	 
	 Question question8 = new TrueFalseQuestion("Sky is blue", "TRUE");
	 question8.check();
	// question8.showResults();
	 
	 Question question9 = new TrueFalseQuestion("You are a university student", "TRUE");
	 question9.check();
	 //question9.showResults();
	 
	 
	 Question question0 = new TrueFalseQuestion("You are strong and valubele part of community", "TRUE");
	 question0.check();
	 question0.showResults();
	 }
	} 



