package serv.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.mapper.*;
import model.po.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class YongHuServ {
	private SqlSession sqlSession;
	YongHuServ()throws IOException{
		String res = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(res);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession();
	}


	@RequestMapping("register")
	public void func1(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String ss="1111";
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ss);
	}
	@RequestMapping("get_sup_user")
	public void func2(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		YongHuMapper mapper = sqlSession.getMapper(YongHuMapper.class);
		YongHuExample ee=new YongHuExample();
		ee.or().andQuanXianEqualTo(0);	
		List<YongHu> lee=mapper.selectByExample(ee);
		String ret="0";
		System.out.println(lee.size());
		if(lee.size()==0){
			ret="0";
		}else{
			ret="1";
		}
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ret);
	}

	@RequestMapping("login_chk")
	public void func3(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String user_name= request.getParameter("user_name");
		String pwd= request.getParameter("pwd");
		YongHuMapper mapper = sqlSession.getMapper(YongHuMapper.class);
		YongHuExample ee=new YongHuExample();
		ee.or().andYongHuMingEqualTo(user_name);	
		List<YongHu> lee=mapper.selectByExample(ee);

		String ret="0";
		if(lee.size()==1){
			if(lee.get(0).getMiMa().equals(pwd)){
				ret="{\"uname\":"+lee.get(0).getYongHuMing()+",\"mask\":\""+lee.get(0).getQuanXian()+"\"}";
			}else{
				//密码错误，在前端提示表现为：用户名或者密码错误
				System.out.println(pwd);
				System.out.println(lee.get(0).getMiMa());
				ret="3";
			}
		}else if(lee.size()==0){
			//用户名不存在，在前端提示表现为：用户名或者密码错误
			ret="2";

		}else{
			//有重名用户
			ret="1";
		}
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ret);
	}



	@RequestMapping("init_sup_user")
	public void func4(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String yongHuMing= request.getParameter("sup_user_name");
		String pwd= request.getParameter("pwd");
		YongHuMapper mapper = sqlSession.getMapper(YongHuMapper.class);
		YongHu xx=new YongHu();
		xx.setYongHuMing(yongHuMing);
		xx.setMiMa(pwd);
		xx.setQuanXian(0);
		mapper.insert(xx);
		return;
	}

	@RequestMapping("com_com_info")
	public void func5(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String qi_ye_ming_cheng_= request.getParameter("qi_ye_ming_cheng_");
		String gong_si_lei_xing_= request.getParameter("gong_si_lei_xing_");
		String zhu_ce_di_zhi_= request.getParameter("zhu_ce_di_zhi_");
		String fa_ding_dai_biao_ren_= request.getParameter("fa_ding_dai_biao_ren_");
		String gong_shang_zhu_ce_hao_= request.getParameter("gong_shang_zhu_ce_hao_");
		String zhu_ce_zi_ben_= request.getParameter("zhu_ce_zi_ben_");
		String kai_hu_zhang_hao_= request.getParameter("kai_hu_zhang_hao_");
		String kai_hu_yin_hang_= request.getParameter("kai_hu_yin_hang_");
		String jing_ying_fan_wei_= request.getParameter("jing_ying_fan_wei_");
		String wei_tuo_dai_li_ren_= request.getParameter("wei_tuo_dai_li_ren_");
		String wei_tuo_dai_li_ren_zhi_wu_= request.getParameter("wei_tuo_dai_li_ren_zhi_wu_");
		String wei_tuo_dai_li_ren_dian_hua_= request.getParameter("wei_tuo_dai_li_ren_dian_hua_");
		String lian_xi_ren_= request.getParameter("lian_xi_ren_");
		String lian_xi_ren_zhi_wu_= request.getParameter("lian_xi_ren_zhi_wu_");
		String lian_xi_ren_dian_hua_= request.getParameter("lian_xi_ren_dian_hua_");
		String dian_zi_you_xiang_= request.getParameter("dian_zi_you_xiang_");
		String chuan_zhen_= request.getParameter("chuan_zhen_");
		String ban_shi_ji_gou_xiang_xi_di_zhi_= request.getParameter("ban_shi_ji_gou_xiang_xi_di_zhi_");
		String ban_shi_ji_gou_you_zheng_bian_ma_= request.getParameter("ban_shi_ji_gou_you_zheng_bian_ma_");
		String ban_shi_ji_gou_lian_xi_ren_= request.getParameter("ban_shi_ji_gou_lian_xi_ren_");
		String ban_shi_ji_gou_lian_xi_ren_zhi_wu_= request.getParameter("ban_shi_ji_gou_lian_xi_ren_zhi_wu_");
		String ban_shi_ji_gou_lian_xi_ren_dian_hua_= request.getParameter("ban_shi_ji_gou_lian_xi_ren_dian_hua_");
		String ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_= request.getParameter("ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_");
		String ban_shi_ji_gou_lian_xi_ren_chuan_zhen_= request.getParameter("ban_shi_ji_gou_lian_xi_ren_chuan_zhen_");
		GongSiXinXiMapper mapper = sqlSession.getMapper(GongSiXinXiMapper.class);

		GongSiXinXiExample ee=new GongSiXinXiExample();
		ee.or().andGongSiJiLuLeiXingEqualTo(0);	
		List<GongSiXinXi> lee=mapper.selectByExample(ee);

		if(lee.size()==0){
			GongSiXinXi xx= new GongSiXinXi();
			xx.setQiYeMingCheng(qi_ye_ming_cheng_);
			xx.setGongSiLeiXing(gong_si_lei_xing_);
			xx.setZhuCeDiZhi(zhu_ce_di_zhi_);
			xx.setFaDingDaiBiaoRen(fa_ding_dai_biao_ren_);
			xx.setGongShangZhuCeHao(gong_shang_zhu_ce_hao_);
			xx.setZhuCeZiBen(zhu_ce_zi_ben_);
			xx.setKaiHuZhangHao(kai_hu_zhang_hao_);
			xx.setKaiHuYinHang(kai_hu_yin_hang_);
			xx.setJingYingFanWei(jing_ying_fan_wei_);
			xx.setWeiTuoDaiLiRen(wei_tuo_dai_li_ren_);
			xx.setWeiTuoDaiLiRenZhiWu(wei_tuo_dai_li_ren_zhi_wu_);
			xx.setWeiTuoDaiLiRenDianHua(wei_tuo_dai_li_ren_dian_hua_);
			xx.setLianXiRen(lian_xi_ren_);
			xx.setLianXiRenZhiWu(lian_xi_ren_zhi_wu_);
			xx.setLianXiRenDianHua(lian_xi_ren_dian_hua_);
			xx.setDianZiYouXiang(dian_zi_you_xiang_);
			xx.setChuanZhen(chuan_zhen_);
			xx.setBanShiJiGouXiangXiDiZhi(ban_shi_ji_gou_xiang_xi_di_zhi_);
			xx.setBanShiJiGouYouZhengBianMa(ban_shi_ji_gou_you_zheng_bian_ma_);
			xx.setBanShiJiGouLianXiRen(ban_shi_ji_gou_lian_xi_ren_);
			xx.setBanShiJiGouLianXiRenZhiWu(ban_shi_ji_gou_lian_xi_ren_zhi_wu_);
			xx.setBanShiJiGouLianXiRenDianHua(ban_shi_ji_gou_lian_xi_ren_dian_hua_);
			xx.setBanShiJiGouLianXiRenDianZiYouXiang(ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_);
			xx.setBanShiJiGouLianXiRenChuanZhen(ban_shi_ji_gou_lian_xi_ren_chuan_zhen_);
			mapper.insert(xx);
		}else{
			GongSiXinXi xx= lee.get(0);
			xx.setQiYeMingCheng(qi_ye_ming_cheng_);
			xx.setGongSiLeiXing(gong_si_lei_xing_);
			xx.setZhuCeDiZhi(zhu_ce_di_zhi_);
			xx.setFaDingDaiBiaoRen(fa_ding_dai_biao_ren_);
			xx.setGongShangZhuCeHao(gong_shang_zhu_ce_hao_);
			xx.setZhuCeZiBen(zhu_ce_zi_ben_);
			xx.setKaiHuZhangHao(kai_hu_zhang_hao_);
			xx.setKaiHuYinHang(kai_hu_yin_hang_);
			xx.setJingYingFanWei(jing_ying_fan_wei_);
			xx.setWeiTuoDaiLiRen(wei_tuo_dai_li_ren_);
			xx.setWeiTuoDaiLiRenZhiWu(wei_tuo_dai_li_ren_zhi_wu_);
			xx.setWeiTuoDaiLiRenDianHua(wei_tuo_dai_li_ren_dian_hua_);
			xx.setLianXiRen(lian_xi_ren_);
			xx.setLianXiRenZhiWu(lian_xi_ren_zhi_wu_);
			xx.setLianXiRenDianHua(lian_xi_ren_dian_hua_);
			xx.setDianZiYouXiang(dian_zi_you_xiang_);
			xx.setChuanZhen(chuan_zhen_);
			xx.setBanShiJiGouXiangXiDiZhi(ban_shi_ji_gou_xiang_xi_di_zhi_);
			xx.setBanShiJiGouYouZhengBianMa(ban_shi_ji_gou_you_zheng_bian_ma_);
			xx.setBanShiJiGouLianXiRen(ban_shi_ji_gou_lian_xi_ren_);
			xx.setBanShiJiGouLianXiRenZhiWu(ban_shi_ji_gou_lian_xi_ren_zhi_wu_);
			xx.setBanShiJiGouLianXiRenDianHua(ban_shi_ji_gou_lian_xi_ren_dian_hua_);
			xx.setBanShiJiGouLianXiRenDianZiYouXiang(ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_);
			xx.setBanShiJiGouLianXiRenChuanZhen(ban_shi_ji_gou_lian_xi_ren_chuan_zhen_);
			mapper.updateByPrimaryKey(xx);
		}

	}

	@RequestMapping("get_com_info")
	public void func6(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		GongSiXinXiMapper mapper = sqlSession.getMapper(GongSiXinXiMapper.class);

		GongSiXinXiExample ee=new GongSiXinXiExample();
		ee.or().andGongSiJiLuLeiXingEqualTo(0);	
		List<GongSiXinXi> lee=mapper.selectByExample(ee);
		String ret="";
		if(lee.size()!=0){
			GongSiXinXi xx= lee.get(0);
			ret="{"+
					"\"id\":\""+xx.getId()+
					"\",\"qi_ye_ming_cheng_\":\""+xx.getQiYeMingCheng()+
					"\",\"gong_si_lei_xing_\":\""+xx.getGongSiLeiXing()+
					"\",\"zhu_ce_di_zhi_\":\""+xx.getZhuCeDiZhi()+
					"\",\"fa_ding_dai_biao_ren_\":\""+xx.getFaDingDaiBiaoRen()+
					"\",\"gong_shang_zhu_ce_hao_\":\""+xx.getGongShangZhuCeHao()+
					"\",\"zhu_ce_zi_ben_\":\""+xx.getZhuCeZiBen()+
					"\",\"kai_hu_zhang_hao_\":\""+xx.getKaiHuZhangHao()+
					"\",\"kai_hu_yin_hang_\":\""+xx.getKaiHuYinHang()+
					"\",\"jing_ying_fan_wei_\":\""+xx.getJingYingFanWei()+
					"\",\"wei_tuo_dai_li_ren_\":\""+xx.getWeiTuoDaiLiRen()+
					"\",\"wei_tuo_dai_li_ren_zhi_wu_\":\""+xx.getWeiTuoDaiLiRenZhiWu()+
					"\",\"wei_tuo_dai_li_ren_dian_hua_\":\""+xx.getWeiTuoDaiLiRenDianHua()+
					"\",\"lian_xi_ren_\":\""+xx.getLianXiRen()+
					"\",\"lian_xi_ren_zhi_wu_\":\""+xx.getLianXiRenZhiWu()+
					"\",\"lian_xi_ren_dian_hua_\":\""+xx.getLianXiRenDianHua()+
					"\",\"dian_zi_you_xiang_\":\""+xx.getDianZiYouXiang()+
					"\",\"chuan_zhen_\":\""+xx.getChuanZhen()+
					"\",\"ban_shi_ji_gou_xiang_xi_di_zhi_\":\""+xx.getBanShiJiGouXiangXiDiZhi()+
					"\",\"ban_shi_ji_gou_you_zheng_bian_ma_\":\""+xx.getBanShiJiGouYouZhengBianMa()+
					"\",\"ban_shi_ji_gou_lian_xi_ren_\":\""+xx.getBanShiJiGouLianXiRen()+
					"\",\"ban_shi_ji_gou_lian_xi_ren_zhi_wu_\":\""+xx.getBanShiJiGouLianXiRenZhiWu()+
					"\",\"ban_shi_ji_gou_lian_xi_ren_dian_hua_\":\""+xx.getBanShiJiGouLianXiRenDianHua()+
					"\",\"ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_\":\""+xx.getBanShiJiGouLianXiRenDianZiYouXiang()+
					"\",\"ban_shi_ji_gou_lian_xi_ren_chuan_zhen_\":\""+xx.getBanShiJiGouLianXiRenChuanZhen()+
					"\",\"gong_si_ji_lu_lei_xing_\":\""+xx.getGongSiJiLuLeiXing()+
					"\"}";
		}
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ret);
	}
	@RequestMapping("fetch_tags")
	public void func7(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		GongSiXinXiMapper xmapper = sqlSession.getMapper(GongSiXinXiMapper.class);
		GongSiXinXiExample cc=new GongSiXinXiExample();
		cc.or();
		List<GongSiXinXi> lee=xmapper.selectByExample(cc);
		System.out.println("********************");
		System.out.println(lee.size());
		String ret="[";
		for(GongSiXinXi it : lee) {
			YongHuBiaoQianMapper mapper = sqlSession.getMapper(YongHuBiaoQianMapper.class);
			YongHuBiaoQianExample ee=new YongHuBiaoQianExample();
			ee.or().andSuoShuGongSiEqualTo(it.getId());
			List<YongHuBiaoQian> fee=mapper.selectByExample(ee);

			String ss="{"
					+"	\"id\" : \""+it.getId()+"\","
					+"	\"qi_ye_ming_cheng_\" : \""+it.getQiYeMingCheng()+"\","
					+"	\"qi_ye_biao_qian_\" : [";

			for(YongHuBiaoQian k:fee){
				String ws="{"
						+"\"id\" : \""+k.getId()+"\","
						+"\"biao_qian_ming_\" : \""+k.getBiaoQianMing()+"\","
						+"\"suo_shu_gong_si_\" : \""+k.getSuoShuGongSi()+"\","
						+"\"bei_zhu_\" : \""+k.getBeiZhu()+"\""
						+"},";
				ss+=ws;
			}
			ss+="]},";
			ret+=ss;
		}
		ret+="]";
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ret);
	}

	@RequestMapping("fetch_staff_tag")
	public void func8(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String tag_id = request.getParameter("tag_id");
		YongHuMapper xmapper = sqlSession.getMapper(YongHuMapper.class);
		YongHuExample cc=new YongHuExample();
		cc.or().andBiaoQianEqualTo(Integer.parseInt(tag_id));
		List<YongHu> lee=xmapper.selectByExample(cc);
		String ret="[";
		for(YongHu k:lee){
			String ss="{\"xing_ming_\":\""+k.getXingMing()+"\","
					+"\"min_zu_\":\""+k.getMinZu()+"\","
					+"\"jia_ting_zhu_zhi_\":\""+k.getJiaTingZhuZhi()+"\","
					+"\"shen_fen_zheng_hao_ma_\":\""+k.getShenFenZhengHaoMa()+"\","
					+"\"lao_dong_he_tong_bian_hao_\":\""+k.getLaoDongHeTongBianHao()+"\"},";
			ret+=ss;
		}
		ret+="]";

		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ret);
	}
	@RequestMapping("rename_tag")
	public void func9(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String id = request.getParameter("id");
		String biao_qian_ming_ = request.getParameter("biao_qian_ming_");
		String ret="";
		YongHuBiaoQianMapper xmapper = sqlSession.getMapper(YongHuBiaoQianMapper.class);
		YongHuBiaoQianExample cc=new YongHuBiaoQianExample();
		cc.or().andIdNotEqualTo(Integer.parseInt(id)).andBiaoQianMingEqualTo(biao_qian_ming_);
		List<YongHuBiaoQian> lee=xmapper.selectByExample(cc);
		if(lee.size()==0){
			lee.get(0).setBiaoQianMing(biao_qian_ming_);
			xmapper.updateByPrimaryKey(lee.get(0));
			ret="0";
		}else{
			ret="3";
		}
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ret);
	}	
	@RequestMapping("get_single_tag")
	public void func10(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String tag_id = request.getParameter("tag_id");
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write("");
	}	
	@RequestMapping("create_tag")
	public void func11(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String tag_id = request.getParameter("tag_id");
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write("");
	}	
	@RequestMapping("cr_staff")
	public void func12(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String xing_ming_ = request.getParameter("xing_ming_");
		String shen_fen_zheng_hao_ma_ = request.getParameter("shen_fen_zheng_hao_ma_");
		String ret="";
		YongHuMapper xmapper = sqlSession.getMapper(YongHuMapper.class);
		YongHuExample cc=new YongHuExample();
		cc.or().andShenFenZhengHaoMaEqualTo(shen_fen_zheng_hao_ma_);
		List<YongHu> lee=xmapper.selectByExample(cc);
		if(lee.size()!=0){
			ret="3";
		}else{
			String xing_bie_ = request.getParameter("xing_bie_");
			String jia_ting_zhu_zhi_ = request.getParameter("jia_ting_zhu_zhi_");
			String min_zu_ = request.getParameter("min_zu_");
			String lao_dong_he_tong_bian_hao_ = request.getParameter("lao_dong_he_tong_bian_hao_");
			//String shen_fen_zheng_zhao_zheng_ = request.getParameter("shen_fen_zheng_zhao_zheng_");
			//String shen_fen_zheng_zhao_fan_ = request.getParameter("shen_fen_zheng_zhao_fan_");
			
			YongHu oc=new YongHu();
			oc.setXingMing(xing_ming_);
			oc.setShenFenZhengHaoMa(shen_fen_zheng_hao_ma_);
			oc.setXingBie(xing_bie_);
			oc.setJiaTingZhuZhi(jia_ting_zhu_zhi_);
			oc.setMinZu(min_zu_);
			oc.setLaoDongHeTongBianHao(lao_dong_he_tong_bian_hao_);
			xmapper.insert(oc);
		}
		

		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write("0");
	}	
	
	
	
}
