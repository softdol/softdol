package quiz;

public class B11_WhileQuiz {

	/*
	 * 	While문만 사용하여 다음을 구하시오
	 * 
	 */
	
	public static void main(String[] args) {
		
		boolean self = false;
		
		if(!self) {
			
			int i = 500, sum = 0;
			while(i <= 1200) {
				if(i % 3 == 0) {
					sum += i;
				}					
				++i;
			}
			System.out.println("Q1 : [" + sum + "]");
			
			i = 30;
			
			while(i > 0) {
				
				System.out.printf("%d\t", i);
				if(i % 5 == 1) {
					System.out.println();
				}
				--i;
			}
			
			i = 1;
			sum = 0;
			
			while(i <= 200) {				
				if(i % 2 != 0 && i % 3 != 0) {
					sum += i;
				}				
				i++;				
			}	
			
			System.out.println("Q3 : [" + sum + "]");
			
		}else {
			
			//	1. 500 ~ 1200 사시에 있는 모든 3의 배수의 총합
			int num = 500, sum = 0;
			
			while(num <= 1200) {				
				if(num % 3 == 0) {
					sum += num;				
				}				
				num++;				
			}			
			System.out.println("500 ~ 1200 사시에 있는 모든 \n3의 배수의 총합 : [" + sum + "]");
			System.out.println();
			
			//	2. 30부터 1까지 한 줄에 숫자를 5개씩 출력
			num = 30;
					
			while(num > 0) {	
				
				System.out.printf("%d\t", num);
				if(num % 5 == 1) {
					System.out.println();
				}				
				num--;				
			}			
			System.out.println();
			
			//	3. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합			
			num = 0;
			sum = 0;
			
			while(num <= 200) {				
				if(!(num % 3 == 0 || num % 2 == 0)) {
					sum += num;
				}				
				num++;				
			}			
			System.out.println("1부터 200까지의 숫자 중 2의 배수도 아니고 \n3의 배수도 아닌 숫자들의 총합 : [" + sum + "]");
			System.out.println();
			
		}		
	}
}


