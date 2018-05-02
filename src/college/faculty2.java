package college;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class faculty2 {
public int deptn;
	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void facty2() {
		try {
			faculty2 window = new faculty2();
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
		
		Label lblName = new Label(shell, SWT.NONE);
		lblName.setBounds(22, 50, 55, 15);
		lblName.setText("Name");
		
		Label lblDepartment = new Label(shell, SWT.NONE);
		lblDepartment.setBounds(22, 96, 70, 15);
		lblDepartment.setText("Department");
		
		Button btnRadioButton = new Button(shell, SWT.RADIO);
		btnRadioButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deptn=1;
			}
		});
		btnRadioButton.setBounds(111, 96, 125, 16);
		btnRadioButton.setText("Computer Science");
		
		Button btnRadioButton_1 = new Button(shell, SWT.RADIO);
		btnRadioButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deptn=2;
			}
		});
		btnRadioButton_1.setBounds(242, 95, 55, 16);
		btnRadioButton_1.setText("Civil");
		
		Button btnRadioButton_2 = new Button(shell, SWT.RADIO);
		btnRadioButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deptn=3;
			}
		});
		btnRadioButton_2.setBounds(313, 96, 90, 16);
		btnRadioButton_2.setText("Biotechnology");
		
		Button btnRadioButton_3 = new Button(shell, SWT.RADIO);
		btnRadioButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deptn=4;
			}
		});
		btnRadioButton_3.setBounds(111, 129, 90, 16);
		btnRadioButton_3.setText("Electricals");
		
		Button btnRadioButton_4 = new Button(shell, SWT.RADIO);
		btnRadioButton_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deptn=5;
			}
		});
		btnRadioButton_4.setBounds(207, 129, 90, 16);
		btnRadioButton_4.setText("Electronics");
		
		Button btnRadioButton_5 = new Button(shell, SWT.RADIO);
		btnRadioButton_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deptn=6;
			}
		});
		btnRadioButton_5.setBounds(313, 129, 90, 16);
		btnRadioButton_5.setText("Mechanical");
		
		Button btnRadioButton_6 = new Button(shell, SWT.RADIO);
		btnRadioButton_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deptn=7;
			}
		});
		btnRadioButton_6.setBounds(111, 161, 125, 16);
		btnRadioButton_6.setText("Information Science");
		
		Button btnSubmit = new Button(shell, SWT.NONE);
	
			btnSubmit.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					Connection connect=null;
					Statement stm=null;
					try {
						Class.forName("com.mysql.jdbc.Driver");
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						connect = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/nittedb", "root",
						"dhanush");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("Connecting succesfully");
					 try {
						stm= connect.createStatement();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					String nam=text.getText().toString();
					
					 try {
						stm.executeUpdate("INSERT INTO `faculty`(Name,Dnum) VALUE ('"+nam+"',"+deptn+")");
					faculty1 ft1=new faculty1();
					ft1.fmain();
					 } catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
		btnSubmit.setBounds(163, 206, 75, 25);
		btnSubmit.setText("Submit");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(111, 50, 76, 21);

	}

}
