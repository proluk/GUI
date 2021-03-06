package pl.edu.pjwstk.s8267.GUI.Lab4;

public class FormattedInt implements Justification {

	private int num;
	private int length;

	public FormattedInt(int num, int length) {
		this.num = num;
		this.length = length;
	}

	@Override
	public String justify(int alignment) {
		return (new FormattedString(String.format("%d", (int)num), length)).justify(alignment);
		// return (new FormattedString(""+num,length).justify(alignment);
	}

}
