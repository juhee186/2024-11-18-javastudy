package com.sist.Movie;

import java.util.*;
import java.io.*;

public class MovieSystem {
	private static ArrayList<Movie> movielist=
					new ArrayList<Movie>();
	static
	{
		try
		{
			FileReader fr=new FileReader("c:\\javadev\\movie.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			fr.close();
			
			String data=sb.toString();
			String[] movies=data.split("\n");
			
			for(String movie:movies)
			{
				String[] ss=movie.split("\\|");
				Movie m=new Movie();
				
				m.setMno(Integer.parseInt(ss[0]));
				m.setTitle(ss[1]);
				m.setGenre(ss[2]);
				m.setPoster(ss[3]);
				m.setActor(ss[4]);
				m.setReg(ss[5]);
				m.setGrade(ss[6]);
				m.setDir(ss[7]);
				
				movielist.add(m);
			}
			
		}catch(Exception e) {}
	}
	public ArrayList<Movie> movieListData()
	{
		return movielist;
	}
	public Movie movieDetailData(int mno)
	{
		Movie m=new Movie();
		for(Movie mm:movielist)
		{
			if(mm.getMno()==mno)
			{
				m=mm;
				break;
			}
		}
		return m;
	}
	public ArrayList<Movie> movieFindTitle(String title)
	{
		ArrayList<Movie>list=new ArrayList<Movie>();
		
		for(Movie m:movielist)
		{
			if(m.getTitle().contains(title))
			{
				list.add(m);
			}
		}
		return list;
	}
	public ArrayList<Movie> movieFindActor(String actor)
	{
		ArrayList<Movie>list=new ArrayList<Movie>();
		
		for(Movie m:movielist)
		{
			if(m.getTitle().contains(actor))
			{
				list.add(m);
			}
		}
		return list;
	}
	public ArrayList<Movie> movieFindGenre(String gen)
	{
		ArrayList<Movie>list=new ArrayList<Movie>();
		
		for(Movie m:movielist)
		{
			if(m.getTitle().contains(gen))
			{
				list.add(m);
			}
		}
		return list;
	}
	

}
