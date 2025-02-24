package view;

//import com.toedter.calendar.JDateChooser;
import entity.Exam;
import entity.Student;
import func.ExamManager;
import func.StudentManager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class ExamManagementV extends javax.swing.JFrame {

      private ExamManager examManager;
       private Exam e;
       private int pos = 0;
       
    private StudentManager studentManager;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    // Đường dẫn tới ảnh nền (chỉnh lại theo đúng vị trí file ảnh)
   // private static final String BACKGROUND_IMAGE_PATH = "src/main/resources/c.jpg";
    public ExamManagementV(ExamManager examManager, StudentManager studentManager) {
           this.examManager = examManager;
        this.studentManager = studentManager;
        initComponents();
        viewTable();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setting();
    }

    public ExamManagementV() {
    }
    

   public void setting()
   {
       background panel = new background("src/main/resources/c.jpg",1f);
        panel.setPreferredSize(new Dimension(250, 150));
          jPanel4.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
            jPanel4.add(panel, BorderLayout.CENTER);
           
             background panel2 = new background("src/main/resources/x.jpg",1f);
        panel2.setPreferredSize(new Dimension(250, 150));
          jPanel5.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
            jPanel5.add(panel2, BorderLayout.CENTER);
            
              background panel3 = new background("src/main/resources/bo-suu-tap-hinh-nen-1.jpg",1f);
        panel3.setPreferredSize(new Dimension(1000, 60));
          jPanel3.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
            jPanel3.add(panel3, BorderLayout.CENTER);
            
             background panel4 = new background("src/main/resources/findBtn.jpg",1f);
        panel4.setPreferredSize(new Dimension(90, 60));
          findBtn.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
            findBtn.add(panel4, BorderLayout.CENTER);
            
              background panel5 = new background("src/main/resources/addBtn.jpg",1f);
        panel5.setPreferredSize(new Dimension(90, 60));
          addBtn.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
            addBtn.add(panel5, BorderLayout.CENTER);
            
              background panel6 = new background("src/main/resources/editBtn.jpg",1f);
        panel6.setPreferredSize(new Dimension(90, 60));
          editBtn.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
            editBtn.add(panel6, BorderLayout.CENTER);
            
                  background panel7 = new background("src/main/resources/deleteBtn.jpg",1f);
        panel7.setPreferredSize(new Dimension(90, 60));
          deleteBtn.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
            deleteBtn.add(panel7, BorderLayout.CENTER);
            
   }
    
      
      public void viewTable()
    {
        DefaultTableModel tableModel = (DefaultTableModel) this.examtable.getModel();
        tableModel.setRowCount(0);
        for (Exam exam : examManager.getExams()) {
            Object[] row = {
                dateFormat.format(exam.getDate()), 
                exam.getLocation(), 
                exam.getVehicleCount(), 
                exam.getLicenseType(), 
                exam.getExamForm()
            };
            tableModel.addRow(row);
        }
       
    }
    
    
      public void view()
      {

          e = examManager.getExams().get(pos);
          dateTF.setDate(e.getDate());
          locationTF.setText(e.getLocation());
          vehicleCountTF.setText(""+ e.getVehicleCount());
          licenseTypeTF.setText(e.getLicenseType());
          examFormTF.setText(e.getExamForm());
         
          
         }

   
     
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        findBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        vehicleCountTF = new javax.swing.JTextField();
        licenseTypeTF = new javax.swing.JTextField();
        locationTF = new javax.swing.JTextField();
        examFormTF = new javax.swing.JTextField();
        dateTF = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        examtable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        setTextBtn = new javax.swing.JButton();
        TKBtn = new javax.swing.JButton();
        dataTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(101, 175, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ KÌ THI");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÔNG TIN KÌ THI");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CHỨC NĂNG");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        findBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        findBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(findBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(findBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Ngày thi: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Địa điểm:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Số lượng xe:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Loại bằng:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Hình thức thi: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(locationTF)
                            .addComponent(dateTF, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(vehicleCountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(examFormTF)
                            .addComponent(licenseTypeTF, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(locationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleCountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licenseTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examFormTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        examtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ngày thi", "Địa điểm", "Số lượng xe", "Loại bằng", "Hình thức thi"
            }
        ));
        examtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                examtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(examtable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        setTextBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        setTextBtn.setText("NHẬP  ");
        setTextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setTextBtnActionPerformed(evt);
            }
        });

        TKBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TKBtn.setText("THỐNG KÊ");
        TKBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKBtnActionPerformed(evt);
            }
        });

        dataTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dataTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Số trường hơp thoả mãn các điều kiện là:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(setTextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(TKBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dataTF))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setTextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dataTF, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void examtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_examtableMouseClicked
  pos = this.examtable.getSelectedRow();
        view();
       
    }//GEN-LAST:event_examtableMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
         
           ExamDialog dialog = new ExamDialog(this, "Thêm kỳ thi mới", null);
        dialog.setVisible(true);
        Exam newExam = dialog.getExam();
        if (newExam != null) {
            boolean found = false;
            for (Exam exam : examManager.getExams()) {
                if (exam.getDate().equals(newExam.getDate())
                        && exam.getExamForm().equals(newExam.getExamForm())
                        && exam.getLocation().equals(newExam.getLocation())
                        && exam.getLicenseType().equals(newExam.getLicenseType())) {
                    found = true;
                    break;
                }
            }
            if (found) {
                JOptionPane.showMessageDialog(this, "Kỳ thi đã tồn tại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                examManager.addExam(newExam);
                viewTable();
            }
        }
          
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
 int selectedRow = examtable.getSelectedRow();
        if (selectedRow >= 0) {
            Exam existingExam = examManager.getExams().get(selectedRow);
            ExamDialog dialog = new ExamDialog(this, "Sửa kỳ thi", existingExam);
            dialog.setVisible(true);
            Exam updatedExam = dialog.getExam();
            if (updatedExam != null) {
                examManager.updateExam(selectedRow, updatedExam);
                viewTable();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn kỳ thi để sửa.", "Lỗi", JOptionPane.WARNING_MESSAGE);
        }        
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
         int selectedRow = examtable.getSelectedRow();
        if (selectedRow >= 0){
              e = examManager.getExams().get(pos);
         int confirmation = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa kỳ thi này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
           if (confirmation == JOptionPane.YES_OPTION)
           {
               examManager.deleteExam(e);
               viewTable();
                  dateTF.setDate(null);
          locationTF.setText("");
          vehicleCountTF.setText("");
          licenseTypeTF.setText("");
          examFormTF.setText("");
            
        }
}
else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn kì thi để xóa");
        }
      
               
           
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void setTextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setTextBtnActionPerformed
                       dateTF.setDate(null);
          locationTF.setText("");
         vehicleCountTF.setText("");
          licenseTypeTF.setText("");
          examFormTF.setText("");
          vehicleCountTF.setText("");
          licenseTypeTF.setText("");
          examFormTF.setText("");
          
    }//GEN-LAST:event_setTextBtnActionPerformed

    private void findBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtnActionPerformed
        
         // Lấy ngày, địa điểm, số lượng xe, loại bằng và hình thức thi từ các ô nhập liệu
    String date = (dateTF.getDate() != null) ? dateFormat.format(dateTF.getDate()) : null;
    String location = locationTF.getText().trim();
    String vehicleCount = vehicleCountTF.getText().trim();
    String licenseType = licenseTypeTF.getText().trim();
    String examForm = examFormTF.getText().trim();

    // Tạo dialog và bảng để hiển thị kết quả
    ExamResultDialog resultD = new ExamResultDialog();
    resultD.setVisible(true);
    JTable resultTable = resultD.getResultTable();
    DefaultTableModel tableModel = (DefaultTableModel) resultTable.getModel();
    tableModel.setRowCount(0);

    // Lặp qua danh sách các kỳ thi để tìm kiếm kết quả
    for (Exam exam : examManager.getExams()) {
        boolean dateMatch = (date == null || date.equals(dateFormat.format(exam.getDate())));
        boolean locationMatch = (location.isEmpty() || location.equals(exam.getLocation()));
        boolean vehicleCountMatch = (vehicleCount.isEmpty() || vehicleCount.equals(String.valueOf(exam.getVehicleCount())));
        boolean licenseTypeMatch = (licenseType.isEmpty() || licenseType.equalsIgnoreCase(exam.getLicenseType()));
        boolean examFormMatch = (examForm.isEmpty() || examForm.equalsIgnoreCase(exam.getExamForm()));

        // Kiểm tra điều kiện phù hợp cho ngày, địa điểm, số lượng xe, loại bằng và hình thức thi
        if (dateMatch && locationMatch && vehicleCountMatch && licenseTypeMatch && examFormMatch) {
            Object[] row = {
                dateFormat.format(exam.getDate()),
                exam.getLocation(),
                exam.getVehicleCount(),
                exam.getLicenseType(),
                exam.getExamForm()
            };
            tableModel.addRow(row);
        }
    }

    // Cập nhật bảng kết quả
    resultTable.setModel(tableModel);
    resultD.setResultTable(resultTable);
        
    }//GEN-LAST:event_findBtnActionPerformed

    private void TKBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKBtnActionPerformed
         // Lấy ngày, địa điểm, số lượng xe, loại bằng và hình thức thi từ các ô nhập liệu
    String date = (dateTF.getDate() != null) ? dateFormat.format(dateTF.getDate()) : null;
    String location = locationTF.getText().trim();
    String vehicleCount = vehicleCountTF.getText().trim();
    String licenseType = licenseTypeTF.getText().trim();
    String examForm = examFormTF.getText().trim();

    int number = 0;

    // Lặp qua danh sách các kỳ thi để tìm kiếm kết quả
    for (Exam exam : examManager.getExams()) {
        boolean dateMatch = (date == null || date.equals(dateFormat.format(exam.getDate())));
        boolean locationMatch = (location.isEmpty() || location.equals(exam.getLocation()));
        boolean vehicleCountMatch = (vehicleCount.isEmpty() || vehicleCount.equals(String.valueOf(exam.getVehicleCount())));
        boolean licenseTypeMatch = (licenseType.isEmpty() || licenseType.equalsIgnoreCase(exam.getLicenseType()));
        boolean examFormMatch = (examForm.isEmpty() || examForm.equalsIgnoreCase(exam.getExamForm()));

        // Kiểm tra điều kiện phù hợp cho ngày, địa điểm, số lượng xe, loại bằng và hình thức thi
        if (dateMatch && locationMatch && vehicleCountMatch && licenseTypeMatch && examFormMatch) {
            number++;
        }
    }
       dataTF.setText("" + number);

    }//GEN-LAST:event_TKBtnActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamManagementV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TKBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField dataTF;
    private com.toedter.calendar.JDateChooser dateTF;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField examFormTF;
    private javax.swing.JTable examtable;
    private javax.swing.JButton findBtn;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField licenseTypeTF;
    private javax.swing.JTextField locationTF;
    private javax.swing.JButton setTextBtn;
    private javax.swing.JTextField vehicleCountTF;
    // End of variables declaration//GEN-END:variables
}
