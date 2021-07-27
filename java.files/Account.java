public class Account {
    private int ac_no;
    private float amount;
    private String name=new String();
  public int getAc_no() {
      return ac_no;
  }
  public void setAc_no(int ac_no) {
      this.ac_no = ac_no;
  }
  public float getAmount() {
      return amount;
  }
  public void setAmount(float amount) {
      this.amount = amount;
  }
  public String getName() {
      return name;
  }
  public void setName(String name) {
      this.name = name;
  }
}
 class B{
	public static void main(String[] args) {
		Account x=new Account();
		x.setName("kanishq");
		x.setAc_no(14677);
		x.setAmount(34.7f);
		System.out.println(x.getName());
		System.out.println(x.getAc_no());
		System.out.println(x.getAmount());
	}
}
