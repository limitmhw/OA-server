package serv.controller;

public class SystemConst {
	public enum c_ChengBenType {  
		//成本类型
		lao_wu_fen_bao_,//劳务分包
		ren_gong_fei_,//人工费
		cai_liao_she_bei_,//材料设备
		zhou_zhuan_cai_liao_zu_lin_tan_xiao_,//周转材料租赁摊销
		shi_gong_ji_xie_zu_lin_tan_xiao_,//施工机械租赁摊销
		zhuan_ye_gong_cheng_fen_bao_,//专业工程分包
		qi_ta_zhi_jie_fei_,//其它直接费
		xian_chang_jing_fei_,//现场经费
		qi_ta_fei_yong_,//其它费用
		bu_ke_yu_jian_fei_//不可预见费
	}
	public enum c_BiaoTi {
		//标题类型
		TITLELEVEL1,
		TITLELEVEL2,
		TITLELEVEL3,
	}
	public enum c_GCXMFlag{
		//标记是项目还是工程
		GongCheng,
		XiangMu,
		DanXiangGongCheng
	}
}
