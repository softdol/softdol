package myobj.RpsRockPaper;

public class RockCom extends Computer {

	@Override
	public int ranShot() {
		
		int num = (int)(Math.random()*5);
		
		switch (num) {
		case 3: case 4:
			return 1;
		}
		
		return num;
	}

	@Override
	public void viewInfo() {
		// TODO Auto-generated method stub
		System.out.println("==============컴퓨터(바위)==============");
		System.out.printf("  [승 : %d]    [패 : %d]    [무 : %d]\n", win, lost, draw);
		
	}

	@Override
	public void setInfo(int result) {
		if(result == 1) {
			lost++;
		}else if(result == -1) {
			win++;
		}else {
			draw++;
		}		
	}
	
	@Override
	public void setPlayInfo(String info) {
		
		String[] playInfo = info.split(",");
		lost = Integer.parseInt(playInfo[1]);
		win = Integer.parseInt(playInfo[2]);
		draw = Integer.parseInt(playInfo[3]);
		
		//return "player|"+win+"|"+lost+"|"+draw;
	}

}
