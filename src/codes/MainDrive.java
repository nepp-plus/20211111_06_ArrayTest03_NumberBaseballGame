package codes;

public class MainDrive {
	
	public static void main(String[] args) {
		
		
//		컴퓨터가 3자리 숫자 문제 출제.
//		[7,4,1] 처럼 3칸의 배열로 만들자.
		
		int[]  cpuNumbers  = new int[3];
		
//		각 칸에 하나씩 (1~9) 랜덤 숫자를 채우자.
		
		for (int i=0 ; i < cpuNumbers.length ; i++) {
			
//			써도 되는 숫자가 나올때까지 무한 반복.
			
			while (true) {
				
//				1~9 중 하나를 랜덤으로 추출.
				int randomNum = (int)  (Math.random() * 9 + 1);
				
//				중복 검사.  cpuNumbers에 같은 값이 있나? 확인.
				
				boolean isDuplOk = true;
				
				for (int cpuNum  : cpuNumbers) {
					
					if ( randomNum  ==  cpuNum) {
						
//						중복 숫자 발견! => 사용하면 안됨!
						isDuplOk = false;
						
					}
					
				}
				
				
//				써도 되는 숫자면, cpuNumber의 위치에 맞게 집어넣고, 다음숫자로 넘어가자.
				
				if (isDuplOk) {
					
					cpuNumbers[i] = randomNum;
					
//					무한 반복 탈출
					break;
					
				}
				
			}
			
			
		}
		
//		나온 문제가 어떤 값인지 출력
		for (int cpuNum :   cpuNumbers) {
			System.out.println("문제 숫자 : " + cpuNum);
		}
		
	}

}





