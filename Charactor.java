
public class Charactor extends Wall {
/// Star Character ������ ������ ���� ////
/// ���� ������ ��� y,x�� ��ȭ�� �ʵ��� �ϰ� ��� �޽����� ������ //	
	int y=0;
	int x=0;
	char s;
	boolean chkR=false;
	char AnnChk;
	
	public Charactor(char s) {
		this.s=s; 
	}
	
	public void Star1() {
		//----Space�� charactor ǥ��
		AA[y][x] = s;  // �� s�� this.s
	}
	public char Star(int key) {
	//---- charactor ���� ����	
	
		chkR=WallCheck(key, y, x);
		
		if (chkR==false) {
			switch (key) {		
				case 8: y--; break;
				case 2: y++; break;
				case 4: x--; break;
				case 6: x++; break;
			}
			AnnChk='O';
		}
		else AnnChk='R';

		return AnnChk;
	
	}
}