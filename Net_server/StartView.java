package Net_server;

	import java.awt.EventQueue;
	import java.awt.Frame;
	import javax.swing.JFrame;
	import javax.swing.JButton;
	import java.awt.SystemColor;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import java.io.IOException;

	public class StartView {

		private JFrame frame;

		/**
		 * Launch the application.
		 */
	/*	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						StartView window = new StartView();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}*/

		/**
		 * Create the application.
		 */
		public StartView() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.getContentPane().setBackground(SystemColor.activeCaption);
			frame.setBounds(100, 100, 450, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JButton open = new JButton("\u6253\u5F00\u670D\u52A1\u5668");
			open.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					try {
						ReceiveCheck.receive();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			open.setBounds(79, 54, 115, 23);
			frame.getContentPane().add(open);
			
			JButton close = new JButton("\u5173\u95ED\u670D\u52A1\u5668");
			close.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					System.exit(0);
				}
			});
			close.setBounds(230, 54, 110, 23);
			frame.getContentPane().add(close);
			frame.setVisible(true);
		}
	}

