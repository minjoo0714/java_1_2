package day13;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class ExceptionTest2 {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
			System.out.println(num + 2);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("���� �̿��ǰ��� �Է��� �� �����ϴ�. "); // �ܼ�â�� �����ں��� ������� �� 
		}
	}
}
