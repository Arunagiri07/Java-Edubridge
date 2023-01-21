package liveclass;

public class TestCustomWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomWrapper wrapper = new CustomWrapper();
		wrapper.setNum(100);
		String value = wrapper.convertToString();
		System.out.println(value);
	}

}
