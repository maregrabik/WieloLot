import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class PanelSamolot extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  JLabel lblStan;
	private  JLabel lblNazwa;
	private  JTextField tfStanPaliwo;
	
	
	
	public JLabel getLblStan() {
		return lblStan;
	}

	public JLabel getLblNazwa() {
		return lblNazwa;
	}

	public  JTextField getTfStanPaliwo() {
		return tfStanPaliwo;
	}

	

	/**
	 * Create the panel.
	 */
	public PanelSamolot() {
		
		lblNazwa = new JLabel("New label");
		
		lblStan = new JLabel("New label");
		
		JLabel lblIloscPaliwa = new JLabel("IlePaliwa");
		
		tfStanPaliwo = new JTextField();
		tfStanPaliwo.setColumns(4);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNazwa)
						.addComponent(lblIloscPaliwa))
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(tfStanPaliwo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStan))
					.addContainerGap(280, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNazwa)
						.addComponent(lblStan))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIloscPaliwa)
						.addComponent(tfStanPaliwo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(243, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
