package model;

import java.io.Serializable;
import java.util.Date;


public class StoreDTO implements Serializable {
	
	private String goodsNum; //상품번호
	private String goodsName; //상품이름
	private String goodsCon;  //상품내용
	private int goodsPri;   //상품금액
	private int goodsQuan;  //상품재고수
	private String goodsNote; //상품 유의사항
	private String goodsPic; //상품사진
	private int memberNum;      //관리자 회원 번호
	private int movieNum;     // 영화번호
	

	public String getGoodsPic() {
		return goodsPic;
	}

	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
	}

	
	public String getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsCon() {
		return goodsCon;
	}

	public void setGoodsCon(String goodsCon) {
		this.goodsCon = goodsCon;
	}

	public int getGoodsPri() {
		return goodsPri;
	}

	public void setGoodsPri(int goodsPri) {
		this.goodsPri = goodsPri;
	}

	public int getGoodsQuan() {
		return goodsQuan;
	}

	public void setGoodsQuan(int goodsQuan) {
		this.goodsQuan = goodsQuan;
	}

	public String getGoodsNote() {
		return goodsNote;
	}

	public void setGoodsNote(String goodsNote) {
		this.goodsNote = goodsNote;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public int getMovieNum() {
		return movieNum;
	}

	public void setMovieNum(int movieNum) {
		this.movieNum = movieNum;
	}


	
	

}
