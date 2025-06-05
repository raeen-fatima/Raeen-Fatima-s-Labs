package GUI;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

public class AudioClipDemo extends Applet implements ActionListener {
    AudioClip clip;
    Button playBtn, stopBtn, loopBtn;

    public void init() {
        // Load audio clip from applet’s code base directory
        clip = getAudioClip(getCodeBase(), "sound.wav");

        // Create buttons
        playBtn = new Button("Play");
        stopBtn = new Button("Stop");
        loopBtn = new Button("Loop");

        // Add buttons to applet window
        add(playBtn);
        add(stopBtn);
        add(loopBtn);

        // Add action listeners
        playBtn.addActionListener(this);
        stopBtn.addActionListener(this);
        loopBtn.addActionListener(this);
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == playBtn) {
            clip.play();  // play audio once
            showStatus("Playing audio once");
        } else if (e.getSource() == stopBtn) {
            clip.stop();  // stop audio
            showStatus("Audio stopped");
        } else if (e.getSource() == loopBtn) {
            clip.loop();  // play audio repeatedly
            showStatus("Audio looping");
        }
    }
}
