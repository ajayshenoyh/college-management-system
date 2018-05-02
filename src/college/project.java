package college;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class project {

	protected Shell shlWelcomeToNmamit;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			project window = new project();
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
		shlWelcomeToNmamit.open();
		shlWelcomeToNmamit.layout();
		while (!shlWelcomeToNmamit.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlWelcomeToNmamit = new Shell();
		shlWelcomeToNmamit.setImage(SWTResourceManager.getImage("C:\\college\\nitte.jpg"));
		shlWelcomeToNmamit.setBackground(SWTResourceManager.getColor(189, 183, 107));
		shlWelcomeToNmamit.setSize(767, 458);
		shlWelcomeToNmamit.setText("Welcome to NMAMIT");
		
		Label label = new Label(shlWelcomeToNmamit, SWT.CENTER);
		label.setImage(SWTResourceManager.getImage("C:\\college\\nitte.jpg"));
		label.setBounds(60, 34, 636, 333);
		
		Label lblWelcomeToNmamit = new Label(shlWelcomeToNmamit, SWT.WRAP | SWT.CENTER);
		lblWelcomeToNmamit.setBackground(SWTResourceManager.getColor(189, 183, 107));
		lblWelcomeToNmamit.setFont(SWTResourceManager.getFont("Broadway", 30, SWT.BOLD));
		lblWelcomeToNmamit.setBounds(114, 368, 471, 41);
		lblWelcomeToNmamit.setText("Welcome to NMAMIT");
		
		Button btnNewButton = new Button(shlWelcomeToNmamit, SWT.NONE);
		btnNewButton.setGrayed(true);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				about ab=new about();
				ab.newscreen();
			}
		});
		btnNewButton.setBounds(0, 2, 75, 25);
		btnNewButton.setText("About");
		
		Button btnDepartments = new Button(shlWelcomeToNmamit, SWT.NONE);
		btnDepartments.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dept dp=new dept();
				dp.department();
			}
		});
		btnDepartments.setBounds(75, 2, 80, 25);
		btnDepartments.setText("Departments");
		
		Button btnFaculty = new Button(shlWelcomeToNmamit, SWT.NONE);
		btnFaculty.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				faculty1 ft=new faculty1();
				ft.fmain();
			}
		});
		btnFaculty.setBounds(155, 2, 75, 25);
		btnFaculty.setText("Faculty");
		
		Button btnStudents = new Button(shlWelcomeToNmamit, SWT.NONE);
		btnStudents.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				student1 st=new student1();
				st.stud1();
			}
		});
		btnStudents.setBounds(230, 2, 75, 25);
		btnStudents.setText("Students");
		
		Button btnContactDetails = new Button(shlWelcomeToNmamit, SWT.NONE);
		btnContactDetails.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				contact cd = new contact();
				cd.screen();
			}
		});
		btnContactDetails.setBounds(305, 3, 92, 25);
		btnContactDetails.setText("Contact Details");
		

	}
}
