package codes;

import java.util.Scanner;

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
		
		
//		사용자에게 3자리 숫자 입력 -> 3S 맞출때까지.
		
		Scanner myScanner = new Scanner(System.in);
		
		while (true) {

			System.out.print("정답 입력 (3자리 정수) : ");
			int inputNum = myScanner.nextInt();
			
//			723 => [7, 2, 3] 배열형태로 분리하자. => 문제 배열과 비교하기 편해짐.
			
			int[]  userNumbers = new int[3];
			
//			userNumbers[0] = 입력 숫자의 100의 자리?
			
			userNumbers[0] = inputNum / 100; 
			
//			userNumbers[1] = 입력 숫자의 10의 자리? => 723 => 72 의 1의 자리?
			
			userNumbers[1] = inputNum / 10 % 10;
			
//			userNumbers[2] = 입력 숫자의 1의 자리?
			
			userNumbers[2] = inputNum % 10; 
			
			
		}
		
		
	}

}





