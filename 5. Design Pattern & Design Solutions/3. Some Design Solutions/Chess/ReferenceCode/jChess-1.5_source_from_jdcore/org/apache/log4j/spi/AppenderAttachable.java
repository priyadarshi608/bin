package org.apache.log4j.spi;

import java.util.Enumeration;
import org.apache.log4j.Appender;

public abstract interface AppenderAttachable
{
  public abstract void addAppender(Appender paramAppender);
  
  public abstract Enumeration getAllAppenders();
  
  public abstract Appender getAppender(String paramString);
  
  public abstract boolean isAttached(Appender paramAppender);
  
  public abstract void removeAllAppenders();
  
  public abstract void removeAppender(Appender paramAppender);
  
  public abstract void removeAppender(String paramString);
}
