package com.gui;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        icon();
    }
    /* 
    NAMA    : NURYADIN ABUTANI
    NPM     : 19552011182
    KELAS   : TIFRP 19D
    
    1. Nilai mata uliah berupa huruf mutu A, B, C & D 
    2. IP akan otomatis muncul ketika bobot SKS di isi
    3. IPK smester 2 akan muncul setelah Button Hitung IPK di klik
    
    Niai Huruf :
    A = 4
    B = 3
    C = 2
    D = 1 (Tidak lulus)
    E or F = 0 (Tidak Lulus)
    
    Mutu = SKS * Nilai Huruf
    IP per Mata Kuliah = Mutu
    IPK Smester = (total Mutu Semua Mata Kuliah/ total SKS Mata Kuliah)
   
    */
    
    // Geter Method value dari text field Input Nilai
    public int getNilaiHuruf(String a){
        int nilaiHuruf = 0;
        try{
            if(a.equalsIgnoreCase("A")){
                nilaiHuruf = 4;
            } else if(a.equalsIgnoreCase("B")){
                nilaiHuruf = 3;
            } else if(a.equalsIgnoreCase("C")){
                nilaiHuruf = 2;
            } else if(a.equalsIgnoreCase("D")){
                nilaiHuruf = 1;
            } else if(a.equalsIgnoreCase("E")){
                nilaiHuruf = 0;
            } else {
                nilaiHuruf = 0;
            }
        }catch (NumberFormatException e){
        }  
        return nilaiHuruf;
    }
    
    // Getter Method value dari text filed Besar SKS
    public int getSKS(String a){
        int besarSks = 0;
        try{
            besarSks = Integer.parseInt(a);
        }catch (NumberFormatException e){
        }
        return besarSks;  
    }
    
    //IP per Mata Kuliah = SKS * Nilai Huruf
    public double hitungIP(String a, String b){
        double hasil = 0, nHuruf, bSks;
        try{
            nHuruf = getNilaiHuruf(a);
            bSks = getSKS(b);
            hasil = nHuruf*bSks;
        }catch (NumberFormatException e){
        }
        return hasil;
    }
    
    // IPK Smester = (total Mutu Semua Mata Kuliah/ total SKS Mata Kuliah)
    public double hitungIPK(){
        double hasil = 0, algo, pkn, metnum, matin, sbd, bing, imk, orkom, totalIP, totalSks, totalIpk;
        double sksAlgo, sksPkn, sksMetNum, sksMatIn, sksSbd, sksBIng, sksImk, sksOrkom;
        try{
            algo = hitungIP(algoTF.getText(), sksAlgoTF.getText());
            pkn = hitungIP(pknTF.getText(), sksPknTF.getText());
            metnum = hitungIP(metNumTF.getText(), sksMetNumTF.getText());
            matin = hitungIP(matInTF.getText(), sksMatInTF.getText());
            bing = hitungIP(bIngTF.getText(), sksBIngTF.getText());
            sbd = hitungIP(sbdTF.getText(), sksSbdTF.getText());
            imk = hitungIP(imkTF.getText(), sksImkTF.getText());
            orkom = hitungIP(orkomTF.getText(), sksOrkomTF.getText());
            
            sksAlgo = getSKS(sksAlgoTF.getText());
            sksPkn = getSKS(sksPknTF.getText());
            sksMetNum = getSKS(sksMetNumTF.getText());
            sksMatIn = getSKS(sksMatInTF.getText());
            sksSbd = getSKS(sksSbdTF.getText());
            sksBIng = getSKS(sksBIngTF.getText());
            sksImk = getSKS(sksImkTF.getText());
            sksOrkom = getSKS(sksOrkomTF.getText());
            
            totalIP = (algo+pkn+metnum+matin+bing+sbd+imk+orkom);
            totalSks = (sksAlgo+sksPkn+sksMetNum+sksMatIn+sksSbd+sksBIng+sksImk+sksOrkom);
            totalIpk = (totalIP/totalSks);
            hasil = (totalIpk);
            String format = String.format("%.2f", hasil);
            hasil = Double.parseDouble(format);
        }catch (NumberFormatException e){
        }
        return hasil;
    }
     
    // Seter Method ke teks fileld IP
    public String setIP(String a, String b){
        String valueOf = String.valueOf(hitungIP(a,b));
        return valueOf;
    }
    
// Seter Method ke teks fileld IPK
    public String setIPK(){
        String valueOf = String.valueOf(hitungIPK());
        return valueOf;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        algoL = new javax.swing.JLabel();
        pknL = new javax.swing.JLabel();
        metNumL = new javax.swing.JLabel();
        matInL = new javax.swing.JLabel();
        sbdL = new javax.swing.JLabel();
        ingL = new javax.swing.JLabel();
        imkL = new javax.swing.JLabel();
        orkomL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        algoTF = new javax.swing.JTextField();
        matInTF = new javax.swing.JTextField();
        metNumTF = new javax.swing.JTextField();
        imkTF = new javax.swing.JTextField();
        orkomTF = new javax.swing.JTextField();
        bIngTF = new javax.swing.JTextField();
        pknTF = new javax.swing.JTextField();
        sbdTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        sksAlgoTF = new javax.swing.JTextField();
        sksMatInTF = new javax.swing.JTextField();
        sksMetNumTF = new javax.swing.JTextField();
        sksImkTF = new javax.swing.JTextField();
        sksOrkomTF = new javax.swing.JTextField();
        sksBIngTF = new javax.swing.JTextField();
        sksPknTF = new javax.swing.JTextField();
        sksSbdTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        ipAlgoTF = new javax.swing.JTextField();
        ipMatInTF = new javax.swing.JTextField();
        ipMetNumTF = new javax.swing.JTextField();
        ipImkTF = new javax.swing.JTextField();
        ipOrkomTF = new javax.swing.JTextField();
        ipBIngTF = new javax.swing.JTextField();
        ipPknTF = new javax.swing.JTextField();
        ipSbdTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ipkL = new javax.swing.JLabel();
        ipkTF = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        countBtn2 = new javax.swing.JToggleButton();
        countBtn1 = new javax.swing.JToggleButton();
        countBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Menghitung IPK");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Mata Kuliah :");

        algoL.setText("1. Algoritma & Pemrograman II");
        algoL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                algoLMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                algoLMouseEntered(evt);
            }
        });

        pknL.setText("2. Kewarganegaraan");
        pknL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pknLMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pknLMouseEntered(evt);
            }
        });

        metNumL.setText("3. Metode Numerik");
        metNumL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                metNumLMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                metNumLMouseEntered(evt);
            }
        });

        matInL.setText("4. Matematika Informatika");
        matInL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                matInLMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                matInLMouseEntered(evt);
            }
        });

        sbdL.setText("5. Sistem Basis Data");
        sbdL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sbdLMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sbdLMouseEntered(evt);
            }
        });

        ingL.setText("6. Bahasa Inggris II");
        ingL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingLMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingLMouseEntered(evt);
            }
        });

        imkL.setText("7. Interaksi Manusia & Komputer");
        imkL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imkLMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imkLMouseEntered(evt);
            }
        });

        orkomL.setText("8. Organisasi & Arsitektur Komputer");
        orkomL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                orkomLMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orkomLMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orkomL, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(imkL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ingL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(121, 121, 121))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(sbdL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(111, 111, 111))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(matInL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(metNumL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(123, 123, 123))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pknL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(107, 107, 107))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(algoL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(algoL)
                .addGap(18, 18, 18)
                .addComponent(pknL)
                .addGap(18, 18, 18)
                .addComponent(metNumL)
                .addGap(18, 18, 18)
                .addComponent(matInL)
                .addGap(18, 18, 18)
                .addComponent(sbdL)
                .addGap(18, 18, 18)
                .addComponent(ingL)
                .addGap(18, 18, 18)
                .addComponent(imkL)
                .addGap(18, 18, 18)
                .addComponent(orkomL)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Input Nilai :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matInTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(imkTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(bIngTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(pknTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(algoTF)
                    .addComponent(metNumTF, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(orkomTF, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(sbdTF, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(algoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pknTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(metNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(matInTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sbdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bIngTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imkTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orkomTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("APLIKASI PENGHITUNG IPK");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(23, 23, 23))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        sksAlgoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sksAlgoTFKeyReleased(evt);
            }
        });

        sksMatInTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sksMatInTFKeyReleased(evt);
            }
        });

        sksMetNumTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sksMetNumTFKeyReleased(evt);
            }
        });

        sksImkTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sksImkTFKeyReleased(evt);
            }
        });

        sksOrkomTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sksOrkomTFKeyReleased(evt);
            }
        });

        sksBIngTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sksBIngTFKeyReleased(evt);
            }
        });

        sksPknTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sksPknTFKeyReleased(evt);
            }
        });

        sksSbdTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sksSbdTFKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Besar SKS :");
        jLabel12.setToolTipText("Satuan Kredit Smester");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sksMatInTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(sksImkTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sksBIngTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sksPknTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sksAlgoTF)
                    .addComponent(sksMetNumTF)
                    .addComponent(sksOrkomTF)
                    .addComponent(sksSbdTF)
                    .addComponent(jLabel12))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(sksAlgoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sksPknTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sksMetNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sksMatInTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sksSbdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sksBIngTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sksImkTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sksOrkomTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        ipAlgoTF.setEditable(false);

        ipMatInTF.setEditable(false);

        ipMetNumTF.setEditable(false);

        ipImkTF.setEditable(false);

        ipOrkomTF.setEditable(false);

        ipBIngTF.setEditable(false);

        ipPknTF.setEditable(false);

        ipSbdTF.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("IP :");
        jLabel13.setToolTipText("Indeks Prestasi");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ipMatInTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(ipImkTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ipBIngTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ipPknTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ipAlgoTF)
                    .addComponent(ipMetNumTF)
                    .addComponent(ipOrkomTF)
                    .addComponent(ipSbdTF)
                    .addComponent(jLabel13))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(ipAlgoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ipPknTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ipMetNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ipMatInTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ipSbdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ipBIngTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ipImkTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ipOrkomTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        ipkL.setText("IPK Smester 2 Anda Adalah :");
        ipkL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ipkLMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ipkLMouseEntered(evt);
            }
        });

        ipkTF.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(ipkL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ipkTF, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipkL)
                    .addComponent(ipkTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        countBtn2.setBackground(new java.awt.Color(51, 51, 51));
        countBtn2.setForeground(new java.awt.Color(255, 255, 255));
        countBtn2.setText("Reset");
        countBtn2.setToolTipText("Muat Ulang Inputan");
        countBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countBtn2ActionPerformed(evt);
            }
        });

        countBtn1.setBackground(new java.awt.Color(51, 51, 51));
        countBtn1.setForeground(new java.awt.Color(255, 255, 255));
        countBtn1.setText("Keluar");
        countBtn1.setToolTipText("Keluar dari Aplikasi");
        countBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countBtn1ActionPerformed(evt);
            }
        });

        countBtn.setBackground(new java.awt.Color(51, 51, 51));
        countBtn.setForeground(new java.awt.Color(255, 255, 255));
        countBtn.setText("Hitung IPK");
        countBtn.setToolTipText("Indeks Prestasi Kumulatif");
        countBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(countBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(countBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(countBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countBtn2)
                    .addComponent(countBtn1)
                    .addComponent(countBtn))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 383, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(827, 635));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void countBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countBtn1ActionPerformed
        exitProgram();
    }//GEN-LAST:event_countBtn1ActionPerformed

    private void countBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countBtn2ActionPerformed
        resetInput();
    }//GEN-LAST:event_countBtn2ActionPerformed

    private void countBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countBtnActionPerformed
        ipkTF.setText(setIPK());
    }//GEN-LAST:event_countBtnActionPerformed

    private void sksAlgoTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sksAlgoTFKeyReleased
        ipAlgoTF.setText(setIP(algoTF.getText(), sksAlgoTF.getText()));
    }//GEN-LAST:event_sksAlgoTFKeyReleased

    private void sksPknTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sksPknTFKeyReleased
        ipPknTF.setText(setIP(pknTF.getText(), sksPknTF.getText()));
    }//GEN-LAST:event_sksPknTFKeyReleased

    private void sksMetNumTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sksMetNumTFKeyReleased
        ipMetNumTF.setText(setIP(metNumTF.getText(), sksMetNumTF.getText()));
    }//GEN-LAST:event_sksMetNumTFKeyReleased

    private void sksMatInTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sksMatInTFKeyReleased
        ipMatInTF.setText(setIP(matInTF.getText(), sksMatInTF.getText()));
    }//GEN-LAST:event_sksMatInTFKeyReleased

    private void sksBIngTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sksBIngTFKeyReleased
        ipBIngTF.setText(setIP(bIngTF.getText(), sksBIngTF.getText()));
    }//GEN-LAST:event_sksBIngTFKeyReleased

    private void sksImkTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sksImkTFKeyReleased
        ipImkTF.setText(setIP(imkTF.getText(), sksImkTF.getText()));
    }//GEN-LAST:event_sksImkTFKeyReleased

    private void sksOrkomTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sksOrkomTFKeyReleased
        ipOrkomTF.setText(setIP(orkomTF.getText(), sksOrkomTF.getText()));
    }//GEN-LAST:event_sksOrkomTFKeyReleased

    private void sksSbdTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sksSbdTFKeyReleased
        ipSbdTF.setText(setIP(sbdTF.getText(), sksSbdTF.getText()));
    }//GEN-LAST:event_sksSbdTFKeyReleased

    private void algoLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_algoLMouseExited
        setColorAlgo();
    }//GEN-LAST:event_algoLMouseExited

    private void algoLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_algoLMouseEntered
        getColorAlgo();
    }//GEN-LAST:event_algoLMouseEntered

    private void pknLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pknLMouseEntered
        getColorPkn();
    }//GEN-LAST:event_pknLMouseEntered

    private void pknLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pknLMouseExited
        setColorPkn();
    }//GEN-LAST:event_pknLMouseExited

    private void metNumLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_metNumLMouseEntered
        getColorMetNum();
    }//GEN-LAST:event_metNumLMouseEntered

    private void metNumLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_metNumLMouseExited
        setColorMetNum();
    }//GEN-LAST:event_metNumLMouseExited

    private void matInLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matInLMouseEntered
        getColorMatIn();
    }//GEN-LAST:event_matInLMouseEntered

    private void matInLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matInLMouseExited
        setColorMatIn();
    }//GEN-LAST:event_matInLMouseExited

    private void sbdLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbdLMouseEntered
        getColorSbd();
    }//GEN-LAST:event_sbdLMouseEntered

    private void sbdLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbdLMouseExited
        setColorSbd();
    }//GEN-LAST:event_sbdLMouseExited

    private void ingLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingLMouseEntered
        getColorBing();
    }//GEN-LAST:event_ingLMouseEntered

    private void ingLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingLMouseExited
        setColorBing();
    }//GEN-LAST:event_ingLMouseExited

    private void imkLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imkLMouseEntered
        getColorImk();
    }//GEN-LAST:event_imkLMouseEntered

    private void imkLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imkLMouseExited
        setColorImk();
    }//GEN-LAST:event_imkLMouseExited

    private void orkomLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orkomLMouseEntered
        getColorOrkom();
    }//GEN-LAST:event_orkomLMouseEntered

    private void orkomLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orkomLMouseExited
        setColorOrkom();
    }//GEN-LAST:event_orkomLMouseExited

    private void ipkLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ipkLMouseEntered
        getColorIpk();
    }//GEN-LAST:event_ipkLMouseEntered

    private void ipkLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ipkLMouseExited
        setColorIpk();
    }//GEN-LAST:event_ipkLMouseExited

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel algoL;
    public javax.swing.JTextField algoTF;
    private javax.swing.JTextField bIngTF;
    private javax.swing.JToggleButton countBtn;
    private javax.swing.JToggleButton countBtn1;
    private javax.swing.JToggleButton countBtn2;
    private javax.swing.JLabel imkL;
    private javax.swing.JTextField imkTF;
    private javax.swing.JLabel ingL;
    private javax.swing.JTextField ipAlgoTF;
    private javax.swing.JTextField ipBIngTF;
    private javax.swing.JTextField ipImkTF;
    private javax.swing.JTextField ipMatInTF;
    private javax.swing.JTextField ipMetNumTF;
    private javax.swing.JTextField ipOrkomTF;
    private javax.swing.JTextField ipPknTF;
    private javax.swing.JTextField ipSbdTF;
    private javax.swing.JLabel ipkL;
    private javax.swing.JTextField ipkTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel matInL;
    private javax.swing.JTextField matInTF;
    private javax.swing.JLabel metNumL;
    private javax.swing.JTextField metNumTF;
    private javax.swing.JLabel orkomL;
    private javax.swing.JTextField orkomTF;
    private javax.swing.JLabel pknL;
    private javax.swing.JTextField pknTF;
    private javax.swing.JLabel sbdL;
    private javax.swing.JTextField sbdTF;
    private javax.swing.JTextField sksAlgoTF;
    private javax.swing.JTextField sksBIngTF;
    private javax.swing.JTextField sksImkTF;
    private javax.swing.JTextField sksMatInTF;
    private javax.swing.JTextField sksMetNumTF;
    private javax.swing.JTextField sksOrkomTF;
    private javax.swing.JTextField sksPknTF;
    private javax.swing.JTextField sksSbdTF;
    // End of variables declaration//GEN-END:variables

    
    // Method Merestart semua inputan       
    private void resetInput(){
        int jawab = JOptionPane.showOptionDialog(this,
            "Ingin Muat Ulang Inputan?",
            "Ulang",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, null, null );
            if (jawab == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(this, "Input Data Gaji Akan Dimuat Ulang");
                algoTF.setText("");
                pknTF.setText("");
                metNumTF.setText("");
                matInTF.setText("");
                sbdTF.setText("");
                bIngTF.setText("");
                imkTF.setText("");
                orkomTF.setText("");

                sksAlgoTF.setText("");
                sksPknTF.setText("");
                sksMetNumTF.setText("");
                sksMatInTF.setText("");
                sksSbdTF.setText("");
                sksBIngTF.setText("");
                sksImkTF.setText("");
                sksOrkomTF.setText("");

                ipAlgoTF.setText("");
                ipPknTF.setText("");
                ipMetNumTF.setText("");
                ipMatInTF.setText("");
                ipSbdTF.setText("");
                ipBIngTF.setText("");
                ipImkTF.setText("");
                ipOrkomTF.setText("");
            }
    }
    // Metod boolean exit
    private void exitProgram(){
        int jawab = JOptionPane.showOptionDialog(this,
            "Anda yakin Ingin Keluar?",
            "Exit",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, null, null );
        if (jawab == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Aplikasi akan keluar", "Aplikasi Keluar", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    // Icon STTBandung
    private void icon() {
        ImageIcon icon;
        icon = new ImageIcon("src/com/icon/icon.png");
        setIconImage(icon.getImage());
    }
    // Action Warna
    private void getColorIpk(){
        ipkL.setForeground(java.awt.Color.gray);
        ipkTF.setForeground(java.awt.Color.white);
        ipkTF.setBackground(java.awt.Color.gray);
        
    }
    
    private void setColorIpk(){
        ipkL.setForeground(java.awt.Color.black);
        ipkTF.setForeground(java.awt.Color.black);
        ipkTF.setBackground(java.awt.Color.white);
    }
    // Action Warna
    private void getColorAlgo(){
        algoL.setForeground(java.awt.Color.gray);
        algoTF.setForeground(java.awt.Color.white);
        sksAlgoTF.setForeground(java.awt.Color.white);
        ipAlgoTF.setForeground(java.awt.Color.white);
        
        algoTF.setBackground(java.awt.Color.gray);
        sksAlgoTF.setBackground(java.awt.Color.gray);
        ipAlgoTF.setBackground(java.awt.Color.gray);
    }
    
    private void setColorAlgo(){
        algoL.setForeground(java.awt.Color.black);
        algoTF.setForeground(java.awt.Color.black);
        sksAlgoTF.setForeground(java.awt.Color.black);
        ipAlgoTF.setForeground(java.awt.Color.black);
        
        algoTF.setBackground(java.awt.Color.white);
        sksAlgoTF.setBackground(java.awt.Color.white);
        ipAlgoTF.setBackground(java.awt.Color.white);
    }
    // Action Warna
    private void getColorPkn(){
        pknL.setForeground(java.awt.Color.gray);
        pknTF.setForeground(java.awt.Color.white);
        sksPknTF.setForeground(java.awt.Color.white);
        ipPknTF.setForeground(java.awt.Color.white);
        
        pknTF.setBackground(java.awt.Color.gray);
        sksPknTF.setBackground(java.awt.Color.gray);
        ipPknTF.setBackground(java.awt.Color.gray);
    }
    
    private void setColorPkn(){
        pknL.setForeground(java.awt.Color.black);
        pknTF.setForeground(java.awt.Color.black);
        sksPknTF.setForeground(java.awt.Color.black);
        ipPknTF.setForeground(java.awt.Color.black);
        
        pknTF.setBackground(java.awt.Color.white);
        sksPknTF.setBackground(java.awt.Color.white);
        ipPknTF.setBackground(java.awt.Color.white);
    }
    // Action Warna
    private void getColorMetNum(){
        metNumL.setForeground(java.awt.Color.gray);
        metNumTF.setForeground(java.awt.Color.white);
        sksMetNumTF.setForeground(java.awt.Color.white);
        ipMetNumTF.setForeground(java.awt.Color.white);
        
        metNumTF.setBackground(java.awt.Color.gray);
        sksMetNumTF.setBackground(java.awt.Color.gray);
        ipMetNumTF.setBackground(java.awt.Color.gray);
    }
    
    private void setColorMetNum(){
        metNumL.setForeground(java.awt.Color.black);
        metNumTF.setForeground(java.awt.Color.black);
        sksMetNumTF.setForeground(java.awt.Color.black);
        ipMetNumTF.setForeground(java.awt.Color.black);
        
        metNumTF.setBackground(java.awt.Color.white);
        sksMetNumTF.setBackground(java.awt.Color.white);
        ipMetNumTF.setBackground(java.awt.Color.white);
    }
    // Action Warna
    private void getColorMatIn(){
        matInL.setForeground(java.awt.Color.gray);
        matInTF.setForeground(java.awt.Color.white);
        sksMatInTF.setForeground(java.awt.Color.white);
        ipMatInTF.setForeground(java.awt.Color.white);
        
        matInTF.setBackground(java.awt.Color.gray);
        sksMatInTF.setBackground(java.awt.Color.gray);
        ipMatInTF.setBackground(java.awt.Color.gray);
    }
    
    private void setColorMatIn(){
        matInL.setForeground(java.awt.Color.black);
        matInTF.setForeground(java.awt.Color.black);
        sksMatInTF.setForeground(java.awt.Color.black);
        ipMatInTF.setForeground(java.awt.Color.black);
        
        matInTF.setBackground(java.awt.Color.white);
        sksMatInTF.setBackground(java.awt.Color.white);
        ipMatInTF.setBackground(java.awt.Color.white);
    }
    // Action Warna
    private void getColorSbd(){
        sbdL.setForeground(java.awt.Color.gray);
        sbdTF.setForeground(java.awt.Color.white);
        sksSbdTF.setForeground(java.awt.Color.white);
        ipSbdTF.setForeground(java.awt.Color.white);
        
        sbdTF.setBackground(java.awt.Color.gray);
        sksSbdTF.setBackground(java.awt.Color.gray);
        ipSbdTF.setBackground(java.awt.Color.gray);
    }
    
    private void setColorSbd(){
        sbdL.setForeground(java.awt.Color.black);
        sbdTF.setForeground(java.awt.Color.black);
        sksSbdTF.setForeground(java.awt.Color.black);
        ipSbdTF.setForeground(java.awt.Color.black);
        
        sbdTF.setBackground(java.awt.Color.white);
        sksSbdTF.setBackground(java.awt.Color.white);
        ipSbdTF.setBackground(java.awt.Color.white);
    }
    // Action Warna
    private void getColorBing(){
        ingL.setForeground(java.awt.Color.gray);
        bIngTF.setForeground(java.awt.Color.white);
        sksBIngTF.setForeground(java.awt.Color.white);
        ipBIngTF.setForeground(java.awt.Color.white);
        
        algoTF.setBackground(java.awt.Color.gray);
        sksBIngTF.setBackground(java.awt.Color.gray);
        ipBIngTF.setBackground(java.awt.Color.gray);
    }
    
    private void setColorBing(){
        ingL.setForeground(java.awt.Color.black);
        bIngTF.setForeground(java.awt.Color.black);
        sksBIngTF.setForeground(java.awt.Color.black);
        ipBIngTF.setForeground(java.awt.Color.black);
        
        algoTF.setBackground(java.awt.Color.white);
        sksBIngTF.setBackground(java.awt.Color.white);
        ipBIngTF.setBackground(java.awt.Color.white);
    }
    // Action Warna
    private void getColorImk(){
        imkL.setForeground(java.awt.Color.gray);
        imkTF.setForeground(java.awt.Color.white);
        sksImkTF.setForeground(java.awt.Color.white);
        ipImkTF.setForeground(java.awt.Color.white);
        
        imkTF.setBackground(java.awt.Color.gray);
        sksImkTF.setBackground(java.awt.Color.gray);
        ipImkTF.setBackground(java.awt.Color.gray);
    }
    
    private void setColorImk(){
        imkL.setForeground(java.awt.Color.black);
        imkTF.setForeground(java.awt.Color.black);
        sksImkTF.setForeground(java.awt.Color.black);
        ipImkTF.setForeground(java.awt.Color.black);
        
        imkTF.setBackground(java.awt.Color.white);
        sksImkTF.setBackground(java.awt.Color.white);
        ipImkTF.setBackground(java.awt.Color.white);
    }
    // Action Warna
    private void getColorOrkom(){
        orkomL.setForeground(java.awt.Color.gray);
        orkomTF.setForeground(java.awt.Color.white);
        sksOrkomTF.setForeground(java.awt.Color.white);
        ipOrkomTF.setForeground(java.awt.Color.white);
        
        orkomTF.setBackground(java.awt.Color.gray);
        sksOrkomTF.setBackground(java.awt.Color.gray);
        ipOrkomTF.setBackground(java.awt.Color.gray);
    }
    
    private void setColorOrkom(){
        orkomL.setForeground(java.awt.Color.black);
        orkomTF.setForeground(java.awt.Color.black);
        sksOrkomTF.setForeground(java.awt.Color.black);
        ipOrkomTF.setForeground(java.awt.Color.black);
        
        orkomTF.setBackground(java.awt.Color.white);
        sksOrkomTF.setBackground(java.awt.Color.white);
        ipOrkomTF.setBackground(java.awt.Color.white);
    }
}
