package de.adito.aditoweb.cti.spi.listener;

import java.util.EventListener;

/**
 * @author J. Boesl, 10.05.2005
 */


public interface ICallListener extends EventListener
{

  /**
   * Wird ausgelöst wenn ein neuer ICall auftritt.
   *
   * @param pEvent das AditoCallevent, dass den ICall kapselt
   */
  void callHappened(AditoCallEvent pEvent);

  /**
   * Wird ausgelöst wenn ein ICall beendet wird.
   *
   * @param pEvent das AditoCallevent, dass den ICall kapselt
   */
  void callEnded(AditoCallEvent pEvent);

}
