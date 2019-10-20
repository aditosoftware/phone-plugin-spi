package de.adito.aditoweb.cti.spi;

/**
 * @author j.boesl, 14.09.19
 */
public interface IPhoneFactory
{

  /**
   * Erzeugt ein IPhone als Grundlage der Telefonie
   *
   * @param pAddress  die Adresse
   * @param pTerminal das Terminal
   * @return das IPhoneObjekt
   * @throws CtiException wenn dabei ein Fehler aufgetreten ist
   */
  IPhone createPhone(String pAddress, String pTerminal) throws CtiException;

  /**
   * Liefert die am Provider möglichen Addressen
   *
   * @return die Addressen
   * @throws CtiException wenn dabei ein Fehler auftritt.
   */
  String[] getAddresses() throws CtiException;

}
