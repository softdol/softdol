package quiz;

import java.util.Scanner;

import myobj.YachtDice.Dice;

public class C06_YachtDice {

	/*
	 * # YachtDice ������ ��������
	 * 
	 * 
	 * 1. �÷��̾�� �ټ����� �ֻ����� ������.
	 * 
	 * 2. �ټ� ���� �ֻ��� �� ����� ���� ������ �����ؾ� �Ѵ�.
	 * 
	 * (1) Ǯ �Ͽ콺 (���� ���� 2��/3��) ex: 11133, 31313 (2) ���� ��Ʈ����Ʈ(1234,2345,3456) ex:
	 * 42131 (3) ���� ��Ʈ����Ʈ(12345,23456) ex: 54123 (4) 4���̽� (���� ���� 4��) ex: 44441,
	 * 63666 (5) Yacht(���� ���� 5��) ex: 11111, 22222 (6) �ƹ��͵� �������� ���� ��� �ֻ��� �� ���� ������
	 * �ȴ�]
	 * 
	 * 3. �÷��̾�� �ٽ� ������ ���� �ֻ����� ������ ��� �ٽ� ���� �� �ִ�.(2ȸ) *
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

			System.out.println("0. ��");
			System.out.println("1. �ֻ��� ������");
			if (checkRoll) {
				System.out.println("2. �ֻ��� �ٽ� ������(" + maxCount + "ȸ ����)");
				System.out.println("3. ��� Ȯ��");
			}
			System.out.print("> ");

			switch (sc.nextInt()) {
			case 0:
				return;
			case 1:
				if (checkRoll) {
					System.out.println("�ֻ��� �ٽ� �����⸦ ����� �ּ���.");
					break;
				}

				roll();
				rollView();

				checkRoll = true;
				break;
			case 2:
				if (checkRoll) {

					if (maxCount < 1) {
						System.out.println("�ֻ��� �ٽ� ������ Ƚ���� �ʰ� �Ǿ����ϴ�.");
						break;
					}
					sc.nextLine();

					System.out.print("�ٽ� ���� �ֻ����� �Է��� �ּ��� >> ");
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
			System.out.println((i + 1) + "��° �ֻ��� �� : " + diceList[i].num);
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

		System.out.println("��� : " + score);

		checkDice = new boolean[6];
		diceCount = new int[6];
		pair = false;

		return;

	}

}
