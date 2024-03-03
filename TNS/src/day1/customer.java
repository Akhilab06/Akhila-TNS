package day1;

public class customer {
		private String cname;
		private String caddress;
		private int cid;
public customer() {
	System.out.println("Default constructor");
}
public customer(String cname,String caddress,int cid){
	this.cname=cname;
	this.caddress=caddress;
	this.cid=cid;
}
public String getcname() {
	return cname;
}
public void setcname(String cname) {
	this.cname = cname;
}
public String getcaddress() {
	return caddress;
}
public void setcaddress(String caddress) {
	this.caddress = caddress;
}
public int getcid() {
	return cid;
}
public void setcid(int cid) {
	this.cid = cid;
}
@Override
public String toString() {
	return "customer [cname=" + cname + ", caddress=" + caddress + ", cid=" + cid + "]";
}

}

