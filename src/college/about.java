package college;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

public class about {

	protected Shell shlAboutNmamit;

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public static void newscreen() {
		try {
			about window = new about();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlAboutNmamit.open();
		shlAboutNmamit.layout();
		while (!shlAboutNmamit.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlAboutNmamit = new Shell();
		shlAboutNmamit.setBackground(SWTResourceManager.getColor(216, 191, 216));
		shlAboutNmamit.setSize(673, 413);
		shlAboutNmamit.setText("About NMAMIT");

	}

}
