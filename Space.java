public class Space {
///////// 2�����迭 ���� : AA�� �ʱ�ȭ///////////////
	static char AA[][]; 
	static int N=0;  
	char BackG;
	
	public Space() {
	}

	public Space(int N, char BackG) {
		//------ Space�� ũ�� ����-----------
		if (N < 5)
			this.N = 5;
		else
			this.N = N; 
		AA= new char[this.N][this.N];
		this.BackG=BackG;
	}	
	public void SpaceIni() {
		//------- Space�� ��� �׸��� (BackG)---		
		for (int i = 0; i < AA.length; i++) {
			for (int j = 0; j < AA[0].length; j++) {
				AA[i][j] = BackG;
				if (!((BackG=='.')||(BackG=='*'))) BackG++;			
			}
		}
	}
}
