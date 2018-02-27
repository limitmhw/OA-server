package serv.controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	Map<String, String> qq;
	AuthorityServ()throws IOException{
		String res = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(res);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession();
		qq = new HashMap<String, String>();

		qq.put("项目部组织机构","004");
		qq.put("岗位与人员配置","005");
		qq.put("任务总览与部署","006");
		qq.put("职责与职权分配","007");
		qq.put("项目实施策划书","010");
		qq.put("部门计划","006");
		qq.put("工作洽商","010");
		qq.put("整改通知","011");
		qq.put("违约通知","012");
		qq.put("行政文件","013");
		qq.put("便函模板","014");
		qq.put("内部报告","015");
		qq.put("会议纪要","016");
		qq.put("发文登记","017");
		qq.put("收文阅办","018");
		qq.put("发文签收","019");
		qq.put("月度出勤","007");
		qq.put("请假申请","008");
		qq.put("出勤统计","009");
		qq.put("使用申请","020");
		qq.put("使用登记","021");
		qq.put("需求计划","022");
		qq.put("库存台账","023");
		qq.put("领用登记","024");
		qq.put("借阅登记","025");
		qq.put("图书台帐","026");
		qq.put("购油加油","027");
		qq.put("维修保养","028");
		qq.put("资产台账","029");
		qq.put("招标文件","030");
		qq.put("议标审批","031");
		qq.put("招标公告","032");
		qq.put("资格审查","033");
		qq.put("考察评价（如需）","034");
		qq.put("文件领取","035");
		qq.put("投标报价","036");
		qq.put("开评定标","037");
		qq.put("价格审定","038");
		qq.put("中标通知","039");
		qq.put("合同签订","040");
		qq.put("合同交底","041");
		qq.put("合同变更","042");
		qq.put("合同台帐","043");
		qq.put("供方名册","044");
		qq.put("图纸登记","045");
		qq.put("图纸会审","046");
		qq.put("施组编制","047");
		qq.put("方案编制","048");
		qq.put("技术交底","049");
		qq.put("工程变更","050");
		qq.put("技术核定","051");
		qq.put("劳务需求计划","052");
		qq.put("物资需求计划","055");
		qq.put("物资验收计划","056");
		qq.put("机械需求计划","057");
		qq.put("监测配备计划","058");
		qq.put("班组作业组织卡","059");
		qq.put("物料吊运组织卡","060");
		qq.put("劳动力配置计划","053");
		qq.put("劳动力调配计划","054");
		qq.put("实际进度与总进度计划对比","061");
		qq.put("实际完成与月进度计划对比","062");
		qq.put("质量通病预控识别","063");
		qq.put("工程质量巡检控制","064");
		qq.put("危险源预控识别","065");
		qq.put("安全巡检控制表","066");
		qq.put("安全工伤事故快报","067");
		qq.put("安全未遂事故登记","068");
		qq.put("环境因素预控识别","069");
		qq.put("环境影响过程巡检","070");
		qq.put("监测装置检定计划","071");
		qq.put("监测装置使用状态","072");
		qq.put("施工日志","073");
		qq.put("项目月报","074");
		qq.put("技术文件管理台账","075");
		qq.put("方案动态管理台账","076");
		qq.put("监测装置管理台帐","077");
		qq.put("分包进场计划","078");
		qq.put("机械进场计划","079");
		qq.put("证件证照验证","080");
		qq.put("分包进场设备清单","081");
		qq.put("机械进场验收记录","082");
		qq.put("机械设备三定登记","083");
		qq.put("施工机械设备台帐","084");
		qq.put("分包人员注册","085");
		qq.put("分包人员造册","086");
		qq.put("分包进场教育","088");
		qq.put("劳务工人出勤","089");
		qq.put("劳务工人变动","090");
		qq.put("劳务用工统计","087");
		qq.put("工人工资发放记录","091");
		qq.put("机械设备维保计划","092");
		qq.put("机械设备运转记录","093");
		qq.put("机械设备检查记录","094");
		qq.put("机械设备保养记录","095");
		qq.put("机械设备维修记录","096");
		qq.put("机械设备事故报告","097");
		qq.put("分包日常管理记录","098");
		qq.put("分包试用记录","099");
		qq.put("分(供)方评价汇总","100");
		qq.put("物资使用计划","101");
		qq.put("零星采购询价","102");
		qq.put("物资调拨凭证","103");
		qq.put("物资进场筹划","104");
		qq.put("物资进场通知","105");
		qq.put("物资进场验收","106");
		qq.put("质量证明登记","107");
		qq.put("收货单","108");
		qq.put("入库单","109");
		qq.put("退（换）货单","110");
		qq.put("领/退用单","116");
		qq.put("出/退库单","117");
		qq.put("物资贮存保管记录","118");
		qq.put("工具用具借用记录","119");
		qq.put("物资出入存耗盘点","122");
		qq.put("物资复试通知单","111");
		qq.put("物资\\构件报验单","112");
		qq.put("样品\\样本送审表","113");
		qq.put("不合格品处置记录","114");
		qq.put("物资进场报验台帐","115");
		qq.put("废旧物资处置申请","120");
		qq.put("废旧物资处置台账","121");
		qq.put("物资保管明细帐表","123");
		qq.put("物资采购统计报表","124");
		qq.put("物资耗用统计报表","125");
		qq.put("物资领用统计报表","126");
		qq.put("物资损耗统计报表","127");
		qq.put("试验检测计划","128");
		qq.put("取样送检通知","129");
		qq.put("试验试件登记","130");
		qq.put("温度湿度记录","131");
		qq.put("试验委托书","132");
		qq.put("试验检测报告","133");
		qq.put("资料处理流程","134");
		qq.put("工程资料检查","135");
		qq.put("工程量统计表","136");
		qq.put("经济与技术指标","137");
		qq.put("工程造价汇总","138");
		qq.put("工程造价分析","139");
		qq.put("分包工程完工单","140");
		qq.put("工程结算巡签单","141");
		qq.put("分供结算评审表","142");
		qq.put("分包工程结算单","143");
		qq.put("物资采购结算单","144");
		qq.put("设备租赁结算单","145");
		qq.put("工程结算计价方案","146");
		qq.put("现场签证表","147");
		qq.put("工程变更费用报审","148");
		qq.put("费用索赔申请核准","149");
		qq.put("变更索赔签证收支记录","150");
		qq.put("工程成本责任表","151");
		qq.put("工程成本测算表","152");
		qq.put("工程成本调整表","153");
		qq.put("工程成本计划表","154");
		qq.put("工程成本控制表","155");
		qq.put("物资成本控制表","156");
		qq.put("工程成本核算表","157");
		qq.put("月度工程成本确认","158");
		qq.put("工程成本综合分析0","159");
		qq.put("工程成本综合分析1","160");
		qq.put("主要物资成本分析","161");
		qq.put("项目利润预测表","162");
		qq.put("年度资金收支计划","162");
		qq.put("月度资金支付计划","163");
		qq.put("工程进度款报审","164");
		qq.put("工程款支付申请","165");
		qq.put("产值与资金回收统计","166");
		qq.put("工程形象进度确认单","167");
		qq.put("分供商付款支付表","168");
		qq.put("分供商产值与支付统计","169");
		qq.put("分包代扣\\罚款记录","170");
		qq.put("员工考核与评价表","171");
		qq.put("员工奖励分配表","172");
		qq.put("项目解体策划书","173");
		qq.put("项目延期解体申请表","174");
		qq.put("项目解体工作完成情况会签","175");
		qq.put("项目移交申请表","176");
		qq.put("项目移交汇签表","177");
		qq.put("项目完工总结报告","178");
		qq.put("工程回访计划表","179");
		qq.put("工程回访记录表","180");
		qq.put("用户满意调查表","180");
		qq.put("顾客投诉记录","181");
		qq.put("工程维修记录","182");
		qq.put("工程保修期满通知","183");


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
		String fa_wen_qian_shou_ = request.getParameter("fa_wen_qian_shou_");
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
		String zheng_jian_zheng_zhao_yan_zheng_ = request.getParameter("zheng_jian_zheng_zhao_yan_zheng_");
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
		String wu_zi_shi_yong_ji_hua_ = request.getParameter("wu_zi_shi_yong_ji_hua_");
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
		String zi_liao_chu_li_liu_cheng_ = request.getParameter("zi_liao_chu_li_liu_cheng_");
		String gong_cheng_zi_liao_jian_cha_ = request.getParameter("gong_cheng_zi_liao_jian_cha_");
		String gong_cheng_liang_tong_ji_biao_ = request.getParameter("gong_cheng_liang_tong_ji_biao_");
		String jing_ji_yu_ji_shu_zhi_biao_ = request.getParameter("jing_ji_yu_ji_shu_zhi_biao_");
		String gong_cheng_zao_jia_hui_zong_ = request.getParameter("gong_cheng_zao_jia_hui_zong_");
		String gong_cheng_zao_jia_fen_xi_ = request.getParameter("gong_cheng_zao_jia_fen_xi_");
		String fen_bao_gong_cheng_wan_gong_dan_ = request.getParameter("fen_bao_gong_cheng_wan_gong_dan_");
		String gong_cheng_jie_suan_xun_qian_dan_ = request.getParameter("gong_cheng_jie_suan_xun_qian_dan_");
		String fen_gong_jie_suan_ping_shen_biao_ = request.getParameter("fen_gong_jie_suan_ping_shen_biao_");
		String fen_bao_gong_cheng_jie_suan_dan_ = request.getParameter("fen_bao_gong_cheng_jie_suan_dan_");
		String wu_zi_cai_gou_jie_suan_dan_ = request.getParameter("wu_zi_cai_gou_jie_suan_dan_");
		String she_bei_zu_lin_jie_suan_dan_ = request.getParameter("she_bei_zu_lin_jie_suan_dan_");
		String gong_cheng_jie_suan_ji_jia_fang_an_ = request.getParameter("gong_cheng_jie_suan_ji_jia_fang_an_");
		String xian_chang_qian_zheng_biao_ = request.getParameter("xian_chang_qian_zheng_biao_");
		String gong_cheng_bian_geng_fei_yong_bao_shen_ = request.getParameter("gong_cheng_bian_geng_fei_yong_bao_shen_");
		String fei_yong_suo_pei_shen_qing_he_zhun_ = request.getParameter("fei_yong_suo_pei_shen_qing_he_zhun_");
		String bian_geng_suo_pei_qian_zheng_shou_zhi_ji_lu_ = request.getParameter("bian_geng_suo_pei_qian_zheng_shou_zhi_ji_lu_");
		String gong_cheng_cheng_ben_ze_ren_biao_ = request.getParameter("gong_cheng_cheng_ben_ze_ren_biao_");
		String gong_cheng_cheng_ben_ce_suan_biao_ = request.getParameter("gong_cheng_cheng_ben_ce_suan_biao_");
		String gong_cheng_cheng_ben_diao_zheng_biao_ = request.getParameter("gong_cheng_cheng_ben_diao_zheng_biao_");
		String gong_cheng_cheng_ben_ji_hua_biao_ = request.getParameter("gong_cheng_cheng_ben_ji_hua_biao_");
		String gong_cheng_cheng_ben_kong_zhi_biao_ = request.getParameter("gong_cheng_cheng_ben_kong_zhi_biao_");
		String wu_zi_cheng_ben_kong_zhi_biao_ = request.getParameter("wu_zi_cheng_ben_kong_zhi_biao_");
		String gong_cheng_cheng_ben_he_suan_biao_ = request.getParameter("gong_cheng_cheng_ben_he_suan_biao_");
		String yue_du_gong_cheng_cheng_ben_que_ren_ = request.getParameter("yue_du_gong_cheng_cheng_ben_que_ren_");
		String gong_cheng_cheng_ben_zong_he_fen_xi_0 = request.getParameter("gong_cheng_cheng_ben_zong_he_fen_xi_0");
		String gong_cheng_cheng_ben_zong_he_fen_xi_1 = request.getParameter("gong_cheng_cheng_ben_zong_he_fen_xi_1");
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
		String xiang_mu_wan_gong_zong_jie_bao_gao_ = request.getParameter("xiang_mu_wan_gong_zong_jie_bao_gao_");
		String gong_cheng_hui_fang_ji_hua_biao_ = request.getParameter("gong_cheng_hui_fang_ji_hua_biao_");
		String gong_cheng_hui_fang_ji_lu_biao_ = request.getParameter("gong_cheng_hui_fang_ji_lu_biao_");
		String yong_hu_man_yi_diao_cha_biao_ = request.getParameter("yong_hu_man_yi_diao_cha_biao_");
		String gu_ke_tou_su_ji_lu_ = request.getParameter("gu_ke_tou_su_ji_lu_");
		String gong_cheng_wei_xiu_ji_lu_ = request.getParameter("gong_cheng_wei_xiu_ji_lu_");
		String gong_cheng_bao_xiu_qi_man_tong_zhi_ = request.getParameter("gong_cheng_bao_xiu_qi_man_tong_zhi_");
		List< String > at = new ArrayList< String >();
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
		at.add(fa_wen_qian_shou_);
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
		at.add(zheng_jian_zheng_zhao_yan_zheng_);
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
		at.add(wu_zi_shi_yong_ji_hua_);
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
		at.add(zi_liao_chu_li_liu_cheng_);
		at.add(gong_cheng_zi_liao_jian_cha_);
		at.add(gong_cheng_liang_tong_ji_biao_);
		at.add(jing_ji_yu_ji_shu_zhi_biao_);
		at.add(gong_cheng_zao_jia_hui_zong_);
		at.add(gong_cheng_zao_jia_fen_xi_);
		at.add(fen_bao_gong_cheng_wan_gong_dan_);
		at.add(gong_cheng_jie_suan_xun_qian_dan_);
		at.add(fen_gong_jie_suan_ping_shen_biao_);
		at.add(fen_bao_gong_cheng_jie_suan_dan_);
		at.add(wu_zi_cai_gou_jie_suan_dan_);
		at.add(she_bei_zu_lin_jie_suan_dan_);
		at.add(gong_cheng_jie_suan_ji_jia_fang_an_);
		at.add(xian_chang_qian_zheng_biao_);
		at.add(gong_cheng_bian_geng_fei_yong_bao_shen_);
		at.add(fei_yong_suo_pei_shen_qing_he_zhun_);
		at.add(bian_geng_suo_pei_qian_zheng_shou_zhi_ji_lu_);
		at.add(gong_cheng_cheng_ben_ze_ren_biao_);
		at.add(gong_cheng_cheng_ben_ce_suan_biao_);
		at.add(gong_cheng_cheng_ben_diao_zheng_biao_);
		at.add(gong_cheng_cheng_ben_ji_hua_biao_);
		at.add(gong_cheng_cheng_ben_kong_zhi_biao_);
		at.add(wu_zi_cheng_ben_kong_zhi_biao_);
		at.add(gong_cheng_cheng_ben_he_suan_biao_);
		at.add(yue_du_gong_cheng_cheng_ben_que_ren_);
		at.add(gong_cheng_cheng_ben_zong_he_fen_xi_0);
		at.add(gong_cheng_cheng_ben_zong_he_fen_xi_1);
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
		at.add(xiang_mu_wan_gong_zong_jie_bao_gao_);
		at.add(gong_cheng_hui_fang_ji_hua_biao_);
		at.add(gong_cheng_hui_fang_ji_lu_biao_);
		at.add(yong_hu_man_yi_diao_cha_biao_);
		at.add(gu_ke_tou_su_ji_lu_);
		at.add(gong_cheng_wei_xiu_ji_lu_);
		at.add(gong_cheng_bao_xiu_qi_man_tong_zhi_);

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


	public String menuItem(String title,String li_id){
		return "{"
				+"				title : '"+title+"',"
				+"				id : '',"
				+"				submenu : [],"
				+"				excelType : '"+qq.get(title)+"',"
				+"				template_tab : "+getTemplateTab(qq.get(title))+","
				+"				parent_id : 'false',"
				+"				li_id : '"+li_id+"',"
				+"				li_type : 'fixed',"
				+"			}";
	}

	public String templateTabItem(String name,String type,String path){
		return "{"+
				"name : \""+name+"\","+
				"tableType : \""+type+"\","+
				"template : '"+path+"'"+
				"}";
	}
	public String getTemplateTab(String excelType){

		if(excelType==null){
			System.out.println("Error");
			return "[]";
		}

		switch(excelType){
		case"151":{
			return "["
					+templateTabItem("目标责任表","151_002","JZ/JZ-01-151/sheet002.htm")
					+"]";
		}

		case"152":{
			return "["
					+templateTabItem("工程项目","152_002","JZ/JZ-02-152/sheet002.htm")+","
					+templateTabItem("单项工程","152_003","JZ/JZ-02-152/sheet003.htm")+","
					+templateTabItem("1-1分包工程测算表","152_004","JZ/JZ-02-152/sheet004.htm")+","
					+templateTabItem("1-2材料设备测算表","152_005","JZ/JZ-02-152/sheet005.htm")+","
					+templateTabItem("1-3机械与材料租赁测算表","152_006","JZ/JZ-02-152/sheet006.htm")+","
					+templateTabItem("1-4管理费及其它测算表","152_007","JZ/JZ-02-152/sheet007.htm")
					+"]";
		}
		case"153":{
			return "["
					+templateTabItem("工程成本调整表","153_002","JZ/JZ-03-153/sheet002.htm")
					+"]";
		}
		case"154":{
			return "["
					+templateTabItem("工程项目","154_002","JZ/JZ-04-154/sheet002.htm")+","
					+templateTabItem("单项工程","154_003","JZ/JZ-04-154/sheet003.htm")
					+"]";
		}
		case"155":{
			return "["
					+templateTabItem("工程项目","155_002","JZ/JZ-05-155/sheet002.htm")+","
					+templateTabItem("单项工程","155_003","JZ/JZ-05-155/sheet003.htm")+","
					+templateTabItem("租赁及摊销计算表","155_004","JZ/JZ-05-155/sheet004.htm")+","
					+templateTabItem("管理费及其它计算表","155_005","JZ/JZ-05-155/sheet005.htm")
					+"]";
		}
		case"156":{
			return "["
					+templateTabItem("过程控制表","156_002","JZ/JZ-06-156/sheet002.htm")
					+"]";
		}
		case"157":{
			return "["
					+templateTabItem("工程项目","157_002","JZ/JZ-07-157/sheet002.htm")+","
					+templateTabItem("单项工程","157_003","JZ/JZ-07-157/sheet003.htm")
					+"]";
		}
		case"158":{
			return "["
					+templateTabItem("工程成本确认单","158_002","JZ/JZ-08-158/sheet002.htm")+","
					+templateTabItem("附件1—物资成本确认单","158_003","JZ/JZ-08-158/sheet003.htm")+","
					+templateTabItem("附件2—租赁成本确认单","158_004","JZ/JZ-08-158/sheet004.htm")+","
					+"]";
		}
		case"159":{
			return "["
					+templateTabItem("综合统计","159_002","JZ/JZ-09-159/sheet002.htm")
					+"]";
		}
		case"160":{
			return "["
					+templateTabItem("工程项目","160_002","JZ/JZ-10-160/sheet002.htm")+","
					+templateTabItem("单项工程","160_003","JZ/JZ-10-160/sheet003.htm")+","
					+"]";
		}
		case"161":{
			return "["
					+templateTabItem("汇总统计","161_002","JZ/JZ-11-161/sheet002.htm")+","
					+templateTabItem("月度统计","161_003","JZ/JZ-11-161/sheet003.htm")+","
					+"]";
		}
		case"162":{
			return "["
					+templateTabItem("成本利润分析表","162_002","JZ/JZ-12-162/sheet002.htm")
					+"]";
		}

		default:{
			return "[]";
		}
		}

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
		String ss="[";
		String cmask="111111111111111111"
				+"111111111111111111"
				+"111111111111111111"
				+"111111111111111111"
				+"111111111111111111"
				+"111111111111111111"
				+"111111111111111111"
				+"111111111111111111"
				+"111111111111111111"
				+"111111111111111111"
				+"111111111111111111";

		if(tt.isExist(cmask,tt.toStringMask(0))){	ss=ss	+menuItem("项目部组织机构","0")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(1))){	ss=ss	+menuItem("岗位与人员配置","1")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(2))){	ss=ss	+menuItem("任务总览与部署","2")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(3))){	ss=ss	+menuItem("职责与职权分配","3")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(4))){	ss=ss	+menuItem("项目实施策划书","4")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(5))){	ss=ss	+menuItem("部门计划","5")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(6))){	ss=ss	+menuItem("工作洽商","6")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(7))){	ss=ss	+menuItem("整改通知","7")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(8))){	ss=ss	+menuItem("违约通知","8")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(9))){	ss=ss	+menuItem("行政文件","9")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(10))){	ss=ss	+menuItem("便函模板","10")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(11))){	ss=ss	+menuItem("内部报告","11")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(12))){	ss=ss	+menuItem("会议纪要","12")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(13))){	ss=ss	+menuItem("发文登记","13")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(14))){	ss=ss	+menuItem("收文阅办","14")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(15))){	ss=ss	+menuItem("发文签收","15")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(16))){	ss=ss	+menuItem("月度出勤","16")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(17))){	ss=ss	+menuItem("请假申请","17")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(18))){	ss=ss	+menuItem("出勤统计","18")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(19))){	ss=ss	+menuItem("使用申请","19")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(20))){	ss=ss	+menuItem("使用登记","20")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(21))){	ss=ss	+menuItem("需求计划","21")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(22))){	ss=ss	+menuItem("库存台账","22")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(23))){	ss=ss	+menuItem("领用登记","23")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(24))){	ss=ss	+menuItem("借阅登记","24")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(25))){	ss=ss	+menuItem("图书台帐","25")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(26))){	ss=ss	+menuItem("购油加油","26")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(27))){	ss=ss	+menuItem("维修保养","27")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(28))){	ss=ss	+menuItem("资产台账","28")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(29))){	ss=ss	+menuItem("招标文件","29")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(30))){	ss=ss	+menuItem("议标审批","30")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(31))){	ss=ss	+menuItem("招标公告","31")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(32))){	ss=ss	+menuItem("资格审查","32")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(33))){	ss=ss	+menuItem("考察评价（如需）","33")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(34))){	ss=ss	+menuItem("文件领取","34")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(35))){	ss=ss	+menuItem("投标报价","35")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(36))){	ss=ss	+menuItem("开评定标","36")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(37))){	ss=ss	+menuItem("价格审定","37")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(38))){	ss=ss	+menuItem("中标通知","38")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(39))){	ss=ss	+menuItem("合同签订","39")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(40))){	ss=ss	+menuItem("合同交底","40")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(41))){	ss=ss	+menuItem("合同变更","41")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(42))){	ss=ss	+menuItem("合同台帐","42")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(43))){	ss=ss	+menuItem("供方名册","43")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(44))){	ss=ss	+menuItem("图纸登记","44")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(45))){	ss=ss	+menuItem("图纸会审","45")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(46))){	ss=ss	+menuItem("施组编制","46")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(47))){	ss=ss	+menuItem("方案编制","47")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(48))){	ss=ss	+menuItem("技术交底","48")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(49))){	ss=ss	+menuItem("工程变更","49")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(50))){	ss=ss	+menuItem("技术核定","50")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(51))){	ss=ss	+menuItem("劳务需求计划","51")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(52))){	ss=ss	+menuItem("物资需求计划","52")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(53))){	ss=ss	+menuItem("物资验收计划","53")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(54))){	ss=ss	+menuItem("机械需求计划","54")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(55))){	ss=ss	+menuItem("监测配备计划","55")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(56))){	ss=ss	+menuItem("班组作业组织卡","56")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(57))){	ss=ss	+menuItem("物料吊运组织卡","57")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(58))){	ss=ss	+menuItem("劳动力配置计划","58")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(59))){	ss=ss	+menuItem("劳动力调配计划","59")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(60))){	ss=ss	+menuItem("实际进度与总进度计划对比","60")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(61))){	ss=ss	+menuItem("实际完成与月进度计划对比","61")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(62))){	ss=ss	+menuItem("质量通病预控识别","62")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(63))){	ss=ss	+menuItem("工程质量巡检控制","63")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(64))){	ss=ss	+menuItem("危险源预控识别","64")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(65))){	ss=ss	+menuItem("安全巡检控制表","65")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(66))){	ss=ss	+menuItem("安全工伤事故快报","66")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(67))){	ss=ss	+menuItem("安全未遂事故登记","67")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(68))){	ss=ss	+menuItem("环境因素预控识别","68")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(69))){	ss=ss	+menuItem("环境影响过程巡检","69")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(70))){	ss=ss	+menuItem("监测装置检定计划","70")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(71))){	ss=ss	+menuItem("监测装置使用状态","71")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(72))){	ss=ss	+menuItem("施工日志","72")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(73))){	ss=ss	+menuItem("项目月报","73")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(74))){	ss=ss	+menuItem("技术文件管理台账","74")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(75))){	ss=ss	+menuItem("方案动态管理台账","75")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(76))){	ss=ss	+menuItem("监测装置管理台帐","76")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(77))){	ss=ss	+menuItem("分包进场计划","77")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(78))){	ss=ss	+menuItem("机械进场计划","78")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(79))){	ss=ss	+menuItem("证件证照验证","79")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(80))){	ss=ss	+menuItem("分包进场设备清单","80")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(81))){	ss=ss	+menuItem("机械进场验收记录","81")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(82))){	ss=ss	+menuItem("机械设备三定登记","82")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(83))){	ss=ss	+menuItem("施工机械设备台帐","83")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(84))){	ss=ss	+menuItem("分包人员注册","84")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(85))){	ss=ss	+menuItem("分包人员造册","85")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(86))){	ss=ss	+menuItem("分包进场教育","86")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(87))){	ss=ss	+menuItem("劳务工人出勤","87")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(88))){	ss=ss	+menuItem("劳务工人变动","88")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(89))){	ss=ss	+menuItem("劳务用工统计","89")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(90))){	ss=ss	+menuItem("工人工资发放记录","90")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(91))){	ss=ss	+menuItem("机械设备维保计划","91")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(92))){	ss=ss	+menuItem("机械设备运转记录","92")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(93))){	ss=ss	+menuItem("机械设备检查记录","93")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(94))){	ss=ss	+menuItem("机械设备保养记录","94")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(95))){	ss=ss	+menuItem("机械设备维修记录","95")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(96))){	ss=ss	+menuItem("机械设备事故报告","96")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(97))){	ss=ss	+menuItem("分包日常管理记录","97")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(98))){	ss=ss	+menuItem("分包试用记录","98")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(99))){	ss=ss	+menuItem("分(供)方评价汇总","99")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(100))){	ss=ss	+menuItem("物资使用计划","100")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(101))){	ss=ss	+menuItem("零星采购询价","101")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(102))){	ss=ss	+menuItem("物资调拨凭证","102")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(103))){	ss=ss	+menuItem("物资进场筹划","103")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(104))){	ss=ss	+menuItem("物资进场通知","104")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(105))){	ss=ss	+menuItem("物资进场验收","105")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(106))){	ss=ss	+menuItem("质量证明登记","106")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(107))){	ss=ss	+menuItem("收货单","107")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(108))){	ss=ss	+menuItem("入库单","108")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(109))){	ss=ss	+menuItem("退（换）货单","109")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(110))){	ss=ss	+menuItem("领/退用单","110")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(111))){	ss=ss	+menuItem("出/退库单","111")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(112))){	ss=ss	+menuItem("物资贮存保管记录","112")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(113))){	ss=ss	+menuItem("工具用具借用记录","113")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(114))){	ss=ss	+menuItem("物资出入存耗盘点","114")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(115))){	ss=ss	+menuItem("物资复试通知单","115")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(116))){	ss=ss	+menuItem("物资\\构件报验单","116")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(117))){	ss=ss	+menuItem("样品\\样本送审表","117")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(118))){	ss=ss	+menuItem("不合格品处置记录","118")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(119))){	ss=ss	+menuItem("物资进场报验台帐","119")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(120))){	ss=ss	+menuItem("废旧物资处置申请","120")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(121))){	ss=ss	+menuItem("废旧物资处置台账","121")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(122))){	ss=ss	+menuItem("物资保管明细帐表","122")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(123))){	ss=ss	+menuItem("物资采购统计报表","123")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(124))){	ss=ss	+menuItem("物资耗用统计报表","124")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(125))){	ss=ss	+menuItem("物资领用统计报表","125")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(126))){	ss=ss	+menuItem("物资损耗统计报表","126")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(127))){	ss=ss	+menuItem("试验检测计划","127")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(128))){	ss=ss	+menuItem("取样送检通知","128")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(129))){	ss=ss	+menuItem("试验试件登记","129")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(130))){	ss=ss	+menuItem("温度湿度记录","130")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(131))){	ss=ss	+menuItem("试验委托书","131")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(132))){	ss=ss	+menuItem("试验检测报告","132")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(133))){	ss=ss	+menuItem("资料处理流程","133")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(134))){	ss=ss	+menuItem("工程资料检查","134")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(135))){	ss=ss	+menuItem("工程量统计表","135")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(136))){	ss=ss	+menuItem("经济与技术指标","136")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(137))){	ss=ss	+menuItem("工程造价汇总","137")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(138))){	ss=ss	+menuItem("工程造价分析","138")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(139))){	ss=ss	+menuItem("分包工程完工单","139")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(140))){	ss=ss	+menuItem("工程结算巡签单","140")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(141))){	ss=ss	+menuItem("分供结算评审表","141")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(142))){	ss=ss	+menuItem("分包工程结算单","142")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(143))){	ss=ss	+menuItem("物资采购结算单","143")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(144))){	ss=ss	+menuItem("设备租赁结算单","144")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(145))){	ss=ss	+menuItem("工程结算计价方案","145")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(146))){	ss=ss	+menuItem("现场签证表","146")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(147))){	ss=ss	+menuItem("工程变更费用报审","147")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(148))){	ss=ss	+menuItem("费用索赔申请核准","148")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(149))){	ss=ss	+menuItem("变更索赔签证收支记录","149")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(150))){	ss=ss	+menuItem("工程成本责任表","150")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(151))){	ss=ss	+menuItem("工程成本测算表","151")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(152))){	ss=ss	+menuItem("工程成本调整表","152")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(153))){	ss=ss	+menuItem("工程成本计划表","153")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(154))){	ss=ss	+menuItem("工程成本控制表","154")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(155))){	ss=ss	+menuItem("物资成本控制表","155")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(156))){	ss=ss	+menuItem("工程成本核算表","156")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(157))){	ss=ss	+menuItem("月度工程成本确认","157")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(158))){	ss=ss	+menuItem("工程成本综合分析0","158")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(159))){	ss=ss	+menuItem("工程成本综合分析1","159")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(160))){	ss=ss	+menuItem("主要物资成本分析","160")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(161))){	ss=ss	+menuItem("项目利润预测表","161")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(162))){	ss=ss	+menuItem("年度资金收支计划","162")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(163))){	ss=ss	+menuItem("月度资金支付计划","163")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(164))){	ss=ss	+menuItem("工程进度款报审","164")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(165))){	ss=ss	+menuItem("工程款支付申请","165")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(166))){	ss=ss	+menuItem("产值与资金回收统计","166")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(167))){	ss=ss	+menuItem("工程形象进度确认单","167")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(168))){	ss=ss	+menuItem("分供商付款支付表","168")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(169))){	ss=ss	+menuItem("分供商产值与支付统计","169")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(170))){	ss=ss	+menuItem("分包代扣\\罚款记录","170")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(171))){	ss=ss	+menuItem("员工考核与评价表","171")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(172))){	ss=ss	+menuItem("员工奖励分配表","172")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(173))){	ss=ss	+menuItem("项目解体策划书","173")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(174))){	ss=ss	+menuItem("项目延期解体申请表","174")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(175))){	ss=ss	+menuItem("项目解体工作完成情况会签","175")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(176))){	ss=ss	+menuItem("项目移交申请表","176")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(177))){	ss=ss	+menuItem("项目移交汇签表","177")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(178))){	ss=ss	+menuItem("项目完工总结报告","178")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(179))){	ss=ss	+menuItem("工程回访计划表","179")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(180))){	ss=ss	+menuItem("工程回访记录表","180")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(181))){	ss=ss	+menuItem("用户满意调查表","181")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(182))){	ss=ss	+menuItem("顾客投诉记录","182")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(183))){	ss=ss	+menuItem("工程维修记录","183")+",";	}
		if(tt.isExist(cmask,tt.toStringMask(184))){	ss=ss	+menuItem("工程保修期满通知","184")+",";	}		
		ss+="]";
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ss);

		return;
	}
}
