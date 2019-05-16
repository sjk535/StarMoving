
import java.util.Scanner;

public class StarMain {

	///////// Space 의 프린트//////////////
	static public void Print() {		
		for (int i = 0; i < Space.AA.length; i++) {
			for (int j = 0; j < Space.AA[i].length; j++) {
				System.out.print(Space.AA[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	/////////////// Main ////////////////////
	public static void main(String[] args) {
		
		Space s = new Space(5, '.');  //최소 5
		Wall w = new Wall(3);
		Character c = new Character('@');

		Scanner sc = new Scanner(System.in);
		int key = 0;
		String ann1 = "위:8, 아래:2, 왼쪽:4, 오른쪽:6, 종료:0";
		String ann2 = "<벽입니다. 다시입력하세요.>\n 위:8, 아래:2, 왼쪽:4, 오른쪽:6, 종료:0";
		String ann = ann1;
	
		do {
			s.SpaceIni();
			w.WallCreat();
			c.Star1();						

			Print();
			System.out.println(ann);
			System.out.println();
			ann=ann1;    //매회 여기까지 진행후 멈춤(input 대기) 
			
			key=sc.nextInt();
			char annChk=c.Star(key);
			if (annChk=='R') ann=ann2;
					
		} while (key != 0);
		sc.close();
	}
}
