package myobj.RpsRockPaper;

public class Player implements PlayerComGame{
	
	private int win;
	private int lost;
	private int draw;
	
	public int getWin() {
		return win;
	}
	
	public int getLost() {
		return lost;
	}
	
	public int getDraw() {
		return draw;
	}

	@Override
	public void viewInfo() {
		System.out.println("===============플레이어===============");
		System.out.printf("  [승 : %d]    [패 : %d]    [무 : %d]\n", win, lost, draw);
		
	}

	@Override
	public void setInfo(int result) {
		if(result == 1) {
			win++;
		}else if(result == -1) {
			lost++;
		}else {
			draw++;
		}
	}

	public String getPlayInfo() {
		return "player,"+win+","+lost+","+draw;
	}
	
	public void setPlayInfo(String info) {
		
		String[] playInfo = info.split(",");
		win = Integer.parseInt(playInfo[1]);
		lost = Integer.parseInt(playInfo[2]);
		draw = Integer.parseInt(playInfo[3]);
		
		//return "player|"+win+"|"+lost+"|"+draw;
	}
	
}

