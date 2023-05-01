
package bytestreams2;

import java.io.*;
import java.lang.System.*;
import java.lang.System.Logger.Level;





public class LAB5 {

    public static void main(String[] args) throws ClassNotFoundException {
        Student s = new Student("1111", "Tako");
        
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(s);
            
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAB5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(LAB5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream file = new  FileInputStream("data.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            Student ss = (Student)input.readObject();
            System.out.println(ss);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAB5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(LAB5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
}
