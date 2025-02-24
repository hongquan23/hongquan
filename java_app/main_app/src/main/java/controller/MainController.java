


package controller;

import func.ExamManager;
import func.StudentManager;
import func.VehicleManager;
//import view.ExamManagementView;
import view.ExamManagementV;
//import view.StudentManagementView;
import view.StudentManagementV;
//import view.VehicleManagementView;
import view.VehicleManagementV;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainController {
    private ExamManager examManager;
    private StudentManager studentManager;
    private VehicleManager vehicleManager;

    public MainController(ExamManager examManager, StudentManager studentManager, VehicleManager vehicleManager) {
        this.examManager = examManager;
        this.studentManager = studentManager;
        this.vehicleManager = vehicleManager;
    }

    public void showMainMenu() {
        JFrame frame = new JFrame("Main Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            // Override paintComponent to add a gradient background
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                int width = getWidth();
                int height = getHeight();
                Color color1 = new Color(173, 216, 230);  // light blue
                Color color2 = new Color(70, 130, 180);   // darker blue
                GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, width, height);
            }
        };
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Customizing button appearance with hover effect
        JButton btnManageExams = createStyledButton("KỲ THI", "");
        btnManageExams.setBounds(100, 50, 200, 60); // Increased button size for a more modern look
        panel.add(btnManageExams);
        btnManageExams.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ExamManagementV examManagementView = new ExamManagementV(examManager, studentManager);
                examManagementView.setVisible(true);
            }
        });

        JButton btnManageStudents = createStyledButton("HỌC VIÊN", "");
        btnManageStudents.setBounds(100, 130, 200, 60);
        panel.add(btnManageStudents);
        btnManageStudents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentManagementV studentManagementView = new StudentManagementV(studentManager);
                studentManagementView.setVisible(true);
            }
        });

        JButton btnManageVehicles = createStyledButton("XE", "");
        btnManageVehicles.setBounds(100, 210, 200, 60);
        panel.add(btnManageVehicles);
        btnManageVehicles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VehicleManagementV vehicleManagementView = new VehicleManagementV(vehicleManager);
                vehicleManagementView.setVisible(true);
            }
        });
    }

    // Method to create styled buttons with rounded corners, icons, and hover effects
    private JButton createStyledButton(String text, String iconPath) {
        JButton button = new JButton(text);

        // Add an icon (assuming icons are available in your project directory)
        button.setIcon(new ImageIcon(iconPath));

        // Customize button appearance
        button.setFocusPainted(false);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(70, 130, 180));  // Button color
        button.setBorder(BorderFactory.createLineBorder(new Color(50, 105, 195), 2));  // Border with shadow
        button.setOpaque(true);

        // Make the button rounded
        button.setContentAreaFilled(false);
        button.setOpaque(true);
        button.setBorderPainted(true);

        // Adding hover effect for button
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new Color(100, 149, 237)); // Lighter color when hovered
                button.setBorder(BorderFactory.createLineBorder(new Color(60, 130, 195), 2));  // Change border on hover
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(new Color(70, 130, 180));  // Original color when not hovered
                button.setBorder(BorderFactory.createLineBorder(new Color(50, 105, 195), 2));  // Original border
            }

            @Override
            public void mousePressed(MouseEvent e) {
                button.setBackground(new Color(30, 144, 255)); // Slightly darker when pressed
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button.setBackground(new Color(100, 149, 237)); // Back to hover color
            }
        });

        return button;
    }
}
