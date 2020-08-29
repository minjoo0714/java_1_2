package day06;

public class ArTest {
public static void main(String[] args) {
	int arData[] = {4,5,6,7};
	for(int i=0; i<arData.length; i++) {// 이렇게 하면 원래 공간에 다시 넣는건지 ??
		arData[i] = i+1;
		System.out.println(arData[i]);
	}
	
}
}
