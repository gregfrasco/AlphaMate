/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitConvertor;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//UnitConvertor//UnitConverters//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "UnitConvertersTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "editor", openAtStartup = false)
@ActionID(category = "Window", id = "UnitConvertor.UnitConvertersTopComponent")
@ActionReference(path = "Menu/Tools" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_UnitConvertersAction",
        preferredID = "UnitConvertersTopComponent"
)
@Messages({
    "CTL_UnitConvertersAction=Unit Converter",
    "CTL_UnitConvertersTopComponent=Unit Converter",
    "HINT_UnitConvertersTopComponent=Unit Converter"
})
public final class UnitConverterTopComponent extends TopComponent {

    private UnitConverterController[] controllers;
    
    public UnitConverterTopComponent() {
        initComponents();
        setName(Bundle.CTL_UnitConvertersTopComponent());
        setToolTipText(Bundle.HINT_UnitConvertersTopComponent());
        initMyComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(UnitConverterTopComponent.class, "UnitConverterTopComponent.jLabel1.text")); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 457, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        this.setVisiable((String) this.jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
    
    @SuppressWarnings({"empty-statement","unchecked","rawtypes"})
    private void initMyComponents() {
        String[] numberOfConvertors = {"1", "2", "3", "4", "5"};
        this.jComboBox1.setModel(new DefaultComboBoxModel(numberOfConvertors));
        this.jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));
        controllers = new UnitConverterController[5];
        for (int i = 0; i < 5; i++) {
            this.controllers[i] = new UnitConverterController();
            this.jPanel1.add(this.controllers[i].getUnitConverterView());
        }
        setVisiable("1");
    }

    @SuppressWarnings("fallthrough")
    private void setVisiable(String number) {
        this.controllers[0].getUnitConverterView().setVisible(false);
        this.controllers[1].getUnitConverterView().setVisible(false);
        this.controllers[2].getUnitConverterView().setVisible(false);
        this.controllers[3].getUnitConverterView().setVisible(false);
        this.controllers[4].getUnitConverterView().setVisible(false);
        switch ((int) Double.parseDouble(number)) {
            case 5:
                this.controllers[4].getUnitConverterView().setVisible(true);
            case 4:
                this.controllers[3].getUnitConverterView().setVisible(true);
            case 3:
                this.controllers[2].getUnitConverterView().setVisible(true);
            case 2:
                this.controllers[1].getUnitConverterView().setVisible(true);
            case 1:
                this.controllers[0].getUnitConverterView().setVisible(true);
        }
    }
}
