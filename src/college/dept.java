package college;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class dept {

	protected Shell shlDepartments;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void department() {
		try {
			dept window = new dept();
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
		shlDepartments.open();
		shlDepartments.layout();
		while (!shlDepartments.isDisposed()) {
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
		shlDepartments = new Shell();
		shlDepartments.setBackground(SWTResourceManager.getColor(240, 230, 140));
		shlDepartments.setSize(450, 300);
		shlDepartments.setText("Departments");
		
		Button btnCivil = new Button(shlDepartments, SWT.NONE);
		btnCivil.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			dispdeptstud dp=new dispdeptstud();
			dp.disp(2);
			
			}
		});
		btnCivil.setBounds(10, 26, 75, 25);
		btnCivil.setText("Civil");
		
		Button btnComputerScience = new Button(shlDepartments, SWT.NONE);
		btnComputerScience.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispdeptstud dp=new dispdeptstud();
				dp.disp(1);
			}
		});
		btnComputerScience.setBounds(10, 57, 109, 25);
		btnComputerScience.setText("Computer Science");
		
		Button btnBiotechnology = new Button(shlDepartments, SWT.NONE);
		btnBiotechnology.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispdeptstud dp=new dispdeptstud();
				dp.disp(3);
			}
		});
		btnBiotechnology.setBounds(10, 88, 94, 25);
		btnBiotechnology.setText("Biotechnology");
		
		Button btnMechanical = new Button(shlDepartments, SWT.NONE);
		btnMechanical.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispdeptstud dp=new dispdeptstud();
				dp.disp(6);
			}
		});
		btnMechanical.setBounds(10, 119, 75, 25);
		btnMechanical.setText("Mechanical");
		
		Button btnElectrical = new Button(shlDepartments, SWT.NONE);
		btnElectrical.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispdeptstud dp=new dispdeptstud();
				dp.disp(4);
			}
		});
		btnElectrical.setBounds(10, 150, 75, 25);
		btnElectrical.setText("Electrical");
		
		Button btnElectronics = new Button(shlDepartments, SWT.NONE);
		btnElectronics.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispdeptstud dp=new dispdeptstud();
				dp.disp(5);
			}
		});
		btnElectronics.setBounds(10, 181, 75, 25);
		btnElectronics.setText("Electronics");
		
		Button btnInformationScience = new Button(shlDepartments, SWT.NONE);
		btnInformationScience.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispdeptstud dp=new dispdeptstud();
				dp.disp(7);
			}
		});
		btnInformationScience.setBounds(10, 215, 123, 25);
		btnInformationScience.setText("Information Science");
		
		
		
	}

}
