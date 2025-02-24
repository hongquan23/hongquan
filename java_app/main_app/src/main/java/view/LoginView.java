

package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import entity.User;
import javax.swing.border.Border;

public class LoginView extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JLabel userNameLabel;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JTextField userNameField;
    private JButton loginBtn;

    public LoginView() {
        initComponents();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Set a modern font and UI layout
        userNameLabel = new JLabel("Username");
        userNameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 16));
        userNameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        loginBtn = new JButton("Login");

        // Set fonts, colors, and tooltips
        userNameField.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
        loginBtn.setFont(new Font("Arial", Font.BOLD, 15));
        loginBtn.setToolTipText("Click to login");

        // Styling the JButton (rounded corners, background color)
        loginBtn.setBackground(new Color(66, 135, 245)); // Blue color for button
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setFocusPainted(false);
        loginBtn.setBorder(BorderFactory.createLineBorder(new Color(50, 105, 195), 1)); // Thin border
       loginBtn.setPreferredSize(new Dimension(80, 40));


        // Make button rounded
        loginBtn.setBorder((Border) new RoundedBorder(10)); // Rounded with radius 10px

        // Hover effect for the button
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtn.setBackground(new Color(100, 149, 237)); // Slightly lighter blue on hover
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtn.setBackground(new Color(66, 135, 245)); // Original blue when not hovered
            }
        });

        // Create a panel with gradient background
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                int width = getWidth();
                int height = getHeight();
                Color color1 = new Color(173, 216, 230); // Light blue
                Color color2 = new Color(70, 130, 180);  // Darker blue
                GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, width, height);
            }
        };
        
        panel.setLayout(new SpringLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Padding for layout

        // Add components to panel
        panel.add(userNameLabel);
        panel.add(passwordLabel);
        panel.add(userNameField);
        panel.add(passwordField);
        panel.add(loginBtn);

        // Position components using SpringLayout
        SpringLayout layout = (SpringLayout) panel.getLayout();
        layout.putConstraint(SpringLayout.WEST, userNameLabel, 20, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, userNameLabel, 60, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, passwordLabel, 20, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, passwordLabel, 100, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, userNameField, 140, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, userNameField, 60, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, passwordField, 140, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, passwordField, 100, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, loginBtn, 140, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, loginBtn, 150, SpringLayout.NORTH, panel);

        // Add panel to JFrame
        this.add(panel);
        this.pack();

        // Set JFrame properties
        this.setTitle("Login");
        this.setSize(400, 250);
        this.setLocationRelativeTo(null); // Center on screen
        this.setResizable(false);
    }

    // Rounded border class for rounded buttons
    private static class RoundedBorder implements Border {
        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(radius + 1, radius + 1, radius + 2, radius);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }

    // Method to show error or info messages
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    // Get user details from the fields
    public User getUser() {
        return new User(userNameField.getText(), String.copyValueOf(passwordField.getPassword()));
    }

    // Add action listener to the login button
    public void addLoginListener(ActionListener listener) {
        loginBtn.addActionListener(listener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Action handling here (if needed)
    }
}
