
public class Character extends Wall {
/// Star Character ������ ������ ���� ////
/// ���� ������ ��� y,x�� ��ȭ�� �ʵ��� �ϰ� ��� �޽����� ������ //	
	int y=0;
	int x=0;
	char c;
  //boolean wallChk=false; //WallŬ������ ����ϹǷ� ���ʿ�
	char annChk;
	
	public Character(char c) {
		this.c=c; 
	}
	
	public void Star1() {
		//----Space�� character ǥ��
		AA[y][x] = c;  // �� s�� this.s
	}
	public char Star(int key) {
	//---- character ���� ����	
	
		WallCheck(key, y, x);
		
		if (wallChkR==false) {
			switch (key) {		
				case 8: y--; break;
				case 2: y++; break;
				case 4: x--; break;
				case 6: x++; break;
			}
			annChk='O';
		}
		else annChk='R';

		return annChk;
	
	}
}