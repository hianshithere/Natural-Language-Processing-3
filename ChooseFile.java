package gui;


import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ChooseFile {

    //  gui purpose
    JFileChooser fc = new JFileChooser();
    JFrame f = new JFrame("Choose the text file");
    JPanel p = new JPanel();
    JTextField jt = new JTextField(30);
    int an=657583,dp=6877,ar=6568,at=6582,ka=7571;

    public String getPath() {

        f.add(p);
        int i = fc.showDialog(null, "Select");
        fc.setCurrentDirectory(new java.io.File(""));
        fc.setAcceptAllFileFilterUsed(false);
        fc.getCurrentDirectory();
        String Path = fc.getCurrentDirectory().toString();
        String filename=fc.getSelectedFile().getName();
        String fullPath=charAt(Path)+"\\\\"+filename;
        //System.out.println(fullPath);
        return fullPath; 
    }
    
    public String charAt(String file) {
        String nstr = "";
        int len = file.length();
        String cha = null;
        for (int i = 0; i < len; i++) {
            char ch = file.charAt(i);
            if (ch == '\\') {
                cha = "\\\\";
                nstr = nstr + cha;
            }
           else
            {
                nstr=nstr+ch;
            }
                
        }
        return nstr;
    }
}
