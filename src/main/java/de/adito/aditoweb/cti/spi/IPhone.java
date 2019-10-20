package de.adito.aditoweb.cti.spi;

import de.adito.aditoweb.cti.spi.listener.ICallListener;

/**
 * Ein IPhone stellt ein Telefon dar, das (wie der Name vermuten läßt) ein zentrales Element für Telefonie ist.
 * Über die listener kann man über ICalls informiert werden und mit IPhoneControl kann man diese ICalls dann
 * steuern.
 *
 * @author J. Boesl, 11.05.2005
 */


public interface IPhone
{

  void addCallListener(ICallListener pListener);

  void removeCallListener(ICallListener pListener);

  IPhoneControl getPhoneControl();

}
