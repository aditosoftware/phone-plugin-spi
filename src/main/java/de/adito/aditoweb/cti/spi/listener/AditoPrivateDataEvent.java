package de.adito.aditoweb.cti.spi.listener;

import de.adito.aditoweb.cti.spi.ICall;

import java.util.Map;

/**
 * Event für das empfangen von privaten Daten
 *
 * @author r.loipfinger,  02.03.11
 */
public class AditoPrivateDataEvent extends AditoCallEvent
{
  private final Map<String, String> privateData;

  public AditoPrivateDataEvent(ICall pCall, Map<String, String> pPrivateData)
  {
    super(pCall);
    privateData = pPrivateData;
  }

  /**
   * Liefert die Daten
   *
   * @return die Daten
   */
  public Map<String, String> getPrivateData()
  {
    return privateData;
  }
}
