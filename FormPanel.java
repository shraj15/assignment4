/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import javax.swing.JOptionPane;
import Model.Patient;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shrajnashetty
 */
public class FormPanel extends javax.swing.JPanel {

    private Patient getPatientData() {
    Patient newPatient = new Patient();

    newPatient.setfirstName(FirstNameTextField.getText());
    newPatient.setlastName(LastNameTextField.getText());
    newPatient.setage(AgeTextField.getText());
    newPatient.setemail(EmailTextField.getText());
    newPatient.setgender(GenderButtonGroup.getSelection() != null ? GenderButtonGroup.getSelection().getActionCommand() : "");
    newPatient.setmessage(MessageTextArea.getText());
    newPatient.settype(TypeComboBox.getSelectedItem() != null ? TypeComboBox.getSelectedItem().toString() : "");

    return newPatient;
}
    

    /**
     * Creates new form FormPanel
     */
    private JPanel bottomPanel;
    public FormPanel(JPanel inputPanel){
        initComponents();
        this.bottomPanel=inputPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderButtonGroup = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        FirstNameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        AgeComboBox = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        LastNameTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        FemaleRadioButton = new javax.swing.JRadioButton();
        MaleRadioButton = new javax.swing.JRadioButton();
        PreferNotRadioButton = new javax.swing.JRadioButton();
        SubmitButton = new javax.swing.JButton();
        AgeTextField = new javax.swing.JTextField();
        MessageLabel = new javax.swing.JLabel();
        MessageScrollPanel = new javax.swing.JScrollPane();
        MessageTextArea = new javax.swing.JTextArea();
        TypeLabel = new javax.swing.JLabel();
        TypeComboBox = new javax.swing.JComboBox<>();
        DOBLabel = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        MainPanel.setBackground(new java.awt.Color(204, 204, 204));

        TitleLabel.setFont(new java.awt.Font("AppleMyungjo", 3, 24)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("PATIENT REGISTRATION FORM");

        FirstNameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        FirstNameLabel.setText("First Name :");

        LastNameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LastNameLabel.setText("Last Name :");

        AgeComboBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        AgeComboBox.setText("Age :");

        EmailLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        EmailLabel.setText("Email :");

        GenderLabel.setText("Gender :");

        FirstNameTextField.setToolTipText("");

        LastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTextFieldActionPerformed(evt);
            }
        });

        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });

        GenderButtonGroup.add(FemaleRadioButton);
        FemaleRadioButton.setText("Female");
        FemaleRadioButton.setActionCommand("FEMALE");

        GenderButtonGroup.add(MaleRadioButton);
        MaleRadioButton.setText("Male");
        MaleRadioButton.setActionCommand("MALE");

        GenderButtonGroup.add(PreferNotRadioButton);
        PreferNotRadioButton.setText("Prefer not to say");
        PreferNotRadioButton.setActionCommand("NOT SPECIFIED");

        SubmitButton.setBackground(new java.awt.Color(153, 204, 255));
        SubmitButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        SubmitButton.setText("SUBMIT");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        MessageLabel.setText("Message :");

        MessageTextArea.setColumns(20);
        MessageTextArea.setRows(5);
        MessageScrollPanel.setViewportView(MessageTextArea);

        TypeLabel.setText("Type :");

        TypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pediatric", "Chronic", "Acute" }));
        TypeComboBox.setSelectedIndex(-1);
        TypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeComboBoxActionPerformed(evt);
            }
        });

        DOBLabel.setText("Date of Birth :");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstNameLabel)
                            .addComponent(LastNameLabel)
                            .addComponent(AgeComboBox)
                            .addComponent(EmailLabel)
                            .addComponent(GenderLabel)
                            .addComponent(MessageLabel)
                            .addComponent(TypeLabel)
                            .addComponent(DOBLabel))
                        .addGap(177, 177, 177)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(MaleRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(FemaleRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(PreferNotRadioButton))
                            .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MessageScrollPanel)
                            .addComponent(EmailTextField)
                            .addComponent(LastNameTextField)
                            .addComponent(FirstNameTextField)
                            .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLabel)
                    .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LastNameLabel)
                    .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeComboBox)
                    .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLabel)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenderLabel)
                    .addComponent(MaleRadioButton)
                    .addComponent(FemaleRadioButton)
                    .addComponent(PreferNotRadioButton))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeLabel)
                    .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(DOBLabel)
                        .addGap(41, 41, 41)
                        .addComponent(MessageLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MessageScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTextFieldActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_EmailTextFieldActionPerformed
private boolean isValidEmail(String email) {
    return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$");
}
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        String firstName = FirstNameTextField.getText();
        String lastName = LastNameTextField.getText();
        String age = AgeTextField.getText();
        String email = EmailTextField.getText();
        String gender = GenderButtonGroup.getSelection() != null ? GenderButtonGroup.getSelection().getActionCommand() : "";
        String message = MessageTextArea.getText();
        String type = TypeComboBox.getSelectedItem() != null ? TypeComboBox.getSelectedItem().toString() : "";

        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Invalid email address", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        if (firstName.isEmpty() || lastName.isEmpty() || age.isEmpty() || gender.isEmpty() || type.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
       if (jDateChooser1.getDate() == null) {
        JOptionPane.showMessageDialog(this, "Please select a valid date of birth", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    } 
    
  Patient newPatient = new Patient();
    newPatient.setfirstName(firstName);
    newPatient.setlastName(lastName);
    newPatient.setage(age);
    newPatient.setemail(email);
    newPatient.setgender(gender);
    newPatient.setmessage(message);
    newPatient.settype(type);
    newPatient.setDateOfBirth(jDateChooser1.getDate());

    
    ViewPanel newViewPanel = new ViewPanel(newPatient);
    bottomPanel.add(newViewPanel, "viewPanel");
    CardLayout layout = (CardLayout) bottomPanel.getLayout();
    layout.show(bottomPanel, "viewPanel");

    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void TypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeComboBox;
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JRadioButton FemaleRadioButton;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.ButtonGroup GenderButtonGroup;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JRadioButton MaleRadioButton;
    private javax.swing.JLabel MessageLabel;
    private javax.swing.JScrollPane MessageScrollPanel;
    private javax.swing.JTextArea MessageTextArea;
    private javax.swing.JRadioButton PreferNotRadioButton;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JComboBox<String> TypeComboBox;
    private javax.swing.JLabel TypeLabel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    // End of variables declaration//GEN-END:variables
}
