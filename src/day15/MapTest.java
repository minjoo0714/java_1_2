package day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
public static void main(String[] args) {
	HashMap<String, Integer> fruitMap = new HashMap<>();
	fruitMap.put("사과", 1000);
	fruitMap.put("자두", 2000);
	fruitMap.put("메론", 3000);
	fruitMap.put("수박", 4000);
	System.out.println(fruitMap); 
	System.out.println(fruitMap.get("수박")+"원");
	
	if (fruitMap.containsKey("사과")) {
		fruitMap.put("사과", 5000);
	}
	System.out.println(fruitMap);
	System.out.println("사과 값 변경!!");
	
//	fruitMap.remove("메론");
//	System.out.println(fruitMap);
//	System.out.println("메론 삭제");
	
	Set<String> set = fruitMap.keySet();
	Iterator<String> iter = set.iterator();
	
	while (iter.hasNext()) {
		System.out.println("과일이름 : "+ iter.next());
	}
	//values()를 사용해서 과일들의 평균 가격 출력하기
	
}
}
