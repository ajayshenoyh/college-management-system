package college;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class student {



private Table table;

private static Connection connect;
private static Statement statement;
private static ResultSet resultSet;
	protected Shell shlStudents;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void stud() {
		try {
			student window = new student();
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
		Shell shell = new Shell();
		shell.setLayout(new GridLayout(1, false));
		shell.setSize(450, 300);
		shell.setText("SWT Application");
	
		{
		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION
		| SWT.VIRTUAL);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setItemCount(1);
		table.addListener(SWT.SetData, new Listener() {
		public void handleEvent(Event event) {
		table.setItemCount(0);
		try {
		Class.forName("com.mysql.jdbc.Driver");
		connect = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/nittedb", "root",
		"dhanush");
		System.out.println("Connecting succesfully");
		statement = connect.createStatement();
		resultSet = statement
		.executeQuery("Select * from student");
		while (resultSet.next()) {
		TableItem item = new TableItem(table, SWT.NONE);
		item.setText(new String[] { resultSet.getString(1),
		resultSet.getString(2),
		resultSet.getString(3),
		resultSet.getString(4),
		resultSet.getString(5),resultSet.getString(6) });
		}
		connect.close();
		} catch (Exception e) {
		System.out.println("Cannot connect to database server");
		}

		}
		});

		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,
		1));
		{
		TableColumn tblclmnNos = new TableColumn(table, SWT.NONE);
		tblclmnNos.setWidth(100);
		tblclmnNos.setText("USns");
		}
		{
		TableColumn tblclmnEno = new TableColumn(table, SWT.NONE);
		tblclmnEno.setWidth(100);
		tblclmnEno.setText("Name");
		}
		{
		TableColumn tblclmnEname = new TableColumn(table, SWT.NONE);
		tblclmnEname.setWidth(100);
		tblclmnEname.setText("Age ");
		}
		{
		TableColumn tblclmnAge = new TableColumn(table, SWT.NONE);
		tblclmnAge.setWidth(100);
		tblclmnAge.setText("Sex");
		}
		{
		TableColumn tblclmnPosition = new TableColumn(table, SWT.NONE);
		tblclmnPosition.setWidth(100);
		tblclmnPosition.setText("Department Name);
		}
		{
			TableColumn tblclmnPosition1 = new TableColumn(table, SWT.NONE);
			tblclmnPosition1.setWidth(100);
			tblclmnPosition1.setText("Department Number");
			}

		}

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
		if (!display.readAndDispatch()) {
		display.sleep();
		}
		}
		}

				}