package fr.karinedias;

@SuppressWarnings("serial")
public class MonException extends IllegalArgumentException {

	private int code;

	public MonException(String msg, int c) {
		super(msg);
		this.code = c;
	}

	public int getCode() {
		return this.code;
	}

}
