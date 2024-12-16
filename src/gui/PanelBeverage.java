/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import gui.custom.CustomRectangularButton;
import dao.*;
import entities.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Trần Ngọc Huyền
 */
public class PanelBeverage extends javax.swing.JPanel implements ActionListener {

    private Beverage bev;
    private DecimalFormat dfK = new DecimalFormat("#,##K");
    private DecimalFormat df = new DecimalFormat("#,### VND");
    private DAOBeverage db = new DAOBeverage();

    /**
     * Creates new form PanelBeverage
     */
    public PanelBeverage() {
        setBackground(new Color(0, 108, 191));

        initComponents();
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lblNameBevDialog.setText(lblName.getText());
                Beverage b = db.findIdByName(lblName.getText());
                lblPriceBevDialog.setText(df.format(b.getSellingPrice()));
                dialogShowBev.setTitle(lblName.getText());
                dialogShowBev.pack();
                dialogShowBev.setLocationRelativeTo(null);
                dialogShowBev.setVisible(true);
            }
        });

    }

    public void setLblbName(String nameBev) {
        this.lblName.setText(nameBev);
    }

    public void setLblPrice(double sellPrice) {
        this.lblPrice.setText(dfK.format(sellPrice));
    }

    public void setImgBev(String imgURL) {
        String imgPath = "/img/" + imgURL;
        try {
            BufferedImage originalImg = ImageIO.read(getClass().getResource(imgPath));
            // Resize ảnh
            Image resizedImg = originalImg.getScaledInstance(300, 300, Image.SCALE_SMOOTH);

            // Tạo ImageIcon từ ảnh vừa resize
            ImageIcon imgIcon = new ImageIcon(resizedImg);
            this.lblImg.setIcon(imgIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogShowBev = new javax.swing.JDialog();
        panelName1 = new javax.swing.JPanel();
        lblNameBevDialog = new javax.swing.JLabel();
        generalTab = new javax.swing.JPanel();
        panelDesc = new javax.swing.JPanel();
        lblDesc = new javax.swing.JLabel();
        txtDescDialog = new javax.swing.JTextField();
        btnBlank = new CustomRectangularButton(new Color[]{Color.WHITE, new Color(102, 44, 33), new Color(102, 44, 33)});
        panelQuantity = new javax.swing.JPanel();
        lblQuantity = new javax.swing.JLabel();
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1, 1, 100, 1);
        spinQuantity = new javax.swing.JSpinner(spinnerModel);
        panelPrice1 = new javax.swing.JPanel();
        lblPriceTitle = new javax.swing.JLabel();
        lblPriceBevDialog = new javax.swing.JLabel();
        btnConfirm = new CustomRectangularButton(new Color[]{Color.WHITE, new Color(102, 44, 33), new Color(102, 44, 33)});
        panelName = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelImg = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        panelPrice = new javax.swing.JPanel();
        lblPrice = new javax.swing.JLabel();

        dialogShowBev.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogShowBev.setBackground(new java.awt.Color(0, 80, 129));
        dialogShowBev.setModal(true);

        panelName1.setBackground(new java.awt.Color(102, 44, 33));
        panelName1.setForeground(new java.awt.Color(255, 255, 255));

        lblNameBevDialog.setBackground(new java.awt.Color(255, 255, 255));
        lblNameBevDialog.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNameBevDialog.setForeground(new java.awt.Color(255, 255, 255));
        lblNameBevDialog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameBevDialog.setText("HazeInut");

        generalTab.setBackground(new java.awt.Color(210, 180, 160));

        panelDesc.setBackground(new java.awt.Color(210, 180, 160));

        lblDesc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDesc.setText("Ghi chú: ");

        btnBlank.setBackground(new java.awt.Color(0, 80, 129));
        btnBlank.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBlank.setForeground(new java.awt.Color(255, 255, 255));
        btnBlank.setText("Xoá");
        btnBlank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlankActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDescLayout = new javax.swing.GroupLayout(panelDesc);
        panelDesc.setLayout(panelDescLayout);
        panelDescLayout.setHorizontalGroup(
            panelDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescLayout.createSequentialGroup()
                .addComponent(lblDesc)
                .addGap(10, 10, 10)
                .addComponent(txtDescDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBlank))
        );
        panelDescLayout.setVerticalGroup(
            panelDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(txtDescDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnBlank)
        );

        btnBlank.setBackground(new Color(0, 80, 129));

        panelQuantity.setBackground(new java.awt.Color(210, 180, 160));
        panelQuantity.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblQuantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQuantity.setText("Số lượng: ");
        panelQuantity.add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        spinQuantity.setPreferredSize(new java.awt.Dimension(50, 25));
        panelQuantity.add(spinQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        panelPrice1.setBackground(new java.awt.Color(210, 180, 160));
        panelPrice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPriceTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPriceTitle.setText("Giá bán: ");
        panelPrice1.add(lblPriceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblPriceBevDialog.setText("0");
        panelPrice1.add(lblPriceBevDialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 20));
        lblPrice.setPreferredSize(lblQuantity.getPreferredSize());

        btnConfirm.setBackground(new java.awt.Color(0, 80, 129));
        btnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Xác nhận");

        javax.swing.GroupLayout generalTabLayout = new javax.swing.GroupLayout(generalTab);
        generalTab.setLayout(generalTabLayout);
        generalTabLayout.setHorizontalGroup(
            generalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPrice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(generalTabLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnConfirm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        generalTabLayout.setVerticalGroup(
            generalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalTabLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(panelPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(panelQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(panelDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirm))
        );

        javax.swing.GroupLayout panelName1Layout = new javax.swing.GroupLayout(panelName1);
        panelName1.setLayout(panelName1Layout);
        panelName1Layout.setHorizontalGroup(
            panelName1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNameBevDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(generalTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelName1Layout.setVerticalGroup(
            panelName1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelName1Layout.createSequentialGroup()
                .addComponent(lblNameBevDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(generalTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout dialogShowBevLayout = new javax.swing.GroupLayout(dialogShowBev.getContentPane());
        dialogShowBev.getContentPane().setLayout(dialogShowBevLayout);
        dialogShowBevLayout.setHorizontalGroup(
            dialogShowBevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogShowBevLayout.createSequentialGroup()
                .addComponent(panelName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dialogShowBevLayout.setVerticalGroup(
            dialogShowBevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(200, 250));
        setPreferredSize(new java.awt.Dimension(300, 330));
        setLayout(new java.awt.BorderLayout());

        panelName.setBackground(new java.awt.Color(247, 247, 247));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("tnhxinhdep");

        javax.swing.GroupLayout panelNameLayout = new javax.swing.GroupLayout(panelName);
        panelName.setLayout(panelNameLayout);
        panelNameLayout.setHorizontalGroup(
            panelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(panelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelNameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelNameLayout.setVerticalGroup(
            panelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(panelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelNameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        add(panelName, java.awt.BorderLayout.SOUTH);

        panelImg.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelImgLayout = new javax.swing.GroupLayout(panelImg);
        panelImg.setLayout(panelImgLayout);
        panelImgLayout.setHorizontalGroup(
            panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImg)
        );
        panelImgLayout.setVerticalGroup(
            panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );

        panelPrice.setBackground(new java.awt.Color(102, 44, 33));

        lblPrice.setBackground(new java.awt.Color(210, 180, 160));
        lblPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrice.setText("40K");
        lblPrice.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        javax.swing.GroupLayout panelPriceLayout = new javax.swing.GroupLayout(panelPrice);
        panelPrice.setLayout(panelPriceLayout);
        panelPriceLayout.setHorizontalGroup(
            panelPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        panelPriceLayout.setVerticalGroup(
            panelPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(panelImg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 234, Short.MAX_VALUE)
                .addComponent(panelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(panelImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(panelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jLayeredPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public JDialog getDialogShowBev() {
        return dialogShowBev;
    }

    public JButton getBtnConfirm() {
        return btnConfirm;
    }

    private void btnBlankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlankActionPerformed
        txtDescDialog.setText("");
    }//GEN-LAST:event_btnBlankActionPerformed

    public JLabel getLblNameBevDialog() {
        return lblNameBevDialog;
    }

    public JLabel getLblPriceBevDialog() {
        return lblPriceBevDialog;
    }

    public JSpinner getSpinQuantity() {
        return spinQuantity;
    }

    public JTextField getTxtDescDialog() {
        return txtDescDialog;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlank;
    public javax.swing.JButton btnConfirm;
    public javax.swing.JDialog dialogShowBev;
    private javax.swing.JPanel generalTab;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameBevDialog;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPriceBevDialog;
    private javax.swing.JLabel lblPriceTitle;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JPanel panelDesc;
    private javax.swing.JPanel panelImg;
    private javax.swing.JPanel panelName;
    private javax.swing.JPanel panelName1;
    private javax.swing.JPanel panelPrice;
    private javax.swing.JPanel panelPrice1;
    private javax.swing.JPanel panelQuantity;
    private javax.swing.JSpinner spinQuantity;
    private javax.swing.JTextField txtDescDialog;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Tạo một JFrame để chứa PanelBeverage
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Tạo một thể hiện của PanelBeverage
                PanelBeverage panel = new PanelBeverage();

                // Thêm PanelBeverage vào JFrame
                frame.getContentPane().add(panel);

                // Hiển thị JFrame
                frame.pack();
                frame.setVisible(true);

                // Gọi hàm mở dialog từ PanelBeverage
//                panel.openDialog();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
