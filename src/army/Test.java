package army;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Test extends JFrame {
	
	public Test() {
		super("�׽�Ʈ");
		setBounds(1000, 200, 500, 500);
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�ȳ�~");
				System.exit(0);
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test();
	}
}






