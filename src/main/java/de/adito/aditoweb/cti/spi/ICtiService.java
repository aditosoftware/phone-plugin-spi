package de.adito.aditoweb.cti.spi;

import java.util.Map;

/**
 * ICtiService has to be provided using java's {@link java.util.ServiceLoader}.
 */
public interface ICtiService
{

  IPhoneFactory createFactory(String pProviderName, Map<String, String> pProperties);

}
