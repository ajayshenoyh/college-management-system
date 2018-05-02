package college;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class faculty1 {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void fmain() {
		try {
			faculty1 window = new faculty1();
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
	 * @wbp.parser.entryPoint
	 */
	
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Button btnInsert = new Button(shell, SWT.NONE);
		btnInsert.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				faculty2 ft2=new faculty2();
				ft2.facty2();
			}
		});
		btnInsert.setBounds(29, 105, 75, 25);
		btnInsert.setText("Insert");
		
		Button btnShowTeachers = new Button(shell, SWT.NONE);
		btnShowTeachers.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				faculty ft = new faculty();
				ft.facty();
			}
		});
		btnShowTeachers.setBounds(193, 105, 90, 25);
		btnShowTeachers.setText("Show Teachers");
		
		Button btnDelete = new Button(shell, SWT.NONE);
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				faculty3 ft3= new faculty3();
				ft3.facty3();
				}
		});
		btnDelete.setBounds(336, 105, 75, 25);
		btnDelete.setText("Delete");
		
	
	}
}
		
		

