import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Color;


public class Panel_Lotniskowca extends JPanel {
	private JLabel lblStanPas;
	private JList listKolejka;
	private JTextField textFieldPasCo;
	private JTextField textFieldPasKto;
	public Panel_Lotniskowca() {
		
		lblStanPas = new JLabel("StanPas");
		lblStanPas.setForeground(Color.RED);
		lblStanPas.setText("Wolny");
		lblStanPas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		listKolejka = new JList();
		
		textFieldPasCo = new JTextField();
		textFieldPasCo.setColumns(10);
		
		textFieldPasKto = new JTextField();
		textFieldPasKto.setColumns(10);
		
		JLabel lblListaOczekujcych = new JLabel("Lista oczekuj\u0105cych");
		
		JLabel lblStanPasa = new JLabel("Stan pasa");
		
		JLabel lblNazwaSamolotu = new JLabel("Nazwa samolotu");
		
		JLabel lblCzynno = new JLabel("Czynno\u015B\u0107");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblStanPasa)
							.addGap(33)
							.addComponent(lblStanPas, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(lblListaOczekujcych)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(listKolejka, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
								.addGap(43)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(textFieldPasCo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNazwaSamolotu))
								.addGap(18)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(lblCzynno)
									.addComponent(textFieldPasKto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(142, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(17)
							.addComponent(lblListaOczekujcych)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(listKolejka, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(42)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNazwaSamolotu)
								.addComponent(lblCzynno))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldPasCo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldPasKto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStanPas, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStanPasa))
					.addContainerGap())
		);
		setLayout(groupLayout);
		
	}
	public JLabel getLblStanPas() {
		return lblStanPas;
	}
	public JList getListKolejka() {
		return listKolejka;
	}
	public JTextField getTextFieldPasCo() {
		return textFieldPasCo;
	}
	public JTextField getTextFieldPasKto() {
		return textFieldPasKto;
	}
}
