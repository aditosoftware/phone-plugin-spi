package de.adito.aditoweb.cti.spi;

public class CtiException extends RuntimeException
{
  public CtiException()
  {
  }

  public CtiException(String message)
  {
    super(message);
  }

  public CtiException(String message, Throwable cause)
  {
    super(message, cause);
  }

  public CtiException(Throwable cause)
  {
    super(cause);
  }

  public CtiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
  {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
