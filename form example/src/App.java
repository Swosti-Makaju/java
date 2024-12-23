import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
       JFrame f=new JFrame();
      JComboBox<String>titleComboBox;
       JTextField firstnameField;
       JTextField lastnameField;
       JTextField usernameField;
       JTextField passwordField;
       JTextField emailField;
       JRadioButton maleButton;
       JRadioButton femaleButton;
       JCheckBox courseJava;
       JCheckBox courseC;
       JCheckBox coursepython;
       JButton saveButton;

       f.setTitle("Form");
       JLabel titleLabel=new JLabel("Title:");
       titleLabel.setBounds(20, 0, 100, 25);
       String[] titles={"Mr","Mrs","Miss"};
       titleComboBox=new JComboBox<>(titles);
       titleComboBox.setBounds(140, 0, 100, 25);
       f.add(titleLabel);
       f.add(titleComboBox);

       JLabel firstnameLabel=new JLabel("First-name:");
        firstnameLabel.setBounds(20, 30, 100, 25);
        firstnameField=new JTextField();
       firstnameField.setBounds(140, 30, 200, 25);
        f.add(firstnameLabel);
        f.add(firstnameField);

        JLabel lastnameLabel=new JLabel("Last-name:");
        lastnameLabel.setBounds(20, 60, 100, 25);
        lastnameField=new JTextField();
      lastnameField.setBounds(140, 60, 200, 25);
        f.add(lastnameLabel);
        f.add(lastnameField);
       
       JLabel emailLabel=new JLabel("Email:");
        emailLabel.setBounds(20, 90, 100, 25);
        emailField=new JTextField();
        emailField.setBounds(140, 90, 200, 25);
        f.add(emailLabel);
        f.add(emailField);

        JLabel usernameLabel=new JLabel("Username:");
        usernameLabel.setBounds(20, 120, 100, 25);
        usernameField=new JTextField();
        usernameField.setBounds(140, 120, 200, 25);
        f.add(usernameLabel);
        f.add(usernameField);

        JLabel passwordLabel=new JLabel("Password:");
        passwordLabel.setBounds(20, 150, 100, 25);
       passwordField=new JTextField();
       passwordField.setBounds(140, 150, 200, 25);
        f.add(passwordLabel);
        f.add(passwordField);

        JLabel genderLabel=new JLabel("Gender:");
        genderLabel.setBounds(20, 180, 100, 25);
        maleButton=new JRadioButton("Male");
        maleButton.setBounds(140, 180, 100, 25);
        femaleButton=new JRadioButton("Female");
        femaleButton.setBounds(240, 180, 100, 25);
        ButtonGroup genderGroup=new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        f.add(genderLabel);
        f.add(maleButton);
        f.add(femaleButton);

        JLabel coursesLabel=new JLabel("Courses:");
       coursesLabel.setBounds(20, 210, 100, 25);
       courseJava=new JCheckBox("Java");
        courseJava.setBounds(140, 210, 100, 25);
      courseC=new JCheckBox("C");
        courseC.setBounds(140, 240, 100, 25);
      coursepython=new JCheckBox("Python");
       coursepython.setBounds(140, 240, 100, 25);
        f.add(coursesLabel);
        f.add(courseJava);
        f.add(courseC);
        f.add(coursepython);

        saveButton=new JButton("Save");
        saveButton.setBounds(140, 270, 100, 25);
        f.add(saveButton);

       f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}