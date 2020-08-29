package day03;

import javax.swing.JOptionPane;

public class DialogTask {
public static void main(String[] args) {
		//두 정수를 입력받고 두 정수의 몫과 나머지(%모듈러스)를 각각 출력하기
			// 10 % 3 == 1
			//대화 상자 사용
			//입력 : JOptionPane.showInputDialog("msg");
			//출력 : JOptionPane.showMessageDialog(null, "msg");
	int num1, num2, value, rest = 0;
	String n1Msg = "첫번째 정수의 값을 입력하세요";
	String n2Msg = "두번째 정수의 값을 입력하세요";
	
	num1 = Integer.parseInt(JOptionPane.showInputDialog(n1Msg));
	num2 = Integer.parseInt(JOptionPane.showInputDialog(n2Msg));
	
	value = num1/num2;
	rest = num1%num2;
	
	String resultMsg ="두수의 나눗셈 몫은"+value+"이고 나머지는"+rest+"입니다" ;
	
	JOptionPane.showMessageDialog(null, resultMsg);

}
}
