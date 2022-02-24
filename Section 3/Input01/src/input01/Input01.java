package input01;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
//        String inputString = JOptionPane.showInputDialog("Ketikan Sesuatu: ");

//        System.out.println(inputString);
//
//        int input = Integer.parseInt(inputString);
//        input++; 

        
//        String input = (String)JOptionPane.showInputDialog(null,
//                                                        "Is this a question?",
//                                                        "Dialog Title",
//                                                        2,
//                                                        null,
//                                                        null,
//                                                        "Type something here.");
//        System.out.println(input);
        
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
