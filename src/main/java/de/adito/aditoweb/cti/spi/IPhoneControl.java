package de.adito.aditoweb.cti.spi;

/**
 * Implementierungen dieses Interfaces k�nnen ICalls eines IPhones steuern.
 * Alle Befehle sollten in einem eigenem Thread durchgef�hrt werden, da die
 * Verarbeitungsdauer eines Befehls von der Telefoniehardware, nicht bekannt
 * ist.
 *
 * @author J. Boesl, 10.05.2005
 */


public interface IPhoneControl
{
  /**
   * Erstellt einen neuen call der zu der angegebenen Adresse verbindet.
   * Da immer nur ein call aktiv sein kann darf um einen call abzusetzen
   * grad kein anderer call aktiv sein.
   *
   * @param pAddress die anzuwählende Adresse
   * @throws CtiException wenn dabei ein Fehler aufgetreten ist.
   */
  void putCall(String pAddress) throws CtiException;

  /**
   * wecheslt aus dem Zustand talking in hold und umgekehrt.
   *
   * @param pCall der Call, dessen Hold-Zustand geswitched werden soll
   * @throws CtiException wenn dabei ein Fehler aufgetreten ist.
   */
  void switchHold(ICall pCall) throws CtiException;

  /**
   * antwortet auf einen ICall. Diese ICall muss sich im Zustand 'STATE_RINGING' befinden
   *
   * @param pCall der ICall auf der 'abgehoben' werden soll
   * @throws CtiException wenn dabei ein Fehler aufgetreten ist.
   */
  void answer(ICall pCall) throws CtiException;

  /**
   * Beendet einen ICall.
   *
   * @param pCall der zu beendende ICall
   * @throws CtiException wenn dabei ein Fehler aufgetreten ist.
   */
  void hangUp(ICall pCall) throws CtiException;

  /**
   * bereitet eine Konferenz vor (nicht bei allen ServiceProvidern nötig (eig. nur tapi))
   *
   * @param pFirstCall bestehender Call
   * @param pAddress   Zieladresse
   * @throws CtiException wenn dabei ein Fehler aufgetreten ist.
   */
  void joinSetup(ICall pFirstCall, String pAddress) throws CtiException;

  /**
   * Verbindet zwei Calls zu einem, so dass eine Konferenz entsteht (entspricht joinFinish bei tapi)
   *
   * @param pFirstCall  Gespräch Nr. 1
   * @param pSecondCall Gespräch Nr. 2
   * @throws CtiException wenn dabei ein Fehler aufgetreten ist.
   */
  void join(ICall pFirstCall, ICall pSecondCall) throws CtiException;

  /**
   * bereitet einen Transfer vor (nicht bei allen ServiceProvidern nötig (eig. nur tapi))
   *
   * @param pFirstCall bestehender Call
   * @param pAddress   Zieladresse
   * @throws CtiException wenn dabei ein Fehler aufgetreten ist.
   */
  void transferSetup(ICall pFirstCall, String pAddress) throws CtiException;

  /**
   * Übergibt einen Call an einen bestimmten Zielcall (entspricht transferFinish bei tapi)
   *
   * @param pFirstCall  erster Call
   * @param pSecondCall zweiter Call
   * @throws CtiException wenn dabei ein Fehler aufgetreten ist.
   */
  void transfer(ICall pFirstCall, ICall pSecondCall) throws CtiException;

  /**
   * Übergibt einen Call an eine bestimmte Adresse. Funktioniert im state connected und ringing
   *
   * @param pCall    der zu übergebende ICall
   * @param pAddress die Zieladresse
   * @throws CtiException wenn dabei ein Fehler aufgetreten ist.
   */
  void transferSimple(ICall pCall, String pAddress) throws CtiException;

  /**
   * sendet Benutzer- und Gerätspezifische Kommandos
   *
   * @param pCall    (optional) wenn sich der Befehl auf einen Call bezieht, ansonsten einfach null
   * @param pDetails die von Tapi erwartet Datenstrucktur als Bytearray
   * @throws CtiException wenn dabei ein Fehler aufgetreten ist.
   */
  void sendPrivateData(ICall pCall, byte[] pDetails) throws CtiException;

}
