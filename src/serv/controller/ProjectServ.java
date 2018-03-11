package serv.controller;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javassist.bytecode.Descriptor.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import model.mapper.*;
import model.po.*;

@Controller
@RequestMapping("/project")
public class ProjectServ {

	private SqlSession sqlSession;
	ProjectServ()throws IOException{
		String res = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(res);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession();
	}
	public void funcCreateGongCheng(String ss,Integer xiangMuId)throws Exception {

		//System.out.print(ss);

		JSONArray jsonArray = JSONArray.parseArray(ss);  
		GongChengMapper mapper = sqlSession.getMapper(GongChengMapper.class);

		for(int k=0;k<jsonArray.size();k++){  
			System.out.println(jsonArray.get(k).getClass());  
			JSONObject tableInfoJson;
			tableInfoJson=(JSONObject)jsonArray.get(k);
			Map<String, String> tableItemMap= JSONObject.toJavaObject(tableInfoJson, Map.class);

			
			if(tableItemMap.get("gong_cheng_id_").trim().length()==0){
				
				GongCheng xx=new GongCheng();
				xx.setXiangMuId(xiangMuId);
				xx.setDanXiangGongCheng(tableItemMap.get("dan_xiang_gong_cheng_"));
				xx.setGuiMoMianJi(tableItemMap.get("gui_mo_mian_ji_"));
				xx.setGuiMoChangDu(tableItemMap.get("gui_mo_chang_du_"));
				xx.setGuiMoQiTa(tableItemMap.get("gui_mo_qi_ta_"));
				xx.setYanGao(tableItemMap.get("yan_gao_"));
				xx.setZongGao(tableItemMap.get("zong_gao_"));
				xx.setDiShangDiXiaCengShu(tableItemMap.get("di_shang_di_xia_ceng_shu_"));
				xx.setGongChengLeiBie(tableItemMap.get("gong_cheng_lei_bie_"));
				xx.setJieGouLeiXing(tableItemMap.get("jie_gou_lei_xing_"));
				xx.setJiChuJieGou(tableItemMap.get("ji_chu_jie_gou_"));
				mapper.insert(xx);	
				
			}else{
				Integer id=Integer.parseInt(tableItemMap.get("gong_cheng_id_"));
				GongCheng xx=mapper.selectByPrimaryKey(id);
				xx.setXiangMuId(xiangMuId);
				xx.setDanXiangGongCheng(tableItemMap.get("dan_xiang_gong_cheng_"));
				xx.setGuiMoMianJi(tableItemMap.get("gui_mo_mian_ji_"));
				xx.setGuiMoChangDu(tableItemMap.get("gui_mo_chang_du_"));
				xx.setGuiMoQiTa(tableItemMap.get("gui_mo_qi_ta_"));
				xx.setYanGao(tableItemMap.get("yan_gao_"));
				xx.setZongGao(tableItemMap.get("zong_gao_"));
				xx.setDiShangDiXiaCengShu(tableItemMap.get("di_shang_di_xia_ceng_shu_"));
				xx.setGongChengLeiBie(tableItemMap.get("gong_cheng_lei_bie_"));
				xx.setJieGouLeiXing(tableItemMap.get("jie_gou_lei_xing_"));
				xx.setJiChuJieGou(tableItemMap.get("ji_chu_jie_gou_"));
				mapper.updateByPrimaryKey(xx);
			}


		}  



	}
	@RequestMapping("new_project")
	public void func2(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String data= request.getParameter("data");
		JSONObject tableInfoJson;
		tableInfoJson = JSON.parseObject(data);  
		Map<String, String> tableItemMap= JSONObject.toJavaObject(tableInfoJson, Map.class);

		
		
		if(tableItemMap.get("xiang_mu_id_").trim().length()==0){
			XiangMuXinXi xx= new XiangMuXinXi();
			xx.setXiangMuMingChen(tableItemMap.get("xiang_mu_ming_chen_"));
			xx.setXiangMuYongTu(tableItemMap.get("xiang_mu_yong_tu_"));
			xx.setGongChengDiDian(tableItemMap.get("gong_cheng_di_dian_"));
			xx.setTouZiXingZhi(tableItemMap.get("tou_zi_xing_zhi_"));
			xx.setJianSheDanWei(tableItemMap.get("jian_she_dan_wei_"));
			xx.setJianSheDanWeiZhuGongDiDaiBiao(tableItemMap.get("jian_she_dan_wei_zhu_gong_di_dai_biao_"));
			xx.setSheJiDanWei(tableItemMap.get("she_ji_dan_wei_"));
			xx.setSheJiDanWeiZhuGongDiDaiBiao(tableItemMap.get("she_ji_dan_wei_zhu_gong_di_dai_biao_"));
			xx.setJianLiDanWei(tableItemMap.get("jian_li_dan_wei_"));
			xx.setJianLiDaiBiao(tableItemMap.get("jian_li_dai_biao_"));
			DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
			Date kai_gong_ri_qi_ = dateFormat1.parse(tableItemMap.get("kai_gong_ri_qi_"));
			Date jun_gong_ri_qi_ = dateFormat1.parse(tableItemMap.get("jun_gong_ri_qi_"));
			xx.setKaiGongRiQi(kai_gong_ri_qi_);
			xx.setJunGongRiQi(jun_gong_ri_qi_);
			xx.setGongQiTianShu(tableItemMap.get("gong_qi_tian_shu_"));
			xx.setZhiLiangMuBiao(tableItemMap.get("zhi_liang_mu_biao_"));
			xx.setHeTongJiaKuan(tableItemMap.get("he_tong_jia_kuan_"));
			xx.setChengBaoFangShi(tableItemMap.get("cheng_bao_fang_shi_"));
			XiangMuXinXiMapper mapper = sqlSession.getMapper(XiangMuXinXiMapper.class);
			mapper.insert(xx);	
			funcCreateGongCheng(tableItemMap.get("trdata"),xx.getId());
		}else{
			XiangMuXinXiMapper mapper = sqlSession.getMapper(XiangMuXinXiMapper.class);
			XiangMuXinXi xx=mapper.selectByPrimaryKey(Integer.parseInt(tableItemMap.get("xiang_mu_id_")));
			xx.setXiangMuMingChen(tableItemMap.get("xiang_mu_ming_chen_"));
			xx.setXiangMuYongTu(tableItemMap.get("xiang_mu_yong_tu_"));
			xx.setGongChengDiDian(tableItemMap.get("gong_cheng_di_dian_"));
			xx.setTouZiXingZhi(tableItemMap.get("tou_zi_xing_zhi_"));
			xx.setJianSheDanWei(tableItemMap.get("jian_she_dan_wei_"));
			xx.setJianSheDanWeiZhuGongDiDaiBiao(tableItemMap.get("jian_she_dan_wei_zhu_gong_di_dai_biao_"));
			xx.setSheJiDanWei(tableItemMap.get("she_ji_dan_wei_"));
			xx.setSheJiDanWeiZhuGongDiDaiBiao(tableItemMap.get("she_ji_dan_wei_zhu_gong_di_dai_biao_"));
			xx.setJianLiDanWei(tableItemMap.get("jian_li_dan_wei_"));
			xx.setJianLiDaiBiao(tableItemMap.get("jian_li_dai_biao_"));
			DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
			Date kai_gong_ri_qi_ = dateFormat1.parse(tableItemMap.get("kai_gong_ri_qi_"));
			Date jun_gong_ri_qi_ = dateFormat1.parse(tableItemMap.get("jun_gong_ri_qi_"));
			xx.setKaiGongRiQi(kai_gong_ri_qi_);
			xx.setJunGongRiQi(jun_gong_ri_qi_);
			xx.setGongQiTianShu(tableItemMap.get("gong_qi_tian_shu_"));
			xx.setZhiLiangMuBiao(tableItemMap.get("zhi_liang_mu_biao_"));
			xx.setHeTongJiaKuan(tableItemMap.get("he_tong_jia_kuan_"));
			xx.setChengBaoFangShi(tableItemMap.get("cheng_bao_fang_shi_"));
			mapper.updateByPrimaryKey(xx);
			funcCreateGongCheng(tableItemMap.get("trdata"),xx.getId());
		}
		
		
		
		/*
		XiangMuXinXiMapper mapper = sqlSession.getMapper(XiangMuXinXiMapper.class);
		mapper.insert(xx);	
		funcCreateGongCheng(tableItemMap.get("trdata"),xx.getId());
//*/
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write("success");

	}

	@RequestMapping("get_pro_staff")
	public void func3(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String pro_id= request.getParameter("pro_id");


		XiangMuRenYuanZhuCe xx=new XiangMuRenYuanZhuCe();
		XiangMuRenYuanZhuCeMapper mapper = sqlSession.getMapper(XiangMuRenYuanZhuCeMapper.class);
		XiangMuRenYuanZhuCeExample cc=new XiangMuRenYuanZhuCeExample();
		cc.setOrderByClause("id");
		cc.or().andXiangMuIdEqualTo(Integer.parseInt(pro_id));
		List<XiangMuRenYuanZhuCe> lee=mapper.selectByExample(cc);
		String ret="";
		if(lee.size()==0){
			ret="2";
		}else{
			ret="[";
			for(XiangMuRenYuanZhuCe k :lee){


				String ss="{\"id\" : \""+k.getId()+"\","+
						"\"ren_yuan_id_\" : \""+k.getRenYuanId()+"\","+
						"\"xiang_mu_id_\" : \""+k.getXiangMuId()+"\","+
						"\"gang_wei_ming_cheng_\" : \""+k.getGangWeiMingCheng()+"\","+
						"\"zhi_wu_\" : \""+k.getZhiWu()+"\","+
						"\"suo_shu_bu_men_\" : \""+k.getSuoShuBuMen()+"\","+
						"\"dao_gang_shi_jian_\" : \""+k.getDaoGangShiJian()+"\","+
						"\"gang_wei_xing_zhi_\" : \""+k.getGangWeiXingZhi()+"\",";

				//YongHu tt=new YongHu();
				YongHuMapper xmapper = sqlSession.getMapper(YongHuMapper.class);

				YongHu pp =xmapper.selectByPrimaryKey(k.getRenYuanId());


				String see="{"+
						"\"id\" : \""+pp.getId()+"\","+
						"\"yong_hu_ming_\" : "+pp.getYongHuMing()+","+
						"\"mi_ma_\" : "+pp.getMiMa()+","+
						"\"xing_ming_\" : \""+pp.getXingMing()+"\","+
						"\"xing_bie_\" : \""+pp.getXingBie()+"\","+
						"\"min_zu_\" : \""+pp.getMinZu()+"\","+
						"\"shen_fen_zheng_hao_ma_\" : \""+pp.getShenFenZhengHaoMa()+"\","+
						"\"shen_fen_zheng_zhao_zheng_\" : \""+pp.getShenFenZhengZhaoZheng()+"\","+
						"\"shen_fen_zheng_zhao_fan_\" : \""+pp.getShenFenZhengZhaoFan()+"\","+
						"\"jia_ting_zhu_zhi_\" : \""+pp.getJiaTingZhuZhi()+"\","+
						"\"lao_dong_he_tong_bian_hao_\" : \""+pp.getLaoDongHeTongBianHao()+" \","+
						"\"zheng_jian_zhao_ids_\" : \""+pp.getZhengJianZhaoIds()+"\","+
						"\"suo_shu_yong_hu_zu_\" : \""+pp.getSuoShuYongHuZu()+"\","+
						"\"biao_qian_\" : \""+pp.getBiaoQian()+"\","+
						"\"qi_ye_\" : \""+pp.getQiYe()+"\","+
						"\"quan_xian_\" : \""+pp.getQuanXian()+"\","+
						"\"zhu_ce_shi_jian_\" : \""+pp.getZhuCeShiJian()+"\""+
						"}";
				ss+="\"yong_hu_xin_xi_\" : "+see+"},";
				//ss+="\"yong_hu_xin_xi_\" : "+JSON.toJSONString(pp)+"},";
				ret+=ss;
			}
			ret+="]";
		}


		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ret);

	}

	@RequestMapping("get_pro_name")
	public void func4(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String pro_id= request.getParameter("pro_id");
		XiangMuXinXiMapper mapper = sqlSession.getMapper(XiangMuXinXiMapper.class);
		XiangMuXinXi xx=mapper.selectByPrimaryKey(Integer.parseInt(pro_id));
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(xx.getXiangMuMingChen());

	}

	@RequestMapping("get_tar_staff")
	public void func5(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String staff_name= request.getParameter("staff_name");
		YongHuMapper mapper = sqlSession.getMapper(YongHuMapper.class);
		YongHuExample ee=new YongHuExample();
		ee.or().andXingMingLike("%"+staff_name+"%");
		List<YongHu> lee=mapper.selectByExample(ee);

		System.out.println(JSON.toJSONString(lee));
		String ret="[";
		for(YongHu ef:lee){


			String ss=		"{"+
					"		\"id\" : \""+ef.getId()+"\","+
					"		\"yong_hu_ming_\" : "+ef.getYongHuMing()+","+
					"		\"mi_ma_\" : "+ef.getMiMa()+","+
					"		\"xing_ming_\" : \""+ef.getXingMing()+"\","+
					"		\"xing_bie_\" : \""+ef.getXingBie()+"\","+
					"		\"min_zu_\" : \""+ef.getMinZu()+"\","+
					"		\"shen_fen_zheng_hao_ma_\" : \""+ef.getShenFenZhengHaoMa()+"\","+
					"		\"shen_fen_zheng_zhao_zheng_\" : \""+ef.getShenFenZhengZhaoZheng()+"\","+
					"		\"shen_fen_zheng_zhao_fan_\" : \""+ef.getShenFenZhengZhaoFan()+"\","+
					"		\"jia_ting_zhu_zhi_\" : \""+ef.getJiaTingZhuZhi()+"\","+
					"		\"lao_dong_he_tong_bian_hao_\" : \""+ef.getLaoDongHeTongBianHao()+"\","+
					"		\"zheng_jian_zhao_ids_\" : \""+ef.getZhengJianZhaoIds()+"\","+
					"		\"suo_shu_yong_hu_zu_\" : \""+ef.getSuoShuYongHuZu()+"\","+
					"		\"biao_qian_\" : \""+ef.getBiaoQian()+"\","+
					"		\"qi_ye_\" : \""+ef.getQiYe()+"\","+
					"		\"quan_xian_\" : \""+ef.getQuanXian()+"\","+
					"		\"zhu_ce_shi_jian_\" : \""+ef.getZhuCeShiJian()+"\","+
					"		\"biao_qian_ming_\" : \""+ef.getBiaoQian()+"\""+
					"	},";
			ret+=ss;
		}
		ret+="]";



		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ret);

	}

	@RequestMapping("get_pro_staffs")
	public void func6(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String pro_id= request.getParameter("pro_id");
		XiangMuRenYuanZhuCe xx=new XiangMuRenYuanZhuCe();
		XiangMuRenYuanZhuCeMapper mapper = sqlSession.getMapper(XiangMuRenYuanZhuCeMapper.class);
		XiangMuRenYuanZhuCeExample cc=new XiangMuRenYuanZhuCeExample();
		cc.or().andXiangMuIdEqualTo(Integer.parseInt(pro_id));
		List<XiangMuRenYuanZhuCe> lee=mapper.selectByExample(cc);
		String ret="[";
		Map<String, String>	qq = new HashMap<String, String>();
		//suo_shu_bu_men_
		for(XiangMuRenYuanZhuCe kk:lee){

			if(qq.get(kk.getSuoShuBuMen())=="1"){
				continue;
			}else{
				qq.put(kk.getSuoShuBuMen(),"1");
			}


			String ss="{"+
					"	\"suo_shu_bu_men_\" : \""+kk.getSuoShuBuMen()+"\","+
					"	\"lei_xing_\" : \"suo_shu_bu_men_\","+
					"	\"ren_yuan_\" : [";
			XiangMuRenYuanZhuCeExample zz=new XiangMuRenYuanZhuCeExample();
			zz.or().andXiangMuIdEqualTo(Integer.parseInt(pro_id)).andSuoShuBuMenEqualTo(kk.getSuoShuBuMen());
			List<XiangMuRenYuanZhuCe> fee=mapper.selectByExample(zz);
			for(XiangMuRenYuanZhuCe jj:fee){

				String dd="{"+
						"			\"id\" : \""+ jj.getId()+"\","+	
						"			\"ren_yuan_id_\" : \""+ jj.getRenYuanId()+"\","+
						"			\"xiang_mu_id_\" : \""+ jj.getXiangMuId()+"\","+
						"			\"gang_wei_ming_cheng_\" : \""+ jj.getGangWeiMingCheng()+"\","+
						"			\"zhi_wu_\" : \""+ jj.getZhiWu()+"\","+
						"			\"suo_shu_bu_men_\" : \""+ jj.getSuoShuBuMen()+"\","+
						"			\"dao_gang_shi_jian_\" : \""+ jj.getDaoGangShiJian()+"\","+
						"			\"gang_wei_xing_zhi_\" : \""+ jj.getGangWeiXingZhi()+"\",";
				YongHuMapper emapper = sqlSession.getMapper(YongHuMapper.class);
				YongHu yy= emapper.selectByPrimaryKey(jj.getRenYuanId());

				dd+="			\"yuan_gong_xin_ming_\" : \""+ yy.getXingMing()+"\""+
						"		}, ";
				ss+=dd;

			}
			ss+="]},";
			ret+=ss;
		}
		//zhiwu
		for(XiangMuRenYuanZhuCe kk:lee){

			if(qq.get(kk.getZhiWu())=="1"){
				continue;
			}else{
				qq.put(kk.getZhiWu(),"1");
			}

			//zhiwu replace suo_shu_bu_men_
			String ss="{"+
					"	\"zhi_wu_\" : \""+kk.getZhiWu()+"\","+
					"	\"lei_xing_\" : \"zhi_wu_\","+
					"	\"ren_yuan_\" : [";
			XiangMuRenYuanZhuCeExample zz=new XiangMuRenYuanZhuCeExample();
			zz.or().andXiangMuIdEqualTo(Integer.parseInt(pro_id)).andZhiWuEqualTo(kk.getZhiWu());
			List<XiangMuRenYuanZhuCe> fee=mapper.selectByExample(zz);
			for(XiangMuRenYuanZhuCe jj:fee){

				String dd="{"+
						"			\"id\" : \""+ jj.getId()+"\","+	
						"			\"ren_yuan_id_\" : \""+ jj.getRenYuanId()+"\","+
						"			\"xiang_mu_id_\" : \""+ jj.getXiangMuId()+"\","+
						"			\"gang_wei_ming_cheng_\" : \""+ jj.getGangWeiMingCheng()+"\","+
						"			\"zhi_wu_\" : \""+ jj.getZhiWu()+"\","+
						"			\"suo_shu_bu_men_\" : \""+ jj.getSuoShuBuMen()+"\","+
						"			\"dao_gang_shi_jian_\" : \""+ jj.getDaoGangShiJian()+"\","+
						"			\"gang_wei_xing_zhi_\" : \""+ jj.getGangWeiXingZhi()+"\",";
				YongHuMapper emapper = sqlSession.getMapper(YongHuMapper.class);
				YongHu yy= emapper.selectByPrimaryKey(jj.getRenYuanId());
				dd+="			\"yuan_gong_xin_ming_\" : \""+ yy.getXingMing()+"\""+
						"		}, ";
				ss+=dd;
			}
			ss+="]},";
			ret+=ss;
		}
		ret+="]";
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ret);

	}


	/*
	 *人与表的配置 
	 */
	@RequestMapping("tabs_configure")
	public void func7(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String pro_id= request.getParameter("pro_id");
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write("");

	}


	@RequestMapping("get_pro_info")
	public void func8(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String pro_id= request.getParameter("pro_id");
		XiangMuXinXiMapper mapper = sqlSession.getMapper(XiangMuXinXiMapper.class);
		XiangMuXinXi xx=mapper.selectByPrimaryKey(Integer.parseInt(pro_id));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String ret="{"+
				"	\"id\" : \""+xx.getId()+"\","+
				"	\"xiang_mu_ming_chen_\" : \""+xx.getXiangMuMingChen()+"\","+
				"	\"xiang_mu_yong_tu_\" : \""+xx.getXiangMuYongTu()+"\","+
				"	\"gong_cheng_di_dian_\" : \""+xx.getGongChengDiDian()+"\","+
				"	\"tou_zi_xing_zhi_\" : \""+xx.getTouZiXingZhi()+"\","+
				"	\"jian_she_dan_wei_\" : \""+xx.getJianSheDanWei()+"\","+
				"	\"jian_she_dan_wei_zhu_gong_di_dai_biao_\" : \""+xx.getJianSheDanWeiZhuGongDiDaiBiao()+"\","+
				"	\"she_ji_dan_wei_\" : \""+xx.getSheJiDanWei()+"\","+
				"	\"she_ji_dan_wei_zhu_gong_di_dai_biao_\" : \""+xx.getSheJiDanWeiZhuGongDiDaiBiao()+"\","+
				"	\"jian_li_dan_wei_\" : \""+xx.getJianLiDanWei()+"\","+
				"	\"jian_li_dai_biao_\" : \""+xx.getJianLiDaiBiao()+"\","+
				"	\"kai_gong_ri_qi_\" : \""+xx.getKaiGongRiQi()+"\","+
				"	\"jun_gong_ri_qi_\" : \""+xx.getJunGongRiQi()+"\","+
				"	\"gong_qi_tian_shu_\" : \""+xx.getGongQiTianShu()+"\","+
				"	\"zhi_liang_mu_biao_\" : \""+xx.getHeTongJiaKuan()+"\","+
				"	\"he_tong_jia_kuan_\" : \""+xx.getHeTongJiaKuan()+"\","+
				"	\"cheng_bao_fang_shi_\" : \""+xx.getChengBaoFangShi()+"\","+
				"	\"shen_he_zhuang_tai_\" : \""+xx.getShenHeZhuangTai()+"\","+
				"   \"single_projects\" : [";

		GongChengMapper smapper= sqlSession.getMapper(GongChengMapper.class);
		GongChengExample cc=new GongChengExample();
		cc.or().andXiangMuIdEqualTo(Integer.parseInt(pro_id));
		List<GongCheng> lee=smapper.selectByExample(cc);

		for(GongCheng k :lee){
			String ss="{"+
					"	\"id\" : \""+k.getId()+"\","+
					"	\"name\" : \""+k.getName()+"\","+
					"	\"xiang_mu_id_\" : \""+k.getXiangMuId()+"\","+
					"	\"dan_xiang_gong_cheng_\" : \""+k.getDanXiangGongCheng()+"\","+
					"	\"gui_mo_mian_ji_\" : \""+k.getGuiMoMianJi()+"\","+
					"	\"gui_mo_chang_du_\" : \""+k.getGuiMoChangDu()+"\","+
					"	\"gui_mo_qi_ta_\" : \""+k.getGuiMoQiTa()+"\","+
					"	\"yan_gao_\" : \""+k.getYanGao()+"\","+
					"	\"zong_gao_\" : \""+k.getZongGao()+"\","+
					"	\"di_shang_di_xia_ceng_shu_\" : \""+k.getDiShangDiXiaCengShu()+"\","+
					"	\"gong_cheng_lei_bie_\" : \""+k.getGongChengLeiBie()+"\","+
					"	\"jie_gou_lei_xing_\" : \""+k.getJieGouLeiXing()+"\","+
					"	\"ji_chu_jie_gou_\" : \""+k.getJiChuJieGou()+"\""+
					"},";
			ret+=ss;
		}
		ret+="]}";
		//System.out.println(sdf.format(xx.getJunGongRiQi()));
		System.out.println(xx.getJunGongRiQi());
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ret);

	}

	@RequestMapping("get_pros")
	public void func9(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		XiangMuXinXiMapper mapper = sqlSession.getMapper(XiangMuXinXiMapper.class);
		XiangMuXinXiExample cc=new XiangMuXinXiExample();
		cc.setOrderByClause("id");
		List<XiangMuXinXi> lee=mapper.selectByExample(cc);

		String ret="[";
		for(XiangMuXinXi k:lee){
			String ss="{"+
					"	\"id\" : \""+k.getId()+"\","+
					"	\"xiang_mu_ming_chen_\" : \""+k.getXiangMuMingChen()+"\""+
					"},";
			ret+=ss;
		}
		ret+="]";
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ret);
	}
}
