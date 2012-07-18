import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class Samolot extends JPanel implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String stan;
	private Integer poziomPaliwa;
	private String nazwa;
	private Integer maxPaliwo;
	private Double rezerwa;
	private PanelSamolot p;
	private boolean rezerwaBln = false;
	private KontrolerLotniskowca kl;
	private Panel_Lotniskowca pl;

	public Samolot(String nazwa, Integer maxPaliwo, final PanelSamolot p,
			Panel_Lotniskowca pl) {
		this.nazwa = nazwa;
		this.pl = pl;
		kl = new KontrolerLotniskowca(pl, this);
		this.p = p;
		this.poziomPaliwa = maxPaliwo;
		this.rezerwa = maxPaliwo * 0.2;
		this.maxPaliwo = maxPaliwo;

		p.getLblNazwa().setText(nazwa);
		p.getLblStan().setText("Fruwa");
		p.getTfStanPaliwo().setText(Integer.toString(maxPaliwo));

	}

	public void run() {
		while (poziomPaliwa-- > 0) {
			p.getTfStanPaliwo().setText(Integer.toString(poziomPaliwa));

			if ((rezerwaBln == false) && (poziomPaliwa <= rezerwa)) {
				p.getLblStan().setText("Oczekuje na l¹dwoanie ");
				KontrolerLotniskowca.getKolejka().add(nazwa);
				pl.getListKolejka().setListData(
				KontrolerLotniskowca.getKolejka());
				KontrolerLotniskowca.setRezerwaGl(true);
				//this.rezerwaBln = true;
				try {
					if (pl.getLblStanPas().getText() == "Wolny") {
						KontrolerLotniskowca.getKolejka().remove(0);
						
						KontrolerLotniskowca.setRezerwaGl(false);
						kl.laduj();
						
						
						
						
					}

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			if (poziomPaliwa <= 0) {
				p.getLblStan().setText("Spadl");
				KontrolerLotniskowca.setRezerwaGl(false);
			}

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void tankuj() throws InterruptedException {
		while (poziomPaliwa <= maxPaliwo) {
			poziomPaliwa++;
			p.getTfStanPaliwo().setText(Integer.toString(poziomPaliwa));
			Thread.sleep(150);
			p.getLblStan().setText("Tankuje...");
			

			
		}

		this.rezerwaBln = false;
	}

	public void ladowanie() throws InterruptedException {
		pl.getLblStanPas().setText("Zajety");
		pl.getTextFieldPasKto().setText(nazwa);
		pl.getTextFieldPasCo().setText("L¹duje");
		p.getLblStan().setText("L¹duje");
		Thread.sleep(3000);
		pl.getTextFieldPasKto().setText("");
		pl.getTextFieldPasCo().setText("");
		pl.getLblStanPas().setText("Wolny");

	}

	public void startowanie() throws InterruptedException {

		pl.getLblStanPas().setText("Zajety");
		pl.getTextFieldPasKto().setText(nazwa);
		pl.getTextFieldPasCo().setText("Startuje");
		p.getLblStan().setText("Startuje");
		Thread.sleep(3000);
		pl.getTextFieldPasKto().setText("");
		pl.getTextFieldPasCo().setText("");
		pl.getLblStanPas().setText("Wolny");
		p.getLblStan().setText("Fruwa");

	}
	public void oczekiwanie () throws InterruptedException {
		
		Thread.sleep(50);
		p.getLblStan().setText("Oczekuje na start");
		
		
		
	}
}
