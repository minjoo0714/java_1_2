package day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
public static void main(String[] args) {
	HashMap<String, Integer> fruitMap = new HashMap<>();
	fruitMap.put("���", 1000);
	fruitMap.put("�ڵ�", 2000);
	fruitMap.put("�޷�", 3000);
	fruitMap.put("����", 4000);
	System.out.println(fruitMap); 
	System.out.println(fruitMap.get("����")+"��");
	
	if (fruitMap.containsKey("���")) {
		fruitMap.put("���", 5000);
	}
	System.out.println(fruitMap);
	System.out.println("��� �� ����!!");
	
//	fruitMap.remove("�޷�");
//	System.out.println(fruitMap);
//	System.out.println("�޷� ����");
	
	Set<String> set = fruitMap.keySet();
	Iterator<String> iter = set.iterator();
	
	while (iter.hasNext()) {
		System.out.println("�����̸� : "+ iter.next());
	}
	//values()�� ����ؼ� ���ϵ��� ��� ���� ����ϱ�
	
}
}
