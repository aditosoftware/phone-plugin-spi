package de.adito.aditoweb.cti.spi.listener;

import java.util.EventListener;

/**
 * CallEventListener für Ereignisse, die von einem Call ausgelöst werden
 *
 * @author r.loipfinger,  02.03.11
 */
public interface ICallEventListener extends EventListener
{
  /**
   * Wird aufgerufen, wenn sich der State des Calls geändert hat
   *
   * @param pEvent das Event
   */
  void stateChanged(AditoCallEvent pEvent);

  /**
   * Wird aufgerufen, wenn ein Private-Data Ereignis aufgerufen wurde
   *
   * @param pEvent das Event
   */
  void privateDataReceived(AditoPrivateDataEvent pEvent);

}
