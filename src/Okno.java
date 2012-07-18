import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;


public class Okno extends JFrame {

	private JPanel contentPane;
	private static Panel_Lotniskowca panelLot;
	private static ArrayList<PanelSamolot> panelSamoloty;
	private static GrupaSamolotow panel_Samoloty;
	private static PanelSamolot p1;
	private static PanelSamolot p2;
	private static PanelSamolot p3,p4;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Okno frame = new Okno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Okno() {
		panelLot = new Panel_Lotniskowca();
		panelSamoloty = new  ArrayList<PanelSamolot>();
		p1 = new PanelSamolot();
		panelSamoloty.add(p1);
		Samolot s1 = new Samolot("Boing",60,p1,panelLot);
		Thread t1 = new Thread(s1);
		t1.start();
		p2 = new PanelSamolot();
		panelSamoloty.add(p2);
		Samolot s2 = new Samolot("f16",30,p2,panelLot);
		Thread t2 = new Thread(s2);
		t2.start();
		
		p3 = new PanelSamolot();
		panelSamoloty.add(p3);
		Samolot s3 = new Samolot("Bodzio",55,p3,panelLot);
		Thread t3 = new Thread(s3);
		t3.start();
		
		
		p4 = new PanelSamolot();
		panelSamoloty.add(p4);
		Samolot s4 = new Samolot("AirForce",70,p4,panelLot);
		Thread t4 = new Thread(s4);
		t4.start();
		panel_Samoloty = new  GrupaSamolotow(panelSamoloty);
		
		panel_Samoloty = new  GrupaSamolotow(panelSamoloty);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	
		JSplitPane splitPane = new JSplitPane();
		splitPane.setPreferredSize(new Dimension(183, 40));
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setBounds(10, 11, 560, 405);
		contentPane.add(splitPane);
		splitPane.setLeftComponent(panelLot);
		splitPane.setRightComponent(panel_Samoloty);
		
		
	}
}
