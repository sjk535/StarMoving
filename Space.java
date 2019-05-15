public class Space {
///////// 2차원배열 바탕 : AA의 초기화///////////////
	static char AA[][]; 
	static int N=0;  
	char BackG;
	
	public Space() {
	}

	public Space(int N, char BackG) {
		//------ Space의 크기 지정-----------
		if (N < 5)
			this.N = 5;
		else
			this.N = N; 
		AA= new char[this.N][this.N];
		this.BackG=BackG;
	}	
	public void SpaceIni() {
		//------- Space의 모양 그리기 (BackG)---		
		for (int i = 0; i < AA.length; i++) {
			for (int j = 0; j < AA[0].length; j++) {
				AA[i][j] = BackG;
				if (!((BackG=='.')||(BackG=='*'))) BackG++;			
			}
		}
	}
}
