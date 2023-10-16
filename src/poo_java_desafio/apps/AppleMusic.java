package poo_java_desafio.apps;

import poo_java_desafio.apps.interfaces.MusicPlayer;

public class AppleMusic implements MusicPlayer {
  private String music;
  private boolean isPlaying = false;

  @Override
  public void selectMusic(String music) {
    this.music = music;
  }

  @Override
  public void play() {
    if (!music.isEmpty()) {
      System.out.println("Tocando: " + this.music + " no AppleMusic");
      this.isPlaying = true;
    } else { 
      System.out.println("Selecione uma música...");
    }
  }

  @Override
  public void pause() {
    if (this.isPlaying == true) {
      System.out.println("Pausando...");
      this.isPlaying = false;
    } else {
      System.out.println("Nenhuma música tocando...");      
    }
  }
}
