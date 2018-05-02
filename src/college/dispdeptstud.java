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

public class dispdeptstud {



private Table table;

private static Connection connect;
private static Statement statement;
private static ResultSet resultSet;
	protected Shell shlStudents;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void disp(int text) {
		try {
			dispdeptstud window = new dispdeptstud();
			window.open(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open(int f) {
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
		switch(f)
		{
		case 1 : 
			
			resultSet = statement
			.executeQuery("Select * from student where Dnum='1'");
			break;
				
		
		case 2 : 
			resultSet = statement
					.executeQuery("Select * from student where Dnum='2'");
					break;
						
		case 3 : 
			resultSet = statement
					.executeQuery("Select * from student where Dnum='3'");
					break;
					
		case 4 : resultSet = statement
				.executeQuery("Select * from student where Dnum='4'");
		case 5 : 
			resultSet = statement
					.executeQuery("Select * from student where Dnum='5'");
					break;
					
		case 6 : resultSet = statement
				.executeQuery("Select * from student where Dnum='6'");
				break;
					}
		
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
			tblclmnNos.setText("USN");
			}
			{
			TableColumn tblclmnEno = new TableColumn(table, SWT.NONE);
			tblclmnEno.setWidth(100);
			tblclmnEno.setText("Name");
			}
			{
			TableColumn tblclmnEname = new TableColumn(table, SWT.NONE);
			tblclmnEname.setWidth(100);
			tblclmnEname.setText("Age");
			}
			{
			TableColumn tblclmnAge = new TableColumn(table, SWT.NONE);
			tblclmnAge.setWidth(100);
			tblclmnAge.setText("Sex");
			}
			{
			TableColumn tblclmnPosition = new TableColumn(table, SWT.NONE);
			tblclmnPosition.setWidth(100);
			tblclmnPosition.setText("Department Name");
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