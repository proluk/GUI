package pl.edu.pjwstk.s8267.GUI.Lab3;

public class RasowyPies extends Pies {
	protected static final String header = "-------------------------------\n Pies rasowy\n -------------------------------";
	
	private String rasa;
	private String imieOjca;
	private String imieMatki;

	public RasowyPies(int id, String rasa, String imie, String kolor, int wiek, String imieOjca, String imieMatki, String imieWlasciciela,
			String nazwiskoWlasciciela) {
		super(id, imie, kolor, wiek, imieWlasciciela, nazwiskoWlasciciela);
		this.rasa = rasa;
		this.imieOjca = imieOjca;
		this.imieMatki = imieMatki;
	}
	
	public String toString() {
		return super.toString();
	}

}