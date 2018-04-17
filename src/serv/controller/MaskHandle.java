package serv.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import serv.controller.SystemConst.c_GCXMFlag;

import com.alibaba.fastjson.serializer.BooleanArraySerializer;

import model.mapper.EauthorityMapper;
import model.po.Eauthority;
import model.po.EauthorityExample;

public class MaskHandle extends SystemConst{
	Map<String, String> qq;
	MaskHandle(){
		//mask顺序号{全拼，名称，类型}
		//这里有用的好像只有顺序号和类型
		tableOrder=new String[][]{{"xiang_mu_bu_zu_zhi_ji_gou_","项目部组织机构","0"},{"gang_wei_yu_ren_yuan_pei_zhi_","岗位与人员配置","1"},{"ren_wu_zong_lan_yu_bu_shu_","任务总览与部署","2"},{"zhi_ze_yu_zhi_quan_fen_pei_","职责与职权分配","3"},{"xiang_mu_shi_shi_ce_hua_shu_","项目实施策划书","4"},{"bu_men_ji_hua_","部门计划","5"},{"gong_zuo_qia_shang_","工作洽商","6"},{"zheng_gai_tong_zhi_","整改通知","7"},{"wei_yue_tong_zhi_","违约通知","8"},{"xing_zheng_wen_jian_","行政文件","9"},{"bian_han_mo_ban_","便函模板","10"},{"na_bu_bao_gao_","内部报告","11"},{"hui_yi_ji_yao_","会议纪要","12"},{"fa_wen_deng_ji_","发文登记","13"},{"shou_wen_yue_ban_","收文阅办","14"},{"fa_wen_qian_shou_","发文签收","15"},{"yue_du_chu_qin_","月度出勤","16"},{"qing_jia_shen_qing_","请假申请","17"},{"chu_qin_tong_ji_","出勤统计","18"},{"shi_yong_shen_qing_","使用申请","19"},{"shi_yong_deng_ji_","使用登记","20"},{"xu_qiu_ji_hua_","需求计划","21"},{"ku_cun_tai_zhang_","库存台账","22"},{"ling_yong_deng_ji_","领用登记","23"},{"jie_yue_deng_ji_","借阅登记","24"},{"tu_shu_tai_zhang_","图书台帐","25"},{"gou_you_jia_you_","购油加油","26"},{"wei_xiu_bao_yang_","维修保养","27"},{"zi_chan_tai_zhang_","资产台账","28"},{"zhao_biao_wen_jian_","招标文件","29"},{"yi_biao_shen_pi_","议标审批","30"},{"zhao_biao_gong_gao_","招标公告","31"},{"zi_ge_shen_cha_","资格审查","32"},{"kao_cha_ping_jia_ru_xu_","考察评价如需","33"},{"wen_jian_ling_qu_","文件领取","34"},{"tou_biao_bao_jia_","投标报价","35"},{"kai_ping_ding_biao_","开评定标","36"},{"jia_ge_shen_ding_","价格审定","37"},{"zhong_biao_tong_zhi_","中标通知","38"},{"he_tong_qian_ding_","合同签订","39"},{"he_tong_jiao_di_","合同交底","40"},{"he_tong_bian_geng_","合同变更","41"},{"he_tong_tai_zhang_","合同台帐","42"},{"gong_fang_ming_ce_","供方名册","43"},{"tu_zhi_deng_ji_","图纸登记","44"},{"tu_zhi_hui_shen_","图纸会审","45"},{"shi_zu_bian_zhi_","施组编制","46"},{"fang_an_bian_zhi_","方案编制","47"},{"ji_shu_jiao_di_","技术交底","48"},{"gong_cheng_bian_geng_","工程变更","49"},{"ji_shu_he_ding_","技术核定","50"},{"lao_wu_xu_qiu_ji_hua_","劳务需求计划","51"},{"wu_zi_xu_qiu_ji_hua_","物资需求计划","52"},{"wu_zi_yan_shou_ji_hua_","物资验收计划","53"},{"ji_xie_xu_qiu_ji_hua_","机械需求计划","54"},{"jian_ce_pei_bei_ji_hua_","监测配备计划","55"},{"ban_zu_zuo_ye_zu_zhi_ka_","班组作业组织卡","56"},{"wu_liao_diao_yun_zu_zhi_ka_","物料吊运组织卡","57"},{"lao_dong_li_pei_zhi_ji_hua_","劳动力配置计划","58"},{"lao_dong_li_diao_pei_ji_hua_","劳动力调配计划","59"},{"shi_ji_jin_du_yu_zong_jin_du_ji_hua_dui_bi_","实际进度与总进度计划对比","60"},{"shi_ji_wan_cheng_yu_yue_jin_du_ji_hua_dui_bi_","实际完成与月进度计划对比","61"},{"zhi_liang_tong_bing_yu_kong_shi_bie_","质量通病预控识别","62"},{"gong_cheng_zhi_liang_xun_jian_kong_zhi_","工程质量巡检控制","63"},{"wei_xian_yuan_yu_kong_shi_bie_","危险源预控识别","64"},{"an_quan_xun_jian_kong_zhi_biao_","安全巡检控制表","65"},{"an_quan_gong_shang_shi_gu_kuai_bao_","安全工伤事故快报","66"},{"an_quan_wei_sui_shi_gu_deng_ji_","安全未遂事故登记","67"},{"huan_jing_yin_su_yu_kong_shi_bie_","环境因素预控识别","68"},{"huan_jing_ying_xiang_guo_cheng_xun_jian_","环境影响过程巡检","69"},{"jian_ce_zhuang_zhi_jian_ding_ji_hua_","监测装置检定计划","70"},{"jian_ce_zhuang_zhi_shi_yong_zhuang_tai_","监测装置使用状态","71"},{"shi_gong_ri_zhi_","施工日志","72"},{"xiang_mu_yue_bao_","项目月报","73"},{"ji_shu_wen_jian_guan_li_tai_zhang_","技术文件管理台账","74"},{"fang_an_dong_tai_guan_li_tai_zhang_","方案动态管理台账","75"},{"jian_ce_zhuang_zhi_guan_li_tai_zhang_","监测装置管理台帐","76"},{"fen_bao_jin_chang_ji_hua_","分包进场计划","77"},{"ji_xie_jin_chang_ji_hua_","机械进场计划","78"},{"zheng_jian_zheng_zhao_yan_zheng_","证件证照验证","79"},{"fen_bao_jin_chang_she_bei_qing_dan_","分包进场设备清单","80"},{"ji_xie_jin_chang_yan_shou_ji_lu_","机械进场验收记录","81"},{"ji_xie_she_bei_san_ding_deng_ji_","机械设备三定登记","82"},{"shi_gong_ji_xie_she_bei_tai_zhang_","施工机械设备台帐","83"},{"fen_bao_ren_yuan_zhu_ce_","分包人员注册","84"},{"fen_bao_ren_yuan_zao_ce_","分包人员造册","85"},{"fen_bao_jin_chang_jiao_yu_","分包进场教育","86"},{"lao_wu_gong_ren_chu_qin_","劳务工人出勤","87"},{"lao_wu_gong_ren_bian_dong_","劳务工人变动","88"},{"lao_wu_yong_gong_tong_ji_","劳务用工统计","89"},{"gong_ren_gong_zi_fa_fang_ji_lu_","工人工资发放记录","90"},{"ji_xie_she_bei_wei_bao_ji_hua_","机械设备维保计划","91"},{"ji_xie_she_bei_yun_zhuan_ji_lu_","机械设备运转记录","92"},{"ji_xie_she_bei_jian_cha_ji_lu_","机械设备检查记录","93"},{"ji_xie_she_bei_bao_yang_ji_lu_","机械设备保养记录","94"},{"ji_xie_she_bei_wei_xiu_ji_lu_","机械设备维修记录","95"},{"ji_xie_she_bei_shi_gu_bao_gao_","机械设备事故报告","96"},{"fen_bao_ri_chang_guan_li_ji_lu_","分包日常管理记录","97"},{"fen_bao_shi_yong_ji_lu_","分包试用记录","98"},{"fen_gong_fang_ping_jia_hui_zong_","分供方评价汇总","99"},{"wu_zi_shi_yong_ji_hua_","物资使用计划","100"},{"ling_xing_cai_gou_xun_jia_","零星采购询价","101"},{"wu_zi_diao_bo_ping_zheng_","物资调拨凭证","102"},{"wu_zi_jin_chang_chou_hua_","物资进场筹划","103"},{"wu_zi_jin_chang_tong_zhi_","物资进场通知","104"},{"wu_zi_jin_chang_yan_shou_","物资进场验收","105"},{"zhi_liang_zheng_ming_deng_ji_","质量证明登记","106"},{"shou_huo_dan_","收货单","107"},{"ru_ku_dan_","入库单","108"},{"tui_huan_huo_dan_","退换货单","109"},{"ling_tui_yong_dan_","领/退用单","110"},{"chu_tui_ku_dan_","出/退库单","111"},{"wu_zi_zhu_cun_bao_guan_ji_lu_","物资贮存保管记录","112"},{"gong_ju_yong_ju_jie_yong_ji_lu_","工具用具借用记录","113"},{"wu_zi_chu_ru_cun_hao_pan_dian_","物资出入存耗盘点","114"},{"wu_zi_cang_ku_qing_dian_biao_","物资仓库清点表","115"},{"wu_zi_fu_shi_tong_zhi_dan_","物资复试通知单","116"},{"wu_zi_gou_jian_bao_yan_dan_","物资构件报验单","117"},{"yang_pin_yang_ben_song_shen_biao_","样品样本送审表","118"},{"bu_he_ge_pin_chu_zhi_ji_lu_","不合格品处置记录","119"},{"wu_zi_jin_chang_bao_yan_tai_zhang_","物资进场报验台帐","120"},{"fei_jiu_wu_zi_chu_zhi_shen_qing_","废旧物资处置申请","121"},{"fei_jiu_wu_zi_chu_zhi_tai_zhang_","废旧物资处置台账","122"},{"wu_zi_bao_guan_ming_xi_zhang_biao_","物资保管明细帐表","123"},{"wu_zi_cai_gou_tong_ji_bao_biao_","物资采购统计报表","124"},{"wu_zi_hao_yong_tong_ji_bao_biao_","物资耗用统计报表","125"},{"wu_zi_ling_yong_tong_ji_bao_biao_","物资领用统计报表","126"},{"wu_zi_sun_hao_tong_ji_bao_biao_","物资损耗统计报表","127"},{"shi_yan_jian_ce_ji_hua_","试验检测计划","128"},{"qu_yang_song_jian_tong_zhi_","取样送检通知","129"},{"shi_yan_shi_jian_deng_ji_","试验试件登记","130"},{"wen_du_shi_du_ji_lu_","温度湿度记录","131"},{"shi_yan_wei_tuo_shu_","试验委托书","132"},{"shi_yan_jian_ce_bao_gao_","试验检测报告","133"},{"gong_cheng_zi_liao_","工程资料","134"},{"zi_liao_chu_li_liu_cheng_","资料处理流程","135"},{"gong_cheng_zi_liao_jian_cha_","工程资料检查","136"},{"gong_cheng_liang_ji_suan_shu_","工程量计算书","137"},{"gong_cheng_liang_tong_ji_biao_","工程量统计表","138"},{"jing_ji_yu_ji_shu_zhi_biao_","经济与技术指标","139"},{"gong_cheng_zao_jia_yu_suan_shu_","工程造价预算书","140"},{"gong_cheng_zao_jia_hui_zong_","工程造价汇总","141"},{"gong_cheng_zao_jia_fen_xi_","工程造价分析","142"},{"fen_bao_gong_cheng_wan_gong_dan_","分包工程完工单","143"},{"gong_cheng_jie_suan_xun_qian_dan_","工程结算巡签单","144"},{"fen_bao_gong_cheng_zao_jia_jie_suan_shu_","分包工程造价结算书","145"},{"fen_gong_jie_suan_ping_shen_biao_","分供结算评审表","146"},{"fen_bao_gong_cheng_jie_suan_dan_","分包工程结算单","147"},{"wu_zi_cai_gou_jie_suan_dan_","物资采购结算单","148"},{"she_bei_zu_lin_jie_suan_dan_","设备租赁结算单","149"},{"gong_cheng_jie_suan_ji_jia_fang_an_","工程结算计价方案","150"},{"gong_cheng_cheng_ben_ze_ren_biao_","工程成本责任表","151"},{"gong_cheng_cheng_ben_ce_suan_biao_","工程成本测算表","152"},{"gong_cheng_cheng_ben_diao_zheng_biao_","工程成本调整表","153"},{"gong_cheng_cheng_ben_ji_hua_biao_","工程成本计划表","154"},{"gong_cheng_cheng_ben_kong_zhi_biao_","工程成本控制表","155"},{"wu_zi_cheng_ben_kong_zhi_biao_","物资成本控制表","156"},{"gong_cheng_cheng_ben_he_suan_biao_","工程成本核算表","157"},{"yue_du_gong_cheng_cheng_ben_que_ren_","月度工程成本确认","158"},{"gong_cheng_cheng_ben_ze_ren_fen_xi_","工程成本责任分析","159"},{"gong_cheng_cheng_ben_zong_he_fen_xi_","工程成本综合分析","160"},{"zhu_yao_wu_zi_cheng_ben_fen_xi_","主要物资成本分析","161"},{"xiang_mu_li_run_yu_ce_biao_","项目利润预测表","162"},{"gong_cheng_jie_suan_shu_","工程结算书","163"},{"xian_chang_qian_zheng_biao_","现场签证表","164"},{"gong_cheng_bian_geng_fei_yong_bao_shen_","工程变更费用报审","165"},{"fei_yong_suo_pei_shen_qing_he_zhun_","费用索赔申请核准","166"},{"bian_geng_suo_pei_qian_zheng_shou_zhi_ji_lu_","变更索赔签证收支记录","167"},{"nian_du_zi_jin_shou_zhi_ji_hua_","年度资金收支计划","168"},{"yue_du_zi_jin_zhi_fu_ji_hua_","月度资金支付计划","169"},{"gong_cheng_jin_du_kuan_bao_shen_","工程进度款报审","170"},{"gong_cheng_kuan_zhi_fu_shen_qing_","工程款支付申请","171"},{"chan_zhi_yu_zi_jin_hui_shou_tong_ji_","产值与资金回收统计","172"},{"gong_cheng_xing_xiang_jin_du_que_ren_dan_","工程形象进度确认单","173"},{"fen_gong_shang_fu_kuan_zhi_fu_biao_","分供商付款支付表","174"},{"fen_gong_shang_chan_zhi_yu_zhi_fu_tong_ji_","分供商产值与支付统计","175"},{"fen_bao_dai_kou_fa_kuan_ji_lu_","分包代扣罚款记录","176"},{"yuan_gong_kao_he_yu_ping_jia_biao_","员工考核与评价表","177"},{"yuan_gong_jiang_li_fen_pei_biao_","员工奖励分配表","178"},{"xiang_mu_jie_ti_ce_hua_shu_","项目解体策划书","179"},{"xiang_mu_yan_qi_jie_ti_shen_qing_biao_","项目延期解体申请表","180"},{"xiang_mu_jie_ti_gong_zuo_wan_cheng_qing_kuang_hui_qian_","项目解体工作完成情况会签","181"},{"xiang_mu_yi_jiao_shen_qing_biao_","项目移交申请表","182"},{"xiang_mu_yi_jiao_hui_qian_biao_","项目移交汇签表","183"},{"gong_cheng_ji_shu_zi_liao_","工程技术资料","184"},{"guan_li_zi_liao_yi_jiao_","管理资料移交","185"},{"xiang_mu_wan_gong_zong_jie_bao_gao_","项目完工总结报告","186"},{"gong_cheng_hui_fang_ji_hua_biao_","工程回访计划表","187"},{"gong_cheng_hui_fang_ji_lu_biao_","工程回访记录表","188"},{"yong_hu_man_yi_diao_cha_biao_","用户满意调查表","189"},{"gu_ke_tou_su_ji_lu_","顾客投诉记录","190"},{"gong_cheng_wei_xiu_ji_lu_","工程维修记录","191"},{"gong_cheng_bao_xiu_qi_man_tong_zhi_","工程保修期满通知","192"}};
		tableInfo=new HashMap<String,String[][]>();  
		tableInfo.put("4",new String[][]{
				{"4_001","封面","AZ/AZ-05-005/001.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_002","目录","AZ/AZ-05-005/002.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_003","编制说明","AZ/AZ-05-005/003.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_004","1.1工程概况","AZ/AZ-05-005/004.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_005","1.2承包范围 ","AZ/AZ-05-005/005.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_006","2.1管理目标","AZ/AZ-05-005/006.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_007","2.2节点计划","AZ/AZ-05-005/007.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_008","3.1组织架构","AZ/AZ-05-005/008.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_009","3.2人员配置","AZ/AZ-05-005/009.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_010","3.3授权书","AZ/AZ-05-005/010.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_011","4.1技术方案选择","AZ/AZ-05-005/011.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_012","5.1分包选择方案","AZ/AZ-05-005/012.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_013","5.2物资采购方案","AZ/AZ-05-005/013.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_014","5.3机械配置方案","AZ/AZ-05-005/014.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_015","5.4资源采购条件","AZ/AZ-05-005/015.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_016","6.1现场临建方案","AZ/AZ-05-005/016.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_017","6.2临水临电方案","AZ/AZ-05-005/017.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_018","6.3监测设备配置方案","AZ/AZ-05-005/018.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_019","6.4办公设备配置","AZ/AZ-05-005/019.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_020","7.1总成本控制","AZ/AZ-05-005/020.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_021","7.1-1管理费预算","AZ/AZ-05-005/021.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_022","8.1现金流量预算","AZ/AZ-05-005/022.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_023","8.1-1预算流入","AZ/AZ-05-005/023.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_024","8.1-2.预算流出","AZ/AZ-05-005/024.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"4_025","9.1文件编制计划","AZ/AZ-05-005/025.htm",String.valueOf(c_GCXMFlag.XiangMu)}
		});

		tableInfo.put("151",new String[][]{
				{"151_002","目标责任表","JZ/JZ-01-151/sheet002.htm",String.valueOf(c_GCXMFlag.XiangMu)}
		});
		tableInfo.put("152",new String[][]{
				{"152_002","工程项目","JZ/JZ-02-152/sheet002.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"152_003","单项工程","JZ/JZ-02-152/sheet003.htm",String.valueOf(c_GCXMFlag.GongCheng)},
				{"152_004","1-1分包工程测算表","JZ/JZ-02-152/sheet004.htm",String.valueOf(c_GCXMFlag.GongCheng)},
				{"152_005","1-2材料设备测算表","JZ/JZ-02-152/sheet005.htm",String.valueOf(c_GCXMFlag.GongCheng)},
				{"152_006","1-3机械与材料租赁测算表","JZ/JZ-02-152/sheet006.htm",String.valueOf(c_GCXMFlag.GongCheng)},
				{"152_007","1-4管理费及其它测算表","JZ/JZ-02-152/sheet007.htm",String.valueOf(c_GCXMFlag.GongCheng)}
		});
		tableInfo.put("153",new String[][]{
				{"153_002","工程成本调整表","JZ/JZ-03-153/sheet002.htm",String.valueOf(c_GCXMFlag.XiangMu)}
		});
		tableInfo.put("154",new String[][]{
				{"154_002","工程项目","JZ/JZ-04-154/sheet002.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"154_003","单项工程","JZ/JZ-04-154/sheet003.htm",String.valueOf(c_GCXMFlag.GongCheng)}
		});
		tableInfo.put("155",new String[][]{
				{"155_002","工程项目","JZ/JZ-05-155/sheet002.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"155_003","单项工程","JZ/JZ-05-155/sheet003.htm",String.valueOf(c_GCXMFlag.GongCheng)},
				{"155_004","租赁及摊销计算表","JZ/JZ-05-155/sheet004.htm",String.valueOf(c_GCXMFlag.GongCheng)},
				{"155_005","管理费及其它计算表","JZ/JZ-05-155/sheet005.htm",String.valueOf(c_GCXMFlag.GongCheng)}
		});

		tableInfo.put("156",new String[][]{
				{"156_002","过程控制表","JZ/JZ-06-156/sheet002.htm",String.valueOf(c_GCXMFlag.XiangMu)}
		});
		tableInfo.put("157",new String[][]{
				{"157_002","工程项目","JZ/JZ-07-157/sheet002.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"157_003","单项工程","JZ/JZ-07-157/sheet003.htm",String.valueOf(c_GCXMFlag.GongCheng)}
		});
		tableInfo.put("158",new String[][]{
				{"158_001","项目成本确认单","JZ/JZ-08-158/sheet002.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"158_002","单项工程成本确认单","JZ/JZ-08-158/sheet002.htm",String.valueOf(c_GCXMFlag.GongCheng)},
				{"158_003","附件1—物资成本确认单","JZ/JZ-08-158/sheet003.htm",String.valueOf(c_GCXMFlag.GongCheng)},
				{"158_004","附件2—租赁成本确认单","JZ/JZ-08-158/sheet004.htm",String.valueOf(c_GCXMFlag.GongCheng)}
		});
		tableInfo.put("159",new String[][]{
				{"159_002","综合统计","JZ/JZ-09-159/sheet002.htm",String.valueOf(c_GCXMFlag.XiangMu)}
		});
		tableInfo.put("160",new String[][]{
				{"160_002","工程项目","JZ/JZ-10-160/sheet002.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"160_003","单项工程","JZ/JZ-10-160/sheet003.htm",String.valueOf(c_GCXMFlag.GongCheng)}
		});
		tableInfo.put("161",new String[][]{
				{"161_002","汇总统计","JZ/JZ-11-161/sheet002.htm",String.valueOf(c_GCXMFlag.XiangMu)},
				{"161_003","月度统计","JZ/JZ-11-161/sheet003.htm",String.valueOf(c_GCXMFlag.XiangMu)}
		});
		tableInfo.put("162",new String[][]{
				{"162_002","成本利润分析表","JZ/JZ-12-162/sheet002.htm",String.valueOf(c_GCXMFlag.XiangMu)}
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
		//通过顺序号生成Mask
		String ret="";
		for(int i=0;i<v;i++){
			ret+="0";
		}
		ret+="1";
		return ret;
	}
	int getAuthorityIDByExcelType(String excelType){
		//根据excelType获取令牌ID，其实就是顺序号，然后根据令牌ID生成对应的门牌mask;
		for(int i=0;i<tableOrder.length;i++){
			if(excelType.trim().equals(tableOrder[i][2].trim())){
				return i;
			}
		}
		return -1;
	}
	public List< String > getValueFromMap(Map<String,String> mm){
		List< String > at = new ArrayList< String >();
		for(int i=0;i<tableOrder.length;i++){
			at.add(mm.get(tableOrder[i][0]));
		}
		return at;
	}
	public List<String> getExcelSubTableType(String excelType){
		//返回excelType，对应的TableID
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
		//返回一个，拼音对应，权限的0-1的JSON
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
		//字符串拼接器
		return "{"+
		"name : \""+name+"\","+
		"tableType : \""+type+"\","+
		"template : '"+path+"'"+
		"},";
	}
	public String getTemplateTabSimple(String excelType){
		//获取并且拼接ExcelType对应的submenu对应的Table的ID
		if(excelType==null){
			System.out.println("Error");
			return "[]";
		}
		String [][] vv=tableInfo.get(excelType);
		String ret="[";
		if(vv!=null){
			for(int i=0;i<vv.length;i++){
				System.out.println(vv[i][3]);
				ret+=templateTabItem(vv[i][1],vv[i][0],vv[i][2]);
			}
		}
		ret+="]";
		return ret;
	}
	public String getTemplateTab(String excelType,String gcorxm){
		//获取并且拼接ExcelType对应的submenu对应的Table的ID
		if(excelType==null){
			System.out.println("Error");
			return "[]";
		}
		String [][] vv=tableInfo.get(excelType);
		String ret="[";
		if(vv!=null){
			for(int i=0;i<vv.length;i++){
				System.out.println(vv[i][3]);
				if(gcorxm.trim().equals(vv[i][3])){
					//判断是工程还是项目
					//输出符合选择的
					ret+=templateTabItem(vv[i][1],vv[i][0],vv[i][2]);
				}
				
			}
		}
		ret+="]";
		return ret;
	}
	public String menuItem(String title,String excelType,String li_id){
		//字符串拼接
		return "{"
		+"				title : '"+title+"',"
		+"				id : '',"
		+"				icon : 'sub2',"
		+"				submenu : [],"
		+"				excelType : '"+excelType+"',"
		+"				template_tab : "+getTemplateTabSimple(excelType)+","
		+"				parent_id : 'false',"
		+"				li_id : '"+li_id+"',"
		+"				li_type : 'fixed',"
		+"			}";
	}
	public String  getMenuJsonFromMask(String cmask){
		int vk=cmask.length()>tableOrder.length?tableOrder.length:cmask.length();
		String ss="[";
		for(int i = 0; i < vk; i++) { 
			if(isExist(cmask,toStringMask(i))){	ss=ss	+menuItem(tableOrder[i][1],tableOrder[i][2], String.valueOf(i))+",";	}
		}
		ss+="]";
		return ss;
	}


	public boolean canGetExcelOrNot(String cmask,String excelType){
		for(int i=0;i<tableOrder.length;i++){
			if(tableOrder[i][2].equals(excelType)){
				System.out.println(tableOrder[i][1]);
				System.out.println(tableOrder[i][0]);
				System.out.println(cmask.charAt(i));
				System.out.println(excelType);
				System.out.println((i));
				System.out.println(cmask);
				if(cmask.charAt(i)=='1'){
					System.out.println("YES");

					return true;
				}else{
					return false;
				}
			}
		}
		return false;
	} 


	public String getExcelTypeName(String excelType){
		for(String[] it:this.tableOrder){
			if(it[2].equals(excelType.trim())){
				return it[1];
			}
		}
		return null;
	}

	public String[] getExcelTypeNameAndMask(String excelType){

		for(int i=0;i<this.tableOrder.length;i++){
			if(this.tableOrder[i][2].equals(excelType.trim())){
				return new String[]{this.tableOrder[i][1],this.toStringMask(i)};//it[1];
			}
		}
		return null;
	}


	public String getPeopleAndTableInit(){
		String[][] baseStr=new String[][]{{"A<br>组织<br>与<br>策划","机构设置","AZ","04","004","xiang_mu_bu_zu_zhi_ji_gou_"},{"A<br>组织<br>与<br>策划","人员配备","AZ","05","005","gang_wei_yu_ren_yuan_pei_zhi_"},{"A<br>组织<br>与<br>策划","任务部署","AZ","06","006","ren_wu_zong_lan_yu_bu_shu_"},{"A<br>组织<br>与<br>策划","权责分配","AZ","07","007","zhi_ze_yu_zhi_quan_fen_pei_"},{"A<br>组织<br>与<br>策划","策划编制","AZ","10","010","xiang_mu_shi_shi_ce_hua_shu_"},{"B<br>行政<br>与<br>办公","工作计划","BZ","01","006","bu_men_ji_hua_"},{"B<br>行政<br>与<br>办公","文件草拟","BZ","05","010","gong_zuo_qia_shang_"},{"B<br>行政<br>与<br>办公","文件草拟","BZ","06","011","zheng_gai_tong_zhi_"},{"B<br>行政<br>与<br>办公","文件草拟","BZ","07","012","wei_yue_tong_zhi_"},{"B<br>行政<br>与<br>办公","文件草拟","BZ","08","013","xing_zheng_wen_jian_"},{"B<br>行政<br>与<br>办公","文件草拟","BZ","09","014","bian_han_mo_ban_"},{"B<br>行政<br>与<br>办公","文件草拟","BZ","10","015","na_bu_bao_gao_"},{"B<br>行政<br>与<br>办公","文件草拟","BZ","11","016","hui_yi_ji_yao_"},{"B<br>行政<br>与<br>办公","文件收发","BZ","12","017","fa_wen_deng_ji_"},{"B<br>行政<br>与<br>办公","文件收发","BZ","13","018","shou_wen_yue_ban_"},{"B<br>行政<br>与<br>办公","文件收发","BZ","14","019","fa_wen_qian_shou_"},{"B<br>行政<br>与<br>办公","员工考勤","BZ","02","007","yue_du_chu_qin_"},{"B<br>行政<br>与<br>办公","员工考勤","BZ","03","008","qing_jia_shen_qing_"},{"B<br>行政<br>与<br>办公","员工考勤","BZ","04","009","chu_qin_tong_ji_"},{"B<br>行政<br>与<br>办公","印鉴使用","BZ","15","020","shi_yong_shen_qing_"},{"B<br>行政<br>与<br>办公","印鉴使用","BZ","16","021","shi_yong_deng_ji_"},{"B<br>行政<br>与<br>办公","办公用品","BZ","17","022","xu_qiu_ji_hua_"},{"B<br>行政<br>与<br>办公","办公用品","BZ","18","023","ku_cun_tai_zhang_"},{"B<br>行政<br>与<br>办公","办公用品","BZ","19","024","ling_yong_deng_ji_"},{"B<br>行政<br>与<br>办公","图书借阅","BZ","20","025","jie_yue_deng_ji_"},{"B<br>行政<br>与<br>办公","图书借阅","BZ","21","026","tu_shu_tai_zhang_"},{"B<br>行政<br>与<br>办公","车辆使用","BZ","22","027","gou_you_jia_you_"},{"B<br>行政<br>与<br>办公","车辆使用","BZ","23","028","wei_xiu_bao_yang_"},{"B<br>行政<br>与<br>办公","资产管理","BZ","24","029","zi_chan_tai_zhang_"},{"C<br>招标<br>与<br>采购","招标准备","CZ","01","030","zhao_biao_wen_jian_"},{"C<br>招标<br>与<br>采购","招标准备","CZ","02","031","yi_biao_shen_pi_"},{"C<br>招标<br>与<br>采购","招标公告","CZ","03","032","zhao_biao_gong_gao_"},{"C<br>招标<br>与<br>采购","报名资审","CZ","04","033","zi_ge_shen_cha_"},{"C<br>招标<br>与<br>采购","报名资审","CZ","05","034","kao_cha_ping_jia_ru_xu_"},{"C<br>招标<br>与<br>采购","文件领取","CZ","06","035","wen_jian_ling_qu_"},{"C<br>招标<br>与<br>采购","投标报价","CZ","07","036","tou_biao_bao_jia_"},{"C<br>招标<br>与<br>采购","开评定标","CZ","08","037","kai_ping_ding_biao_"},{"C<br>招标<br>与<br>采购","开评定标","CZ","09","038","jia_ge_shen_ding_"},{"C<br>招标<br>与<br>采购","中标通知","CZ","10","039","zhong_biao_tong_zhi_"},{"D<br>合约<br>与<br>商务","合同签订","CZ","11","040","he_tong_qian_ding_"},{"D<br>合约<br>与<br>商务","合同交底","CZ","12","041","he_tong_jiao_di_"},{"D<br>合约<br>与<br>商务","合同变更","CZ","13","042","he_tong_bian_geng_"},{"D<br>合约<br>与<br>商务","合同台账","CZ","14","043","he_tong_tai_zhang_"},{"D<br>合约<br>与<br>商务","供方名册","CZ","15","044","gong_fang_ming_ce_"},{"D<br>生产<br>与<br>技术","技术准备","DZ","01","045","tu_zhi_deng_ji_"},{"D<br>生产<br>与<br>技术","技术准备","DZ","02","046","tu_zhi_hui_shen_"},{"D<br>生产<br>与<br>技术","技术准备","DZ","03","047","shi_zu_bian_zhi_"},{"D<br>生产<br>与<br>技术","技术准备","DZ","04","048","fang_an_bian_zhi_"},{"D<br>生产<br>与<br>技术","技术准备","DZ","05","049","ji_shu_jiao_di_"},{"D<br>生产<br>与<br>技术","技术准备","DZ","06","050","gong_cheng_bian_geng_"},{"D<br>生产<br>与<br>技术","技术准备","DZ","07","051","ji_shu_he_ding_"},{"D<br>生产<br>与<br>技术","资源需求","DZ","08","052","lao_wu_xu_qiu_ji_hua_"},{"D<br>生产<br>与<br>技术","资源需求","DZ","11","055","wu_zi_xu_qiu_ji_hua_"},{"D<br>生产<br>与<br>技术","资源需求","DZ","12","056","wu_zi_yan_shou_ji_hua_"},{"D<br>生产<br>与<br>技术","资源需求","DZ","13","057","ji_xie_xu_qiu_ji_hua_"},{"D<br>生产<br>与<br>技术","资源需求","DZ","14","058","jian_ce_pei_bei_ji_hua_"},{"D<br>生产<br>与<br>技术","生产组织","DZ","15","059","ban_zu_zuo_ye_zu_zhi_ka_"},{"D<br>生产<br>与<br>技术","生产组织","DZ","16","060","wu_liao_diao_yun_zu_zhi_ka_"},{"D<br>生产<br>与<br>技术","生产组织","DZ","09","053","lao_dong_li_pei_zhi_ji_hua_"},{"D<br>生产<br>与<br>技术","生产组织","DZ","10","054","lao_dong_li_diao_pei_ji_hua_"},{"D<br>生产<br>与<br>技术","进度控制","DZ","17","061","shi_ji_jin_du_yu_zong_jin_du_ji_hua_dui_bi_"},{"D<br>生产<br>与<br>技术","进度控制","DZ","18","062","shi_ji_wan_cheng_yu_yue_jin_du_ji_hua_dui_bi_"},{"D<br>生产<br>与<br>技术","质量控制","DZ","19","063","zhi_liang_tong_bing_yu_kong_shi_bie_"},{"D<br>生产<br>与<br>技术","质量控制","DZ","20","064","gong_cheng_zhi_liang_xun_jian_kong_zhi_"},{"D<br>生产<br>与<br>技术","安全控制","DZ","21","065","wei_xian_yuan_yu_kong_shi_bie_"},{"D<br>生产<br>与<br>技术","安全控制","DZ","22","066","an_quan_xun_jian_kong_zhi_biao_"},{"D<br>生产<br>与<br>技术","安全控制","DZ","23","067","an_quan_gong_shang_shi_gu_kuai_bao_"},{"D<br>生产<br>与<br>技术","安全控制","DZ","24","068","an_quan_wei_sui_shi_gu_deng_ji_"},{"D<br>生产<br>与<br>技术","环境控制","DZ","25","069","huan_jing_yin_su_yu_kong_shi_bie_"},{"D<br>生产<br>与<br>技术","环境控制","DZ","26","070","huan_jing_ying_xiang_guo_cheng_xun_jian_"},{"D<br>生产<br>与<br>技术","监测装置","DZ","27","071","jian_ce_zhuang_zhi_jian_ding_ji_hua_"},{"D<br>生产<br>与<br>技术","监测装置","DZ","28","072","jian_ce_zhuang_zhi_shi_yong_zhuang_tai_"},{"D<br>生产<br>与<br>技术","施工日志","DZ","29","073","shi_gong_ri_zhi_"},{"D<br>生产<br>与<br>技术","生产月报","DZ","30","074","xiang_mu_yue_bao_"},{"D<br>生产<br>与<br>技术","管理台账","DZ","31","075","ji_shu_wen_jian_guan_li_tai_zhang_"},{"D<br>生产<br>与<br>技术","管理台账","DZ","32","076","fang_an_dong_tai_guan_li_tai_zhang_"},{"D<br>生产<br>与<br>技术","管理台账","DZ","33","077","jian_ce_zhuang_zhi_guan_li_tai_zhang_"},{"E<br>分包<br>与<br>机械","进场计划","EZ","01","078","fen_bao_jin_chang_ji_hua_"},{"E<br>分包<br>与<br>机械","进场计划","EZ","02","079","ji_xie_jin_chang_ji_hua_"},{"E<br>分包<br>与<br>机械","进场登记","EZ","03","080","zheng_jian_zheng_zhao_yan_zheng_"},{"E<br>分包<br>与<br>机械","进场登记","EZ","04","081","fen_bao_jin_chang_she_bei_qing_dan_"},{"E<br>分包<br>与<br>机械","进场登记","EZ","05","082","ji_xie_jin_chang_yan_shou_ji_lu_"},{"E<br>分包<br>与<br>机械","进场登记","EZ","06","083","ji_xie_she_bei_san_ding_deng_ji_"},{"E<br>分包<br>与<br>机械","进场登记","EZ","07","084","shi_gong_ji_xie_she_bei_tai_zhang_"},{"E<br>分包<br>与<br>机械","人员注册","EZ","08","085","fen_bao_ren_yuan_zhu_ce_"},{"E<br>分包<br>与<br>机械","人员注册","EZ","09","086","fen_bao_ren_yuan_zao_ce_"},{"E<br>分包<br>与<br>机械","入场教育","EZ","11","088","fen_bao_jin_chang_jiao_yu_"},{"E<br>分包<br>与<br>机械","劳务考勤","EZ","12","089","lao_wu_gong_ren_chu_qin_"},{"E<br>分包<br>与<br>机械","劳务考勤","EZ","13","090","lao_wu_gong_ren_bian_dong_"},{"E<br>分包<br>与<br>机械","劳务考勤","EZ","10","087","lao_wu_yong_gong_tong_ji_"},{"E<br>分包<br>与<br>机械","工资发放","EZ","14","091","gong_ren_gong_zi_fa_fang_ji_lu_"},{"E<br>分包<br>与<br>机械","维保计划","EZ","15","092","ji_xie_she_bei_wei_bao_ji_hua_"},{"E<br>分包<br>与<br>机械","运行记录","EZ","16","093","ji_xie_she_bei_yun_zhuan_ji_lu_"},{"E<br>分包<br>与<br>机械","运行记录","EZ","17","094","ji_xie_she_bei_jian_cha_ji_lu_"},{"E<br>分包<br>与<br>机械","维保记录","EZ","18","095","ji_xie_she_bei_bao_yang_ji_lu_"},{"E<br>分包<br>与<br>机械","维保记录","EZ","19","096","ji_xie_she_bei_wei_xiu_ji_lu_"},{"E<br>分包<br>与<br>机械","事故报告","EZ","20","097","ji_xie_she_bei_shi_gu_bao_gao_"},{"E<br>分包<br>与<br>机械","使用评价","EZ","21","098","fen_bao_ri_chang_guan_li_ji_lu_"},{"E<br>分包<br>与<br>机械","使用评价","EZ","22","099","fen_bao_shi_yong_ji_lu_"},{"E<br>分包<br>与<br>机械","使用评价","EZ","23","100","fen_gong_fang_ping_jia_hui_zong_"},{"F<br>材料<br>与<br>设备","物资供应","FZ","01","101","wu_zi_shi_yong_ji_hua_"},{"F<br>材料<br>与<br>设备","物资供应","FZ","02","102","ling_xing_cai_gou_xun_jia_"},{"F<br>材料<br>与<br>设备","物资供应","FZ","03","103","wu_zi_diao_bo_ping_zheng_"},{"F<br>材料<br>与<br>设备","进场计划","FZ","04","104","wu_zi_jin_chang_chou_hua_"},{"F<br>材料<br>与<br>设备","进场通知","FZ","05","105","wu_zi_jin_chang_tong_zhi_"},{"F<br>材料<br>与<br>设备","验收入库","FZ","06","106","wu_zi_jin_chang_yan_shou_"},{"F<br>材料<br>与<br>设备","验收入库","FZ","07","107","zhi_liang_zheng_ming_deng_ji_"},{"F<br>材料<br>与<br>设备","验收入库","FZ","08","108","shou_huo_dan_"},{"F<br>材料<br>与<br>设备","验收入库","FZ","09","109","ru_ku_dan_"},{"F<br>材料<br>与<br>设备","验收入库","FZ","10","110","tui_huan_huo_dan_"},{"F<br>材料<br>与<br>设备","领用出库","FZ","16","116","ling_tui_yong_dan_"},{"F<br>材料<br>与<br>设备","领用出库","FZ","17","117","chu_tui_ku_dan_"},{"F<br>材料<br>与<br>设备","贮存保管","FZ","18","118","wu_zi_zhu_cun_bao_guan_ji_lu_"},{"F<br>材料<br>与<br>设备","贮存保管","FZ","19","119","gong_ju_yong_ju_jie_yong_ji_lu_"},{"F<br>材料<br>与<br>设备","库存盘点","FZ","22","122","wu_zi_chu_ru_cun_hao_pan_dian_"},{"F<br>材料<br>与<br>设备","库存盘点","","","","wu_zi_cang_ku_qing_dian_biao_"},{"F<br>材料<br>与<br>设备","检验报验","FZ","11","111","wu_zi_fu_shi_tong_zhi_dan_"},{"F<br>材料<br>与<br>设备","检验报验","FZ","12","112","wu_zi_gou_jian_bao_yan_dan_"},{"F<br>材料<br>与<br>设备","检验报验","FZ","13","113","yang_pin_yang_ben_song_shen_biao_"},{"F<br>材料<br>与<br>设备","检验报验","FZ","14","114","bu_he_ge_pin_chu_zhi_ji_lu_"},{"F<br>材料<br>与<br>设备","检验报验","FZ","15","115","wu_zi_jin_chang_bao_yan_tai_zhang_"},{"F<br>材料<br>与<br>设备","废料处置","FZ","20","120","fei_jiu_wu_zi_chu_zhi_shen_qing_"},{"F<br>材料<br>与<br>设备","废料处置","FZ","21","121","fei_jiu_wu_zi_chu_zhi_tai_zhang_"},{"F<br>材料<br>与<br>设备","账目报表","FZ","23","123","wu_zi_bao_guan_ming_xi_zhang_biao_"},{"F<br>材料<br>与<br>设备","账目报表","FZ","24","124","wu_zi_cai_gou_tong_ji_bao_biao_"},{"F<br>材料<br>与<br>设备","账目报表","FZ","25","125","wu_zi_hao_yong_tong_ji_bao_biao_"},{"F<br>材料<br>与<br>设备","账目报表","FZ","26","126","wu_zi_ling_yong_tong_ji_bao_biao_"},{"F<br>材料<br>与<br>设备","账目报表","FZ","27","127","wu_zi_sun_hao_tong_ji_bao_biao_"},{"G<br>试验<br>与<br>资料","计划编制","GZ","01","128","shi_yan_jian_ce_ji_hua_"},{"G<br>试验<br>与<br>资料","取样通知","GZ","02","129","qu_yang_song_jian_tong_zhi_"},{"G<br>试验<br>与<br>资料","试样制取","GZ","03","130","shi_yan_shi_jian_deng_ji_"},{"G<br>试验<br>与<br>资料","试样养护","GZ","04","131","wen_du_shi_du_ji_lu_"},{"G<br>试验<br>与<br>资料","试样送检","GZ","05","132","shi_yan_wei_tuo_shu_"},{"G<br>试验<br>与<br>资料","检验报告","GZ","06","133","shi_yan_jian_ce_bao_gao_"},{"G<br>试验<br>与<br>资料","工程资料","","","","gong_cheng_zi_liao_"},{"G<br>试验<br>与<br>资料","工程资料","GZ","07","134","zi_liao_chu_li_liu_cheng_"},{"G<br>试验<br>与<br>资料","工程资料","GZ","08","135","gong_cheng_zi_liao_jian_cha_"},{"H<br>预算<br>与<br>结算","工程计量","","","","gong_cheng_liang_ji_suan_shu_"},{"H<br>预算<br>与<br>结算","工程计量","HZ","01","136","gong_cheng_liang_tong_ji_biao_"},{"H<br>预算<br>与<br>结算","工程计量","HZ","02","137","jing_ji_yu_ji_shu_zhi_biao_"},{"H<br>预算<br>与<br>结算","工程计价","","","","gong_cheng_zao_jia_yu_suan_shu_"},{"H<br>预算<br>与<br>结算","工程计价","HZ","03","138","gong_cheng_zao_jia_hui_zong_"},{"H<br>预算<br>与<br>结算","工程计价","HZ","04","139","gong_cheng_zao_jia_fen_xi_"},{"H<br>预算<br>与<br>结算","分供结算","HZ","05","140","fen_bao_gong_cheng_wan_gong_dan_"},{"H<br>预算<br>与<br>结算","分供结算","HZ","06","141","gong_cheng_jie_suan_xun_qian_dan_"},{"H<br>预算<br>与<br>结算","分供结算","","","","fen_bao_gong_cheng_zao_jia_jie_suan_shu_"},{"H<br>预算<br>与<br>结算","分供结算","HZ","07","142","fen_gong_jie_suan_ping_shen_biao_"},{"H<br>预算<br>与<br>结算","分供结算","HZ","08","143","fen_bao_gong_cheng_jie_suan_dan_"},{"H<br>预算<br>与<br>结算","分供结算","HZ","09","144","wu_zi_cai_gou_jie_suan_dan_"},{"H<br>预算<br>与<br>结算","分供结算","HZ","10","145","she_bei_zu_lin_jie_suan_dan_"},{"H<br>预算<br>与<br>结算","总包结算","HZ","11","146","gong_cheng_jie_suan_ji_jia_fang_an_"},{"H<br>预算<br>与<br>结算","总包结算","","","","gong_cheng_jie_suan_shu_"},{"I<br>签证<br>与<br>索赔","现场签证","IZ","01","147","xian_chang_qian_zheng_biao_"},{"I<br>签证<br>与<br>索赔","变更索赔","IZ","02","148","gong_cheng_bian_geng_fei_yong_bao_shen_"},{"I<br>签证<br>与<br>索赔","变更索赔","IZ","03","149","fei_yong_suo_pei_shen_qing_he_zhun_"},{"I<br>签证<br>与<br>索赔","收支记录","IZ","04","150","bian_geng_suo_pei_qian_zheng_shou_zhi_ji_lu_"},{"J<br>成本<br>与<br>利润","成本责任","JZ","01","151","gong_cheng_cheng_ben_ze_ren_biao_"},{"J<br>成本<br>与<br>利润","成本测算","JZ","02","152","gong_cheng_cheng_ben_ce_suan_biao_"},{"J<br>成本<br>与<br>利润","成本测算","JZ","03","153","gong_cheng_cheng_ben_diao_zheng_biao_"},{"J<br>成本<br>与<br>利润","成本计划","JZ","04","154","gong_cheng_cheng_ben_ji_hua_biao_"},{"J<br>成本<br>与<br>利润","成本控制","JZ","05","155","gong_cheng_cheng_ben_kong_zhi_biao_"},{"J<br>成本<br>与<br>利润","成本控制","JZ","06","156","wu_zi_cheng_ben_kong_zhi_biao_"},{"J<br>成本<br>与<br>利润","成本核算","JZ","07","157","gong_cheng_cheng_ben_he_suan_biao_"},{"J<br>成本<br>与<br>利润","成本核算","JZ","08","158","yue_du_gong_cheng_cheng_ben_que_ren_"},{"J<br>成本<br>与<br>利润","成本分析","JZ","09","159","gong_cheng_cheng_ben_ze_ren_fen_xi_"},{"J<br>成本<br>与<br>利润","成本分析","JZ","10","160","gong_cheng_cheng_ben_zong_he_fen_xi_"},{"J<br>成本<br>与<br>利润","成本分析","JZ","11","161","zhu_yao_wu_zi_cheng_ben_fen_xi_"},{"J<br>成本<br>与<br>利润","利润预测","JZ","12","162","xiang_mu_li_run_yu_ce_biao_"},{"K<br>产值<br>与<br>资金","资金计划","KZ","01","162","nian_du_zi_jin_shou_zhi_ji_hua_"},{"K<br>产值<br>与<br>资金","资金计划","KZ","02","163","yue_du_zi_jin_zhi_fu_ji_hua_"},{"K<br>产值<br>与<br>资金","进度报量","KZ","03","164","gong_cheng_jin_du_kuan_bao_shen_"},{"K<br>产值<br>与<br>资金","资金回收","KZ","04","165","gong_cheng_kuan_zhi_fu_shen_qing_"},{"K<br>产值<br>与<br>资金","资金回收","KZ","05","166","chan_zhi_yu_zi_jin_hui_shou_tong_ji_"},{"K<br>产值<br>与<br>资金","确认进度","KZ","06","167","gong_cheng_xing_xiang_jin_du_que_ren_dan_"},{"K<br>产值<br>与<br>资金","资金支付","KZ","07","168","fen_gong_shang_fu_kuan_zhi_fu_biao_"},{"K<br>产值<br>与<br>资金","资金支付","KZ","08","169","fen_gong_shang_chan_zhi_yu_zhi_fu_tong_ji_"},{"K<br>产值<br>与<br>资金","资金往来","KZ","09","170","fen_bao_dai_kou_fa_kuan_ji_lu_"},{"L<br>考核<br>与<br>激励","考核","LZ","01","171","yuan_gong_kao_he_yu_ping_jia_biao_"},{"L<br>考核<br>与<br>激励","激励","LZ","02","172","yuan_gong_jiang_li_fen_pei_biao_"},{"M<br>竣工<br>与<br>维保","项目解体","MZ","01","173","xiang_mu_jie_ti_ce_hua_shu_"},{"M<br>竣工<br>与<br>维保","项目解体","MZ","02","174","xiang_mu_yan_qi_jie_ti_shen_qing_biao_"},{"M<br>竣工<br>与<br>维保","项目解体","MZ","03","175","xiang_mu_jie_ti_gong_zuo_wan_cheng_qing_kuang_hui_qian_"},{"M<br>竣工<br>与<br>维保","工程移交","MZ","04","176","xiang_mu_yi_jiao_shen_qing_biao_"},{"M<br>竣工<br>与<br>维保","工程移交","MZ","05","177","xiang_mu_yi_jiao_hui_qian_biao_"},{"M<br>竣工<br>与<br>维保","资料移交","","","","gong_cheng_ji_shu_zi_liao_"},{"M<br>竣工<br>与<br>维保","资料移交","","","","guan_li_zi_liao_yi_jiao_"},{"M<br>竣工<br>与<br>维保","项目总结","MZ","06","178","xiang_mu_wan_gong_zong_jie_bao_gao_"},{"M<br>竣工<br>与<br>维保","工程回访","MZ","07","179","gong_cheng_hui_fang_ji_hua_biao_"},{"M<br>竣工<br>与<br>维保","工程回访","MZ","08","180","gong_cheng_hui_fang_ji_lu_biao_"},{"M<br>竣工<br>与<br>维保","工程回访","MZ","08","180","yong_hu_man_yi_diao_cha_biao_"},{"M<br>竣工<br>与<br>维保","业主投诉","MZ","09","181","gu_ke_tou_su_ji_lu_"},{"M<br>竣工<br>与<br>维保","工程维保","MZ","10","182","gong_cheng_wei_xiu_ji_lu_"},{"M<br>竣工<br>与<br>维保","工程维保","MZ","11","183","gong_cheng_bao_xiu_qi_man_tong_zhi_"},{"M<br>竣工<br>与<br>维保","工程维保","MZ","10","182",""}};
		String ret="[";
		for(String[] item : baseStr){
			String[] excelTyem= getExcelInfoByEncodeName(item[5].trim());
			ret+="{"+
					"\"title1\":\""+item[0]+"\","+
					"\"title2\":\""+item[1]+"\","+
					"\"a3\" : \""+item[2]+"\","+
					"\"a4\" : \""+item[3]+"\","+
					"\"a5\" : \""+item[4]+"\","+
					"\"title3\":\""+excelTyem[1]+"\","+
					"\"title3_encode\":\""+excelTyem[0]+"\","+
					"\"excel_type\":\""+excelTyem[2]+"\","+
					"\"maskOrder\":\""+excelTyem[3]+"\""+
					"},";
		}
		ret+="]";
		return ret;
	}
	public String[] getExcelInfoByEncodeName(String encodeName){
		if(encodeName.trim().length()==0){
			return new String[]{"","","",""};
		}
		for(int i=0;i<tableOrder.length;i++){
			if(tableOrder[i][0].equals(encodeName)){
				return new String[]{tableOrder[i][0],
						tableOrder[i][1],
						tableOrder[i][2],
						String.valueOf(i)};
			}
		}
		return new String[]{"","","",""};
	}

	public boolean hasGCTable(String excelType){
		String[][] xx= tableInfo.get(excelType);
		if(xx==null)return false;
		boolean ret=false;
		for(int i=0;i<xx.length;i++){
			if(xx[i][3].equals(String.valueOf(c_GCXMFlag.GongCheng))){
				ret=true;
				break;
			}
		}
		return ret;
	}

	public boolean hasXMTable(String excelType){
		String[][] xx= tableInfo.get(excelType);
		if(xx==null)return false;
		boolean ret=false;
		for(int i=0;i<xx.length;i++){
			if(xx[i][3].equals(String.valueOf(c_GCXMFlag.XiangMu))){
				ret=true;
				break;
			}
		}
		return ret;
	}
}
