
public class Wall extends Space {
//// ��ֹ� ���� �� Check /////////////////
	boolean wallChkR;			  // ���̳� �庮�� �������� ����
	int h=AA.length*2/3;  // y���� 2/3 ��ġ�� �庮 ����
	int w1=N / 2 - 1;     // ù��° �庮 ��ġ
	static int numWall=0;  //Number of Wall
//	int numWall=0;  //Number of Wall //for Test

	public Wall() {
	}
	
	public Wall(int numWall) {
		this.numWall=numWall;
		System.out.println("A:"+this.numWall); //for Test

	}
	
	public void WallCreat() {       // �庮 ����
		System.out.println("B:"+numWall); //for Test

		for (int i = w1; i < w1 + numWall; i++) {
			AA[h][i] = 'W';    
		}
	}

	public boolean WallCheck (int key, int y, int x) {
	System.out.println("C:"+numWall);  //for Test
	//--------- ���� �������� Check 
		if (((key==8)&&(y == 0)) ||
			((key==4)&&(x == 0)) || 
			((key==2)&&(y == AA.length - 1)) ||
			((key==6)&&(x == AA[0].length - 1))) {
			wallChkR=true;
		}
	//--------- �庮�� �������� Check 		

		else if ( (((key==8)&&((y-1) == h))&&((x>=w1)&&(x<(w1+numWall)))) ||
				  (((key==2)&&((y+1) == h))&&((x>=w1)&&(x<(w1+numWall)))) ||
				  ((key==4)&&(y == h)&&((x-1)==(w1+numWall-1))) ||
				  ((key==6)&&(y == h)&&((x+1)==w1)) ) {
			wallChkR=true;
		}
		else {
			wallChkR=false;
		}
		return wallChkR;
	}
}
