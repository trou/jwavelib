package gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class UnLoadModuleAction extends AbstractAction {

	private int moduleIndex;
	private MainWindow parent;
	
	public UnLoadModuleAction(MainWindow parent, int modInd) {
		super("UnLoad");
		
		this.moduleIndex = modInd;
		this.parent = parent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.parent.unloadModule(this.moduleIndex);

	}

}
