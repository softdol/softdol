package myobj.Pirate;

public class Player {
	
	public int orderNum;
	public int winCount;
	public int lostCount;	
	
	int win;
	int lose;
	
	public double winRate() {
		if(win + lose == 0) {
			return 0.0;
		}
		return (double)win / (win + lose) * 100.0;
	}
	
	public void win() {
		win++;
	}
	
	public void lose() {
		lose++;
	}
	
	public void print() {
		System.out.printf("Win : %d, Lose: %d, Rate: %.2f\n", win, lose, winRate());
	}
	
	
}
