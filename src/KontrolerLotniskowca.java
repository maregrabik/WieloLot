import java.util.Vector;

public class KontrolerLotniskowca {

	private String pasStan;
	private Samolot s;
	private static Vector<String> kolejka;
	private static boolean rezerwaGl = false ;

	

	public KontrolerLotniskowca(final Panel_Lotniskowca pl, final Samolot s) {
		this.pasStan = pl.getLblStanPas().getText();
		this.s = s;
		kolejka = new Vector<String>();
	}


	/*
	 * bnvnvbnvb opis
	 * 
	 */
	public  void laduj() throws InterruptedException {

		if (pasStan == "Wolny") {
			synchronized(s){
			s.ladowanie();
			
			
			}}
			s.tankuj();
			while(rezerwaGl==true && pasStan == "Wolny" ){s.oczekiwanie();}
			synchronized(s){s.startowanie();}
		
		

	}
	public static Vector<String> getKolejka() {
		return kolejka;
	}

	public static boolean isRezerwaGl() {
		return rezerwaGl;
	}


	public static void setRezerwaGl(boolean rezerwaGl) {
		KontrolerLotniskowca.rezerwaGl = rezerwaGl;
	}

}
