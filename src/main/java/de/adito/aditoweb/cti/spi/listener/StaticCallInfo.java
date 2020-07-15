package de.adito.aditoweb.cti.spi.listener;

import de.adito.aditoweb.cti.spi.*;

import java.util.Objects;

/**
 * Implementiert eine StaticCallInfo mit statischen Informationen, d.h. diese
 * werden einmalig beim Erzeugen der Info ausgelesen
 *
 * @author r.loipfinger,  02.03.11
 */
class StaticCallInfo implements ICallInfo
{
  private final String id;
  private final ECallState state;
  private final ECallDirection callDirection;
  private final String callPartner;

  StaticCallInfo(ICallInfo pCallInfo)
  {
    this(pCallInfo.getID(), pCallInfo.getState(), pCallInfo.getCallDirection(), pCallInfo.getCallPartner());
  }

  StaticCallInfo(String pId, ECallState pState, ECallDirection pCallDirection, String pCallPartner)
  {
    id = pId;
    state = pState;
    callDirection = pCallDirection;
    callPartner = pCallPartner;
  }

  @Override
  public final ECallDirection getCallDirection()
  {
    return callDirection;
  }

  @Override
  public final String getCallPartner()
  {
    return callPartner;
  }

  @Override
  public final ECallState getState()
  {
    return state;
  }

  @Override
  public final String getID()
  {
    return id;
  }

  @Override
  public boolean equals(Object pO)
  {
    if (this == pO) return true;
    if (pO == null || getClass() != pO.getClass()) return false;
    StaticCallInfo that = (StaticCallInfo) pO;
    return Objects.equals(id, that.id) &&
        state == that.state &&
        callDirection == that.callDirection &&
        Objects.equals(callPartner, that.callPartner);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, state, callDirection, callPartner);
  }

  @Override
  public String toString()
  {
    return "StaticCallInfo{" +
        "id='" + id + '\'' +
        ", state=" + state +
        ", callDirection=" + callDirection +
        ", callPartner='" + callPartner + '\'' +
        '}';
  }
}
