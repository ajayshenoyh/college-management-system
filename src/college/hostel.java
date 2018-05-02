package college;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;

public class hostel {

	protected Shell shlHostel;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void host() {
		try {
			hostel window = new hostel();
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
		shlHostel.open();
		shlHostel.layout();
		while (!shlHostel.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlHostel = new Shell();
		shlHostel.setBackground(SWTResourceManager.getColor(255, 182, 193));
		shlHostel.setSize(450, 300);
		shlHostel.setText("Hostel");
		
		Label lblNewLabel = new Label(shlHostel, SWT.NONE);
		lblNewLabel.setBackground(SWTResourceManager.getColor(255, 218, 185));
		lblNewLabel.setBounds(10, 10, 414, 159);
		lblNewLabel.setText("About the hostel");
		
		Label lblNewLabel_1 = new Label(shlHostel, SWT.NONE);
		lblNewLabel_1.setBounds(10, 179, 127, 72);
		lblNewLabel_1.setText("pics");
		
		Label lblPics = new Label(shlHostel, SWT.NONE);
		lblPics.setBounds(143, 179, 140, 72);
		lblPics.setText("pics");
		
		Label lblPics_1 = new Label(shlHostel, SWT.NONE);
		lblPics_1.setBounds(289, 179, 121, 71);
		lblPics_1.setText("pics");

	}

}
