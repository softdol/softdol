package quiz;

import java.util.Scanner;

import myobj.YachtDice.Dice;

public class C06_YachtDice {

	/*
	 * # YachtDice 게임을 만들어보세요
	 * 
	 * 
	 * 1. 플레이어는 다섯개의 주사위를 던진다.
	 * 
	 * 2. 다섯 개의 주사위 눈 결과를 통해 다음을 구분해야 한다.
	 * 
	 * (1) 풀 하우스 (같은 눈이 2개/3개) ex: 11133, 31313 (2) 스몰 스트레이트(1234,2345,3456) ex:
	 * 42131 (3) 라지 스트레이트(12345,23456) ex: 54123 (4) 4다이스 (같은 숫자 4개) ex: 44441,
	 * 63666 (5) Yacht(같은 숫자 5개) ex: 11111, 22222 (6) 아무것도 만족하지 못한 경우 주사위 눈 합이 점수가
	 * 된다]
	 * 
	 * 3. 플레이어는 다시 던지고 싶은 주사위를 여러개 골라서 다시 던질 수 있다.(2회) *
	 * 
	 */

	static Scanner sc;
	static Dice[] diceList;
	static boolean[] checkDice;
	static int[] diceCount;

	public static void main(String[] args) {

		diceList = new Dice[5];
		checkDice = new boolean[6];
		diceCount = new int[6];

		int maxCount = 2;
		boolean checkRoll = false;

		for (int i = 0; i < diceList.length; i++) {
			diceList[i] = new Dice();
		}

		sc = new Scanner(System.in);

		while (true) {

			System.out.println("0. 끝");
			System.out.println("1. 주사위 던지기");
			if (checkRoll) {
				System.out.println("2. 주사위 다시 던지기(" + maxCount + "회 가능)");
				System.out.println("3. 결과 확인");
			}
			System.out.print("> ");

			switch (sc.nextInt()) {
			case 0:
				return;
			case 1:
				if (checkRoll) {
					System.out.println("주사위 다시 던지기를 사용해 주세요.");
					break;
				}

				roll();
				rollView();

				checkRoll = true;
				break;
			case 2:
				if (checkRoll) {

					if (maxCount < 1) {
						System.out.println("주사위 다시 던지기 횟수가 초과 되었습니다.");
						break;
					}
					sc.nextLine();

					System.out.print("다시 던질 주사위를 입력해 주세요 >> ");
					String diceNum = sc.nextLine();

					if (diceNum.length() < 1) {
						break;
					}

					reRoll(diceNum);
					rollView();

					maxCount--;
				}
				break;
			case 3:
				if (checkRoll) {
					result();

					checkRoll = false;
					maxCount = 2;

				}

			default:
				break;
			}
		}

	}

	static void roll() {
//		for (Dice d : diceList) {
//			// d.roll();
//		}
	}

	static void reRollChkDice(int num) {
		if (!checkDice[num]) {
			// diceList[num].roll();
			checkDice[num] = true;
		}
	}

	static void reRoll(String diceNum) {

		char[] chNum = diceNum.toCharArray();

		for (int i = 0; i < chNum.length; i++) {
			if (chNum[i] >= '1' && chNum[i] <= '6') {
				switch (chNum[i]) {
				case '1':
					reRollChkDice(0);
					break;
				case '2':
					reRollChkDice(1);
					break;
				case '3':
					reRollChkDice(2);
					break;
				case '4':
					reRollChkDice(3);
					break;
				case '5':
					reRollChkDice(4);
					break;
				case '6':
					reRollChkDice(5);
					break;
				default:
					break;
				}
			}
		}
	}

	static void rollView() {

		for (int i = 0; i < diceList.length; i++) {
			System.out.println((i + 1) + "번째 주사위 값 : " + diceList[i].num);
			checkDice[i] = false;
		}

	}

	static void result() {

		int sum = 0;

		for (int i = 0; i < diceList.length; i++) {
			diceCount[diceList[i].num - 1]++;
			sum += diceList[i].num;
		}

		int diceNumCount = 0;
		boolean pair = false;
		String score = "";

		int straightCnt = 0;
		boolean straightchk = false;

		for (int i = 0; i < diceCount.length; i++) {

			if (diceNumCount == 3 && diceCount[i] == 3) {
				pair = true;
			} else if (diceCount[i] == 2) {
				pair = true;
			}

			diceNumCount = diceNumCount < diceCount[i] ? diceCount[i] : diceNumCount;

			if (i == 0) {
				straightchk = true;
			} else {
				straightchk = diceCount[i - 1] > 0;
			}
			if (straightCnt < 4) {
				straightCnt = straightchk ? straightCnt : 0;
			}

			if (diceCount[i] > 0) {
				straightCnt++;
			}
		}

		switch (diceNumCount) {
		case 5:
		case 6:
			score = "Yacht";
			break;

		case 4:
			score = "4 Dice";
			break;

		case 3:

			if (pair) {
				score = "Full House";
			} else {

				if (straightCnt >= 5) {
					score = "Large Straight";
				} else if (straightCnt == 4) {
					score = "Small Straight";
				} else {
					score = score + sum;
				}
			}
			break;

		default:
			if (straightCnt >= 5) {
				score = "Large Straight";
			} else if (straightCnt == 4) {
				score = "Small Straight";
			} else {
				score = score + sum;
			}

			break;
		}

		System.out.println("결과 : " + score);

		checkDice = new boolean[6];
		diceCount = new int[6];
		pair = false;

		return;

	}

}
