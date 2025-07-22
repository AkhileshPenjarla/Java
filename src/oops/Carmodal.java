package oops;
class Carmodal {
	private String modal;
	private int year;
	public void setModal(String modal,int year) {
		this.modal=modal;
		this.year=year;
	}
	public String getModel() {
		return modal;
	}
	public int year() {
		return year;
	}
//}
//public class Carmodal1{
	public static void main(String[] args) {
		Carmodal cr=new Carmodal();
			cr.setModal("Audi",200000);
			System.out.println(cr.getModel());
			System.out.println(cr.year());
	}
}
