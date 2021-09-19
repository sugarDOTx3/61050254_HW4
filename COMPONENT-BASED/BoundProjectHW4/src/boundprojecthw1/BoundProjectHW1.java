/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundprojecthw1;

import java.util.Scanner;
import javax.xml.bind.Marshaller.Listener;

/**
 *
 * @author SugarDOT
 */
public class BoundProjectHW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do {
            MyBean mySource = new MyBean();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Score:: ");
            String inputString = sc.nextLine();
            if ("".equals(inputString)) {
                System.out.println("No data");
                System.exit(0);
            } else {
                Listener1 listener1 = new Listener1();
                Listener2 listener2 = new Listener2();
                mySource.addPropertyChangeListener(listener1);
                mySource.addPropertyChangeListener(listener2);
                mySource.setValue(inputString);
            }
        } while (true);
    }

}
