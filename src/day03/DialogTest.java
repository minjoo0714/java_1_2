package day03;

import javax.swing.JOptionPane;

public class DialogTest {
public static void main(String[] args) {
	
	String name = JOptionPane.showInputDialog("이름을 입력하세요"); // 이게 내가 통째로 입력한 값 
	
	JOptionPane.showMessageDialog(null, name +"안녕~");
	
	
	
}
}
