package myobj;

public class test {
	static int[][] map;
	static boolean[] visited;
	static String[] conection;
	static int n, m, start, end;
	
	/*
	 * 	������4���
		����ε� ��ä�� ����� ���� ��� ���̾��� �ű� ���� ���� ������ �ð� �Ǿ���. 
		�̹��� ����� ���� ������ "������4���".
		���� ����� īī�������� ����� 2��2 ���·� 4���� �پ����� ��� ������鼭 ������ ��� �����̴�.

		board map
		���� ���� ���� ���� �־��� ���, ���̾��� 2��2�� ��ġ�� 7�� ��ϰ� ���� 2��2�� ��ġ�� 4�� ����� ��������. 
		���� ����� ���� 2��2�� ���Ե� �� ������, 
		�������� ���ǿ� �����ϴ� 2��2 ����� ���� �� �ִٸ� �Ѳ����� ��������.

		board map

		����� ������ �Ŀ� ���� �ִ� ����� �Ʒ��� ������ �� ������ ä��� �ȴ�.

		board map

		���� �� ������ ä�� �Ŀ� �ٽ� 2��2 ���·� ���� ����� ����� ���̸� �ٽ� �������� �������� �ݺ��ϰ� �ȴ�.
		board map

		�� �ʱ� ��ġ�� ���ڷ� ǥ���ϸ� �Ʒ��� ����.

		TTTANT
		RRFACC
		RRRFCC
		TRRRAA
		TTMMMF
		TMMTTJ
		
		�� ���ڴ� ���̾�(R), ����(M), ����ġ(A), ���ε�(F), �׿�(N), Ʃ��(T), ������(J), ��(C)�� �ǹ��Ѵ�

		�Է����� ����� ù ��ġ�� �־����� ��, �������� ����� ��� �� ������ �Ǵ��ϴ� ���α׷��� �����϶�.

		�Է� ����
		
		�Է����� ���� ���� m, �� n�� ���� ��ġ ���� board�� ���´�.
		2 <= n, m <= 30
		board�� ���� n�� ���ڿ� m���� �迭�� �־�����. ����� ��Ÿ���� ���ڴ� �빮�� A���� Z�� ���ȴ�.
		
		��� ����
		
		�Է����� �־��� �� ������ ������ �� ���� ����� �������� ����϶�.

		����� ����
		m	n	board	answer
		4	5	["CCBDE", "AAADE", "AAABF", "CCBBF"]	14
		6	6	["TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"]	15
	 * 	 
	 */
	
	public static void main(String[] args) {
		int m = 4;
		int n = 5;
		String[] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
		
		System.out.println(solution(m, n, board));
		
		String name = "softdol";
	    String email = "hoso8243!@";
	    
	    //name.hashCode() * email.hashCode()
		
	}
	
	public static int solution(int m, int n, String[] board) {
        int answer = 0;
        
        for(int i= 0; i < board.length; i++) {
        	System.out.println(board[i]);
        }
        
        System.out.println();
        System.out.println();
        
        return answer;
    }
	
	
	public static void chkBolck() {
		
	}
}















