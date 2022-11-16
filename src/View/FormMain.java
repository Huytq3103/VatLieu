/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import java.awt.FlowLayout;

/**
 *
 * @author Huy PC
 */
public class FormMain extends javax.swing.JFrame {

    /**
     * Creates new form FormDSOrder
     */
    public FormMain() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pannelHeader = new javax.swing.JPanel();
        titleHeader = new javax.swing.JLabel();
        iconLogout = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelDonHang = new javax.swing.JPanel();
        iconOrder = new javax.swing.JLabel();
        lbTitleOrder1 = new javax.swing.JLabel();
        panelKhachHang = new javax.swing.JPanel();
        iconOrder1 = new javax.swing.JLabel();
        lbTitleOrder = new javax.swing.JLabel();
        panelSanPham = new javax.swing.JPanel();
        iconOrder2 = new javax.swing.JLabel();
        lbTitleOrder2 = new javax.swing.JLabel();
        panelTaiKhoan = new javax.swing.JPanel();
        iconOrder3 = new javax.swing.JLabel();
        lbTitleOrder3 = new javax.swing.JLabel();
        lbDanhSachHD = new javax.swing.JLabel();
        lbThemMoiHD = new javax.swing.JLabel();
        lbDanhSachTK = new javax.swing.JLabel();
        lbThemMoiTK = new javax.swing.JLabel();
        lbDanhSachKH = new javax.swing.JLabel();
        lbThemMoiKH = new javax.swing.JLabel();
        lbThemMoiSP = new javax.swing.JLabel();
        lbDanhSachSP = new javax.swing.JLabel();
        lbLoaiSP = new javax.swing.JLabel();
        panelContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(216, 217, 218));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        pannelHeader.setBackground(new java.awt.Color(242, 157, 56));
        pannelHeader.setMaximumSize(new java.awt.Dimension(1920, 64));
        pannelHeader.setMinimumSize(new java.awt.Dimension(1920, 64));

        titleHeader.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        titleHeader.setForeground(new java.awt.Color(255, 255, 255));
        titleHeader.setText("PHẦM MỀM QUẢN LÝ BÁN HÀNG");
        titleHeader.setMaximumSize(new java.awt.Dimension(297, 22));
        titleHeader.setMinimumSize(new java.awt.Dimension(297, 22));
        titleHeader.setPreferredSize(new java.awt.Dimension(297, 22));

        iconLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Logout.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ĐĂNG XUẤT");
        jLabel2.setMaximumSize(new java.awt.Dimension(65, 13));
        jLabel2.setMinimumSize(new java.awt.Dimension(65, 13));
        jLabel2.setPreferredSize(new java.awt.Dimension(65, 13));

        javax.swing.GroupLayout pannelHeaderLayout = new javax.swing.GroupLayout(pannelHeader);
        pannelHeader.setLayout(pannelHeaderLayout);
        pannelHeaderLayout.setHorizontalGroup(
            pannelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelHeaderLayout.createSequentialGroup()
                .addGap(844, 844, 844)
                .addComponent(titleHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 633, Short.MAX_VALUE)
                .addComponent(iconLogout)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        pannelHeaderLayout.setVerticalGroup(
            pannelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelHeaderLayout.createSequentialGroup()
                .addGroup(pannelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannelHeaderLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pannelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconLogout)))
                    .addGroup(pannelHeaderLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(240, 768));
        jPanel2.setMinimumSize(new java.awt.Dimension(240, 768));
        jPanel2.setPreferredSize(new java.awt.Dimension(240, 768));

        panelDonHang.setBackground(new java.awt.Color(255, 255, 255));
        panelDonHang.setMaximumSize(new java.awt.Dimension(216, 39));
        panelDonHang.setMinimumSize(new java.awt.Dimension(216, 39));
        panelDonHang.setPreferredSize(new java.awt.Dimension(216, 39));

        iconOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Order.png"))); // NOI18N

        lbTitleOrder1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbTitleOrder1.setText("Quản lý đơn hàng");

        javax.swing.GroupLayout panelDonHangLayout = new javax.swing.GroupLayout(panelDonHang);
        panelDonHang.setLayout(panelDonHangLayout);
        panelDonHangLayout.setHorizontalGroup(
            panelDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDonHangLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(iconOrder)
                .addGap(11, 11, 11)
                .addComponent(lbTitleOrder1)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        panelDonHangLayout.setVerticalGroup(
            panelDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDonHangLayout.createSequentialGroup()
                .addGroup(panelDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDonHangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitleOrder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDonHangLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(iconOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        panelKhachHang.setMaximumSize(new java.awt.Dimension(216, 39));
        panelKhachHang.setMinimumSize(new java.awt.Dimension(216, 39));

        iconOrder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/People.png"))); // NOI18N

        lbTitleOrder.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbTitleOrder.setText("Quản lý khách hàng");

        javax.swing.GroupLayout panelKhachHangLayout = new javax.swing.GroupLayout(panelKhachHang);
        panelKhachHang.setLayout(panelKhachHangLayout);
        panelKhachHangLayout.setHorizontalGroup(
            panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKhachHangLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(iconOrder1)
                .addGap(9, 9, 9)
                .addComponent(lbTitleOrder)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        panelKhachHangLayout.setVerticalGroup(
            panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKhachHangLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitleOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconOrder1, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        panelSanPham.setBackground(new java.awt.Color(255, 255, 255));
        panelSanPham.setMaximumSize(new java.awt.Dimension(216, 39));
        panelSanPham.setMinimumSize(new java.awt.Dimension(216, 39));
        panelSanPham.setPreferredSize(new java.awt.Dimension(216, 39));

        iconOrder2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Sanpham.png"))); // NOI18N

        lbTitleOrder2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbTitleOrder2.setText("Quản lý sản phẩm");

        javax.swing.GroupLayout panelSanPhamLayout = new javax.swing.GroupLayout(panelSanPham);
        panelSanPham.setLayout(panelSanPhamLayout);
        panelSanPhamLayout.setHorizontalGroup(
            panelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSanPhamLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(iconOrder2)
                .addGap(9, 9, 9)
                .addComponent(lbTitleOrder2)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        panelSanPhamLayout.setVerticalGroup(
            panelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSanPhamLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(panelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitleOrder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconOrder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        panelTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        panelTaiKhoan.setMaximumSize(new java.awt.Dimension(216, 39));
        panelTaiKhoan.setMinimumSize(new java.awt.Dimension(216, 39));

        iconOrder3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Account.png"))); // NOI18N

        lbTitleOrder3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbTitleOrder3.setText("Quản lý tài khoản");

        javax.swing.GroupLayout panelTaiKhoanLayout = new javax.swing.GroupLayout(panelTaiKhoan);
        panelTaiKhoan.setLayout(panelTaiKhoanLayout);
        panelTaiKhoanLayout.setHorizontalGroup(
            panelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTaiKhoanLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(iconOrder3)
                .addGap(9, 9, 9)
                .addComponent(lbTitleOrder3)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        panelTaiKhoanLayout.setVerticalGroup(
            panelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTaiKhoanLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(panelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitleOrder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconOrder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        lbDanhSachHD.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbDanhSachHD.setText("Danh sách");
        lbDanhSachHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDanhSachHDMouseClicked(evt);
            }
        });

        lbThemMoiHD.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbThemMoiHD.setText("Thêm mới");
        lbThemMoiHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThemMoiHDMouseClicked(evt);
            }
        });

        lbDanhSachTK.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbDanhSachTK.setText("Danh sách");
        lbDanhSachTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDanhSachTKMouseClicked(evt);
            }
        });

        lbThemMoiTK.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbThemMoiTK.setText("Thêm mới");
        lbThemMoiTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThemMoiTKMouseClicked(evt);
            }
        });

        lbDanhSachKH.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbDanhSachKH.setText("Danh sách");
        lbDanhSachKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDanhSachKHMouseClicked(evt);
            }
        });

        lbThemMoiKH.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbThemMoiKH.setText("Thêm mới");
        lbThemMoiKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThemMoiKHMouseClicked(evt);
            }
        });

        lbThemMoiSP.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbThemMoiSP.setText("Thêm mới");
        lbThemMoiSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThemMoiSPMouseClicked(evt);
            }
        });

        lbDanhSachSP.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbDanhSachSP.setText("Danh sách");
        lbDanhSachSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDanhSachSPMouseClicked(evt);
            }
        });

        lbLoaiSP.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbLoaiSP.setText("Loại sản phẩm");
        lbLoaiSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLoaiSPMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelDonHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDanhSachHD)
                            .addComponent(lbThemMoiHD)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDanhSachTK)
                            .addComponent(lbThemMoiTK)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbThemMoiKH)
                            .addComponent(lbDanhSachKH)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDanhSachSP)
                            .addComponent(lbThemMoiSP)
                            .addComponent(lbLoaiSP))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(panelDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbDanhSachHD)
                .addGap(12, 12, 12)
                .addComponent(lbThemMoiHD)
                .addGap(18, 18, 18)
                .addComponent(panelKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDanhSachKH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbThemMoiKH)
                .addGap(18, 18, 18)
                .addComponent(panelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDanhSachSP)
                .addGap(9, 9, 9)
                .addComponent(lbThemMoiSP)
                .addGap(9, 9, 9)
                .addComponent(lbLoaiSP)
                .addGap(18, 18, 18)
                .addComponent(panelTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDanhSachTK)
                .addGap(18, 18, 18)
                .addComponent(lbThemMoiTK)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        panelContainer.setBackground(new java.awt.Color(216, 217, 218));

        javax.swing.GroupLayout panelContainerLayout = new javax.swing.GroupLayout(panelContainer);
        panelContainer.setLayout(panelContainerLayout);
        panelContainerLayout.setHorizontalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1680, Short.MAX_VALUE)
        );
        panelContainerLayout.setVerticalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pannelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pannelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 248, Short.MAX_VALUE))
                    .addComponent(panelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbDanhSachHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDanhSachHDMouseClicked
        // TODO add your handling code here:
        clearGround();
        panelDonHang.setBackground(Color.decode("#FDE0BE"));
        lbDanhSachHD.setForeground(Color.decode("#F29D38"));
        DSHoaDon dshd = new DSHoaDon();
        panelContainer.removeAll();
        panelContainer.add(dshd);
        panelContainer.setLayout(new FlowLayout());
        this.pack();
        panelContainer.setVisible(true);

    }//GEN-LAST:event_lbDanhSachHDMouseClicked

    private void lbDanhSachTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDanhSachTKMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbDanhSachTKMouseClicked

    private void lbThemMoiHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThemMoiHDMouseClicked
        // TODO add your handling code here:
        clearGround();
        panelDonHang.setBackground(Color.decode("#FDE0BE"));
        lbThemMoiHD.setForeground(Color.decode("#F29D38"));
        ThemDonHang tdh = new ThemDonHang();
        panelContainer.removeAll();
        panelContainer.add(tdh);
        panelContainer.setLayout(new FlowLayout());
        this.pack();
        panelContainer.setVisible(true);
    }//GEN-LAST:event_lbThemMoiHDMouseClicked

    private void lbThemMoiTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThemMoiTKMouseClicked
        // TODO add your handling code here:
        clearGround();
        panelTaiKhoan.setBackground(Color.decode("#FDE0BE"));
        lbThemMoiTK.setForeground(Color.decode("#F29D38"));
        ThemMoiTaiKhoan tmtk = new ThemMoiTaiKhoan();
        panelContainer.removeAll();
        panelContainer.add(tmtk);
        panelContainer.setLayout(new FlowLayout());
        this.pack();
        panelContainer.setVisible(true);
    }//GEN-LAST:event_lbThemMoiTKMouseClicked

    private void lbDanhSachKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDanhSachKHMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbDanhSachKHMouseClicked

    private void lbThemMoiKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThemMoiKHMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbThemMoiKHMouseClicked

    private void lbThemMoiSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThemMoiSPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbThemMoiSPMouseClicked

    private void lbDanhSachSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDanhSachSPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbDanhSachSPMouseClicked

    private void lbLoaiSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLoaiSPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbLoaiSPMouseClicked

    /**
     * @param args the command line arguments
     */
    private void clearGround() {
        panelDonHang.setBackground(Color.decode("#FFFFFF"));
        panelKhachHang.setBackground(Color.decode("#FFFFFF"));
        panelSanPham.setBackground(Color.decode("#FFFFFF"));
        panelTaiKhoan.setBackground(Color.decode("#FFFFFF"));
        lbDanhSachHD.setForeground(Color.decode("#000000"));
        lbDanhSachKH.setForeground(Color.decode("#000000"));
        lbDanhSachSP.setForeground(Color.decode("#000000"));
        lbDanhSachTK.setForeground(Color.decode("#000000"));
        lbLoaiSP.setForeground(Color.decode("#000000"));
        lbThemMoiHD.setForeground(Color.decode("#000000"));
        lbThemMoiSP.setForeground(Color.decode("#000000"));
        lbThemMoiTK.setForeground(Color.decode("#000000"));
        lbThemMoiKH.setForeground(Color.decode("#000000"));
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLogout;
    private javax.swing.JLabel iconOrder;
    private javax.swing.JLabel iconOrder1;
    private javax.swing.JLabel iconOrder2;
    private javax.swing.JLabel iconOrder3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbDanhSachHD;
    private javax.swing.JLabel lbDanhSachKH;
    private javax.swing.JLabel lbDanhSachSP;
    private javax.swing.JLabel lbDanhSachTK;
    private javax.swing.JLabel lbLoaiSP;
    private javax.swing.JLabel lbThemMoiHD;
    private javax.swing.JLabel lbThemMoiKH;
    private javax.swing.JLabel lbThemMoiSP;
    private javax.swing.JLabel lbThemMoiTK;
    private javax.swing.JLabel lbTitleOrder;
    private javax.swing.JLabel lbTitleOrder1;
    private javax.swing.JLabel lbTitleOrder2;
    private javax.swing.JLabel lbTitleOrder3;
    private javax.swing.JPanel panelContainer;
    private javax.swing.JPanel panelDonHang;
    private javax.swing.JPanel panelKhachHang;
    private javax.swing.JPanel panelSanPham;
    private javax.swing.JPanel panelTaiKhoan;
    private javax.swing.JPanel pannelHeader;
    private javax.swing.JLabel titleHeader;
    // End of variables declaration//GEN-END:variables
}
