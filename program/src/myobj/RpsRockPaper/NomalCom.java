package myobj.RpsRockPaper;

public class NomalCom extends Computer{

	@Override
	public int ranShot() {
		return (int)(Math.random()*3);
	}	

	@Override
	public void viewInfo() {
		// TODO Auto-generated method stub
		System.out.println("==============��ǻ��(�⺻)==============");
		System.out.printf("  [�� : %d]    [�� : %d]    [�� : %d]\n", win, lost, draw);		
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
}
