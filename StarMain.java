
import java.util.Scanner;

public class StarMain {

	///////// Space �� ����Ʈ//////////////
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
		
		Space s = new Space(5, '.');  //�ּ� 5
		Wall w = new Wall(3);
		Character c = new Character('@');

		Scanner sc = new Scanner(System.in);
		int key = 0;
		String ann1 = "��:8, �Ʒ�:2, ����:4, ������:6, ����:0";
		String ann2 = "<���Դϴ�. �ٽ��Է��ϼ���.>\n ��:8, �Ʒ�:2, ����:4, ������:6, ����:0";
		String ann = ann1;
	
		do {
			s.SpaceIni();
			w.WallCreat();
			c.Star1();						

			Print();
			System.out.println(ann);
			System.out.println();
			ann=ann1;    //��ȸ ������� ������ ����(input ���) 
			
			key=sc.nextInt();
			char annChk=c.Star(key);
			if (annChk=='R') ann=ann2;
					
		} while (key != 0);
		sc.close();
	}
}
