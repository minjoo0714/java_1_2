package tjmedia;

import java.util.Random;

import javax.swing.JOptionPane;

public class CoinBox {
	public static void main(String[] args) {
		String title = "◐TJ 미디어◑";
		String msg = "①코인 충전\n②노래 재생\n③나가기";
		String coinMsg = "코인 : ";
		
		String chargeMsg = "①500원(2곡)\n②1000원(5곡)\n③홈으로";
		
		String err_msg = "다시 시도해주세요.    ";
		//50점 이하
		//70점 이하
		//90점 이하
		//100점
		String msg_50 = "조금 더 노력해볼래요?";
		String msg_70 = "연습생 이신가요?";
		String msg_90 = "와우~ 가수의 실력이군요!";
		String msg_100 = "JYP, YG, SM으로 가도 되겠어요!";
		
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
							+ coinMsg + coin + "개\n" + msg));
			
			if(choice == 3) {
				JOptionPane.showMessageDialog(null, "안녕히 가세요");
				break; // 현재 반복문을 빠져나감
			}
			
			switch(choice) {
			//코인 충전
			case 1:
				//변수의 재사용
				//1. 메모리 절약
				//2. 가독성이 떨어진다.
				choice = Integer.parseInt(
						JOptionPane.showInputDialog(chargeMsg));
				
				//nested switch(중첩 switch문)
				switch(choice) {
				//500원(2곡)
				case 1:
					price = 500;
					cnt = 2;
					break;
				//1000원(5곡)
				case 2:
					price = 1000;
					cnt = 5;
					break;
				default:
//				case 3:
//					홈으로 이동할 때 출력할 메세지
					continue; // 반복으로 다시 넘어감 
				}
				break;
			//노래 재생
			case 2:
				if(coin > 0) {
					coin--;
					System.out.print("노래 재생중");
					for (int i = 0; i < 3; i++) {
						System.out.print(".");
						try {	Thread.sleep(1000);} catch (InterruptedException e) {}
					}
					System.out.println();
					
					//점수 출력 40~100(10단위)
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
							"★" + score + "점★\n" + resultMsg);
				}else {
					JOptionPane.showMessageDialog(null, err_msg + " / 코인 부족");
				}
				continue;
			default:
				JOptionPane.showMessageDialog(null, err_msg);
				continue;
			}
			
			//결제 영역(일괄처리)
			if(money < price) {
				//잔액 부족
				JOptionPane.showMessageDialog(null, err_msg + " / 잔액부족");
			}else {
				//정상 결제
				money -= price;
				coin += cnt;
				JOptionPane.showMessageDialog(null, "충전 성공");
			}
		}
	}
}

