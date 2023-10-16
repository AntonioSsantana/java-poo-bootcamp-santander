package poo_java_desafio;

import poo_java_desafio.apps.*;

public class Iphone {

  public static void main(String[] args) {
    AppleMusic appleMusic = new AppleMusic();
    Safari safari = new Safari();
    
    appleMusic.selectMusic("The Trooper - 2015 Remaster");
    appleMusic.play();
    appleMusic.pause();
    
    System.out.println("________________________________________");
    
    safari.openPage();
    safari.addNewPage();
    safari.refreshPage();
    
    System.out.println("________________________________________");
    
    call(1198548332);
    answer();
    voiceMail();
  }

  public static void call(long number) {
    System.out.println("Ligando para o número " + number);
  }
  
  public static void answer() {
    System.out.println("Atendendo ligação...");
  }

  public static void voiceMail() {
    System.out.println("Iniciando correio de voz...");
  }

}
