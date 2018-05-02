package college;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class student1 {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void stud1() {
		try {
			student1 window = new student1();
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
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				student2 st2=new student2();
				st2.stud2();
			}
		});
		btnNewButton.setBounds(23, 104, 75, 25);
		btnNewButton.setText("Insert");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				student st=new student();
				st.stud();
			}
		});
		btnNewButton_1.setBounds(165, 104, 75, 25);
		btnNewButton_1.setText("Show Items");
		
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				student3 stt=new student3();
				stt.stud3();
			}
		});
		btnNewButton_2.setBounds(326, 104, 75, 25);
		btnNewButton_2.setText("Delete");

	}
}
