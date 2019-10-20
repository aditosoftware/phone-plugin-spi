package de.adito.aditoweb.cti.spi;

import java.util.Map;

public interface ICtiService
{

  IPhoneFactory createFactory(String pProviderName, Map<String, String> pProperties);

}
