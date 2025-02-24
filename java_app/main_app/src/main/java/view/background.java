/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;

public class background extends JPanel {
     private Image backgroundImage;
    private float transparency;

    // Constructor nhận vào đường dẫn đến file ảnh
   public background(String filePath, float transparency) {
        this.backgroundImage = new ImageIcon(filePath).getImage();
        this.transparency = transparency; // độ mờ, từ 0.0 (hoàn toàn trong suốt) đến 1.0 (hoàn toàn rõ)
    }
    // Ghi đè phương thức paintComponent để vẽ ảnh nền
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, transparency));
        g2d.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        g2d.dispose();
    }
}

