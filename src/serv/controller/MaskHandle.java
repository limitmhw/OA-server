package serv.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaskHandle {
	Map<String, String> qq;
	MaskHandle(){
		tableOrder=new String[][]{{"xiang_mu_bu_zu_zhi_ji_gou_","项目部组织机构","0"},{"gang_wei_yu_ren_yuan_pei_zhi_","岗位与人员配置","1"},{"ren_wu_zong_lan_yu_bu_shu_","任务总览与部署","2"},{"zhi_ze_yu_zhi_quan_fen_pei_","职责与职权分配","3"},{"xiang_mu_shi_shi_ce_hua_shu_","项目实施策划书","4"},{"bu_men_ji_hua_","部门计划","5"},{"gong_zuo_qia_shang_","工作洽商","6"},{"zheng_gai_tong_zhi_","整改通知","7"},{"wei_yue_tong_zhi_","违约通知","8"},{"xing_zheng_wen_jian_","行政文件","9"},{"bian_han_mo_ban_","便函模板","10"},{"na_bu_bao_gao_","内部报告","11"},{"hui_yi_ji_yao_","会议纪要","12"},{"fa_wen_deng_ji_","发文登记","13"},{"shou_wen_yue_ban_","收文阅办","14"},{"fa_wen_qian_shou_","发文签收","15"},{"yue_du_chu_qin_","月度出勤","16"},{"qing_jia_shen_qing_","请假申请","17"},{"chu_qin_tong_ji_","出勤统计","18"},{"shi_yong_shen_qing_","使用申请","19"},{"shi_yong_deng_ji_","使用登记","20"},{"xu_qiu_ji_hua_","需求计划","21"},{"ku_cun_tai_zhang_","库存台账","22"},{"ling_yong_deng_ji_","领用登记","23"},{"jie_yue_deng_ji_","借阅登记","24"},{"tu_shu_tai_zhang_","图书台帐","25"},{"gou_you_jia_you_","购油加油","26"},{"wei_xiu_bao_yang_","维修保养","27"},{"zi_chan_tai_zhang_","资产台账","28"},{"zhao_biao_wen_jian_","招标文件","29"},{"yi_biao_shen_pi_","议标审批","30"},{"zhao_biao_gong_gao_","招标公告","31"},{"zi_ge_shen_cha_","资格审查","32"},{"kao_cha_ping_jia_ru_xu_","考察评价如需","33"},{"wen_jian_ling_qu_","文件领取","34"},{"tou_biao_bao_jia_","投标报价","35"},{"kai_ping_ding_biao_","开评定标","36"},{"jia_ge_shen_ding_","价格审定","37"},{"zhong_biao_tong_zhi_","中标通知","38"},{"he_tong_qian_ding_","合同签订","39"},{"he_tong_jiao_di_","合同交底","40"},{"he_tong_bian_geng_","合同变更","41"},{"he_tong_tai_zhang_","合同台帐","42"},{"gong_fang_ming_ce_","供方名册","43"},{"tu_zhi_deng_ji_","图纸登记","44"},{"tu_zhi_hui_shen_","图纸会审","45"},{"shi_zu_bian_zhi_","施组编制","46"},{"fang_an_bian_zhi_","方案编制","47"},{"ji_shu_jiao_di_","技术交底","48"},{"gong_cheng_bian_geng_","工程变更","49"},{"ji_shu_he_ding_","技术核定","50"},{"lao_wu_xu_qiu_ji_hua_","劳务需求计划","51"},{"wu_zi_xu_qiu_ji_hua_","物资需求计划","52"},{"wu_zi_yan_shou_ji_hua_","物资验收计划","53"},{"ji_xie_xu_qiu_ji_hua_","机械需求计划","54"},{"jian_ce_pei_bei_ji_hua_","监测配备计划","55"},{"ban_zu_zuo_ye_zu_zhi_ka_","班组作业组织卡","56"},{"wu_liao_diao_yun_zu_zhi_ka_","物料吊运组织卡","57"},{"lao_dong_li_pei_zhi_ji_hua_","劳动力配置计划","58"},{"lao_dong_li_diao_pei_ji_hua_","劳动力调配计划","59"},{"shi_ji_jin_du_yu_zong_jin_du_ji_hua_dui_bi_","实际进度与总进度计划对比","60"},{"shi_ji_wan_cheng_yu_yue_jin_du_ji_hua_dui_bi_","实际完成与月进度计划对比","61"},{"zhi_liang_tong_bing_yu_kong_shi_bie_","质量通病预控识别","62"},{"gong_cheng_zhi_liang_xun_jian_kong_zhi_","工程质量巡检控制","63"},{"wei_xian_yuan_yu_kong_shi_bie_","危险源预控识别","64"},{"an_quan_xun_jian_kong_zhi_biao_","安全巡检控制表","65"},{"an_quan_gong_shang_shi_gu_kuai_bao_","安全工伤事故快报","66"},{"an_quan_wei_sui_shi_gu_deng_ji_","安全未遂事故登记","67"},{"huan_jing_yin_su_yu_kong_shi_bie_","环境因素预控识别","68"},{"huan_jing_ying_xiang_guo_cheng_xun_jian_","环境影响过程巡检","69"},{"jian_ce_zhuang_zhi_jian_ding_ji_hua_","监测装置检定计划","70"},{"jian_ce_zhuang_zhi_shi_yong_zhuang_tai_","监测装置使用状态","71"},{"shi_gong_ri_zhi_","施工日志","72"},{"xiang_mu_yue_bao_","项目月报","73"},{"ji_shu_wen_jian_guan_li_tai_zhang_","技术文件管理台账","74"},{"fang_an_dong_tai_guan_li_tai_zhang_","方案动态管理台账","75"},{"jian_ce_zhuang_zhi_guan_li_tai_zhang_","监测装置管理台帐","76"},{"fen_bao_jin_chang_ji_hua_","分包进场计划","77"},{"ji_xie_jin_chang_ji_hua_","机械进场计划","78"},{"zheng_jian_zheng_zhao_yan_zheng_","证件证照验证","79"},{"fen_bao_jin_chang_she_bei_qing_dan_","分包进场设备清单","80"},{"ji_xie_jin_chang_yan_shou_ji_lu_","机械进场验收记录","81"},{"ji_xie_she_bei_san_ding_deng_ji_","机械设备三定登记","82"},{"shi_gong_ji_xie_she_bei_tai_zhang_","施工机械设备台帐","83"},{"fen_bao_ren_yuan_zhu_ce_","分包人员注册","84"},{"fen_bao_ren_yuan_zao_ce_","分包人员造册","85"},{"fen_bao_jin_chang_jiao_yu_","分包进场教育","86"},{"lao_wu_gong_ren_chu_qin_","劳务工人出勤","87"},{"lao_wu_gong_ren_bian_dong_","劳务工人变动","88"},{"lao_wu_yong_gong_tong_ji_","劳务用工统计","89"},{"gong_ren_gong_zi_fa_fang_ji_lu_","工人工资发放记录","90"},{"ji_xie_she_bei_wei_bao_ji_hua_","机械设备维保计划","91"},{"ji_xie_she_bei_yun_zhuan_ji_lu_","机械设备运转记录","92"},{"ji_xie_she_bei_jian_cha_ji_lu_","机械设备检查记录","93"},{"ji_xie_she_bei_bao_yang_ji_lu_","机械设备保养记录","94"},{"ji_xie_she_bei_wei_xiu_ji_lu_","机械设备维修记录","95"},{"ji_xie_she_bei_shi_gu_bao_gao_","机械设备事故报告","96"},{"fen_bao_ri_chang_guan_li_ji_lu_","分包日常管理记录","97"},{"fen_bao_shi_yong_ji_lu_","分包试用记录","98"},{"fen_gong_fang_ping_jia_hui_zong_","分供方评价汇总","99"},{"wu_zi_shi_yong_ji_hua_","物资使用计划","100"},{"ling_xing_cai_gou_xun_jia_","零星采购询价","101"},{"wu_zi_diao_bo_ping_zheng_","物资调拨凭证","102"},{"wu_zi_jin_chang_chou_hua_","物资进场筹划","103"},{"wu_zi_jin_chang_tong_zhi_","物资进场通知","104"},{"wu_zi_jin_chang_yan_shou_","物资进场验收","105"},{"zhi_liang_zheng_ming_deng_ji_","质量证明登记","106"},{"shou_huo_dan_","收货单","107"},{"ru_ku_dan_","入库单","108"},{"tui_huan_huo_dan_","退换货单","109"},{"ling_tui_yong_dan_","领/退用单","110"},{"chu_tui_ku_dan_","出/退库单","111"},{"wu_zi_zhu_cun_bao_guan_ji_lu_","物资贮存保管记录","112"},{"gong_ju_yong_ju_jie_yong_ji_lu_","工具用具借用记录","113"},{"wu_zi_chu_ru_cun_hao_pan_dian_","物资出入存耗盘点","114"},{"wu_zi_cang_ku_qing_dian_biao_","物资仓库清点表","115"},{"wu_zi_fu_shi_tong_zhi_dan_","物资复试通知单","116"},{"wu_zi_gou_jian_bao_yan_dan_","物资构件报验单","117"},{"yang_pin_yang_ben_song_shen_biao_","样品样本送审表","118"},{"bu_he_ge_pin_chu_zhi_ji_lu_","不合格品处置记录","119"},{"wu_zi_jin_chang_bao_yan_tai_zhang_","物资进场报验台帐","120"},{"fei_jiu_wu_zi_chu_zhi_shen_qing_","废旧物资处置申请","121"},{"fei_jiu_wu_zi_chu_zhi_tai_zhang_","废旧物资处置台账","122"},{"wu_zi_bao_guan_ming_xi_zhang_biao_","物资保管明细帐表","123"},{"wu_zi_cai_gou_tong_ji_bao_biao_","物资采购统计报表","124"},{"wu_zi_hao_yong_tong_ji_bao_biao_","物资耗用统计报表","125"},{"wu_zi_ling_yong_tong_ji_bao_biao_","物资领用统计报表","126"},{"wu_zi_sun_hao_tong_ji_bao_biao_","物资损耗统计报表","127"},{"shi_yan_jian_ce_ji_hua_","试验检测计划","128"},{"qu_yang_song_jian_tong_zhi_","取样送检通知","129"},{"shi_yan_shi_jian_deng_ji_","试验试件登记","130"},{"wen_du_shi_du_ji_lu_","温度湿度记录","131"},{"shi_yan_wei_tuo_shu_","试验委托书","132"},{"shi_yan_jian_ce_bao_gao_","试验检测报告","133"},{"gong_cheng_zi_liao_","工程资料","134"},{"zi_liao_chu_li_liu_cheng_","资料处理流程","135"},{"gong_cheng_zi_liao_jian_cha_","工程资料检查","136"},{"gong_cheng_liang_ji_suan_shu_","工程量计算书","137"},{"gong_cheng_liang_tong_ji_biao_","工程量统计表","138"},{"jing_ji_yu_ji_shu_zhi_biao_","经济与技术指标","139"},{"gong_cheng_zao_jia_yu_suan_shu_","工程造价预算书","140"},{"gong_cheng_zao_jia_hui_zong_","工程造价汇总","141"},{"gong_cheng_zao_jia_fen_xi_","工程造价分析","142"},{"fen_bao_gong_cheng_wan_gong_dan_","分包工程完工单","143"},{"gong_cheng_jie_suan_xun_qian_dan_","工程结算巡签单","144"},{"fen_bao_gong_cheng_zao_jia_jie_suan_shu_","分包工程造价结算书","145"},{"fen_gong_jie_suan_ping_shen_biao_","分供结算评审表","146"},{"fen_bao_gong_cheng_jie_suan_dan_","分包工程结算单","147"},{"wu_zi_cai_gou_jie_suan_dan_","物资采购结算单","148"},{"she_bei_zu_lin_jie_suan_dan_","设备租赁结算单","149"},{"gong_cheng_jie_suan_ji_jia_fang_an_","工程结算计价方案","150"},{"gong_cheng_cheng_ben_ze_ren_biao_","工程成本责任表","151"},{"gong_cheng_cheng_ben_ce_suan_biao_","工程成本测算表","152"},{"gong_cheng_cheng_ben_diao_zheng_biao_","工程成本调整表","153"},{"gong_cheng_cheng_ben_ji_hua_biao_","工程成本计划表","154"},{"gong_cheng_cheng_ben_kong_zhi_biao_","工程成本控制表","155"},{"wu_zi_cheng_ben_kong_zhi_biao_","物资成本控制表","156"},{"gong_cheng_cheng_ben_he_suan_biao_","工程成本核算表","157"},{"yue_du_gong_cheng_cheng_ben_que_ren_","月度工程成本确认","158"},{"gong_cheng_cheng_ben_zong_he_fen_xi_yi_","工程成本综合分析(1)","159"},{"gong_cheng_cheng_ben_zong_he_fen_xi_er_","工程成本综合分析(2)","160"},{"zhu_yao_wu_zi_cheng_ben_fen_xi_","主要物资成本分析","161"},{"xiang_mu_li_run_yu_ce_biao_","项目利润预测表","162"},{"gong_cheng_jie_suan_shu_","工程结算书","163"},{"xian_chang_qian_zheng_biao_","现场签证表","164"},{"gong_cheng_bian_geng_fei_yong_bao_shen_","工程变更费用报审","165"},{"fei_yong_suo_pei_shen_qing_he_zhun_","费用索赔申请核准","166"},{"bian_geng_suo_pei_qian_zheng_shou_zhi_ji_lu_","变更索赔签证收支记录","167"},{"nian_du_zi_jin_shou_zhi_ji_hua_","年度资金收支计划","168"},{"yue_du_zi_jin_zhi_fu_ji_hua_","月度资金支付计划","169"},{"gong_cheng_jin_du_kuan_bao_shen_","工程进度款报审","170"},{"gong_cheng_kuan_zhi_fu_shen_qing_","工程款支付申请","171"},{"chan_zhi_yu_zi_jin_hui_shou_tong_ji_","产值与资金回收统计","172"},{"gong_cheng_xing_xiang_jin_du_que_ren_dan_","工程形象进度确认单","173"},{"fen_gong_shang_fu_kuan_zhi_fu_biao_","分供商付款支付表","174"},{"fen_gong_shang_chan_zhi_yu_zhi_fu_tong_ji_","分供商产值与支付统计","175"},{"fen_bao_dai_kou_fa_kuan_ji_lu_","分包代扣罚款记录","176"},{"yuan_gong_kao_he_yu_ping_jia_biao_","员工考核与评价表","177"},{"yuan_gong_jiang_li_fen_pei_biao_","员工奖励分配表","178"},{"xiang_mu_jie_ti_ce_hua_shu_","项目解体策划书","179"},{"xiang_mu_yan_qi_jie_ti_shen_qing_biao_","项目延期解体申请表","180"},{"xiang_mu_jie_ti_gong_zuo_wan_cheng_qing_kuang_hui_qian_","项目解体工作完成情况会签","181"},{"xiang_mu_yi_jiao_shen_qing_biao_","项目移交申请表","182"},{"xiang_mu_yi_jiao_hui_qian_biao_","项目移交汇签表","183"},{"gong_cheng_ji_shu_zi_liao_","工程技术资料","184"},{"guan_li_zi_liao_yi_jiao_","管理资料移交","185"},{"xiang_mu_wan_gong_zong_jie_bao_gao_","项目完工总结报告","186"},{"gong_cheng_hui_fang_ji_hua_biao_","工程回访计划表","187"},{"gong_cheng_hui_fang_ji_lu_biao_","工程回访记录表","188"},{"yong_hu_man_yi_diao_cha_biao_","用户满意调查表","189"},{"gu_ke_tou_su_ji_lu_","顾客投诉记录","190"},{"gong_cheng_wei_xiu_ji_lu_","工程维修记录","191"},{"gong_cheng_bao_xiu_qi_man_tong_zhi_","工程保修期满通知","192"}};
		tableInfo=new HashMap<String,String[][]>();  
		tableInfo.put("4",new String[][]{
				{"4_001","封面","AZ/AZ-05-005/001.htm"},
				{"4_002","目录","AZ/AZ-05-005/002.htm"},
				{"4_003","编制说明","AZ/AZ-05-005/003.htm"},
				{"4_004","1.1工程概况","AZ/AZ-05-005/004.htm"},
				{"4_005","1.2承包范围 ","AZ/AZ-05-005/005.htm"},
				{"4_006","2.1管理目标","AZ/AZ-05-005/006.htm"},
				{"4_007","2.2节点计划","AZ/AZ-05-005/007.htm"},
				{"4_008","3.1组织架构","AZ/AZ-05-005/008.htm"},
				{"4_009","3.2人员配置","AZ/AZ-05-005/009.htm"},
				{"4_010","3.3授权书","AZ/AZ-05-005/010.htm"},
				{"4_011","4.1技术方案选择","AZ/AZ-05-005/011.htm"},
				{"4_012","5.1分包选择方案","AZ/AZ-05-005/012.htm"},
				{"4_013","5.2物资采购方案","AZ/AZ-05-005/013.htm"},
				{"4_014","5.3机械配置方案","AZ/AZ-05-005/014.htm"},
				{"4_015","5.4资源采购条件","AZ/AZ-05-005/015.htm"},
				{"4_016","6.1现场临建方案","AZ/AZ-05-005/016.htm"},
				{"4_017","6.2临水临电方案","AZ/AZ-05-005/017.htm"},
				{"4_018","6.3监测设备配置方案","AZ/AZ-05-005/018.htm"},
				{"4_019","6.4办公设备配置","AZ/AZ-05-005/019.htm"},
				{"4_020","7.1总成本控制","AZ/AZ-05-005/020.htm"},
				{"4_021","7.1-1管理费预算","AZ/AZ-05-005/021.htm"},
				{"4_022","8.1现金流量预算","AZ/AZ-05-005/022.htm"},
				{"4_023","8.1-1预算流入","AZ/AZ-05-005/023.htm"},
				{"4_024","8.1-2.预算流出","AZ/AZ-05-005/024.htm"},
				{"4_025","9.1文件编制计划","AZ/AZ-05-005/025.htm"}
		});

		tableInfo.put("151",new String[][]{
				{"151_002","目标责任表","JZ/JZ-01-151/sheet002.htm"}
		});
		tableInfo.put("152",new String[][]{
				{"152_002","工程项目","JZ/JZ-02-152/sheet002.htm"},
				{"152_003","单项工程","JZ/JZ-02-152/sheet003.htm"},
				{"152_004","1-1分包工程测算表","JZ/JZ-02-152/sheet004.htm"},
				{"152_005","1-2材料设备测算表","JZ/JZ-02-152/sheet005.htm"},
				{"152_006","1-3机械与材料租赁测算表","JZ/JZ-02-152/sheet006.htm"},
				{"152_007","1-4管理费及其它测算表","JZ/JZ-02-152/sheet007.htm"}
		});
		tableInfo.put("153",new String[][]{
				{"153_002","工程成本调整表","JZ/JZ-03-153/sheet002.htm"}
		});
		tableInfo.put("154",new String[][]{
				{"154_002","工程项目","JZ/JZ-04-154/sheet002.htm"},
				{"154_003","单项工程","JZ/JZ-04-154/sheet003.htm"}
		});
		tableInfo.put("155",new String[][]{
				{"155_002","工程项目","JZ/JZ-05-155/sheet002.htm"},
				{"155_003","单项工程","JZ/JZ-05-155/sheet003.htm"},
				{"155_004","租赁及摊销计算表","JZ/JZ-05-155/sheet004.htm"},
				{"155_005","管理费及其它计算表","JZ/JZ-05-155/sheet005.htm"}
		});

		tableInfo.put("156",new String[][]{
				{"156_002","过程控制表","JZ/JZ-06-156/sheet002.htm"}
		});
		tableInfo.put("157",new String[][]{
				{"157_002","工程项目","JZ/JZ-07-157/sheet002.htm"},
				{"157_003","单项工程","JZ/JZ-07-157/sheet003.htm"}
		});
		tableInfo.put("158",new String[][]{
				{"158_002","工程成本确认单","JZ/JZ-08-158/sheet002.htm"},
				{"158_003","附件1—物资成本确认单","JZ/JZ-08-158/sheet003.htm"},
				{"158_004","附件2—租赁成本确认单","JZ/JZ-08-158/sheet004.htm"}
		});
		tableInfo.put("159",new String[][]{
				{"159_002","综合统计","JZ/JZ-09-159/sheet002.htm"}
		});
		tableInfo.put("160",new String[][]{
				{"160_002","工程项目","JZ/JZ-10-160/sheet002.htm"},
				{"160_003","单项工程","JZ/JZ-10-160/sheet003.htm"}
		});
		tableInfo.put("161",new String[][]{
				{"161_002","汇总统计","JZ/JZ-11-161/sheet002.htm"},
				{"161_003","月度统计","JZ/JZ-11-161/sheet003.htm"}
		});
		tableInfo.put("162",new String[][]{
				{"162_002","成本利润分析表","JZ/JZ-12-162/sheet002.htm"}
		});

	}
	private String [][]tableOrder;
	private Map<String,String[][]> tableInfo;
	public boolean isExist(String mask,String authority){
		if(authority.length()>mask.length())return false;
		for(int i = 0; i < authority.length(); i++) {  
			if(authority.charAt(i)=='1'){
				if(mask.charAt(i)!='1'){
					return false;
				}
			}
		}  
		return true;
	}
	public String toStringMask(int v){
		String ret="";
		for(int i=0;i<v;i++){
			ret+="0";
		}
		ret+="1";
		return ret;
	}
	public List< String > getValueFromMap(Map<String,String> mm){
		List< String > at = new ArrayList< String >();
		for(int i=0;i<tableOrder.length;i++){
			at.add(mm.get(tableOrder[i][0]));
		}
		return at;
	}
	public List<String> getExcelSubTableType(String excelType){
		List<String> subTable = new ArrayList<String>();
		String [][] vv=tableInfo.get(excelType);
		if(vv!=null){
			for(int i=0;i<vv.length;i++){
				subTable.add(vv[i][0]);
			}
		}
		return subTable;
	}
	public  String  getJsonFromMask(String ss){

		if(ss.length()!=tableOrder.length){
			System.out.println("Error Mask");
			System.out.println(tableOrder.length);
			System.out.println(ss.length());
			return "{}";
		}
		String ret="{";
		int vz=ss.length()-1;
		for(int i = 0; i < vz; i++) { 
			ret+="\""+tableOrder[i][0]+"\":\""+ss.charAt(i)+"\",";
		} 
		ret+="\""+tableOrder[vz][0]+"\":\""+ss.charAt(vz)+"\"}";
		return ret;
	}

	public String templateTabItem(String name,String type,String path){
		return "{"+
				"name : \""+name+"\","+
				"tableType : \""+type+"\","+
				"template : '"+path+"'"+
				"},";
	}
	public String getTemplateTab(String excelType){

		if(excelType==null){
			System.out.println("Error");
			return "[]";
		}

		String [][] vv=tableInfo.get(excelType);
		System.out.println(excelType);
		System.out.println(vv);
		String ret="[";
		if(vv!=null){
			for(int i=0;i<vv.length;i++){
				ret+=templateTabItem(vv[i][1],vv[i][0],vv[i][2]);
			}
		}
		ret+="]";
		return ret;

	}

	public String menuItem(String title,String excelType,String li_id){
		return "{"
				+"				title : '"+title+"',"
				+"				id : '',"
				+"				icon : 'sub2',"
				+"				submenu : [],"
				+"				excelType : '"+excelType+"',"
				+"				template_tab : "+getTemplateTab(excelType)+","
				+"				parent_id : 'false',"
				+"				li_id : '"+li_id+"',"
				+"				li_type : 'fixed',"
				+"			}";
	}
	public  String  getMenuJsonFromMask(String cmask){
		int vk=cmask.length()>tableOrder.length?tableOrder.length:cmask.length();
		String ss="[";
		for(int i = 0; i < vk; i++) { 
			if(isExist(cmask,toStringMask(i))){	ss=ss	+menuItem(tableOrder[i][1],tableOrder[i][2], String.valueOf(i))+",";	}
		}
		ss+="]";
		return ss;
	}

}
