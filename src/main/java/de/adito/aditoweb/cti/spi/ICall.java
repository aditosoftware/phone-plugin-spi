package de.adito.aditoweb.cti.spi;

import de.adito.aditoweb.cti.spi.listener.ICallEventListener;

/**
 * Ein ICall stellt ein Telefonat dar. Jedes Telefonat hat seine eigenen Zustände und kann seperat im IPhone gesteuert werden.
 *
 * @author J. Boesl, 11.05.2005
 */


public interface ICall extends ICallInfo
{
  /**
   * Listener für PrivateData-Ereigenisse einhängen
   */
  void addCallEventListener(ICallEventListener pListener);

  /**
   * Listener für PrivateData-Ereignisse entfernen
   */
  void removeCallEventListener(ICallEventListener pListener);
}
