package lojaDeTinta;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaLojaTinta  extends JFrame{
	
	JButton jb = new JButton("Botao 1");
	JButton jb2 = new JButton("Botao 2");
	
	public JanelaLojaTinta() {
		setLayout(null);
		jb.setBounds(100,300,100,60);
		jb2.setBounds(10,20,200,60);
		add(jb);
		add(jb2);
		
		setTitle("Loja de Tintas");
		setSize(700,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JanelaLojaTinta();
	}

}
