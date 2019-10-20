package de.adito.aditoweb.cti.spi;

/**
 * @author j.boesl, 16.09.19
 */
public enum ECallState
{
  STATE_UNKNOWN(0),
  STATE_CONNECTING(1),
  STATE_TALKING(2),
  // ausgehendes Klingeln
  STATE_RINGING(3),
  // eingehendes Klingeln
  STATE_CONNECTION_RINGING(4),
  STATE_ON_HOLD(5),
  STATE_CREATED(6),
  STATE_DISCONNECTED(7),
  STATE_BUSY(8);

  private int state;


  ECallState(int pState)
  {
    state = pState;
  }

  public int getStateAsInt()
  {
    return state;
  }

  public static ECallState getStateFromInt(int pState)
  {
    for (ECallState value : values())
      if (value.state == pState)
        return value;
    return STATE_UNKNOWN;
  }

}
