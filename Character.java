
public class Character extends Wall {
/// Star Character 생성과 움직임 추적 ////
/// 벽을 만났을 경우 y,x가 변화지 않도록 하고 경고 메시지를 보낸다 //	
	int y=0;
	int x=0;
	char c;
  //boolean wallChk=false; //Wall클래스를 상속하므로 불필요
	char annChk;
	
	public Character(char c) {
		this.c=c; 
	}
	
	public void Star1() {
		//----Space에 character 표시
		AA[y][x] = c;  // 이 s는 this.s
	}
	public char Star(int key) {
	//---- character 동작 제어	
	
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