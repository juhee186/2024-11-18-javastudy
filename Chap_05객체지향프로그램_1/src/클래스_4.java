/*
 *  <ul class="common_sp_list_ul ea4" style="padding:0 0 0 8px;">
            <li class="common_sp_list_li">
                <div class="common_sp_thumb">
                    <a href="/recipe/7039214" class="common_sp_link">
                                                <img src="https://recipe1.ezmember.co.kr/cache/recipe/2024/11/24/565de119b099835a80ffdfc4006583621_m.jpg">
                    </a>
                </div>
                <div class="common_sp_caption">
                    <div class="common_sp_caption_tit line2">치킨너겟 교촌 허니콤보 만들기</div>
                    <div class="common_sp_caption_rv_name" style="display: inline-block; vertical-align: bottom;">
                        <a href="/profile/recipe.html?uid=59304070"><img src="https://recipe1.ezmember.co.kr/cache/rpf/2024/10/24/1455cb2a66c286ac31d1c570f1276de11.jpg">태형제맘</a>
                    </div>
                    <div class="common_sp_caption_rv">
                                                    <span class="common_sp_caption_rv_star"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"></span>
                            <span class="common_sp_caption_rv_ea">(2)</span>
                                                <span class="common_sp_caption_buyer" style="vertical-align: middle;">조회수 1,853</span>
                    </div>
                </div>
            </li>
 */
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
class rec
{
	int rno; //구분자
	String title;
	String chef;
}
class recSite
{
	static rec[] recs=new rec[40];
	// 사용자정의 데이터형은 일반 데이터형과 사용하는 방법 유사
	// 시작과 동시에 배열초기화
	static //초기화블럭
	{
		try
		{
			int j=0;
			Document doc=Jsoup.connect("https://www.10000recipe.com/recipe/list.html").get();
			Elements title=doc.select("ul.common_sp_list_ul div.common_sp_caption_titl");
			Elements chef=doc.select("ul.common_sp_list_ul div.common_sp_caption_rv_name");
			for(int i=0;i<title.size();i++)
			{	recs[j]=new rec();
				recs[j].title=title.get(i).text();
				recs[j].chef=chef.get(i).text();
				j++;
				//System.out.println(title.get(i).text());
				//System.out.println(chef.get(i).text());
			}
		}catch(Exception ex)
		{
			
		}
	}
}
public class 클래스_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recSite rs= new recSite();
		System.out.println("=====레시피 목록=======");
		for(rec r:rs.recs)
		{
			System.out.println(r.title);
		}
		
		
		
		
	}

}
