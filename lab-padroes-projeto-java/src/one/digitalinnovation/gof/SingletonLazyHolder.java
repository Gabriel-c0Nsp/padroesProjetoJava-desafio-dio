package one.digitalinnovation.gof;

/**
 * Singleton "otimizado".
 *
 * @author Gabriel-c0Nsp
 */

public class SingletonLazyHolder {

  private static class InstanceHolder {
    public static SingletonLazyHolder instancia = new SingletonLazyHolder();
  }

  private SingletonLazyHolder() {
    super();
  }

  public static SingletonLazyHolder getInstancia() {
    return InstanceHolder.instancia;
  }
}
