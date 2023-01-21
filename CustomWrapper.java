package liveclass;

public class CustomWrapper {
	int num;

	public void setNum(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public String convertToString() {
		return Integer.toString(num);
	}
}
