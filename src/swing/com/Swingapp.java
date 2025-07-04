package swing.com;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Swingapp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	
	JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Swingapp frame = new Swingapp();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Swingapp() {
		setTitle("Pet Selector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout());

		
		birdButton = new JRadioButton("Bird");
		catButton = new JRadioButton("Cat");
		dogButton = new JRadioButton("Dog");
		rabbitButton = new JRadioButton("Rabbit");
		pigButton = new JRadioButton("Pig");

		ButtonGroup group = new ButtonGroup();
		group.add(birdButton);
		group.add(catButton);
		group.add(dogButton);
		group.add(rabbitButton);
		group.add(pigButton);

		addRadioButtonAction(birdButton);
		addRadioButtonAction(catButton);
		addRadioButtonAction(dogButton);
		addRadioButtonAction(rabbitButton);
		addRadioButtonAction(pigButton);

		contentPane.add(birdButton);
		contentPane.add(catButton);
		contentPane.add(dogButton);
		contentPane.add(rabbitButton);
		contentPane.add(pigButton);
	}

	private void addRadioButtonAction(JRadioButton button) {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Swingapp.this, "You selected: " + button.getText());
			}
		});
	}
}
