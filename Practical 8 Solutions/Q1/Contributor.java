package company;

public interface Contributor {
  public static final String CHARITY_NAME = "Grace Charity Group";
	public static final String ADDRESS = "123 Jalan Bunga Raya, 53300 KL";

  public abstract void donate(double amount);
  public abstract void volunteer();
}
