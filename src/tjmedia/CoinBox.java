package tjmedia;

import java.util.Random;

import javax.swing.JOptionPane;

public class CoinBox {
	public static void main(String[] args) {
		String title = "��TJ �̵���";
		String msg = "������ ����\n��뷡 ���\n�鳪����";
		String coinMsg = "���� : ";
		
		String chargeMsg = "��500��(2��)\n��1000��(5��)\n��Ȩ����";
		
		String err_msg = "�ٽ� �õ����ּ���.    ";
		//50�� ����
		//70�� ����
		//90�� ����
		//100��
		String msg_50 = "���� �� ����غ�����?";
		String msg_70 = "������ �̽Ű���?";
		String msg_90 = "�Ϳ�~ ������ �Ƿ��̱���!";
		String msg_100 = "JYP, YG, SM���� ���� �ǰھ��!";
		
		String resultMsg = "";
		
		int choice = 0;
		int coin = 0;
		
		int money = 10000;
		
		int price = 0;
		int cnt = 0;
		
		int score = 0;
		
		Random r = new Random();
		
//		r.nextInt(10) : 0~9
		
		while(true) {
			
			choice = Integer.parseInt(
					JOptionPane.showInputDialog(title + "\n" 
							+ coinMsg + coin + "��\n" + msg));
			
			if(choice == 3) {
				JOptionPane.showMessageDialog(null, "�ȳ��� ������");
				break; // ���� �ݺ����� ��������
			}
			
			switch(choice) {
			//���� ����
			case 1:
				//������ ����
				//1. �޸� ����
				//2. �������� ��������.
				choice = Integer.parseInt(
						JOptionPane.showInputDialog(chargeMsg));
				
				//nested switch(��ø switch��)
				switch(choice) {
				//500��(2��)
				case 1:
					price = 500;
					cnt = 2;
					break;
				//1000��(5��)
				case 2:
					price = 1000;
					cnt = 5;
					break;
				default:
//				case 3:
//					Ȩ���� �̵��� �� ����� �޼���
					continue; // �ݺ����� �ٽ� �Ѿ 
				}
				break;
			//�뷡 ���
			case 2:
				if(coin > 0) {
					coin--;
					System.out.print("�뷡 �����");
					for (int i = 0; i < 3; i++) {
						System.out.print(".");
						try {	Thread.sleep(1000);} catch (InterruptedException e) {}
					}
					System.out.println();
					
					//���� ��� 40~100(10����)
					// 40 ~ 100
					// 0 ~ 60 + 40
					
					// 4 ~ 10 * 10
					// (0 ~ 6 + 4) * 10
					
//					score = r.nextInt(61) + 40;
					score = (r.nextInt(7) + 4) * 10;
					
					if(score <= 50) {
						resultMsg = msg_50;
					}else if(score <= 70) {
						resultMsg = msg_70;
					}else if(score <= 90) {
						resultMsg = msg_90;
					}else {
						resultMsg = msg_100;
						coin++;
					}
					JOptionPane.showMessageDialog(null, 
							"��" + score + "����\n" + resultMsg);
				}else {
					JOptionPane.showMessageDialog(null, err_msg + " / ���� ����");
				}
				continue;
			default:
				JOptionPane.showMessageDialog(null, err_msg);
				continue;
			}
			
			//���� ����(�ϰ�ó��)
			if(money < price) {
				//�ܾ� ����
				JOptionPane.showMessageDialog(null, err_msg + " / �ܾ׺���");
			}else {
				//���� ����
				money -= price;
				coin += cnt;
				JOptionPane.showMessageDialog(null, "���� ����");
			}
		}
	}
}

