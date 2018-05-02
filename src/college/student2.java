package college;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Group;

public class student2 {
public int deptno;
public String depttext, usn,name,age,sex;
	protected Shell shell;
	private Text text;
	private Label lblName;
	private Text text_1;
	private Label lblSex;
	private Text text_2;
	private Label lblNewLabel_1;
	private Button btnSubmit;
	private Button btnRadioButton_4;
	private Button btnRadioButton_5;
	private Label lblNewLabel_2;
	private Text text_3;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void stud2() {
		try {
			student2 window = new student2();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public void open() throws SQLException, ClassNotFoundException {
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
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() throws SQLException, ClassNotFoundException {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(133, 7, 76, 21);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(29, 10, 55, 15);
		lblNewLabel.setText("USN");
		
		lblName = new Label(shell, SWT.NONE);
		lblName.setBounds(29, 45, 55, 15);
		lblName.setText("Name");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(133, 42, 76, 21);
		
		lblSex = new Label(shell, SWT.NONE);
		lblSex.setBounds(29, 132, 55, 15);
		lblSex.setText("Age");
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(133, 129, 76, 21);
		
		lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(29, 168, 70, 15);
		lblNewLabel_1.setText("Department");
		
		Button btnRadioButton = new Button(shell, SWT.RADIO);
		btnRadioButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deptno=1;
				depttext="Computer Science";
			}
		});
		btnRadioButton.setBounds(119, 167, 90, 16);
		btnRadioButton.setText("Computer Science");
		
		Button btnRadioButton_1 = new Button(shell, SWT.RADIO);
		btnRadioButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deptno=2;
				depttext="Civil";
			}
		});
		btnRadioButton_1.setBounds(229, 167, 90, 16);
		btnRadioButton_1.setText("Civil");
		
		Button btnRadioButton_2 = new Button(shell, SWT.RADIO);
		btnRadioButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deptno=3;
				depttext="Biotechnology";
			}
		});
		btnRadioButton_2.setBounds(229, 202, 90, 16);
		btnRadioButton_2.setText("Biotechnology");
		
		Button btnRadioButton_3 = new Button(shell, SWT.RADIO);
		btnRadioButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deptno=4;
				depttext="Electrical";
			}
		});
		btnRadioButton_3.setBounds(119, 202, 90, 16);
		btnRadioButton_3.setText("Electrical");
		
		
		btnSubmit = new Button(shell, SWT.NONE);
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
				 usn=text.getText().toString();
				name=text_1.getText().toString();
				  age=text_2.getText().toString();
				 sex=text_3.getText().toString();
				 try {
					stm.executeUpdate("INSERT INTO `student`(USN,Name,Age,Sex,Dname,Dnum) VALUE ('"+usn+"','"+name+"','"+age+"','"+sex+"','"+depttext+"',"+deptno+")");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnSubmit.setBounds(133, 224, 75, 25);
		btnSubmit.setText("Submit");
		
		btnRadioButton_4 = new Button(shell, SWT.RADIO);
		btnRadioButton_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deptno=5;
				depttext="Electronics";
			}
		});
		btnRadioButton_4.setBounds(325, 167, 90, 16);
		btnRadioButton_4.setText("Electronics");
		
		btnRadioButton_5 = new Button(shell, SWT.RADIO);
		btnRadioButton_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deptno=6;
				depttext="Mechanical";
			}
		});
		btnRadioButton_5.setBounds(325, 202, 90, 16);
		btnRadioButton_5.setText("Mechanical");
		
		lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(29, 85, 55, 15);
		lblNewLabel_2.setText("Sex");
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(133, 82, 76, 21);
		
		

	}
}
