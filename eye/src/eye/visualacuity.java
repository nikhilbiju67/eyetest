/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eye;

import java.awt.Font;
import static org.apache.derby.iapi.util.StringUtil.split;

/**
 *
 * @author nikhil
 */
public class visualacuity extends javax.swing.JPanel {

    /**
     * Creates new form visualacuity
     */
    
     int i=0;
    int eyeop=0;
    int rs1=0;
    int rs2=0;
    int testl;
    int testr;
    String letters;
    String displayform;
    public visualacuity() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        acuityresult = new warningback();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        warning = new warningback();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("E");

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("YES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("NO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(51, 51, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("                              CAN  YOU READ THESE LETTERS?");
        jLabel6.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap(235, Short.MAX_VALUE))
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jButton5.setText("main menu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));

        jButton6.setText("result");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(325, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 340, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout acuityresultLayout = new javax.swing.GroupLayout(acuityresult);
        acuityresult.setLayout(acuityresultLayout);
        acuityresultLayout.setHorizontalGroup(
            acuityresultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        acuityresultLayout.setVerticalGroup(
            acuityresultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        warning.setOpaque(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("jLabel7");

        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.setText("ok");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(388, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(363, 363, 363))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout warningLayout = new javax.swing.GroupLayout(warning);
        warning.setLayout(warningLayout);
        warningLayout.setHorizontalGroup(
            warningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        warningLayout.setVerticalGroup(
            warningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("     if you can read the letters then click yes else click no");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("start");
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("close your right eye");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sit at a distance of approx 40 cm from the screen");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        jPanel2.remove(jPanel1);
        // warning.add(jPanel3);
        jPanel2.add(jPanel3);
        jPanel3.setVisible(true);
        jPanel3.setSize(1366,768);
        jPanel2.revalidate();
        jPanel2.repaint();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        displayletters l=new displayletters();
       Thread t = new Thread(l);
        
        
        if(i==0)
        {   
            Font f=new Font("Tahoma",12,400);
            jLabel4.setFont(f);
            letters="ee";
            t.start();
            //jLabel4.setText("ee");
            i++;
            return;

        }
        if(i==1)
        {
            Font f=new Font("Tahoma",12,300);
            jLabel4.setFont(f);
            letters="12345";
            t.start();
            
           // jLabel4.setText("1");
            i++;
            rs1=i;
            return;
        }
        if(i==2)
        {
            Font f=new Font("Tahoma",12,250);
            jLabel4.setFont(f);
            letters="1234556";
            t.start();
           // jLabel4.setText("12");
            i++;
            rs1=i;
            return;

        }
        if(i==3)
        {
            Font f=new Font("Tahoma",12,200);
            jLabel4.setFont(f);
            letters="123456777";
            t.start();
           // jLabel4.setText("4A");
            i++;
            rs1=i;
            return;
        }
        if(i==4)
        {
            Font f=new Font("Tahoma",12,180);
            jLabel4.setFont(f);
            letters="dsfsdgdg";
            t.start();
           // jLabel4.setText("AB");
            i++;
            rs1=i;
            return;
        }

        if(i==5)
        {
            Font f=new Font("Tahoma",12,170);
            jLabel4.setFont(f);
            letters="1232dghgfhdf";
            t.start();
            //jLabel4.setText("XYU");
            i++;
            rs1=i;
            return;
        }
        if(i==6)
        {
            Font f=new Font("Tahoma",12,100);
            jLabel4.setFont(f);
            letters="asdfghj";
            t.start();
           // jLabel4.setText("DFG");
            i++;
            rs1=i;
            return;

        }

        if(i==7)
        {
            Font f=new Font("Tahoma",12,80);
            jLabel4.setFont(f);
            letters="erterter";
            t.start();
            //jLabel4.setText("KLMN");
            i++;
            rs1=i;
            return;
        }
        if(i==8)
        {
            Font f=new Font("Tahoma",12,60);
            jLabel4.setFont(f);
            letters="hnfgnf34345";
            t.start();
           // jLabel4.setText("EFGHJ");
            i++;
            rs1=i;
            return;
        }

        if(i==9)
        {
            Font f=new Font("Tahoma",12,50);
            jLabel4.setFont(f);
            letters="3456778";
          //  jLabel4.setText("PQRTYDFGHY");
            i++;
            rs1=i;
            return;
        }

        if(i==10)
        {
            Font f=new Font("Tahoma",12,40);
            jLabel4.setFont(f);
            letters="1232343hgfh";
            t.start();
            //jLabel4.setText("478923980");
            i++;
            rs1=i;
            return;
        }

        if(i==11)
        {
            Font f=new Font("Tahoma",12,30);
            jLabel4.setFont(f);
            letters="xcvbxcvbc";
            t.start();
            //jLabel4.setText("abdcgetyui");
            i++;
            rs1=i;
            return;
        }
        if(i==12)
        {
            Font f=new Font("Tahoma",12,25);
            jLabel4.setFont(f);
            letters="cvbcvbcvb";
            t.start();
            //jLabel4.setText("jknlmnopgq");
            i++;
            rs1=i;
            return;
        }
        if(i==13)
        {

            Font f=new Font("Tahoma",12,23);
            jLabel4.setFont(f);
            letters="nikhilbiju";
            t.start();
            //jLabel4.setText("dfghtyui");
            i++;
            rs1=i;
            return;
        }
        if(i==14)
        {

            Font f=new Font("Tahoma",12,20);
            jLabel4.setFont(f);
            letters="5363546";
            t.start();
          //  jLabel4.setText("eqoptyuij");
            i++;
            rs1=i;
            return;
        }
        if(i==15)
        {

            Font f=new Font("Tahoma",12,18);
            jLabel4.setFont(f);
            letters="ghodofghnhgn";
            t.start();
            //jLabel4.setText("haopyetesshhsfs");
            i++;
            rs1=i;
            return;
        }
        if(i==16)
        {

            Font f=new Font("Tahoma",12,16);
            jLabel4.setFont(f);
            letters="dghggdfg";
            //jLabel4.setText("efghrtertadxhxchdh");
            i++;
            rs1=i;
            return;
        }
        if(i==17)
        {

            Font f=new Font("Tahoma",12,12);
            jLabel4.setFont(f);
            letters="dfgdfg";
            t.start();
           // jLabel4.setText("nxksfgns");
            i++;
            rs1=i;
            return;
        }
        if(i==18)
        {

            /* Font f=new Font("Tahoma",12,8);
            jLabel4.setFont(f);
            jLabel4.setText("efgh");
            i++;
            rs1=i;
            i=0;*/
            jPanel2.remove(jPanel3);
            jPanel2.add(warning);
            warning.setSize(1366,768);
            jPanel2.repaint();
            jPanel2.revalidate();
            Font f=new Font("Tahoma",12,48);
            jLabel7.setFont(f);
            if(eyeop==0)
            {
                jLabel7.setText("you have no problems with your left eye");
                testl=0;
                i=0;
                rs2=rs1;
                Font f1=new Font("Tahoma",12,300);
                jLabel4.setFont(f1);
            }
            else if(eyeop==1)
            {
                Font f1=new Font("Tahoma",12,300);
                jLabel4.setFont(f1);
                i=0;
                jLabel7.setText("you have no problems with your right eye");
                testr=0;

            }

            i=0;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here
        if (rs1<14)

        {
            jPanel2.remove(jPanel3);
            jPanel2.add(warning);
            warning.setSize(1366,768);
            jPanel2.repaint();
            jPanel2.revalidate();
            Font f=new Font("Tahoma",12,48);
            jLabel7.setFont(f);
            if(eyeop==0)
            {
                jLabel7.setText("you have some problems with your left eye");
                testl=1;
                i=0;

            }
            else  if(eyeop==1)
            {
                jLabel7.setText("you have some problems with your right eye");
                testr=1;
                i=0;

            }

        }
        else

        {

            jPanel2.remove(jPanel3);
            jPanel2.add(warning);
            warning.setSize(1366,768);
            jPanel2.repaint();
            jPanel2.revalidate();
            Font f=new Font("Tahoma",12,48);
            jLabel7.setFont(f);
            if(eyeop==0)
            {
                jLabel7.setText("you have no problems with your right eye");
                testr=0;
                i=0;
            }
            else if(eyeop==1)
            {
                jLabel7.setText("you have no problems with your left eye");
                testl=0;
                i=0;

            }

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        jPanel2.remove(warning);
        Functionselect f=new Functionselect();
        jPanel2.add(f);
        f.setSize(1366,768);
        f.setVisible(true);
        jPanel2.repaint();
        jPanel2.revalidate();
        jPanel2.remove(acuityresult);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        if(testl==0)
        {
            jLabel3.setText("                            you have no problem with left eye");

        }
        if(testr==0)
        {
            jLabel5.setText("                             you have no problem with right eye");
        }
        if(testl==1)
        {
            jLabel3.setText("                             you have visual problem with left eye");
        }
        if(testr==1)
        {
            jLabel5.setText("                             you have visual problem with right eye");
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        if(eyeop==0)
        {
            jPanel2.remove(warning);
            jLabel2.setText("close your left eye");
            jPanel2.add(jPanel1);
            jPanel2.setSize(1366,768);
            jPanel2.revalidate();
            jPanel2.repaint();
            eyeop++;
            rs2=rs1;
        }

        else if(eyeop==1)
        {
            jPanel2.add(acuityresult);
            acuityresult.setVisible(true);
            acuityresult.setSize(1366,768);
            jPanel2.remove(warning);
            jPanel2.revalidate();
            jPanel2.repaint();

        }

    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acuityresult;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel warning;
    // End of variables declaration//GEN-END:variables

    
    
     class displayletters implements Runnable {
         int z;
    
        public void run() {
            while(true)
            {
           
       try
       {
           
       //  MP3 m=new MP3();
        // m.play();
          int lenght=letters.length();
          for(z=0;z<lenght;z++)
          {
           displayform=letters.substring(0,z);
           jLabel4.setText(displayform);
           System.out.println(displayform);
           
           Thread.sleep(100);
          }
           if(z>=lenght)
               break;
         // Thread.interrupted();
           
           }
        catch(InterruptedException e)
        {
           e.getMessage();
        }}}}
}


