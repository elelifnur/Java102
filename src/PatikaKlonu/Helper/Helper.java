package PatikaKlonu.Helper;

import javax.swing.*;
import java.awt.*;

public class Helper {
    public static void setLayout(){
        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
            if ("NIMBUS".equals(info.getName())){
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException |
                         InstantiationException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
    public static int screenCenter(String eksen, Dimension size){
        int point= 0;
        switch (eksen){
            case "x" :
                point = (Toolkit.getDefaultToolkit().getScreenSize().width - size.width ) / 2;
                break;
            case "y":
                point =  (Toolkit.getDefaultToolkit().getScreenSize().height - size.height ) / 2;
                break;
        }
        return point;
    }
    public static boolean isFieldEmpty(JTextField field){
        return field.getText().trim().isEmpty();
    }

    public static void showMsg(String str){
        String msg;
        String title;
        switch (str){
            case "fill":
               msg = "Lütfen tüm alanları doldurunuz!";
               title = "Hata!";
               break;
            case "done":
                msg ="İşlem Başarılı!";
                title = "Sonuç";
                break;
            case "error":
                msg = "Bir hata oluştu!";
                title = "Hata!";
            default:
                msg = str;
                title = "Mesaj";
        }
        JOptionPane.showMessageDialog(null,msg,title,JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean confirm(String str){
        oprionPaneTR();
        String msg;
        switch (str){
            case "Sure":
                msg = "Bu işlemi gerçekleştirmek istediğinize emin misiniz?";
                break;
            default:
                msg = str;
        }
        return JOptionPane.showConfirmDialog(null,msg,"Son kararın mı?",JOptionPane.YES_NO_OPTION) == 0;
    }

    public static void oprionPaneTR(){
        UIManager.put("OptionPane.okButtonText", "Tamam");
        UIManager.put("OptionPane.yesButtonText", "Evet");
        UIManager.put("OptionPane.noButtonText", "Hayır");



    }
}
