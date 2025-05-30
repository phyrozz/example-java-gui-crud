import pages.StudentPage;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentPage::new);
    }
}