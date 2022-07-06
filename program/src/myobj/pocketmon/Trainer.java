package myobj.pocketmon;

public class Trainer {
	
	String name;
	Pocketmon[] own_poletmon = new Pocketmon[6];
	
	int index = 0;
	
	public Trainer(String name) {
		this.name = name;
		
	}
	
	public void catchPoketmon(Pocketmon poke) {
		if(index == 6) {
			System.out.println("주머니가 가득차서 " + poke.name + "을 놓아주었습니다.");
			return;
		}
		own_poletmon[index++] = poke;
	}
	
	public void printOwn() {
		for(int i = 0; i < index; i++) {
			own_poletmon[i].printStats();
		}
	}
	
	public static void main(String[] args) {
		Trainer t = new Trainer("지우");
		
		t.catchPoketmon(new Pocketmon("이상해씨", 1,2,3,4,5,6));
		t.catchPoketmon(new Pikachu());
		t.catchPoketmon(new Pikachu());
		t.catchPoketmon(new Pikachu());
		t.catchPoketmon(new Pichu());
		t.catchPoketmon(new Pichu());
		t.catchPoketmon(new Pichu());
		t.catchPoketmon(new Pikachu());
		t.printOwn();
	}
	
//	public static void main(String[] args) {
//		
//		Pikachu pike = new Pikachu();
//		pike.thunder();
//		pike.printStats();
//		
//		Pichu pichu = new Pichu();
//		pichu.takle();
//		pichu.printStats();
//	}
}
