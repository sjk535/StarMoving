
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
		Charactor c = new Charactor('@');

		Scanner sc = new Scanner(System.in);
		int key = 0;
		String Ann1 = "��:8, �Ʒ�:2, ����:4, ������:6, ����:0";
		String Ann2 = "<���Դϴ�. �ٽ��Է��ϼ���.>\n ��:8, �Ʒ�:2, ����:4, ������:6, ����:0";
		String Ann = Ann1;
	
		do {
			s.SpaceIni();
			w.WallCreat();
			c.Star1();						

			Print();
			System.out.println(Ann);
			System.out.println();
			Ann=Ann1;    //��ȸ ������� ������ ����(input ���) 
			
			key=sc.nextInt();
			char AnnCR=c.Star(key);
			if (AnnCR=='R') Ann=Ann2;
					
		} while (key != 0);
		sc.close();
	}
}
