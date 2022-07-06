package myutil;

public class Range {
	int start;
	int end;
	int incre;
	
	int length;
	int[] range;
	
	public Range(int end) {
		this(0, end, end < 0 ? -1 : 1);
	}
	
	public Range(int start, int end) {
		this(start, end, start > end ? -1 : 1);
	}
	
	public Range(int start, int end, int incre) {
		this.start = start;
		this.end = end;
		this.incre = incre;		
		this.length = length();
		this.range = range();
	}
	
	int length() {
		int diff = end - start;
		int length = diff / incre;
		if (length < 0) {
			return 0;
		}
		length += diff % incre == 0 ? 0 : 1;
		return length;
	}
	
	public int[] range() {
		int len = length();
		int[] arrNum = new int[len];
		//int arrCount = 0;
		
		for(int i = 0; i < len; i++) {
			arrNum[i] = start + incre * i;
		}
		
		return arrNum;
	}
	
}
