/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

import java.io.File;
import java.io.FileNotFoundException;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author 7ooda74
 */
public class load {

    public static void main(String args[]) {

        loading l = new loading();
        l.setVisible(true);
      
        try {

            for (int i = 0; i <= 100; i++) {
                Thread.sleep(90);
                HMS h = new HMS();
                if (i == 100) {
                    h.setVisible(true);
                    l.hide();
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Failure", JOptionPane.ERROR_MESSAGE);

        }

    }

}
