package connection;

public class goods {
	
	private int goodsid;
	private String goodsname;
	private String goodsowner;
	private String lowprice;
	//private int goodsstate;
	
	public goods() { 
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.lowprice = lowprice;
		this.goodsowner = goodsowner;
	}
	
	public goods(int goodsid,String goodsname,String goodsowner,String lowprice,
			int goodsstate) {
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.lowprice = lowprice;
		this.goodsowner = goodsowner;
		//this.goodsstate = goodsstate;
		
	}
	
	
	public String getgoodsname() {
		return goodsname;
	}
	public void setgoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getgoodsowner() {
		return goodsowner;
	}
	public void setgoodsowner(String goodsowner) {
		this.goodsowner = goodsowner;
	}
	public String getlowprice() {
		return lowprice;
	}
	public void setlowprice(String lowprice) {
		this.lowprice = lowprice;
	}

//	public int getgoodsstate() {
//		return goodsstate;
//	}
//
//	public void setgoodsstate(String goodsstate) {
//		goodsstate = goodsstate;
//	}

	public int getgoodsid() {
		return goodsid;
	}

   public void setgoodsid(int goodsid) {
		this.goodsid = goodsid;
	}

	


}
