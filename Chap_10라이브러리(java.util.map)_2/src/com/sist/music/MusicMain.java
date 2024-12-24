package com.sist.music;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MusicMain {
	// 지니뮤직 데이터
	// 멜론데이터
	// => 공통데이터(교집합) ,  다른데이터(차집합), 전체(합집합)
	public Set<String> genieMusic()
	{
		Set<String> set=new HashSet();
		try
		{
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("table.list-wrap a.title");
			//System.out.println(title);
			for(int i=0;i<title.size();i++)
			{
				set.add(title.get(i).text());
			}
		}catch(Exception ex) {}
		return set;
	}
	
	public Set<String> melonMusic()
	{
		Set<String> set=new HashSet();
		try
		{
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("div.wrap_song_info div.rank01 a");
			//System.out.println(title);
			for(int i=0;i<title.size();i++)
			{
				set.add(title.get(i).text());
			}
		}catch (Exception ex) {}
		return set;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicMain mm= new MusicMain();
		Set<String> genie=mm.genieMusic();
		for(String music:genie)
		{
			System.out.println(music);
		}
		
		System.out.println("==========================");
		
		Set<String> melon=mm.melonMusic();
		for(String music:melon)
		{
			System.out.println(music);
		}
		
//		System.out.println("=========차집합==========");
//		genie.removeAll(melon);
//		for(String music:genie)
//		{
//			System.out.println(music);
//		}
		System.out.println("=========교집합==========");
		genie.retainAll(melon);
		System.out.println("합계 : " +genie.size());
		for(String music:genie)
		{
			System.out.println(music);
		}
		System.out.println("=========합집합==========");
		List<String> list=new ArrayList<String>();
		list.addAll(genie);
		list.addAll(melon);
		System.out.println("합계 : " +list.size());
		for(String music:list)
		{
			System.out.println(music);
		}
		
		Set<String> hap=new HashSet<String>();
		hap.addAll(list);
		System.out.println("=========중복없는 곡==========");
		System.out.println("합계 : " +hap.size());
		for(String music:hap)
		{
			System.out.println(music);
		}
		
		
	}

}
