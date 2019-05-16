public class Space {
///////// 2차원배열 바탕 : AA의 초기화///////////////
	static char AA[][]; 
	static int N=0;  
	char backG;
	
	public Space() {
	}

	public Space(int N, char BackG) {
		//------ Space의 크기와 바탕 모양 지정-----------
		if (N < 5)
			this.N = 5;
		else
			this.N = N; 
		AA= new char[this.N][this.N];
		this.backG=BackG;
	}	
	public void SpaceIni() {
		//------- Space의 모양 그리기 (BackG)---		
		for (int i = 0; i < AA.length; i++) {
			for (int j = 0; j < AA[0].length; j++) {
				AA[i][j] = backG;
				if (!((backG=='.')||(backG=='*'))) backG++;			
			}
		}
	}
}
