package carte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import agenda.CarteDeTelefon;

public class ActivateInput extends AbstractCarteDeTelefonActionListener  implements
	ActionListener {
	
	public ActivateInput(CarteDeTelefon carteDeTelefon) {
		super(carteDeTelefon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		activareInput();
	}

}
