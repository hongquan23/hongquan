package view;

import entity.Exam;
import entity.Student;
import func.ExamManager;
import func.StudentManager;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class StudentManagementV extends JFrame {
    
    private ExamManager examManager;
    private StudentManager studentManager;
     private Image backgroundImage;
    private int pos;
    private Student s;
     private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    

     public StudentManagementV(StudentManager studentManager) {
        this.examManager = new ExamManager();
        this.studentManager = studentManager;
        initComponents();
        viewTable();
        String x;
        setting();
        hover();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
     
     }
    
    public StudentManagementV() {
        
    }

    public void view()
    {
        Student s = studentManager.getStudents().get(pos);
        nameTF.setText(s.getName());
        cccdTF.setText(s.getCccd());
        typeTF.setText(s.getRegisteredLicenseType());
        dateTF.setDate(s.getExamDate());
        resultTF.setText(s.getResult());
        
    }
 
     
      
      public void viewTable()
    {
        DefaultTableModel tableModel = (DefaultTableModel) this.studenttable.getModel();
        tableModel.setRowCount(0);
        for (Student student:  studentManager.getStudents()) {
            Object[] row = {
                student.getName(), 
                student.getCccd(), 
                student.getRegisteredLicenseType(), 
               dateFormat.format(student.getExamDate()), 
                student.getResult()
            };
            tableModel.addRow(row);
        }
       
    }
    public void setting()
    {
          background panel = new background("src/main/resources/findBtn.jpg",1f);
        panel.setPreferredSize(new Dimension(90, 60));
          findBtn.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
            findBtn.add(panel, BorderLayout.CENTER);
            
              background panel2 = new background("src/main/resources/addBtn.jpg",1f);
        panel2.setPreferredSize(new Dimension(90, 60));
          addBtn.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
            addBtn.add(panel2, BorderLayout.CENTER);
            
              background panel3 = new background("src/main/resources/editBtn.jpg",1f);
        panel3.setPreferredSize(new Dimension(90, 60));
          editBtn.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
            editBtn.add(panel3, BorderLayout.CENTER);
            
                  background panel4 = new background("src/main/resources/deleteBtn.jpg",1f);
        panel4.setPreferredSize(new Dimension(90, 60));
          deleteBtn.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
            deleteBtn.add(panel4, BorderLayout.CENTER);
            
                       background panel5 = new background("src/main/resources/pexels-souvenirpixels-417074.jpg",1f);
        panel5.setPreferredSize(new Dimension(1000, 60));
          jPanel1.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
            jPanel1.add(panel5, BorderLayout.CENTER);
            
    }
      
    public void hover()
    {
        //jLabel9.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinField1 = new com.toedter.components.JSpinField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        cccdTF = new javax.swing.JTextField();
        typeTF = new javax.swing.JTextField();
        dateTF = new com.toedter.calendar.JDateChooser();
        resultTF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        findBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studenttable = new javax.swing.JTable();
        findBtn1 = new javax.swing.JButton();
        TKBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        dataTF = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý học viên");

        jPanel1.setBackground(new java.awt.Color(101, 173, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ HỌC VIÊN");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Họ và tên:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("CCCD:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Loại bằng đăng kí:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Ngày thi: ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Kết quả: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cccdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(typeTF)
                            .addComponent(dateTF, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(resultTF))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGap(4, 4, 4)
                        .addComponent(cccdTF, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(typeTF, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(resultTF)
                                .addGap(6, 6, 6))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        findBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        findBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(findBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÔNG TIN HỌC VIÊN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CHỨC NĂNG");

        studenttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Họ và tên", "CCCD", "Loại bằng đăng kí", "Ngày thi", "Kết quả"
            }
        ));
        studenttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studenttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studenttable);

        findBtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        findBtn1.setText("NHẬP ");
        findBtn1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                findBtn1MouseMoved(evt);
            }
        });
        findBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtn1ActionPerformed(evt);
            }
        });

        TKBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TKBtn.setText("THỐNG KÊ");
        TKBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TKBtnMouseMoved(evt);
            }
        });
        TKBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Số trường hợp thỏa mãn điều kiện là: ");

        dataTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dataTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(findBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(TKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dataTF, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(findBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataTF, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studenttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studenttableMouseClicked
        pos = this.studenttable.getSelectedRow();
        view();
        typeTF.setEditable(true);
          resultTF.setEditable(true);
                           
    
    }//GEN-LAST:event_studenttableMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
             StudentDialog dialog = new StudentDialog(this, "Thêm học viên mới", null);
        dialog.setVisible(true);
        Student newStudent = dialog.getStudent();
        if (newStudent != null) {
            // Kiểm tra xem CCCD đã tồn tại trong danh sách học viên chưa
            if (isDuplicateCCCD(newStudent.getCccd())) {
                JOptionPane.showMessageDialog(this, "CCCD đã tồn tại. Vui lòng nhập CCCD khác.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                // Kiểm tra xem học viên đã được thêm vào một kỳ thi cụ thể hay không
                if (!isExamExist(newStudent.getExamDate(), newStudent.getRegisteredLicenseType())) {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy kỳ thi vào ngày " + dateFormat.format(newStudent.getExamDate()) + " và loại bằng " + newStudent.getRegisteredLicenseType(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Nếu không có lỗi, thêm học viên vào danh sách và cập nhật bảng
                    studentManager.addStudent(newStudent);
                    viewTable();
                }
            }
        }        
    }//GEN-LAST:event_addBtnActionPerformed
 private boolean isDuplicateCCCD(String cccd) {
        for (Student student : studentManager.getStudents()) {
            if (student.getCccd().equals(cccd)) {
                return true;
            }
        }
        return false;
    }
 
   // Kiểm tra xem kỳ thi có tồn tại với ngày và loại bằng đã cho hay không
    private boolean isExamExist(Date date, String licenseType) {
        List<Exam> exams = examManager.searchByDateAndLicenseType(dateFormat.format(date), licenseType);
        return !exams.isEmpty();
    }
    
    private void findBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtnActionPerformed
           // Lấy ngày, tên, CCCD, loại bằng và kết quả từ các ô nhập liệu
    String date = (dateTF.getDate() != null) ? dateFormat.format(dateTF.getDate()) : null;
    String name = nameTF.getText().trim();
    String cccd = cccdTF.getText().trim();
    String type = typeTF.getText().trim();
    String result = resultTF.getText().trim();

    // Tạo dialog và bảng để hiển thị kết quả
    StudentResultDialog resultD = new StudentResultDialog();
    resultD.setVisible(true);
    JTable resultTable = resultD.getResultTable();
    DefaultTableModel tableModel = (DefaultTableModel) resultTable.getModel();
    tableModel.setRowCount(0);

    // Lặp qua danh sách học sinh để tìm kiếm kết quả
    for (Student student : studentManager.getStudents()) {
        boolean dateMatch = (date == null || date.equals(dateFormat.format(student.getExamDate())));
        boolean nameMatch = (name.isEmpty() || name.equalsIgnoreCase(student.getName()));
        boolean cccdMatch = (cccd.isEmpty() || cccd.equals(student.getCccd()));
        boolean typeMatch = (type.isEmpty() || type.equalsIgnoreCase(student.getRegisteredLicenseType()));
        boolean resultMatch = (result.isEmpty() || result.equalsIgnoreCase(student.getResult()));

        // Kiểm tra điều kiện phù hợp cho ngày, tên, CCCD, loại bằng và kết quả
        if (dateMatch && nameMatch && cccdMatch && typeMatch && resultMatch) {
            Object[] row = {
                student.getName(),
                student.getCccd(),
                student.getRegisteredLicenseType(),
                dateFormat.format(student.getExamDate()),
                student.getResult()
            };
            tableModel.addRow(row);
        }
    }

    // Cập nhật bảng kết quả
    resultTable.setModel(tableModel);
    resultD.setResultTable(resultTable);
    
    
    
    
    }//GEN-LAST:event_findBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
         int selectedRow = studenttable.getSelectedRow();
        if (selectedRow >= 0) {
            Student existingStudent = studentManager.getStudents().get(selectedRow);
            StudentDialog dialog = new StudentDialog(this, "Sửa học viên", existingStudent);
            dialog.setVisible(true);
            Student updatedStudent = dialog.getStudent();
            if (updatedStudent != null) {
                // Kiểm tra xem CCCD có trùng với học viên khác không
                boolean isDuplicateCCCD = false;
                for (int i = 0; i < studentManager.getStudents().size(); i++) {
                    if (i != selectedRow && studentManager.getStudents().get(i).getCccd().equals(updatedStudent.getCccd())) {
                        isDuplicateCCCD = true;
                        break;
                    }
                }
                if (isDuplicateCCCD) {
                    JOptionPane.showMessageDialog(this, "CCCD đã tồn tại. Vui lòng nhập CCCD khác.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Kiểm tra xem kỳ thi có tồn tại với ngày và loại bằng đã cho hay không
                    if (!isExamExist(updatedStudent.getExamDate(), updatedStudent.getRegisteredLicenseType())) {
                        JOptionPane.showMessageDialog(this, "Không tìm thấy kỳ thi vào ngày " + dateFormat.format(updatedStudent.getExamDate()) + " và loại bằng " + updatedStudent.getRegisteredLicenseType(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Nếu không có lỗi, cập nhật học viên và bảng
                        studentManager.updateStudent(selectedRow, updatedStudent);
                        viewTable();
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn học viên để sửa");
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
                 int selectedRow = studenttable.getSelectedRow();
        if (selectedRow >= 0){
              s = studentManager.getStudents().get(pos);
       int confirmation = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa kỳ thi này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
           if (confirmation == JOptionPane.YES_OPTION)
           {
               studentManager.deleteStudent(s);
               viewTable();
                  dateTF.setDate(null);
         nameTF.setText("");
          cccdTF.setText("");
          typeTF.setText("");
          resultTF.setText("");
               
           }
}
else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn học viên để xóa");
        }
      
        
       
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void findBtn1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findBtn1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_findBtn1MouseMoved

    private void findBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtn1ActionPerformed
          dateTF.setDate(null);
          nameTF.setText("");
          cccdTF.setText("");
          typeTF.setText("");
          resultTF.setText("");
         typeTF.setText("");
          resultTF.setText("");
        
    }//GEN-LAST:event_findBtn1ActionPerformed

    private void TKBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TKBtnMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TKBtnMouseMoved

    private void TKBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKBtnActionPerformed
 // Lấy ngày, tên, CCCD, loại bằng và kết quả từ các ô nhập liệu
    String date = (dateTF.getDate() != null) ? dateFormat.format(dateTF.getDate()) : null;
    String name = nameTF.getText().trim();
    String cccd = cccdTF.getText().trim();
    String type = typeTF.getText().trim();
    String result = resultTF.getText().trim();

   int number = 0;

    // Lặp qua danh sách học sinh để tìm kiếm kết quả
    for (Student student : studentManager.getStudents()) {
        boolean dateMatch = (date == null || date.equals(dateFormat.format(student.getExamDate())));
        boolean nameMatch = (name.isEmpty() || name.equalsIgnoreCase(student.getName()));
        boolean cccdMatch = (cccd.isEmpty() || cccd.equals(student.getCccd()));
        boolean typeMatch = (type.isEmpty() || type.equalsIgnoreCase(student.getRegisteredLicenseType()));
        boolean resultMatch = (result.isEmpty() || result.equalsIgnoreCase(student.getResult()));

        // Kiểm tra điều kiện phù hợp cho ngày, tên, CCCD, loại bằng và kết quả
        if (dateMatch && nameMatch && cccdMatch && typeMatch && resultMatch) {
          number ++;
        }
    }
          dataTF.setText("" + number);
         
    }//GEN-LAST:event_TKBtnActionPerformed

     
          
    
   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentManagementV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TKBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField cccdTF;
    private javax.swing.JTextField dataTF;
    private com.toedter.calendar.JDateChooser dateTF;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton findBtn;
    private javax.swing.JButton findBtn1;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField resultTF;
    private javax.swing.JTable studenttable;
    private javax.swing.JTextField typeTF;
    // End of variables declaration//GEN-END:variables
}
