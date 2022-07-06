package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

class Test01{
	String s1;
	String s2;
	String s3;
	
	public Test01(String s1, String s2, String s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
}

public class S09_JTable extends JFrame {
	
	public S09_JTable() {
		
		ArrayList<Test01> testList = new ArrayList<Test01>();
		
		for(int i = 0; i < 50; i++) {
			testList.add(new Test01("아메리카노","1500","1"));
		}
		String[][] rowDate = new String[testList.size()][3];
		String[] columnNames = {"Coffee Name", "Price", "Shot"};
		
		for(int i = 0; i < testList.size(); i++) {
			rowDate[i][0] = testList.get(i).s1;
			rowDate[i][1] = testList.get(i).s2;
			rowDate[i][2] = String.valueOf(i);
		}
		
		// JTable은 ScrollPane에 붙여야 제대로 나온다
		JTable table = new JTable(rowDate, columnNames); 
		
		// 특정 컴포넌트를 스크롤 가능한 형태로 보여주기 위해 사용된다
		JScrollPane scPane = new JScrollPane(table); 		
		JButton south = new JButton("South");
		
		//table.setCellSelectionEnabled(false);
		// 테이블 수정 막기
		//table.setEnabled(false);
		
		// 테이블 선택 이벤트
		// ListSelectionModel : 테이블 선택에 관련된 설정을 할 수 있는 모델
		ListSelectionModel selModel = table.getSelectionModel();
		
		TableColumnModel colModel = table.getColumnModel();
		
//		colModel.addColumnModelListener(new TableColumnModelListener() {
//			@Override
//			public void columnSelectionChanged(ListSelectionEvent e) {
//				//System.out.println(e);
//			}
//			@Override
//			public void columnRemoved(TableColumnModelEvent e) {
//			}
//			@Override
//			public void columnMoved(TableColumnModelEvent e) {
//			}
//			@Override
//			public void columnMarginChanged(ChangeEvent e) {
//			}
//			@Override
//			public void columnAdded(TableColumnModelEvent e) {
//			}
//		});
				
		// setSelectionMode : 선택 모드를 설정할 수 있다
		// selModel.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		// CellSelection : 한 셀만 선택할 수 있도록 설정
		table.setCellSelectionEnabled(true);
		
		selModel.addListSelectionListener(table);
		selModel.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				//System.out.println("valueChanged : " + e.getSource());
				//System.out.println("select row : " + table.getSelectedRow());
				//System.out.println("select col : " + table.getSelectedColumn());
				
				//System.out.println("Selected ");
				
				if(e.getValueIsAdjusting()) {
					System.out.println("select row : " + table.getSelectedRow());
					System.out.println("select rows : " + Arrays.toString(table.getSelectedRows()));
					System.out.println("select col : " + table.getSelectedColumn());
					System.out.println("select cols : " + Arrays.toString(table.getSelectedColumns()));
				}else {
					System.out.println("(마우스를 꾹 누르고 조정중)");
				}
			}
		});
		//selModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//System.out.println(selModel.getSelectionMode());
		
		add(scPane, "Center");
		add(south, "South");
		
		// 테이블 내부의 데이터 콘솔에서 보기
		south.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TableModel tm = table.getModel();

				int colCnt = tm.getColumnCount();
				int rowCnt = tm.getRowCount();
				
				System.out.println("컬럼 : " + colCnt);
				System.out.println("행 : " + rowCnt);		
				
				for(int row = 0; row < rowCnt; row++) {
					for(int col = 0; col < colCnt; col++) {
						System.out.print(tm.getValueAt(row, col) + " | ");
					}
					System.out.println();
				}
			}
		});
		
		
		setTitle("JTable");		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(500, 250, 500, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new S09_JTable();
		
	}

}
