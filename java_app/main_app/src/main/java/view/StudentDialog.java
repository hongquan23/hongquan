package view;

import entity.Student;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentDialog extends JDialog {
    private JTextField txtName, txtCccd;
    private JComboBox<String> cmbRegisteredLicenseType, cmbResult;
    private JTextField txtDate;
    private JCalendar calendar;
    private Student student;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public StudentDialog(Frame owner, String title, Student student) {
        super(owner, title, true);
        this.student = student;

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Họ và tên:"), gbc);
        gbc.gridx = 1;
        txtName = new JTextField(20);
        panel.add(txtName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("CCCD:"), gbc);
        gbc.gridx = 1;
        txtCccd = new JTextField(20);
        panel.add(txtCccd, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Loại bằng đăng ký thi:"), gbc);
        gbc.gridx = 1;
        cmbRegisteredLicenseType = new JComboBox<>(new String[]{"B1", "B2", "C1", "C2", "D", "E", "F"});
        panel.add(cmbRegisteredLicenseType, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Ngày thi:"), gbc);
        gbc.gridx = 1;
        txtDate = new JTextField(20);
        txtDate.setEditable(false);
        JButton btnCalendar = new JButton("...");
        btnCalendar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCalendarDialog();
            }
        });
        JPanel datePanel = new JPanel(new BorderLayout());
        datePanel.add(txtDate, BorderLayout.CENTER);
        datePanel.add(btnCalendar, BorderLayout.EAST);
        panel.add(datePanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(new JLabel("Kết quả:"), gbc);
        gbc.gridx = 1;
        cmbResult = new JComboBox<>(new String[]{"Đỗ", "Trượt"});
        panel.add(cmbResult, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JPanel buttonPanel = new JPanel();
        JButton btnOk = new JButton("OK");
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
        buttonPanel.add(btnOk);

        JButton btnCancel = new JButton("Hủy");
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });
        buttonPanel.add(btnCancel);
        panel.add(buttonPanel, gbc);

        add(panel);

        if (student != null) {
            txtName.setText(student.getName());
            txtCccd.setText(student.getCccd());
            cmbRegisteredLicenseType.setSelectedItem(student.getRegisteredLicenseType());
            txtDate.setText(dateFormat.format(student.getExamDate()));
            cmbResult.setSelectedItem(student.getResult());
        }

        pack();
        setLocationRelativeTo(owner);
    }

    private void showCalendarDialog() {
        calendar = new JCalendar();
        JDialog calendarDialog = new JDialog(this, "Chọn ngày", true);
        calendarDialog.setLayout(new BorderLayout());
        calendarDialog.add(calendar, BorderLayout.CENTER);
        JButton btnOk = new JButton("OK");
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date selectedDate = calendar.getDate();
                txtDate.setText(dateFormat.format(selectedDate));
                calendarDialog.dispose();
            }
        });
        calendarDialog.add(btnOk, BorderLayout.SOUTH);
        calendarDialog.pack();
        calendarDialog.setLocationRelativeTo(this);
        calendarDialog.setVisible(true);
    }

    private void onOK() {
        if (txtName.getText() != null && txtCccd.getText() != null && !txtDate.getText().isEmpty()) {
            String name = txtName.getText();
            String cccd = txtCccd.getText();
            String registeredLicenseType = (String) cmbRegisteredLicenseType.getSelectedItem();
            Date examDate = null;
            try {
                examDate = dateFormat.parse(txtDate.getText());
            } catch (Exception e) {
                e.printStackTrace();
            }
            String result = (String) cmbResult.getSelectedItem();

            student = new Student(name, cccd, registeredLicenseType, examDate, result);
            dispose();
        } else {
            student = null;
        }
    }

    private void onCancel() {
        student = null;
        dispose();
    }

    public Student getStudent() {
        return student;
    }
}
