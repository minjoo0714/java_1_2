package day03;

import javax.swing.JOptionPane;

public class DialogTask {
public static void main(String[] args) {
		//�� ������ �Է¹ް� �� ������ ��� ������(%��ⷯ��)�� ���� ����ϱ�
			// 10 % 3 == 1
			//��ȭ ���� ���
			//�Է� : JOptionPane.showInputDialog("msg");
			//��� : JOptionPane.showMessageDialog(null, "msg");
	int num1, num2, value, rest = 0;
	String n1Msg = "ù��° ������ ���� �Է��ϼ���";
	String n2Msg = "�ι�° ������ ���� �Է��ϼ���";
	
	num1 = Integer.parseInt(JOptionPane.showInputDialog(n1Msg));
	num2 = Integer.parseInt(JOptionPane.showInputDialog(n2Msg));
	
	value = num1/num2;
	rest = num1%num2;
	
	String resultMsg ="�μ��� ������ ����"+value+"�̰� ��������"+rest+"�Դϴ�" ;
	
	JOptionPane.showMessageDialog(null, resultMsg);

}
}
