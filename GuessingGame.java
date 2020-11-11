import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random; 

public class GuessingGame implements ActionListener {     
  JTextField userGuess;
  JButton guessButton;
  JButton playAgainButton;
  // Jlabel names can be changed/updated
  Jlabel guessLabel, hintLabel, lastGuessLabel
  Random r = new Random();
  int randomInt;

    GuessingGame() {
      int randomInt = r.nextInt(100) + 1;

      JFrame frame = new JFrame("Guessing Game");
      frame.setLayout(new FlowLayout());
      frame.setSize(240,120);

      userGuess = new JTextfield(10);
      userGuess.setActionCommand("myTF");

      guessButton = new JButton("Guess");
      playAgainButton = new JButton("Play Again");

      userGuess.addActionListener(this);
      guessButton.addActionListener(this);
      playAgainButton.addActionListener(this);

      guessLabel = new JLabel("Enter your guess:");
      hintLabel = new JLabel("");
      lastGuessLabel = new JLabel("");
      
      frame.add(guessLabel);
      frame.add(userGuess);
      frame.add(guessButton);
      frame.add(hintlabel);
      frame.add(lastGuessLabel);
      frame.add(playAgainButton);

      frame.setVisible(true);
    }
      public void actionPerformed(ActionEvent ae) {
       int guess = Integer.parseInt(userGuess.getText());
            
       if(ae.getActionCommand().equals("Guess")) {
        String orgStr = userGuess.getText();
        String resStr = "";
      }
      if(ae.getActionCommand().equals("myTF")) {
        if userGuess>randomInt {
          hintLabel.setText("Too high!");
          lastGuessLabel.setText("Last guess was" +userGuess);
        }
        else userGuess<randomInt {
          hintLabel.setText ("Too low!");
          lastGuessLabel.setText("Last guess was" +userGuess);
        }
        if userGuess == randomInt {
          hintLabel.setText ("You got it!");
        }
      }  

      if(ae.getActionCommand().equals("Play Again")) {
      int randomInt = r.nextInt(100) + 1;
      guessLabel.setText("Enter your guess:");
      hintLabel.setText("");
      lastGuessLabel.setSize("");
      userGuess.setText("");
      }
    if(ae.getActionCommand().equals("")) {
      hintLabel.setText("You pressed Enter. Please press the Guess Button.");
     
  }

}