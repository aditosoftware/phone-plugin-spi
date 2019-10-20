package de.adito.aditoweb.cti.spi;

/**
 * Enthält die Informationen über einen Call
 *
 * @author r.loipfinger,  02.03.11
 */
public interface ICallInfo
{
  enum ECallDirection
  {
    INCOMING,
    OUTGOING
  }


  /**
   * in welche Richtung das Telefonat ausgelöst wurde
   *
   * @return ECallDirection
   */
  ECallDirection getCallDirection();

  /**
   * gibt den Gesprächspartner als String zurück. (Nummer)
   *
   * @return callPartner falls dieser existiert - ansonsten 'unknown'
   */
  String getCallPartner();

  /**
   * liefert den Status von diesem ICall
   *
   * @return state
   */
  ECallState getState();

  /**
   * liefert die eindeutige ID für diese ICall
   *
   * @return uniqueID
   */
  String getID();

}
