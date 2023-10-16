package poo_java_desafio.apps;

import poo_java_desafio.apps.interfaces.Browser;

public class Safari implements Browser {

  @Override
  public void openPage() {
    System.out.println("Carregando página...");
  }

  @Override
  public void addNewPage() {
    System.out.println("Abrindo nova página...");
  }

  @Override
  public void refreshPage() {
    System.out.println("Atualizando página...");
  }

}
