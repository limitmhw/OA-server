package serv.controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model.mapper.*;
import model.po.*;
@Controller
@RequestMapping("/authority")
public class AuthorityServ {
	private SqlSession sqlSession;
	AuthorityServ()throws IOException{
		String res = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(res);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession();
	}
	private String changeResult(String vv){
		if(vv==null)return "0";
		if(vv.equals("on")){
			return "1";
		}
		return "0";
	}
	@RequestMapping("create_authority_model")
	public void func1(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		//http://localhost:8080/simpleMVC/authority/create_authority_model.action
		//request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		/*
		name = URLDecoder.decode(name,"UTF-8"); 
		System.out.println("######################");
		name=new String(name.getBytes("ISO-8859-1"),"UTF-8");
		System.out.println(name);

		 这个只有在有url里面有汉字的情况才可以正常解码，但是汉字在url 里面也被二次编码
		System.out.println("######################");
		System.out.println(name);
		System.out.println("name");
		name=new String(name.getBytes("ISO-8859-1"),"UTF-8");
		System.out.println(name);
		 */
		String xiang_mu_bu_zu_zhi_ji_gou_ = request.getParameter("xiang_mu_bu_zu_zhi_ji_gou_");
		String gang_wei_yu_ren_yuan_pei_zhi_ = request.getParameter("gang_wei_yu_ren_yuan_pei_zhi_");
		String ren_wu_zong_lan_yu_bu_shu_ = request.getParameter("ren_wu_zong_lan_yu_bu_shu_");
		String zhi_ze_yu_zhi_quan_fen_pei_ = request.getParameter("zhi_ze_yu_zhi_quan_fen_pei_");
		String xiang_mu_shi_shi_ce_hua_shu_ = request.getParameter("xiang_mu_shi_shi_ce_hua_shu_");
		String bu_men_ji_hua_ = request.getParameter("bu_men_ji_hua_");
		String gong_zuo_qia_shang_ = request.getParameter("gong_zuo_qia_shang_");
		String zheng_gai_tong_zhi_ = request.getParameter("zheng_gai_tong_zhi_");
		String wei_yue_tong_zhi_ = request.getParameter("wei_yue_tong_zhi_");
		String xing_zheng_wen_jian_ = request.getParameter("xing_zheng_wen_jian_");
		String bian_han_mo_ban_ = request.getParameter("bian_han_mo_ban_");
		String na_bu_bao_gao_ = request.getParameter("na_bu_bao_gao_");
		String hui_yi_ji_yao_ = request.getParameter("hui_yi_ji_yao_");
		String fa_wen_deng_ji_ = request.getParameter("fa_wen_deng_ji_");
		String shou_wen_yue_ban_ = request.getParameter("shou_wen_yue_ban_");
		String lai_wen_qian_shou_ = request.getParameter("lai_wen_qian_shou_");
		String yue_du_chu_qin_ = request.getParameter("yue_du_chu_qin_");
		String qing_jia_shen_qing_ = request.getParameter("qing_jia_shen_qing_");
		String chu_qin_tong_ji_ = request.getParameter("chu_qin_tong_ji_");
		String shi_yong_shen_qing_ = request.getParameter("shi_yong_shen_qing_");
		String shi_yong_deng_ji_ = request.getParameter("shi_yong_deng_ji_");
		String xu_qiu_ji_hua_ = request.getParameter("xu_qiu_ji_hua_");
		String ku_cun_tai_zhang_ = request.getParameter("ku_cun_tai_zhang_");
		String ling_yong_deng_ji_ = request.getParameter("ling_yong_deng_ji_");
		String jie_yue_deng_ji_ = request.getParameter("jie_yue_deng_ji_");
		String tu_shu_tai_zhang_ = request.getParameter("tu_shu_tai_zhang_");
		String gou_you_jia_you_ = request.getParameter("gou_you_jia_you_");
		String wei_xiu_bao_yang_ = request.getParameter("wei_xiu_bao_yang_");
		String zi_chan_tai_zhang_ = request.getParameter("zi_chan_tai_zhang_");
		String zhao_biao_wen_jian_ = request.getParameter("zhao_biao_wen_jian_");
		String yi_biao_shen_pi_ = request.getParameter("yi_biao_shen_pi_");
		String zhao_biao_gong_gao_ = request.getParameter("zhao_biao_gong_gao_");
		String zi_ge_shen_cha_ = request.getParameter("zi_ge_shen_cha_");
		String kao_cha_ping_jia_ru_xu_ = request.getParameter("kao_cha_ping_jia_ru_xu_");
		String wen_jian_ling_qu_ = request.getParameter("wen_jian_ling_qu_");
		String tou_biao_bao_jia_ = request.getParameter("tou_biao_bao_jia_");
		String kai_ping_ding_biao_ = request.getParameter("kai_ping_ding_biao_");
		String jia_ge_shen_ding_ = request.getParameter("jia_ge_shen_ding_");
		String zhong_biao_tong_zhi_ = request.getParameter("zhong_biao_tong_zhi_");
		String he_tong_qian_ding_ = request.getParameter("he_tong_qian_ding_");
		String he_tong_jiao_di_ = request.getParameter("he_tong_jiao_di_");
		String he_tong_bian_geng_ = request.getParameter("he_tong_bian_geng_");
		String he_tong_tai_zhang_ = request.getParameter("he_tong_tai_zhang_");
		String gong_fang_ming_ce_ = request.getParameter("gong_fang_ming_ce_");
		String tu_zhi_deng_ji_ = request.getParameter("tu_zhi_deng_ji_");
		String tu_zhi_hui_shen_ = request.getParameter("tu_zhi_hui_shen_");
		String shi_zu_bian_zhi_ = request.getParameter("shi_zu_bian_zhi_");
		String fang_an_bian_zhi_ = request.getParameter("fang_an_bian_zhi_");
		String ji_shu_jiao_di_ = request.getParameter("ji_shu_jiao_di_");
		String gong_cheng_bian_geng_ = request.getParameter("gong_cheng_bian_geng_");
		String ji_shu_he_ding_ = request.getParameter("ji_shu_he_ding_");
		String lao_wu_xu_qiu_ji_hua_ = request.getParameter("lao_wu_xu_qiu_ji_hua_");
		String wu_zi_xu_qiu_ji_hua_ = request.getParameter("wu_zi_xu_qiu_ji_hua_");
		String wu_zi_yan_shou_ji_hua_ = request.getParameter("wu_zi_yan_shou_ji_hua_");
		String ji_xie_xu_qiu_ji_hua_ = request.getParameter("ji_xie_xu_qiu_ji_hua_");
		String jian_ce_pei_bei_ji_hua_ = request.getParameter("jian_ce_pei_bei_ji_hua_");
		String ban_zu_zuo_ye_zu_zhi_ka_ = request.getParameter("ban_zu_zuo_ye_zu_zhi_ka_");
		String wu_liao_diao_yun_zu_zhi_ka_ = request.getParameter("wu_liao_diao_yun_zu_zhi_ka_");
		String lao_dong_li_pei_zhi_ji_hua_ = request.getParameter("lao_dong_li_pei_zhi_ji_hua_");
		String lao_dong_li_diao_pei_ji_hua_ = request.getParameter("lao_dong_li_diao_pei_ji_hua_");
		String shi_ji_jin_du_yu_zong_jin_du_ji_hua_dui_bi_ = request.getParameter("shi_ji_jin_du_yu_zong_jin_du_ji_hua_dui_bi_");
		String shi_ji_wan_cheng_yu_yue_jin_du_ji_hua_dui_bi_ = request.getParameter("shi_ji_wan_cheng_yu_yue_jin_du_ji_hua_dui_bi_");
		String zhi_liang_tong_bing_yu_kong_shi_bie_ = request.getParameter("zhi_liang_tong_bing_yu_kong_shi_bie_");
		String gong_cheng_zhi_liang_xun_jian_kong_zhi_ = request.getParameter("gong_cheng_zhi_liang_xun_jian_kong_zhi_");
		String wei_xian_yuan_yu_kong_shi_bie_ = request.getParameter("wei_xian_yuan_yu_kong_shi_bie_");
		String an_quan_xun_jian_kong_zhi_biao_ = request.getParameter("an_quan_xun_jian_kong_zhi_biao_");
		String an_quan_gong_shang_shi_gu_kuai_bao_ = request.getParameter("an_quan_gong_shang_shi_gu_kuai_bao_");
		String an_quan_wei_sui_shi_gu_deng_ji_ = request.getParameter("an_quan_wei_sui_shi_gu_deng_ji_");
		String huan_jing_yin_su_yu_kong_shi_bie_ = request.getParameter("huan_jing_yin_su_yu_kong_shi_bie_");
		String huan_jing_ying_xiang_guo_cheng_xun_jian_ = request.getParameter("huan_jing_ying_xiang_guo_cheng_xun_jian_");
		String jian_ce_zhuang_zhi_jian_ding_ji_hua_ = request.getParameter("jian_ce_zhuang_zhi_jian_ding_ji_hua_");
		String jian_ce_zhuang_zhi_shi_yong_zhuang_tai_ = request.getParameter("jian_ce_zhuang_zhi_shi_yong_zhuang_tai_");
		String shi_gong_ri_zhi_ = request.getParameter("shi_gong_ri_zhi_");
		String xiang_mu_yue_bao_ = request.getParameter("xiang_mu_yue_bao_");
		String ji_shu_wen_jian_guan_li_tai_zhang_ = request.getParameter("ji_shu_wen_jian_guan_li_tai_zhang_");
		String fang_an_dong_tai_guan_li_tai_zhang_ = request.getParameter("fang_an_dong_tai_guan_li_tai_zhang_");
		String jian_ce_zhuang_zhi_guan_li_tai_zhang_ = request.getParameter("jian_ce_zhuang_zhi_guan_li_tai_zhang_");
		String fen_bao_jin_chang_ji_hua_ = request.getParameter("fen_bao_jin_chang_ji_hua_");
		String ji_xie_jin_chang_ji_hua_ = request.getParameter("ji_xie_jin_chang_ji_hua_");
		String fen_bao_jin_chang_yan_zheng_ji_lu_ = request.getParameter("fen_bao_jin_chang_yan_zheng_ji_lu_");
		String fen_bao_jin_chang_she_bei_qing_dan_ = request.getParameter("fen_bao_jin_chang_she_bei_qing_dan_");
		String ji_xie_jin_chang_yan_shou_ji_lu_ = request.getParameter("ji_xie_jin_chang_yan_shou_ji_lu_");
		String ji_xie_she_bei_san_ding_deng_ji_ = request.getParameter("ji_xie_she_bei_san_ding_deng_ji_");
		String shi_gong_ji_xie_she_bei_tai_zhang_ = request.getParameter("shi_gong_ji_xie_she_bei_tai_zhang_");
		String fen_bao_ren_yuan_zhu_ce_ = request.getParameter("fen_bao_ren_yuan_zhu_ce_");
		String fen_bao_ren_yuan_zao_ce_ = request.getParameter("fen_bao_ren_yuan_zao_ce_");
		String fen_bao_jin_chang_jiao_yu_ = request.getParameter("fen_bao_jin_chang_jiao_yu_");
		String lao_wu_gong_ren_chu_qin_ = request.getParameter("lao_wu_gong_ren_chu_qin_");
		String lao_wu_gong_ren_bian_dong_ = request.getParameter("lao_wu_gong_ren_bian_dong_");
		String lao_wu_yong_gong_tong_ji_ = request.getParameter("lao_wu_yong_gong_tong_ji_");
		String gong_ren_gong_zi_fa_fang_ji_lu_ = request.getParameter("gong_ren_gong_zi_fa_fang_ji_lu_");
		String ji_xie_she_bei_wei_bao_ji_hua_ = request.getParameter("ji_xie_she_bei_wei_bao_ji_hua_");
		String ji_xie_she_bei_yun_zhuan_ji_lu_ = request.getParameter("ji_xie_she_bei_yun_zhuan_ji_lu_");
		String ji_xie_she_bei_jian_cha_ji_lu_ = request.getParameter("ji_xie_she_bei_jian_cha_ji_lu_");
		String ji_xie_she_bei_bao_yang_ji_lu_ = request.getParameter("ji_xie_she_bei_bao_yang_ji_lu_");
		String ji_xie_she_bei_wei_xiu_ji_lu_ = request.getParameter("ji_xie_she_bei_wei_xiu_ji_lu_");
		String ji_xie_she_bei_shi_gu_bao_gao_ = request.getParameter("ji_xie_she_bei_shi_gu_bao_gao_");
		String fen_bao_ri_chang_guan_li_ji_lu_ = request.getParameter("fen_bao_ri_chang_guan_li_ji_lu_");
		String fen_bao_shi_yong_ji_lu_ = request.getParameter("fen_bao_shi_yong_ji_lu_");
		String fen_gong_fang_ping_jia_hui_zong_ = request.getParameter("fen_gong_fang_ping_jia_hui_zong_");
		String wu_zi_cai_gou_ji_hua_ = request.getParameter("wu_zi_cai_gou_ji_hua_");
		String ling_xing_cai_gou_xun_jia_ = request.getParameter("ling_xing_cai_gou_xun_jia_");
		String wu_zi_diao_bo_ping_zheng_ = request.getParameter("wu_zi_diao_bo_ping_zheng_");
		String wu_zi_jin_chang_chou_hua_ = request.getParameter("wu_zi_jin_chang_chou_hua_");
		String wu_zi_jin_chang_tong_zhi_ = request.getParameter("wu_zi_jin_chang_tong_zhi_");
		String wu_zi_jin_chang_yan_shou_ = request.getParameter("wu_zi_jin_chang_yan_shou_");
		String zhi_liang_zheng_ming_deng_ji_ = request.getParameter("zhi_liang_zheng_ming_deng_ji_");
		String shou_huo_dan_ = request.getParameter("shou_huo_dan_");
		String ru_ku_dan_ = request.getParameter("ru_ku_dan_");
		String tui_huan_huo_dan_ = request.getParameter("tui_huan_huo_dan_");
		String ling_tui_yong_dan_ = request.getParameter("ling_tui_yong_dan_");
		String chu_tui_ku_dan_ = request.getParameter("chu_tui_ku_dan_");
		String wu_zi_zhu_cun_bao_guan_ji_lu_ = request.getParameter("wu_zi_zhu_cun_bao_guan_ji_lu_");
		String gong_ju_yong_ju_jie_yong_ji_lu_ = request.getParameter("gong_ju_yong_ju_jie_yong_ji_lu_");
		String wu_zi_chu_ru_cun_hao_pan_dian_ = request.getParameter("wu_zi_chu_ru_cun_hao_pan_dian_");
		String wu_zi_fu_shi_tong_zhi_dan_ = request.getParameter("wu_zi_fu_shi_tong_zhi_dan_");
		String wu_zi_gou_jian_bao_yan_dan_ = request.getParameter("wu_zi_gou_jian_bao_yan_dan_");
		String yang_pin_yang_ben_song_shen_biao_ = request.getParameter("yang_pin_yang_ben_song_shen_biao_");
		String bu_he_ge_pin_chu_zhi_ji_lu_ = request.getParameter("bu_he_ge_pin_chu_zhi_ji_lu_");
		String wu_zi_jin_chang_bao_yan_tai_zhang_ = request.getParameter("wu_zi_jin_chang_bao_yan_tai_zhang_");
		String fei_jiu_wu_zi_chu_zhi_shen_qing_ = request.getParameter("fei_jiu_wu_zi_chu_zhi_shen_qing_");
		String fei_jiu_wu_zi_chu_zhi_tai_zhang_ = request.getParameter("fei_jiu_wu_zi_chu_zhi_tai_zhang_");
		String wu_zi_bao_guan_ming_xi_zhang_biao_ = request.getParameter("wu_zi_bao_guan_ming_xi_zhang_biao_");
		String wu_zi_cai_gou_tong_ji_bao_biao_ = request.getParameter("wu_zi_cai_gou_tong_ji_bao_biao_");
		String wu_zi_hao_yong_tong_ji_bao_biao_ = request.getParameter("wu_zi_hao_yong_tong_ji_bao_biao_");
		String wu_zi_ling_yong_tong_ji_bao_biao_ = request.getParameter("wu_zi_ling_yong_tong_ji_bao_biao_");
		String wu_zi_sun_hao_tong_ji_bao_biao_ = request.getParameter("wu_zi_sun_hao_tong_ji_bao_biao_");
		String shi_yan_jian_ce_ji_hua_ = request.getParameter("shi_yan_jian_ce_ji_hua_");
		String qu_yang_song_jian_tong_zhi_ = request.getParameter("qu_yang_song_jian_tong_zhi_");
		String shi_yan_shi_jian_deng_ji_ = request.getParameter("shi_yan_shi_jian_deng_ji_");
		String wen_du_shi_du_ji_lu_ = request.getParameter("wen_du_shi_du_ji_lu_");
		String shi_yan_wei_tuo_shu_ = request.getParameter("shi_yan_wei_tuo_shu_");
		String shi_yan_jian_ce_bao_gao_ = request.getParameter("shi_yan_jian_ce_bao_gao_");
		String gong_cheng_zi_liao_ = request.getParameter("gong_cheng_zi_liao_");
		String zi_liao_chu_li_liu_cheng_ = request.getParameter("zi_liao_chu_li_liu_cheng_");
		String gong_cheng_zi_liao_jian_cha_ = request.getParameter("gong_cheng_zi_liao_jian_cha_");
		String gong_cheng_liang_ji_suan_shu_ = request.getParameter("gong_cheng_liang_ji_suan_shu_");
		String gong_cheng_liang_tong_ji_biao_ = request.getParameter("gong_cheng_liang_tong_ji_biao_");
		String jing_ji_yu_ji_shu_zhi_biao_ = request.getParameter("jing_ji_yu_ji_shu_zhi_biao_");
		String gong_cheng_zao_jia_yu_suan_shu_ = request.getParameter("gong_cheng_zao_jia_yu_suan_shu_");
		String gong_cheng_zao_jia_hui_zong_ = request.getParameter("gong_cheng_zao_jia_hui_zong_");
		String gong_cheng_zao_jia_fen_xi_ = request.getParameter("gong_cheng_zao_jia_fen_xi_");
		String fen_bao_gong_cheng_wan_gong_dan_ = request.getParameter("fen_bao_gong_cheng_wan_gong_dan_");
		String gong_cheng_jie_suan_xun_qian_dan_ = request.getParameter("gong_cheng_jie_suan_xun_qian_dan_");
		String fen_bao_gong_cheng_zao_jia_jie_suan_shu_ = request.getParameter("fen_bao_gong_cheng_zao_jia_jie_suan_shu_");
		String fen_gong_jie_suan_ping_shen_biao_ = request.getParameter("fen_gong_jie_suan_ping_shen_biao_");
		String fen_bao_gong_cheng_jie_suan_dan_ = request.getParameter("fen_bao_gong_cheng_jie_suan_dan_");
		String wu_zi_cai_gou_jie_suan_dan_ = request.getParameter("wu_zi_cai_gou_jie_suan_dan_");
		String she_bei_zu_lin_jie_suan_dan_ = request.getParameter("she_bei_zu_lin_jie_suan_dan_");
		String gong_cheng_jie_suan_ji_jia_fang_an_ = request.getParameter("gong_cheng_jie_suan_ji_jia_fang_an_");
		String gong_cheng_jie_suan_shu_ = request.getParameter("gong_cheng_jie_suan_shu_");
		String xian_chang_qian_zheng_biao_ = request.getParameter("xian_chang_qian_zheng_biao_");
		String gong_cheng_bian_geng_fei_yong_bao_shen_ = request.getParameter("gong_cheng_bian_geng_fei_yong_bao_shen_");
		String fei_yong_suo_pei_shen_qing_he_zhun_ = request.getParameter("fei_yong_suo_pei_shen_qing_he_zhun_");
		String bian_geng_suo_pei_qian_zheng_shou_zhi_ji_lu_ = request.getParameter("bian_geng_suo_pei_qian_zheng_shou_zhi_ji_lu_");
		String gong_cheng_cheng_ben_ze_ren_mu_biao_biao_ = request.getParameter("gong_cheng_cheng_ben_ze_ren_mu_biao_biao_");
		String gong_cheng_cheng_ben_ze_ren_ji_hua_biao_ = request.getParameter("gong_cheng_cheng_ben_ze_ren_ji_hua_biao_");
		String gong_cheng_yu_suan_cheng_ben_ce_suan_biao_ = request.getParameter("gong_cheng_yu_suan_cheng_ben_ce_suan_biao_");
		String gong_cheng_yu_suan_cheng_ben_diao_zheng_biao_ = request.getParameter("gong_cheng_yu_suan_cheng_ben_diao_zheng_biao_");
		String gong_cheng_cheng_ben_guo_cheng_kong_zhi_biao_ = request.getParameter("gong_cheng_cheng_ben_guo_cheng_kong_zhi_biao_");
		String wu_zi_cheng_ben_guo_cheng_kong_zhi_biao_ = request.getParameter("wu_zi_cheng_ben_guo_cheng_kong_zhi_biao_");
		String gong_cheng_cheng_ben_he_suan_biao_ = request.getParameter("gong_cheng_cheng_ben_he_suan_biao_");
		String yue_du_gong_cheng_cheng_ben_que_ren_ = request.getParameter("yue_du_gong_cheng_cheng_ben_que_ren_");
		String gong_cheng_cheng_ben_zong_he_fen_xi_ = request.getParameter("gong_cheng_cheng_ben_zong_he_fen_xi_");
		String zhu_yao_wu_zi_cheng_ben_fen_xi_ = request.getParameter("zhu_yao_wu_zi_cheng_ben_fen_xi_");
		String xiang_mu_li_run_yu_ce_biao_ = request.getParameter("xiang_mu_li_run_yu_ce_biao_");
		String nian_du_zi_jin_shou_zhi_ji_hua_ = request.getParameter("nian_du_zi_jin_shou_zhi_ji_hua_");
		String yue_du_zi_jin_zhi_fu_ji_hua_ = request.getParameter("yue_du_zi_jin_zhi_fu_ji_hua_");
		String gong_cheng_jin_du_kuan_bao_shen_ = request.getParameter("gong_cheng_jin_du_kuan_bao_shen_");
		String gong_cheng_kuan_zhi_fu_shen_qing_ = request.getParameter("gong_cheng_kuan_zhi_fu_shen_qing_");
		String chan_zhi_yu_zi_jin_hui_shou_tong_ji_ = request.getParameter("chan_zhi_yu_zi_jin_hui_shou_tong_ji_");
		String gong_cheng_xing_xiang_jin_du_que_ren_dan_ = request.getParameter("gong_cheng_xing_xiang_jin_du_que_ren_dan_");
		String fen_gong_shang_fu_kuan_zhi_fu_biao_ = request.getParameter("fen_gong_shang_fu_kuan_zhi_fu_biao_");
		String fen_gong_shang_chan_zhi_yu_zhi_fu_tong_ji_ = request.getParameter("fen_gong_shang_chan_zhi_yu_zhi_fu_tong_ji_");
		String fen_bao_dai_kou_fa_kuan_ji_lu_ = request.getParameter("fen_bao_dai_kou_fa_kuan_ji_lu_");
		String yuan_gong_kao_he_yu_ping_jia_biao_ = request.getParameter("yuan_gong_kao_he_yu_ping_jia_biao_");
		String yuan_gong_jiang_li_fen_pei_biao_ = request.getParameter("yuan_gong_jiang_li_fen_pei_biao_");
		String xiang_mu_jie_ti_ce_hua_shu_ = request.getParameter("xiang_mu_jie_ti_ce_hua_shu_");
		String xiang_mu_yan_qi_jie_ti_shen_qing_biao_ = request.getParameter("xiang_mu_yan_qi_jie_ti_shen_qing_biao_");
		String xiang_mu_jie_ti_gong_zuo_wan_cheng_qing_kuang_hui_qian_ = request.getParameter("xiang_mu_jie_ti_gong_zuo_wan_cheng_qing_kuang_hui_qian_");
		String xiang_mu_yi_jiao_shen_qing_biao_ = request.getParameter("xiang_mu_yi_jiao_shen_qing_biao_");
		String xiang_mu_yi_jiao_hui_qian_biao_ = request.getParameter("xiang_mu_yi_jiao_hui_qian_biao_");
		String gong_cheng_ji_shu_zi_liao_ = request.getParameter("gong_cheng_ji_shu_zi_liao_");
		String guan_li_zi_liao_yi_jiao_ = request.getParameter("guan_li_zi_liao_yi_jiao_");
		String xiang_mu_wan_gong_zong_jie_bao_gao_ = request.getParameter("xiang_mu_wan_gong_zong_jie_bao_gao_");
		String gong_cheng_hui_fang_ji_hua_biao_ = request.getParameter("gong_cheng_hui_fang_ji_hua_biao_");
		String gong_cheng_hui_fang_ji_lu_biao_ = request.getParameter("gong_cheng_hui_fang_ji_lu_biao_");
		String yong_hu_man_yi_diao_cha_biao_ = request.getParameter("yong_hu_man_yi_diao_cha_biao_");
		String gu_ke_tou_su_ji_lu_ = request.getParameter("gu_ke_tou_su_ji_lu_");
		String gong_cheng_wei_xiu_ji_lu_ = request.getParameter("gong_cheng_wei_xiu_ji_lu_");
		String gong_cheng_bao_xiu_qi_man_tong_zhi_ = request.getParameter("gong_cheng_bao_xiu_qi_man_tong_zhi_");

		List<String> at = new ArrayList<String>();
		{
			at.add(xiang_mu_bu_zu_zhi_ji_gou_);
			at.add(gang_wei_yu_ren_yuan_pei_zhi_);
			at.add(ren_wu_zong_lan_yu_bu_shu_);
			at.add(zhi_ze_yu_zhi_quan_fen_pei_);
			at.add(xiang_mu_shi_shi_ce_hua_shu_);
			at.add(bu_men_ji_hua_);
			at.add(gong_zuo_qia_shang_);
			at.add(zheng_gai_tong_zhi_);
			at.add(wei_yue_tong_zhi_);
			at.add(xing_zheng_wen_jian_);
			at.add(bian_han_mo_ban_);
			at.add(na_bu_bao_gao_);
			at.add(hui_yi_ji_yao_);
			at.add(fa_wen_deng_ji_);
			at.add(shou_wen_yue_ban_);
			at.add(lai_wen_qian_shou_);
			at.add(yue_du_chu_qin_);
			at.add(qing_jia_shen_qing_);
			at.add(chu_qin_tong_ji_);
			at.add(shi_yong_shen_qing_);
			at.add(shi_yong_deng_ji_);
			at.add(xu_qiu_ji_hua_);
			at.add(ku_cun_tai_zhang_);
			at.add(ling_yong_deng_ji_);
			at.add(jie_yue_deng_ji_);
			at.add(tu_shu_tai_zhang_);
			at.add(gou_you_jia_you_);
			at.add(wei_xiu_bao_yang_);
			at.add(zi_chan_tai_zhang_);
			at.add(zhao_biao_wen_jian_);
			at.add(yi_biao_shen_pi_);
			at.add(zhao_biao_gong_gao_);
			at.add(zi_ge_shen_cha_);
			at.add(kao_cha_ping_jia_ru_xu_);
			at.add(wen_jian_ling_qu_);
			at.add(tou_biao_bao_jia_);
			at.add(kai_ping_ding_biao_);
			at.add(jia_ge_shen_ding_);
			at.add(zhong_biao_tong_zhi_);
			at.add(he_tong_qian_ding_);
			at.add(he_tong_jiao_di_);
			at.add(he_tong_bian_geng_);
			at.add(he_tong_tai_zhang_);
			at.add(gong_fang_ming_ce_);
			at.add(tu_zhi_deng_ji_);
			at.add(tu_zhi_hui_shen_);
			at.add(shi_zu_bian_zhi_);
			at.add(fang_an_bian_zhi_);
			at.add(ji_shu_jiao_di_);
			at.add(gong_cheng_bian_geng_);
			at.add(ji_shu_he_ding_);
			at.add(lao_wu_xu_qiu_ji_hua_);
			at.add(wu_zi_xu_qiu_ji_hua_);
			at.add(wu_zi_yan_shou_ji_hua_);
			at.add(ji_xie_xu_qiu_ji_hua_);
			at.add(jian_ce_pei_bei_ji_hua_);
			at.add(ban_zu_zuo_ye_zu_zhi_ka_);
			at.add(wu_liao_diao_yun_zu_zhi_ka_);
			at.add(lao_dong_li_pei_zhi_ji_hua_);
			at.add(lao_dong_li_diao_pei_ji_hua_);
			at.add(shi_ji_jin_du_yu_zong_jin_du_ji_hua_dui_bi_);
			at.add(shi_ji_wan_cheng_yu_yue_jin_du_ji_hua_dui_bi_);
			at.add(zhi_liang_tong_bing_yu_kong_shi_bie_);
			at.add(gong_cheng_zhi_liang_xun_jian_kong_zhi_);
			at.add(wei_xian_yuan_yu_kong_shi_bie_);
			at.add(an_quan_xun_jian_kong_zhi_biao_);
			at.add(an_quan_gong_shang_shi_gu_kuai_bao_);
			at.add(an_quan_wei_sui_shi_gu_deng_ji_);
			at.add(huan_jing_yin_su_yu_kong_shi_bie_);
			at.add(huan_jing_ying_xiang_guo_cheng_xun_jian_);
			at.add(jian_ce_zhuang_zhi_jian_ding_ji_hua_);
			at.add(jian_ce_zhuang_zhi_shi_yong_zhuang_tai_);
			at.add(shi_gong_ri_zhi_);
			at.add(xiang_mu_yue_bao_);
			at.add(ji_shu_wen_jian_guan_li_tai_zhang_);
			at.add(fang_an_dong_tai_guan_li_tai_zhang_);
			at.add(jian_ce_zhuang_zhi_guan_li_tai_zhang_);
			at.add(fen_bao_jin_chang_ji_hua_);
			at.add(ji_xie_jin_chang_ji_hua_);
			at.add(fen_bao_jin_chang_yan_zheng_ji_lu_);
			at.add(fen_bao_jin_chang_she_bei_qing_dan_);
			at.add(ji_xie_jin_chang_yan_shou_ji_lu_);
			at.add(ji_xie_she_bei_san_ding_deng_ji_);
			at.add(shi_gong_ji_xie_she_bei_tai_zhang_);
			at.add(fen_bao_ren_yuan_zhu_ce_);
			at.add(fen_bao_ren_yuan_zao_ce_);
			at.add(fen_bao_jin_chang_jiao_yu_);
			at.add(lao_wu_gong_ren_chu_qin_);
			at.add(lao_wu_gong_ren_bian_dong_);
			at.add(lao_wu_yong_gong_tong_ji_);
			at.add(gong_ren_gong_zi_fa_fang_ji_lu_);
			at.add(ji_xie_she_bei_wei_bao_ji_hua_);
			at.add(ji_xie_she_bei_yun_zhuan_ji_lu_);
			at.add(ji_xie_she_bei_jian_cha_ji_lu_);
			at.add(ji_xie_she_bei_bao_yang_ji_lu_);
			at.add(ji_xie_she_bei_wei_xiu_ji_lu_);
			at.add(ji_xie_she_bei_shi_gu_bao_gao_);
			at.add(fen_bao_ri_chang_guan_li_ji_lu_);
			at.add(fen_bao_shi_yong_ji_lu_);
			at.add(fen_gong_fang_ping_jia_hui_zong_);
			at.add(wu_zi_cai_gou_ji_hua_);
			at.add(ling_xing_cai_gou_xun_jia_);
			at.add(wu_zi_diao_bo_ping_zheng_);
			at.add(wu_zi_jin_chang_chou_hua_);
			at.add(wu_zi_jin_chang_tong_zhi_);
			at.add(wu_zi_jin_chang_yan_shou_);
			at.add(zhi_liang_zheng_ming_deng_ji_);
			at.add(shou_huo_dan_);
			at.add(ru_ku_dan_);
			at.add(tui_huan_huo_dan_);
			at.add(ling_tui_yong_dan_);
			at.add(chu_tui_ku_dan_);
			at.add(wu_zi_zhu_cun_bao_guan_ji_lu_);
			at.add(gong_ju_yong_ju_jie_yong_ji_lu_);
			at.add(wu_zi_chu_ru_cun_hao_pan_dian_);
			at.add(wu_zi_fu_shi_tong_zhi_dan_);
			at.add(wu_zi_gou_jian_bao_yan_dan_);
			at.add(yang_pin_yang_ben_song_shen_biao_);
			at.add(bu_he_ge_pin_chu_zhi_ji_lu_);
			at.add(wu_zi_jin_chang_bao_yan_tai_zhang_);
			at.add(fei_jiu_wu_zi_chu_zhi_shen_qing_);
			at.add(fei_jiu_wu_zi_chu_zhi_tai_zhang_);
			at.add(wu_zi_bao_guan_ming_xi_zhang_biao_);
			at.add(wu_zi_cai_gou_tong_ji_bao_biao_);
			at.add(wu_zi_hao_yong_tong_ji_bao_biao_);
			at.add(wu_zi_ling_yong_tong_ji_bao_biao_);
			at.add(wu_zi_sun_hao_tong_ji_bao_biao_);
			at.add(shi_yan_jian_ce_ji_hua_);
			at.add(qu_yang_song_jian_tong_zhi_);
			at.add(shi_yan_shi_jian_deng_ji_);
			at.add(wen_du_shi_du_ji_lu_);
			at.add(shi_yan_wei_tuo_shu_);
			at.add(shi_yan_jian_ce_bao_gao_);
			at.add(gong_cheng_zi_liao_);
			at.add(zi_liao_chu_li_liu_cheng_);
			at.add(gong_cheng_zi_liao_jian_cha_);
			at.add(gong_cheng_liang_ji_suan_shu_);
			at.add(gong_cheng_liang_tong_ji_biao_);
			at.add(jing_ji_yu_ji_shu_zhi_biao_);
			at.add(gong_cheng_zao_jia_yu_suan_shu_);
			at.add(gong_cheng_zao_jia_hui_zong_);
			at.add(gong_cheng_zao_jia_fen_xi_);
			at.add(fen_bao_gong_cheng_wan_gong_dan_);
			at.add(gong_cheng_jie_suan_xun_qian_dan_);
			at.add(fen_bao_gong_cheng_zao_jia_jie_suan_shu_);
			at.add(fen_gong_jie_suan_ping_shen_biao_);
			at.add(fen_bao_gong_cheng_jie_suan_dan_);
			at.add(wu_zi_cai_gou_jie_suan_dan_);
			at.add(she_bei_zu_lin_jie_suan_dan_);
			at.add(gong_cheng_jie_suan_ji_jia_fang_an_);
			at.add(gong_cheng_jie_suan_shu_);
			at.add(xian_chang_qian_zheng_biao_);
			at.add(gong_cheng_bian_geng_fei_yong_bao_shen_);
			at.add(fei_yong_suo_pei_shen_qing_he_zhun_);
			at.add(bian_geng_suo_pei_qian_zheng_shou_zhi_ji_lu_);
			at.add(gong_cheng_cheng_ben_ze_ren_mu_biao_biao_);
			at.add(gong_cheng_cheng_ben_ze_ren_ji_hua_biao_);
			at.add(gong_cheng_yu_suan_cheng_ben_ce_suan_biao_);
			at.add(gong_cheng_yu_suan_cheng_ben_diao_zheng_biao_);
			at.add(gong_cheng_cheng_ben_guo_cheng_kong_zhi_biao_);
			at.add(wu_zi_cheng_ben_guo_cheng_kong_zhi_biao_);
			at.add(gong_cheng_cheng_ben_he_suan_biao_);
			at.add(yue_du_gong_cheng_cheng_ben_que_ren_);
			at.add(gong_cheng_cheng_ben_zong_he_fen_xi_);
			at.add(zhu_yao_wu_zi_cheng_ben_fen_xi_);
			at.add(xiang_mu_li_run_yu_ce_biao_);
			at.add(nian_du_zi_jin_shou_zhi_ji_hua_);
			at.add(yue_du_zi_jin_zhi_fu_ji_hua_);
			at.add(gong_cheng_jin_du_kuan_bao_shen_);
			at.add(gong_cheng_kuan_zhi_fu_shen_qing_);
			at.add(chan_zhi_yu_zi_jin_hui_shou_tong_ji_);
			at.add(gong_cheng_xing_xiang_jin_du_que_ren_dan_);
			at.add(fen_gong_shang_fu_kuan_zhi_fu_biao_);
			at.add(fen_gong_shang_chan_zhi_yu_zhi_fu_tong_ji_);
			at.add(fen_bao_dai_kou_fa_kuan_ji_lu_);
			at.add(yuan_gong_kao_he_yu_ping_jia_biao_);
			at.add(yuan_gong_jiang_li_fen_pei_biao_);
			at.add(xiang_mu_jie_ti_ce_hua_shu_);
			at.add(xiang_mu_yan_qi_jie_ti_shen_qing_biao_);
			at.add(xiang_mu_jie_ti_gong_zuo_wan_cheng_qing_kuang_hui_qian_);
			at.add(xiang_mu_yi_jiao_shen_qing_biao_);
			at.add(xiang_mu_yi_jiao_hui_qian_biao_);
			at.add(gong_cheng_ji_shu_zi_liao_);
			at.add(guan_li_zi_liao_yi_jiao_);
			at.add(xiang_mu_wan_gong_zong_jie_bao_gao_);
			at.add(gong_cheng_hui_fang_ji_hua_biao_);
			at.add(gong_cheng_hui_fang_ji_lu_biao_);
			at.add(yong_hu_man_yi_diao_cha_biao_);
			at.add(gu_ke_tou_su_ji_lu_);
			at.add(gong_cheng_wei_xiu_ji_lu_);
			at.add(gong_cheng_bao_xiu_qi_man_tong_zhi_);
		}
		String mask="";
		for(String i:at){
			mask+=changeResult(i);
		}
		System.out.println(mask);
		WtableAuthority tt=new WtableAuthority();	
		tt.setName(name);
		tt.setMtmask(mask);
		WtableAuthorityMapper mapper = sqlSession.getMapper(WtableAuthorityMapper.class);
		mapper.insert(tt);

		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write("success");
		return;
	}

	
	public String menuItem(String title){
		return "{"
				+"				title : '"+title+"',"
				+"				id : '',"
				+"				submenu : [],"
				+"				excelType : '',"
				+"				template_tab : [],"
				+"				parent_id : 'false',"
				+"				li_id : '205',"
				+"				li_type : 'fixed',"
				+"			}";
	}

	@RequestMapping("list_authority_model")
	public void func2(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		WtableAuthorityMapper mapper = sqlSession.getMapper(WtableAuthorityMapper.class);
		WtableAuthorityExample ee=new WtableAuthorityExample();
		List<WtableAuthority> lee=mapper.selectByExample(ee);
		String ss="[";
		for(WtableAuthority i:lee){
			ss+="{id:"+i.getId()+",name:"+i.getName()+"},";
		}
		ss+="]";
		System.out.println(ss);
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ss);
		return;
	}
	@RequestMapping("get_menujs")
	public void func3(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		MaskHandle tt=new MaskHandle();
		String ss="golbal.allmenu = [";
		
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"		id : 'o_p',"
					+"		title : '组织与策划',"
					+"		submenu : [{"
					+"				title : '项目部组织机构',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '1',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '岗位与人员配置',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '2',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '任务总览与部署',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '3',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '职责与职权分配',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '4',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '项目实施策划书',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '5',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程计划表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '6',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '管理台账',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '7',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '项目注册',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '8',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '招标文件封面',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '9',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '招标文件正文',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '10',"
					+"				li_type : 'fixed',"
					+"			}"
					+"		]"
					+"	}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"		id : 'a_o',"
					+"		title : '行政与办公',"
					+"		submenu : [{"
					+"				title : '部门计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '11',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工作洽商',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '12',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '整改通知',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '13',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '违约通知',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '14',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '行政文件',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '15',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '便函模板',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '16',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '内部报告',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '17',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '会议纪要',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '18',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '发文登记',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '19',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '收文阅办',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '20',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '发文签收',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '21',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '月度出勤',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '22',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '请假申请',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '23',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '出勤统计',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '24',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '使用申请',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '25',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '使用登记',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '26',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '需求计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '27',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '库存台账',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '28',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '领用登记',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '29',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '借阅登记',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '30',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '图书台帐',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '31',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '购油加油',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '32',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '维修保养',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '33',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '资产台账',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '34',"
					+"				li_type : 'fixed',"
					+"			}"
					+"		]"
					+"	}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"		id : 'b_p',"
					+"		title : '招标与采购',"
					+"		submenu : [{"
					+"				title : '招标文件',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '35',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '议标审批',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '36',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '招标公告',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '37',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '资格审查',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '38',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '考察评价（如需）',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '39',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '文件领取',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '40',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '投标报价',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '41',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '开评定标',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '42',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '价格审定',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '43',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '中标通知',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '44',"
					+"				li_type : 'fixed',"
					+"			}"
					+"		]"
					+"	}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"		id : 'c_b',"
					+"		title : '合作与商务',"
					+"		submenu : [{"
					+"				title : '合同签订',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '45',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '合同交底',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '46',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '合同变更',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '47',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '合同台帐',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '48',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '供方名册',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '49',"
					+"				li_type : 'fixed',"
					+"			}"
					+"		]"
					+"	}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"		id : 'p_t',"
					+"		title : '生产与技术图纸登记',"
					+"		submenu : [{"
					+"				title : '图纸会审',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '50',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '施组编制',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '51',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '方案编制',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '52',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '技术交底',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '53',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程变更',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '54',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '技术核定',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '55',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '劳务需求计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '56',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资需求计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '57',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资验收计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '58',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '机械需求计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '59',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '监测配备计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '60',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '班组作业组织卡',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '60',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物料吊运组织卡',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '62',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '劳动力配置计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '63',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '劳动力调配计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '64',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '实际进度与总进度计划对比',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '65',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '实际完成与月进度计划对比',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '66',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '质量通病预控识别',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '67',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程质量巡检控制',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '68',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '危险源预控识别',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '69',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '安全巡检控制表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '70',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '安全工伤事故快报',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '71',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '安全未遂事故登记',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '72',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '环境因素预控识别',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '73',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '环境影响过程巡检',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '74',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '监测装置检定计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '75',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '监测装置使用状态',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '76',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '施工日志',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '77',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '项目月报',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '78',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '技术文件管理台账',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '79',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '方案动态管理台账',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '80',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '监测装置管理台帐',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '81',"
					+"				li_type : 'fixed',"
					+"			}"
					+"		]"
					+"	}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"		id : 's_m',"
					+"		title : '分包与机械',"
					+"		submenu : [{"
					+"				title : '分包进场计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '82',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '机械进场计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '83',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '证件证照验证',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '84',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '分包进场设备清单',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '85',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '机械进场验收记录',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '86',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '机械设备三定登记',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '87',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '施工机械设备台帐',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '88',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '分包人员注册',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '89',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '分包人员造册',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '90',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '分包进场教育',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '91',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '劳务工人出勤',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '92',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '劳务工人变动',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '93',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '劳务用工统计',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '94',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工人工资发放记录',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '95',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '机械设备维保计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '96',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '机械设备运转记录',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '97',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '机械设备检查记录',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '98',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '机械设备保养记录',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '99',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '机械设备维修记录',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '100',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '机械设备事故报告',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '101',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '分包日常管理记录',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '102',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '分包试用记录',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '103',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '分(供)方评价汇总',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '104',"
					+"				li_type : 'fixed',"
					+"			}"
					+"		]"
					+"	}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"		id : 'm_e',"
					+"		title : '材料与设备',"
					+"		submenu : [{"
					+"				title : '物资使用计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '105',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '零星采购询价',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '106',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资调拨凭证',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '107',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资进场筹划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '108',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资进场通知',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '109',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资进场验收',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '110',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '质量证明登记',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '111',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '收货单',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '112',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '入库单',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '113',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '退（换）货单',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '114',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '领/退用单',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '115',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '出/退库单',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '116',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资贮存保管记录',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '117',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工具用具借用记录',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '118',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资出入存耗盘点',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '119',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资仓库清点表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '120',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资复试通知单',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '121',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资\\构件报验单',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '122',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '样品\\样本送审表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '123',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '不合格品处置记录',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '124',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资进场报验台帐',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '125',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '废旧物资处置申请',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '126',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '废旧物资处置台账',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '127',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资保管明细帐表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '128',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资采购统计报表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '129',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资耗用统计报表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '130',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资领用统计报表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '131',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资损耗统计报表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '132',"
					+"				li_type : 'fixed',"
					+"			}"
					+"		]"
					+"	}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"		id : 'e_m',"
					+"		title : '试验与资料',"
					+"		submenu : [{"
					+"				title : '试验检测计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '133',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '取样送检通知',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '134',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '试验试件登记',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '135',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '温度湿度记录',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '136',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '试验委托书',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '137',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '试验检测报告',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '138',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程资料',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '139',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '资料处理流程',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '140',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程资料检查',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '141',"
					+"				li_type : 'fixed',"
					+"			}"
					+"		]"
					+"	}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"		id : 'b_c',"
					+"		title : '预算与结算',"
					+"		submenu : [{"
					+"				title : '工程量计算书',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '142',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程量统计表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '143',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '经济与技术指标',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '144',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程造价预算书',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '145',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程造价汇总',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '146',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程造价分析',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '147',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '分包工程完工单',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '148',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程结算巡签单',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '149',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '分包工程造价结算书',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '150',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '分供结算评审表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '151',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '分包工程结算单',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '152',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '物资采购结算单',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '153',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '设备租赁结算单',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '154',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程结算计价方案',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '155',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程结算书',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '156',"
					+"				li_type : 'fixed',"
					+"			}"
					+"		]"
					+"	}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"		id : 'v_c',"
					+"		title : '签证与索赔',"
					+"		submenu : [{"
					+"				title : '现场签证表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '157',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程变更费用报审',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '158',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '费用索赔申请核准',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '159',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '变更索赔签证收支记录',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '160',"
					+"				li_type : 'fixed',"
					+"			}"
					+"		]"
					+"	}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"		id : 'c_p',"
					+"		title : '成本与利润',"
					+"		submenu : [{"
					+"				id : '',"
					+"				title : '成本责任',"
					+"				submenu : [{"
					+"						title : '工程成本责任表',"
					+"						id : '',"
					+"						submenu : [],"
					+"						excelType : '151',"
					+"						parent_id : 'false',"
					+"						li_id : '161',"
					+"						li_type : 'fixed',"
					+"						template_tab : [{"
					+"								name : '目标责任表',"
					+"								tableType : '151_002',"
					+"								template : 'JZ/JZ-01-151/sheet002.htm'"
					+"							}"
					+"						]"
					+"					}"
					+"				]"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				id : '',"
					+"				title : '成本测算',"
					+"				submenu : [{"
					+"						title : '工程成本测算表',"
					+"						id : '',"
					+"						submenu : [],"
					+"						excelType : '152',"
					+"						parent_id : 'false',"
					+"						li_id : '162',"
					+"						li_type : 'fixed',"
					+"						template_tab : [{"
					+"								name : '工程项目 ',"
					+"								tableType : '152_002',"
					+"								template : 'JZ/JZ-02-152/sheet002.htm'"
					+"							}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"								name : '单项工程',"
					+"								tableType : '152_003',"
					+"								template : 'JZ/JZ-02-152/sheet003.htm'"
					+"							}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"								name : '1-1分包工程测算表',"
					+"								tableType : '152_004',"
					+"								template : 'JZ/JZ-02-152/sheet004.htm'"
					+"							}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"								name : '1-2材料设备测算表',"
					+"								tableType : '152_005',"
					+"								template : 'JZ/JZ-02-152/sheet005.htm'"
					+"							}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"								name : '1-3机械与材料租赁测算表',"
					+"								tableType : '152_006',"
					+"								template : 'JZ/JZ-02-152/sheet006.htm'"
					+"							}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"								name : '1-4管理费及其它测算表',"
					+"								tableType : '152_007',"
					+"								template : 'JZ/JZ-02-152/sheet007.htm'"
					+"							}"
					+"						]"
					+"					}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"						title : '工程成本调整表',"
					+"						id : '',"
					+"						submenu : [],"
					+"						excelType : '153',"
					+"						parent_id : 'false',"
					+"						li_id : '163',"
					+"						li_type : 'fixed',"
					+"						template_tab : [{"
					+"								name : '工程成本调整表',"
					+"								tableType : '153_002',"
					+"								template : 'JZ/JZ-03-153/sheet002.htm'"
					+"							}"
					+"						]"
					+"					}"
					+"				]"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				id : '',"
					+"				title : '成本计划',"
					+"				submenu : [{"
					+"						title : '工程成本计划表',"
					+"						id : '152_003',"
					+"						submenu : [],"
					+"						excelType : '154',"
					+"						parent_id : 'false',"
					+"						li_id : '164',"
					+"						li_type : 'fixed',"
					+"						template_tab : [{"
					+"								name : '工程项目 ',"
					+"								tableType : '154_002',"
					+"								template : 'JZ/JZ-04-154/sheet002.htm'"
					+"							}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"								name : '单项工程 ',"
					+"								tableType : '154_003',"
					+"								template : 'JZ/JZ-04-154/sheet003.htm'"
					+"							}"
					+"						],"
					+""
					+"					}"
					+"				]"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				id : '',"
					+"				title : '成本控制',"
					+"				submenu : [{"
					+"						title : '工程成本控制表',"
					+"						id : '',"
					+"						submenu : [],"
					+"						excelType : '155',"
					+"						template_tab : [{"
					+"								name : '工程项目 ',"
					+"								tableType : '155_002',"
					+"								template : 'JZ/JZ-05-155/sheet002.htm'"
					+"							}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"								name : '单项工程 ',"
					+"								tableType : '155_003',"
					+"								template : 'JZ/JZ-05-155/sheet003.htm'"
					+"							}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"								name : '租赁及摊销计算表',"
					+"								tableType : '155_004',"
					+"								template : 'JZ/JZ-05-155/sheet004.htm'"
					+"							}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"								name : '管理费及其它计算表',"
					+"								tableType : '155_005',"
					+"								template : 'JZ/JZ-05-155/sheet005.htm'"
					+"							}"
					+"						],"
					+"						parent_id : 'false',"
					+"						li_id : '165',"
					+"						li_type : 'fixed',"
					+"					}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"						title : '物资成本控制表',"
					+"						id : '',"
					+"						submenu : [],"
					+"						excelType : '156',"
					+"						template_tab : [{"
					+"								name : '过程控制表 ',"
					+"								tableType : '156_002',"
					+"								template : 'JZ/JZ-06-156/sheet002.htm'"
					+"							}"
					+"						],"
					+"						parent_id : 'false',"
					+"						li_id : '166',"
					+"						li_type : 'fixed',"
					+"					}"
					+"				]"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				id : '',"
					+"				title : '成本核算',"
					+"				submenu : [{"
					+"						title : '工程成本核算表',"
					+"						id : '',"
					+"						submenu : [],"
					+"						excelType : '157',"
					+"						template_tab : [{"
					+"								name : '工程项目 ',"
					+"								tableType : '157_002',"
					+"								template : 'JZ/JZ-07-157/sheet002.htm'"
					+"							}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"								name : '单项工程 ',"
					+"								tableType : '157_003',"
					+"								template : 'JZ/JZ-07-157/sheet003.htm'"
					+"							}"
					+"						],"
					+"						parent_id : 'false',"
					+"						li_id : '167',"
					+"						li_type : 'fixed',"
					+"					}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"						title : '月度工程成本确认',"
					+"						id : '',"
					+"						submenu : [],"
					+"						excelType : '158',"
					+"						template_tab : [{"
					+"								name : '工程成本确认单 ',"
					+"								tableType : '158_002',"
					+"								template : 'JZ/JZ-08-158/sheet002.htm'"
					+"							}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"								name : '附件1—物资成本确认单',"
					+"								tableType : '158_003',"
					+"								template : 'JZ/JZ-08-158/sheet003.htm'"
					+"							}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"								name : '附件2—租赁成本确认单',"
					+"								tableType : '158_004',"
					+"								template : 'JZ/JZ-08-158/sheet004.htm'"
					+"							}"
					+"						],"
					+"						parent_id : 'false',"
					+"						li_id : '168',"
					+"						li_type : 'fixed',"
					+"					}"
					+"				]"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				id : '',"
					+"				title : '成本分析',"
					+"				submenu : [{"
					+"						title : '工程成本综合分析',"
					+"						id : '',"
					+"						submenu : [],"
					+"						excelType : '159',"
					+"						template_tab : [{"
					+"								name : '综合统计',"
					+"								tableType : '159_002',"
					+"								template : 'JZ/JZ-09-159/sheet002.htm'"
					+"							}],"
					+"						parent_id : 'false',"
					+"						li_id : '169',"
					+"						li_type : 'fixed',"
					+"					}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"						title : '工程成本综合分析',"
					+"						id : '',"
					+"						submenu : [],"
					+"						excelType : '160',"
					+"						template_tab : [{"
					+"								name : '工程项目',"
					+"								tableType : '160_002',"
					+"								template : 'JZ/JZ-10-160/sheet002.htm'"
					+"							}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"								name : '单项工程',"
					+"								tableType : '160_003',"
					+"								template : 'JZ/JZ-10-160/sheet003.htm'"
					+"							}"
					+"						],"
					+"						parent_id : 'false',"
					+"						li_id : '169-2',"
					+"						li_type : 'fixed',"
					+"					}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"						title : '主要物资成本分析',"
					+"						id : '',"
					+"						submenu : [],"
					+"						excelType : '161',"
					+"						template_tab : [{"
					+"								name : '汇总统计',"
					+"								tableType : '161_002',"
					+"								template : 'JZ/JZ-11-161/sheet002.htm'"
					+"							}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"								name : '月度统计',"
					+"								tableType : '161_003',"
					+"								template : 'JZ/JZ-11-161/sheet003.htm'"
					+"							}"
					+"						],"
					+"						parent_id : 'false',"
					+"						li_id : '170',"
					+"						li_type : 'fixed',"
					+"					}"
					+"				]"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				id : '',"
					+"				title : '利润预测',"
					+"				submenu : [{"
					+"						title : '项目利润预测表',"
					+"						id : '',"
					+"						submenu : [],"
					+"						excelType : '162',"
					+"						template_tab : [{"
					+"								name : '成本利润分析表',"
					+"								tableType : '162_002',"
					+"								template : 'JZ/JZ-12-162/sheet002.htm'"
					+"							}"
					+"						],"
					+"						parent_id : 'false',"
					+"						li_id : '171',"
					+"						li_type : 'fixed',"
					+"					}"
					+"				]"
					+"			}"
					+""
					+"		]"
					+"	}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"		id : 'o_m',"
					+"		title : '产值与资金',"
					+"		submenu : [{"
					+"				title : '年度资金收支计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '181',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '月度资金支付计划',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '182',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程进度款报审',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '183',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程款支付申请',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '184',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '产值与资金回收统计',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '185',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程形象进度确认单',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '186',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '分供商付款支付表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '187',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '分供商产值与支付统计',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '188',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '分包代扣\\罚款记录',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '189',"
					+"				li_type : 'fixed',"
					+"			}"
					+"		]"
					+"	}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"		id : 'e_e',"
					+"		title : '考核与激励',"
					+"		submenu : [{"
					+"				title : '员工考核与评价表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '190',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '员工奖励分配表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '191',"
					+"				li_type : 'fixed',"
					+"			}"
					+"		]"
					+"	}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"		id : 'c_m',"
					+"		title : '竣工与维保',"
					+"		submenu : [{"
					+"				title : '项目解体策划书',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '192',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '项目延期解体申请表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '193',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '项目解体工作完成情况会签',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '194',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '项目移交申请表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '195',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '项目移交汇签表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '196',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程技术资料',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '197',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '管理资料移交',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '198',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '项目完工总结报告',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '199',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程回访计划表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '200',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程回访记录表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '201',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '用户满意调查表',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '202',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '顾客投诉记录',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '203',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("01",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程维修记录',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '204',"
					+"				li_type : 'fixed',"
					+"			}, ";
		}
		if(tt.isExist("1",tt.toStringMask(1))){
			ss=ss
					+"{"
					+"				title : '工程保修期满通知',"
					+"				id : '',"
					+"				submenu : [],"
					+"				excelType : '',"
					+"				template_tab : [],"
					+"				parent_id : 'false',"
					+"				li_id : '205',"
					+"				li_type : 'fixed',"
					+"			}"
					+"		]"
					+"	}";
					
		}

		ss=ss+"]";
		
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ss);

		return;
	}
}
