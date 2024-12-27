package com.sist.movie;

import java.io.Serializable;

/*
 * 1|
 * 쇼생크 탈출|
 * 드라마|
 * https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
 * 팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|
 * 2016 .02.24 재개봉, 1995 .01.28 개봉|
 * 15세 관람가|
 * 프랭크 다라본트
 */

public class Movie implements Serializable {
	private int mno;
	private String title,genre,poster,actor,reg,grad,dec;
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public String getGrad() {
		return grad;
	}
	public void setGrad(String grad) {
		this.grad = grad;
	}
	public String getDec() {
		return dec;
	}
	public void setDec(String dec) {
		this.dec = dec;
	}
	
}
