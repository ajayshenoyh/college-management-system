package college;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;

public class Placement {

	protected Shell shell;
	private Text text;
	private Text txtPlacements;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void pl() {
		try {
			Placement window = new Placement();
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
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		text = new Text(shell, SWT.BORDER);
		text.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		text.setBounds(51, 65, 339, 156);
		
		txtPlacements = new Text(shell, SWT.BORDER);
		txtPlacements.setForeground(SWTResourceManager.getColor(SWT.COLOR_CYAN));
		txtPlacements.setText("Placements");
		txtPlacements.setBounds(10, 23, 76, 21);

	}

}
