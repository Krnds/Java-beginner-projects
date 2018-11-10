package fr.krnds.swingtest;

import javax.swing.*;

public class SwingTest {

	public static void main(String args[]) {

		String prompt = "Will it be rock, paper or scissors?";
		String clientGesture = null;
		String serverGesture = "rock";
		String outcome = "error";

		clientGesture = JOptionPane.showInputDialog(prompt);

		if (clientGesture.equalsIgnoreCase("rock")) {
			outcome = "tie";
		} else if (clientGesture.equalsIgnoreCase("scissors")) {
			outcome = "loss";
		} else if (clientGesture.equalsIgnoreCase("paper")) {
			outcome = "win";
		}

		JOptionPane.showMessageDialog(null, outcome);
	}

}