package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
//        JOptionPane.showMessageDialog(null,
//                "WARNING!!! Rahasia Negara",
//                "Dokumen Penting",
//                0);

        
//        String kuisku = (String)JOptionPane.showInputDialog(null,
//                "Silahkan Mengisi Data diri",
//                "Quiz",
//                2,
//                null,
//                null,
//                "Masukan Nama Anda.");
//        System.out.println(kuisku);        
        
        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
