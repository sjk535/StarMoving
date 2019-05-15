
public class Charactor extends Wall {
/// Star Character 생성과 움직임 추적 ////
/// 벽을 만났을 경우 y,x가 변화지 않도록 하고 경고 메시지를 보낸다 //	
	int y=0;
	int x=0;
	char s;
	boolean chkR=false;
	char AnnChk;
	
	public Charactor(char s) {
		this.s=s; 
	}
	
	public void Star1() {
		//----Space에 charactor 표시
		AA[y][x] = s;  // 이 s는 this.s
	}
	public char Star(int key) {
	//---- charactor 동작 제어	
	
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