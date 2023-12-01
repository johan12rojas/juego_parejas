
package juego_parejas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;


class metodos {
    
    public void audio(){
    try {

         File audioFile = new File("C:\\Users\\Johan\\Documents\\NetBeansProjects\\juego_parejas\\audio\\Sonido de botón para tus videos.wav");
         AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
         Clip clip = AudioSystem.getClip();
         clip.open(audioStream);

         clip.start();
         
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
    

    boolean isPlaying = false;
Clip clip;

public void au3(String cancion){
    try {
         if (clip == null) {
             clip = AudioSystem.getClip();
         }
         if (!isPlaying) {
             File audioFile = new File(cancion);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
             clip.open(audioStream);
             clip.start();
             isPlaying = true;
         } else {
             clip.stop();
             clip.close();
             isPlaying = false;
         }
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }

public void metodofecha(JLabel label) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    Timer timer = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            label.setText(dtf.format(LocalDateTime.now()));
        }
    });
    timer.start();
}

public void metodohora(JLabel label) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    Timer timer = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            label.setText(dtf.format(LocalDateTime.now()));
        }
    });
    timer.start();
}

 public int[] ObtenerNumeroCartas() {

        int[] Numeros = new int[36];
        int Contador = 0;

        while (Contador < 36) {
            Random Ram = new Random();
            int NumeroRandom = Ram.nextInt(12) + 1;
            int Maximo = 0;

            for (int a = 0; a < 36; a++) {
                if (Numeros[a] == NumeroRandom) {
                    Maximo++;
                }
            }
            if (Maximo < 3) {
                Numeros[Contador] = NumeroRandom;
                Contador++;
            }

        }
        return Numeros;
    }
 
 public void Ganar(boolean Win, JFrame Panel) {
        if (Win == true) {
            Panel.dispose();
        }
    }
}
