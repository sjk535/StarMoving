
public class Wall extends Space {
//// ��ֹ� ���� �� Check /////////////////
	boolean WC;			  // ���̳� �庮�� �������� ����
	int H=AA.length*2/3;  // y���� 2/3 ��ġ�� �庮 ����
	int W1=N / 2 - 1;     // ù��° �庮 ��ġ
	static int NoW=0;  //Number of Wall
//	int NoW=0;  //Number of Wall //for Test

	public Wall() {
	}
	
	public Wall(int NoW) {
		this.NoW=NoW;
		System.out.println("A:"+this.NoW); //for Test

	}
	
	public void WallCreat() {       // �庮 ����
		System.out.println("B:"+NoW); //for Test

		for (int i = W1; i < W1 + NoW; i++) {
			AA[H][i] = 'W';    
		}
	}

	public boolean WallCheck (int key, int y, int x) {
	System.out.println("C:"+NoW);  //for Test
	//--------- ���� �������� Check 
		if (((key==8)&&(y == 0)) ||
			((key==4)&&(x == 0)) || 
			((key==2)&&(y == AA.length - 1)) ||
			((key==6)&&(x == AA[0].length - 1))) {
			WC=true;
		}
	//--------- �庮�� �������� Check 		

		else if ( (((key==8)&&((y-1) == H))&&((x>=W1)&&(x<(W1+NoW)))) ||
				  (((key==2)&&((y+1) == H))&&((x>=W1)&&(x<(W1+NoW)))) ||
				  ((key==4)&&(y == H)&&((x-1)==(W1+NoW-1))) ||
				  ((key==6)&&(y == H)&&((x+1)==W1)) ) {
			WC=true;
		}
		else {
			WC=false;
		}
		return WC;
	}
}
