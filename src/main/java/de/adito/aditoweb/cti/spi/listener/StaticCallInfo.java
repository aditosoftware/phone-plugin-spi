package de.adito.aditoweb.cti.spi.listener;

import de.adito.aditoweb.cti.spi.*;

/**
 * Implementiert eine StaticCallInfo mit statischen Informationen, d.h. diese
 * werden einmalig beim Erzeugen der Info ausgelesen
 *
 * @author r.loipfinger,  02.03.11
 */
class StaticCallInfo implements ICallInfo
{
  private ECallDirection callDirection;
  private String callPartner;
  private ECallState state;
  private String id;

  StaticCallInfo(ICall pCall)
  {
    callDirection = pCall.getCallDirection();
    callPartner = pCall.getCallPartner();
    state = pCall.getState();
    id = pCall.getID();
  }

  @Override
  public ECallDirection getCallDirection()
  {
    return callDirection;
  }

  @Override
  public String getCallPartner()
  {
    return callPartner;
  }

  @Override
  public ECallState getState()
  {
    return state;
  }

  @Override
  public String getID()
  {
    return id;
  }
}
