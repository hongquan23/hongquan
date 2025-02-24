package view;

import entity.Exam;
import entity.Student;
import entity.Vehicle;
import func.VehicleManager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;
public class VehicleManagementV extends javax.swing.JFrame {

    private VehicleManager vehicleManager;
    private int pos = 0;
    private Vehicle v;
    
    
      public VehicleManagementV(VehicleManager vehicleManager) {
        this.vehicleManager = vehicleManager;
        initComponents();
        viewTable();
        
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setting();
      }
      
    public VehicleManagementV() {
        
    }
    
    
    
    public void setting()
    {
         background panel5 = new background("src/main/resources/vehicleBG.jpg",1f);
        panel5.setPreferredSize(new Dimension(1000, 80));
          jPanel1.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
          jPanel1.add(panel5, BorderLayout.CENTER);
                 background panel = new background("src/main/resources/findBtn.jpg",1f);
        panel.setPreferredSize(new Dimension(100, 60));
          findBtn.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
            findBtn.add(panel, BorderLayout.CENTER);
            
              background panel2 = new background("src/main/resources/addBtn.jpg",1f);
        panel2.setPreferredSize(new Dimension(100, 60));
          addBtn.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
            addBtn.add(panel2, BorderLayout.CENTER);
            
              background panel3 = new background("src/main/resources/editBtn.jpg",1f);
        panel3.setPreferredSize(new Dimension(100, 60));
          editBtn.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
            editBtn.add(panel3, BorderLayout.CENTER);
            
                  background panel4 = new background("src/main/resources/deleteBtn.jpg",1f);
        panel4.setPreferredSize(new Dimension(100, 60));
          deleteBtn.setLayout(new BorderLayout()); // TinitComponentshiết lập layout
            deleteBtn.add(panel4, BorderLayout.CENTER);
    }

      public void viewTable()
    {
        DefaultTableModel tableModel = (DefaultTableModel) this.vehicletable.getModel();
        tableModel.setRowCount(0);
        for (Vehicle vehicle : vehicleManager.getVehicles()) {
            Object[] row = {
                vehicle.getVehicleNumber(),
                vehicle.getVehicleInfo(),
                vehicle.getExamAssigned()
            };
            tableModel.addRow(row);
        }
       
    }
      
       public void view()
      {

          v = vehicleManager.getVehicles().get(pos);
          numberTF.setText(v.getVehicleNumber());
          informationTF.setText(v.getVehicleInfo());
          typeTF.setText(v.getExamAssigned());
          
         
          
         }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numberTF = new javax.swing.JTextField();
        informationTF = new javax.swing.JTextField();
        typeTF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        findBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        vehicletable = new javax.swing.JTable();
        searchBtn1 = new javax.swing.JButton();
        TKBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        dataTF = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ XE");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUẢN LÝ XE");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CHỨC NĂNG");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Biển số xe: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Thông tin xe: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Phục vụ bài thi:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(numberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(typeTF))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(informationTF)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(informationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        findBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });

        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBtn)
                    .addComponent(editBtn)
                    .addComponent(addBtn)
                    .addComponent(findBtn))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(findBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        vehicletable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Biển số xe", "Thông tin xe", "Phục vụ bài thi"
            }
        ));
        vehicletable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehicletableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(vehicletable);

        searchBtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchBtn1.setText("NHẬP");
        searchBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn1ActionPerformed(evt);
            }
        });

        TKBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TKBtn.setText("THỐNG KÊ");
        TKBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Số trường hợp thỏa mãn điều kiện là:");

        dataTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dataTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(searchBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(TKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(dataTF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataTF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vehicletableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehicletableMouseClicked
         pos = this.vehicletable.getSelectedRow();
        view();
    }//GEN-LAST:event_vehicletableMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
                int selectedRow = vehicletable.getSelectedRow();
        if (selectedRow >= 0){
              
         int confirmation = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa kỳ thi này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
           if (confirmation == JOptionPane.YES_OPTION)
           {
               vehicleManager.deleteVehicle(selectedRow);
              viewTable();
                  
          numberTF.setText("");
          informationTF.setText("");
          typeTF.setText("");
          
            
        }
}
else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn xe để xóa");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
     int selectedRow = vehicletable.getSelectedRow();
        if (selectedRow >= 0) {
            Vehicle existingVehicle = vehicleManager.getVehicles().get(selectedRow);
            VehicleDialog dialog = new VehicleDialog(this, "Sửa xe", existingVehicle);
            dialog.setVisible(true);
            Vehicle updatedVehicle = dialog.getVehicle();
            if (updatedVehicle != null) {
                if (!existingVehicle.getVehicleNumber().equals(updatedVehicle.getVehicleNumber()) && vehicleManager.isDuplicateVehicleNumber(updatedVehicle.getVehicleNumber())) {
                    JOptionPane.showMessageDialog(this, "Biển số xe đã tồn tại. Vui lòng nhập biển số xe khác.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                } else {
                    vehicleManager.updateVehicle(selectedRow, updatedVehicle);
                    viewTable();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn xe để sửa");
        }        
    }//GEN-LAST:event_editBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
          VehicleDialog dialog = new VehicleDialog(this, "Thêm xe mới", null);
        dialog.setVisible(true);
        Vehicle newVehicle = dialog.getVehicle();
        if (newVehicle != null) {
            if (vehicleManager.isDuplicateVehicleNumber(newVehicle.getVehicleNumber())) {
                JOptionPane.showMessageDialog(this, "Biển số xe đã tồn tại. Vui lòng nhập biển số xe khác.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                vehicleManager.addVehicle(newVehicle);
                viewTable();
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void searchBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn1ActionPerformed
        numberTF.setText("");
          informationTF.setText("");
          typeTF.setText("");
        
    }//GEN-LAST:event_searchBtn1ActionPerformed

    private void findBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtnActionPerformed
        // Lấy giá trị từ các ô nhập liệu
    String number = numberTF.getText().trim();
    String information = informationTF.getText().trim();
    String type = typeTF.getText().trim();
    
    // Tạo dialog và bảng để hiển thị kết quả
    VehicleResultDialog resultDialog = new VehicleResultDialog();
    resultDialog.setVisible(true);
    JTable resultTable = resultDialog.getResultTable();
    DefaultTableModel tableModel = (DefaultTableModel) resultTable.getModel();
    tableModel.setRowCount(0);
    
    // Lặp qua danh sách các đối tượng Vehicle trong VehicleManager
    for (Vehicle item : vehicleManager.getVehicles()) {
        boolean numberMatch = (number.isEmpty() || number.equals(item.getVehicleNumber()));
        boolean informationMatch = (information.isEmpty() || information.equalsIgnoreCase(item.getVehicleInfo()));
        boolean typeMatch = (type.isEmpty() || type.equalsIgnoreCase(item.getExamAssigned()));
        
        // Kiểm tra điều kiện phù hợp cho number, information, và type
        if (numberMatch && informationMatch && typeMatch) {
            Object[] row = {
                item.getVehicleNumber(),
                item.getVehicleInfo(),
                item.getExamAssigned()
            };
            tableModel.addRow(row);
        }
    }
    
    // Cập nhật bảng kết quả
    resultTable.setModel(tableModel);
    resultDialog.setResultTable(resultTable);
        
    }//GEN-LAST:event_findBtnActionPerformed

    private void TKBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKBtnActionPerformed
               // Lấy giá trị từ các ô nhập liệu
    String number = numberTF.getText().trim();
    String information = informationTF.getText().trim();
    String type = typeTF.getText().trim();
    
    int number2 = 0;
    // Lặp qua danh sách các đối tượng Vehicle trong VehicleManager
    for (Vehicle item : vehicleManager.getVehicles()) {
        boolean numberMatch = (number.isEmpty() || number.equals(item.getVehicleNumber()));
        boolean informationMatch = (information.isEmpty() || information.equalsIgnoreCase(item.getVehicleInfo()));
        boolean typeMatch = (type.isEmpty() || type.equalsIgnoreCase(item.getExamAssigned()));
        
        // Kiểm tra điều kiện phù hợp cho number, information, và type
        if (numberMatch && informationMatch && typeMatch) {
          number2 ++;
        }
    }
    
            dataTF.setText("" + number2);
    }//GEN-LAST:event_TKBtnActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleManagementV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TKBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField dataTF;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton findBtn;
    private javax.swing.JTextField informationTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField numberTF;
    private javax.swing.JButton searchBtn1;
    private javax.swing.JTextField typeTF;
    private javax.swing.JTable vehicletable;
    // End of variables declaration//GEN-END:variables
}
