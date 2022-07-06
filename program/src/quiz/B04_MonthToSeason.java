package quiz;

import java.util.Scanner;

public class B04_MonthToSeason {

	/*
	 * 	사용자로부터 몇 월인지 입력받으면 해당하는 계절을 출력해보세요
	 * 	(반드시 switch-case 문을 사용할것
	 * 
	 * 일반적으로 3·4·5월을 봄, 
	 * 	6·7·8월을 여름,
	 *  9·10·11월을 가을,
	 *  12·1·2월을 겨울이라고 한다.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력해 주세요 >>");
		
		int month = sc.nextInt();		

		String season = "";
		
		sc.close();
		switch (month) {
		//switch (month) {
			case 3: case 4: case 5:
				season = "봄";
				break;			
			case 6: case 7: case 8:
				season = "여름";
				break;
			case 9: case 10: case 11:
				season = "가을";
				break;
			case 12: case 1: case 2:
				season = "겨울";
				break;
			default:
				System.out.println("잘못 입력 하셨습니다.");
				return;
		}		
		
		System.out.printf("입력하신 월에 계절은 [%s] 입니다.", season);
		
	}
}
