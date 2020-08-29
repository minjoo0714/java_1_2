package day13;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class ExceptionTest2 {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(JOptionPane.showInputDialog("정수 입력"));
			System.out.println(num + 2);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("정수 이외의값은 입력할 수 없습니다. "); // 콘솔창은 개발자보기 좋으라고 함 
		}
	}
}
