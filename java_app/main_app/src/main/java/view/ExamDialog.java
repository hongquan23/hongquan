package view;

import entity.Exam;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExamDialog extends JDialog {

    private JDateChooser dateChooser;
    private JTextField txtLocation, txtVehicleCount;
    private JComboBox<String> cmbLicenseType, cmbExamForm;
    private Exam exam;

    // Constants
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    private static final String[] LICENSE_TYPES = {"B1", "B2", "C1", "C2", "D", "E", "F"};
    private static final String[] EXAM_FORMS = {"Thực hành", "Lý thuyết"};

    // Constructor
    public ExamDialog(Frame owner, String title, Exam exam) {
        super(owner, title, true);
        this.exam = exam;

        setupLayout();
        initializeFields();
        populateFieldsIfEditing();
        addComponentsToLayout();
        
        setPreferredSize(new Dimension(400, 400));
        pack();
        setLocationRelativeTo(owner);
    }

    // Set up the layout manager and common settings
    private void setupLayout() {
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    // Initialize input fields and components
    private void initializeFields() {
        dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd/MM/yyyy");

        txtLocation = new JTextField(20);
        txtVehicleCount = new JTextField(20);

        cmbLicenseType = new JComboBox<>(LICENSE_TYPES);
        cmbExamForm = new JComboBox<>(EXAM_FORMS);
    }

    // If editing an existing exam, populate fields with its data
    private void populateFieldsIfEditing() {
        if (exam != null) {
            dateChooser.setDate(exam.getDate());
            txtLocation.setText(exam.getLocation());
            txtVehicleCount.setText(String.valueOf(exam.getVehicleCount()));
            cmbLicenseType.setSelectedItem(exam.getLicenseType());
            cmbExamForm.setSelectedItem(exam.getExamForm());
        }
    }

    // Add components to the dialog window using GridBagLayout
    private void addComponentsToLayout() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Adding components
        addComponent(new JLabel("Ngày thi:"), dateChooser, gbc, 0);
        addComponent(new JLabel("Địa điểm:"), txtLocation, gbc, 1);
        addComponent(new JLabel("Số lượng xe:"), txtVehicleCount, gbc, 2);
        addComponent(new JLabel("Loại bằng:"), cmbLicenseType, gbc, 3);
        addComponent(new JLabel("Hình thức thi:"), cmbExamForm, gbc, 4);
        addButtons(gbc);
    }

    // Method to add label and corresponding input field in one row
    private void addComponent(JLabel label, JComponent component, GridBagConstraints gbc, int row) {
        gbc.gridx = 0;
        gbc.gridy = row;
        add(label, gbc);

        gbc.gridx = 1;
        add(component, gbc);
    }

    // Adding OK and Cancel buttons
    private void addButtons(GridBagConstraints gbc) {
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;

        JPanel buttonPanel = new JPanel();

        // OK button
        JButton btnOk = new JButton("OK");
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
        buttonPanel.add(btnOk);

        // Cancel button
        JButton btnCancel = new JButton("Hủy");
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });
        buttonPanel.add(btnCancel);

        add(buttonPanel, gbc);
    }

    // Handler for OK button click
    private void onOK() {
        try {
            if (dateChooser.getDate() != null && !txtLocation.getText().isEmpty() && !txtVehicleCount.getText().isEmpty()) {
                Date date = dateChooser.getDate();
                String location = txtLocation.getText();
                int vehicleCount = Integer.parseInt(txtVehicleCount.getText());
                String licenseType = (String) cmbLicenseType.getSelectedItem();
                String examForm = (String) cmbExamForm.getSelectedItem();
                
                exam = new Exam(date, location, vehicleCount, licenseType, examForm);
                dispose();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số lượng xe phải là một số nguyên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Handler for Cancel button click
    private void onCancel() {
        exam = null;
        dispose();
    }

    // Getter to retrieve the exam object
    public Exam getExam() {
        return exam;
    }
}
