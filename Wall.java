
public class Wall extends Space {
//// 장애물 생성 및 Check /////////////////
	boolean wallChkR;			  // 벽이나 장벽을 만났는지 여부
	int h=AA.length*2/3;  // y축의 2/3 위치에 장벽 생성
	int w1=N / 2 - 1;     // 첫번째 장벽 위치
	static int numWall=0;  //Number of Wall
//	int numWall=0;  //Number of Wall //for Test

	public Wall() {
	}
	
	public Wall(int numWall) {
		this.numWall=numWall;
		System.out.println("A:"+this.numWall); //for Test

	}
	
	public void WallCreat() {       // 장벽 생성
		System.out.println("B:"+numWall); //for Test

		for (int i = w1; i < w1 + numWall; i++) {
			AA[h][i] = 'W';    
		}
	}

	public boolean WallCheck (int key, int y, int x) {
	System.out.println("C:"+numWall);  //for Test
	//--------- 벽과 만났는지 Check 
		if (((key==8)&&(y == 0)) ||
			((key==4)&&(x == 0)) || 
			((key==2)&&(y == AA.length - 1)) ||
			((key==6)&&(x == AA[0].length - 1))) {
			wallChkR=true;
		}
	//--------- 장벽과 만났는지 Check 		

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
