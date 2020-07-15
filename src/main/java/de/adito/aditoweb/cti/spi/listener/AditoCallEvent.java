package de.adito.aditoweb.cti.spi.listener;

import de.adito.aditoweb.cti.spi.*;

/**
 * Entält einen ICall und wird ausgelöst wenn ein ICall auftritt oder verschwindet.
 *
 * @author J. Boesl, 11.05.2005
 */


public class AditoCallEvent
{
  private final ICall call;
  private final ICallInfo callInfo;

  public AditoCallEvent(ICall pCall)
  {
    call = pCall;
    callInfo = new StaticCallInfo(pCall);
  }

  /**
   * Liefert den Zustand des Calls bei Auftreten des Events
   *
   * @return die Info
   */
  public ICallInfo getCallInfo()
  {
    return callInfo;
  }

  /**
   * Liefert den Call zum Event. Dieser Call ist "Live", d.h. die Informationen werden zum aktuellen Zeitpunkt zurück-
   * geliefert und können vom Zustand beim Auftreten des Events abweichen.
   *
   * @return der Call
   */
  public ICall getCall()
  {
    return call;
  }
}
