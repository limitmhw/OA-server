<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
requestScope.menu.isExist("","");

%>

golbal.allmenu = [{
		id : "o_p",
		title : "组织与策划",
		submenu : [{
				title : "项目部组织机构",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "1",
				li_type : "fixed",
			}, {
				title : "岗位与人员配置",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "2",
				li_type : "fixed",
			}, {
				title : "任务总览与部署",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "3",
				li_type : "fixed",
			}, {
				title : "职责与职权分配",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "4",
				li_type : "fixed",
			}, {
				title : "项目实施策划书",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "5",
				li_type : "fixed",
			}, {
				title : "工程计划表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "6",
				li_type : "fixed",
			}, {
				title : "管理台账",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "7",
				li_type : "fixed",
			}, {
				title : "项目注册",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "8",
				li_type : "fixed",
			}, {
				title : "招标文件封面",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "9",
				li_type : "fixed",
			}, {
				title : "招标文件正文",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "10",
				li_type : "fixed",
			}
		]
	}, {
		id : "a_o",
		title : "行政与办公",
		submenu : [{
				title : "部门计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "11",
				li_type : "fixed",
			}, {
				title : "工作洽商",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "12",
				li_type : "fixed",
			}, {
				title : "整改通知",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "13",
				li_type : "fixed",
			}, {
				title : "违约通知",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "14",
				li_type : "fixed",
			}, {
				title : "行政文件",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "15",
				li_type : "fixed",
			}, {
				title : "便函模板",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "16",
				li_type : "fixed",
			}, {
				title : "内部报告",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "17",
				li_type : "fixed",
			}, {
				title : "会议纪要",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "18",
				li_type : "fixed",
			}, {
				title : "发文登记",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "19",
				li_type : "fixed",
			}, {
				title : "收文阅办",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "20",
				li_type : "fixed",
			}, {
				title : "发文签收",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "21",
				li_type : "fixed",
			}, {
				title : "月度出勤",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "22",
				li_type : "fixed",
			}, {
				title : "请假申请",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "23",
				li_type : "fixed",
			}, {
				title : "出勤统计",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "24",
				li_type : "fixed",
			}, {
				title : "使用申请",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "25",
				li_type : "fixed",
			}, {
				title : "使用登记",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "26",
				li_type : "fixed",
			}, {
				title : "需求计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "27",
				li_type : "fixed",
			}, {
				title : "库存台账",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "28",
				li_type : "fixed",
			}, {
				title : "领用登记",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "29",
				li_type : "fixed",
			}, {
				title : "借阅登记",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "30",
				li_type : "fixed",
			}, {
				title : "图书台帐",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "31",
				li_type : "fixed",
			}, {
				title : "购油加油",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "32",
				li_type : "fixed",
			}, {
				title : "维修保养",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "33",
				li_type : "fixed",
			}, {
				title : "资产台账",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "34",
				li_type : "fixed",
			}
		]
	}, {
		id : "b_p",
		title : "招标与采购",
		submenu : [{
				title : "招标文件",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "35",
				li_type : "fixed",
			}, {
				title : "议标审批",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "36",
				li_type : "fixed",
			}, {
				title : "招标公告",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "37",
				li_type : "fixed",
			}, {
				title : "资格审查",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "38",
				li_type : "fixed",
			}, {
				title : "考察评价（如需）",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "39",
				li_type : "fixed",
			}, {
				title : "文件领取",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "40",
				li_type : "fixed",
			}, {
				title : "投标报价",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "41",
				li_type : "fixed",
			}, {
				title : "开评定标",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "42",
				li_type : "fixed",
			}, {
				title : "价格审定",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "43",
				li_type : "fixed",
			}, {
				title : "中标通知",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "44",
				li_type : "fixed",
			}
		]
	}, {
		id : "c_b",
		title : "合作与商务",
		submenu : [{
				title : "合同签订",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "45",
				li_type : "fixed",
			}, {
				title : "合同交底",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "46",
				li_type : "fixed",
			}, {
				title : "合同变更",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "47",
				li_type : "fixed",
			}, {
				title : "合同台帐",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "48",
				li_type : "fixed",
			}, {
				title : "供方名册",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "49",
				li_type : "fixed",
			}
		]
	}, {
		id : "p_t",
		title : "生产与技术图纸登记",
		submenu : [{
				title : "图纸会审",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "50",
				li_type : "fixed",
			}, {
				title : "施组编制",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "51",
				li_type : "fixed",
			}, {
				title : "方案编制",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "52",
				li_type : "fixed",
			}, {
				title : "技术交底",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "53",
				li_type : "fixed",
			}, {
				title : "工程变更",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "54",
				li_type : "fixed",
			}, {
				title : "技术核定",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "55",
				li_type : "fixed",
			}, {
				title : "劳务需求计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "56",
				li_type : "fixed",
			}, {
				title : "物资需求计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "57",
				li_type : "fixed",
			}, {
				title : "物资验收计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "58",
				li_type : "fixed",
			}, {
				title : "机械需求计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "59",
				li_type : "fixed",
			}, {
				title : "监测配备计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "60",
				li_type : "fixed",
			}, {
				title : "班组作业组织卡",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "60",
				li_type : "fixed",
			}, {
				title : "物料吊运组织卡",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "62",
				li_type : "fixed",
			}, {
				title : "劳动力配置计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "63",
				li_type : "fixed",
			}, {
				title : "劳动力调配计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "64",
				li_type : "fixed",
			}, {
				title : "实际进度与总进度计划对比",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "65",
				li_type : "fixed",
			}, {
				title : "实际完成与月进度计划对比",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "66",
				li_type : "fixed",
			}, {
				title : "质量通病预控识别",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "67",
				li_type : "fixed",
			}, {
				title : "工程质量巡检控制",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "68",
				li_type : "fixed",
			}, {
				title : "危险源预控识别",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "69",
				li_type : "fixed",
			}, {
				title : "安全巡检控制表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "70",
				li_type : "fixed",
			}, {
				title : "安全工伤事故快报",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "71",
				li_type : "fixed",
			}, {
				title : "安全未遂事故登记",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "72",
				li_type : "fixed",
			}, {
				title : "环境因素预控识别",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "73",
				li_type : "fixed",
			}, {
				title : "环境影响过程巡检",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "74",
				li_type : "fixed",
			}, {
				title : "监测装置检定计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "75",
				li_type : "fixed",
			}, {
				title : "监测装置使用状态",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "76",
				li_type : "fixed",
			}, {
				title : "施工日志",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "77",
				li_type : "fixed",
			}, {
				title : "项目月报",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "78",
				li_type : "fixed",
			}, {
				title : "技术文件管理台账",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "79",
				li_type : "fixed",
			}, {
				title : "方案动态管理台账",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "80",
				li_type : "fixed",
			}, {
				title : "监测装置管理台帐",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "81",
				li_type : "fixed",
			}
		]
	}, {
		id : "s_m",
		title : "分包与机械",
		submenu : [{
				title : "分包进场计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "82",
				li_type : "fixed",
			}, {
				title : "机械进场计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "83",
				li_type : "fixed",
			}, {
				title : "证件证照验证",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "84",
				li_type : "fixed",
			}, {
				title : "分包进场设备清单",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "85",
				li_type : "fixed",
			}, {
				title : "机械进场验收记录",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "86",
				li_type : "fixed",
			}, {
				title : "机械设备三定登记",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "87",
				li_type : "fixed",
			}, {
				title : "施工机械设备台帐",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "88",
				li_type : "fixed",
			}, {
				title : "分包人员注册",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "89",
				li_type : "fixed",
			}, {
				title : "分包人员造册",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "90",
				li_type : "fixed",
			}, {
				title : "分包进场教育",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "91",
				li_type : "fixed",
			}, {
				title : "劳务工人出勤",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "92",
				li_type : "fixed",
			}, {
				title : "劳务工人变动",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "93",
				li_type : "fixed",
			}, {
				title : "劳务用工统计",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "94",
				li_type : "fixed",
			}, {
				title : "工人工资发放记录",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "95",
				li_type : "fixed",
			}, {
				title : "机械设备维保计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "96",
				li_type : "fixed",
			}, {
				title : "机械设备运转记录",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "97",
				li_type : "fixed",
			}, {
				title : "机械设备检查记录",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "98",
				li_type : "fixed",
			}, {
				title : "机械设备保养记录",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "99",
				li_type : "fixed",
			}, {
				title : "机械设备维修记录",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "100",
				li_type : "fixed",
			}, {
				title : "机械设备事故报告",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "101",
				li_type : "fixed",
			}, {
				title : "分包日常管理记录",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "102",
				li_type : "fixed",
			}, {
				title : "分包试用记录",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "103",
				li_type : "fixed",
			}, {
				title : "分(供)方评价汇总",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "104",
				li_type : "fixed",
			}
		]
	}, {
		id : "m_e",
		title : "材料与设备",
		submenu : [{
				title : "物资使用计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "105",
				li_type : "fixed",
			}, {
				title : "零星采购询价",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "106",
				li_type : "fixed",
			}, {
				title : "物资调拨凭证",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "107",
				li_type : "fixed",
			}, {
				title : "物资进场筹划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "108",
				li_type : "fixed",
			}, {
				title : "物资进场通知",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "109",
				li_type : "fixed",
			}, {
				title : "物资进场验收",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "110",
				li_type : "fixed",
			}, {
				title : "质量证明登记",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "111",
				li_type : "fixed",
			}, {
				title : "收货单",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "112",
				li_type : "fixed",
			}, {
				title : "入库单",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "113",
				li_type : "fixed",
			}, {
				title : "退（换）货单",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "114",
				li_type : "fixed",
			}, {
				title : "领/退用单",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "115",
				li_type : "fixed",
			}, {
				title : "出/退库单",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "116",
				li_type : "fixed",
			}, {
				title : "物资贮存保管记录",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "117",
				li_type : "fixed",
			}, {
				title : "工具用具借用记录",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "118",
				li_type : "fixed",
			}, {
				title : "物资出入存耗盘点",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "119",
				li_type : "fixed",
			}, {
				title : "物资仓库清点表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "120",
				li_type : "fixed",
			}, {
				title : "物资复试通知单",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "121",
				li_type : "fixed",
			}, {
				title : "物资\构件报验单",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "122",
				li_type : "fixed",
			}, {
				title : "样品\样本送审表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "123",
				li_type : "fixed",
			}, {
				title : "不合格品处置记录",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "124",
				li_type : "fixed",
			}, {
				title : "物资进场报验台帐",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "125",
				li_type : "fixed",
			}, {
				title : "废旧物资处置申请",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "126",
				li_type : "fixed",
			}, {
				title : "废旧物资处置台账",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "127",
				li_type : "fixed",
			}, {
				title : "物资保管明细帐表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "128",
				li_type : "fixed",
			}, {
				title : "物资采购统计报表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "129",
				li_type : "fixed",
			}, {
				title : "物资耗用统计报表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "130",
				li_type : "fixed",
			}, {
				title : "物资领用统计报表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "131",
				li_type : "fixed",
			}, {
				title : "物资损耗统计报表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "132",
				li_type : "fixed",
			}
		]
	}, {
		id : "e_m",
		title : "试验与资料",
		submenu : [{
				title : "试验检测计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "133",
				li_type : "fixed",
			}, {
				title : "取样送检通知",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "134",
				li_type : "fixed",
			}, {
				title : "试验试件登记",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "135",
				li_type : "fixed",
			}, {
				title : "温度湿度记录",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "136",
				li_type : "fixed",
			}, {
				title : "试验委托书",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "137",
				li_type : "fixed",
			}, {
				title : "试验检测报告",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "138",
				li_type : "fixed",
			}, {
				title : "工程资料",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "139",
				li_type : "fixed",
			}, {
				title : "资料处理流程",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "140",
				li_type : "fixed",
			}, {
				title : "工程资料检查",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "141",
				li_type : "fixed",
			}
		]
	}, {
		id : "b_c",
		title : "预算与结算",
		submenu : [{
				title : "工程量计算书",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "142",
				li_type : "fixed",
			}, {
				title : "工程量统计表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "143",
				li_type : "fixed",
			}, {
				title : "经济与技术指标",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "144",
				li_type : "fixed",
			}, {
				title : "工程造价预算书",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "145",
				li_type : "fixed",
			}, {
				title : "工程造价汇总",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "146",
				li_type : "fixed",
			}, {
				title : "工程造价分析",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "147",
				li_type : "fixed",
			}, {
				title : "分包工程完工单",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "148",
				li_type : "fixed",
			}, {
				title : "工程结算巡签单",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "149",
				li_type : "fixed",
			}, {
				title : "分包工程造价结算书",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "150",
				li_type : "fixed",
			}, {
				title : "分供结算评审表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "151",
				li_type : "fixed",
			}, {
				title : "分包工程结算单",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "152",
				li_type : "fixed",
			}, {
				title : "物资采购结算单",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "153",
				li_type : "fixed",
			}, {
				title : "设备租赁结算单",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "154",
				li_type : "fixed",
			}, {
				title : "工程结算计价方案",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "155",
				li_type : "fixed",
			}, {
				title : "工程结算书",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "156",
				li_type : "fixed",
			}
		]
	}, {
		id : "v_c",
		title : "签证与索赔",
		submenu : [{
				title : "现场签证表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "157",
				li_type : "fixed",
			}, {
				title : "工程变更费用报审",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "158",
				li_type : "fixed",
			}, {
				title : "费用索赔申请核准",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "159",
				li_type : "fixed",
			}, {
				title : "变更索赔签证收支记录",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "160",
				li_type : "fixed",
			}
		]
	}, {
		id : "c_p",
		title : "成本与利润",
		submenu : [{
				id : "",
				title : "成本责任",
				submenu : [{
						title : "工程成本责任表",
						id : "",
						submenu : [],
						excelType : "151",
						parent_id : "false",
						li_id : "161",
						li_type : "fixed",
						template_tab : [{
								name : "目标责任表",
								tableType : "151_002",
								template : 'JZ/JZ-01-151/sheet002.htm'
							}
						]
					}
				]
			}, {
				id : "",
				title : "成本测算",
				submenu : [{
						title : "工程成本测算表",
						id : "",
						submenu : [],
						excelType : "152",
						parent_id : "false",
						li_id : "162",
						li_type : "fixed",
						template_tab : [{
								name : "工程项目 ",
								tableType : "152_002",
								template : 'JZ/JZ-02-152/sheet002.htm'
							}, {
								name : "单项工程",
								tableType : "152_003",
								template : 'JZ/JZ-02-152/sheet003.htm'
							}, {
								name : "1-1分包工程测算表",
								tableType : "152_004",
								template : 'JZ/JZ-02-152/sheet004.htm'
							}, {
								name : "1-2材料设备测算表",
								tableType : "152_005",
								template : 'JZ/JZ-02-152/sheet005.htm'
							}, {
								name : "1-3机械与材料租赁测算表",
								tableType : "152_006",
								template : 'JZ/JZ-02-152/sheet006.htm'
							}, {
								name : "1-4管理费及其它测算表",
								tableType : "152_007",
								template : 'JZ/JZ-02-152/sheet007.htm'
							}
						]
					}, {
						title : "工程成本调整表",
						id : "",
						submenu : [],
						excelType : "153",
						parent_id : "false",
						li_id : "163",
						li_type : "fixed",
						template_tab : [{
								name : "工程成本调整表",
								tableType : "153_002",
								template : 'JZ/JZ-03-153/sheet002.htm'
							}
						]
					}
				]
			}, {
				id : "",
				title : "成本计划",
				submenu : [{
						title : "工程成本计划表",
						id : "152_003",
						submenu : [],
						excelType : "154",
						parent_id : "false",
						li_id : "164",
						li_type : "fixed",
						template_tab : [{
								name : "工程项目 ",
								tableType : "154_002",
								template : 'JZ/JZ-04-154/sheet002.htm'
							}, {
								name : "单项工程 ",
								tableType : "154_003",
								template : 'JZ/JZ-04-154/sheet003.htm'
							}
						],

					}
				]
			}, {
				id : "",
				title : "成本控制",
				submenu : [{
						title : "工程成本控制表",
						id : "",
						submenu : [],
						excelType : "155",
						template_tab : [{
								name : "工程项目 ",
								tableType : "155_002",
								template : 'JZ/JZ-05-155/sheet002.htm'
							}, {
								name : "单项工程 ",
								tableType : "155_003",
								template : 'JZ/JZ-05-155/sheet003.htm'
							}, {
								name : "租赁及摊销计算表",
								tableType : "155_004",
								template : 'JZ/JZ-05-155/sheet004.htm'
							}, {
								name : "管理费及其它计算表",
								tableType : "155_005",
								template : 'JZ/JZ-05-155/sheet005.htm'
							}
						],
						parent_id : "false",
						li_id : "165",
						li_type : "fixed",
					}, {
						title : "物资成本控制表",
						id : "",
						submenu : [],
						excelType : "156",
						template_tab : [{
								name : "过程控制表 ",
								tableType : "156_002",
								template : 'JZ/JZ-06-156/sheet002.htm'
							}
						],
						parent_id : "false",
						li_id : "166",
						li_type : "fixed",
					}
				]
			}, {
				id : "",
				title : "成本核算",
				submenu : [{
						title : "工程成本核算表",
						id : "",
						submenu : [],
						excelType : "157",
						template_tab : [{
								name : "工程项目 ",
								tableType : "157_002",
								template : 'JZ/JZ-07-157/sheet002.htm'
							}, {
								name : "单项工程 ",
								tableType : "157_003",
								template : 'JZ/JZ-07-157/sheet003.htm'
							}
						],
						parent_id : "false",
						li_id : "167",
						li_type : "fixed",
					}, {
						title : "月度工程成本确认",
						id : "",
						submenu : [],
						excelType : "158",
						template_tab : [{
								name : "工程成本确认单 ",
								tableType : "158_002",
								template : 'JZ/JZ-08-158/sheet002.htm'
							}, {
								name : "附件1—物资成本确认单",
								tableType : "158_003",
								template : 'JZ/JZ-08-158/sheet003.htm'
							}, {
								name : "附件2—租赁成本确认单",
								tableType : "158_004",
								template : 'JZ/JZ-08-158/sheet004.htm'
							}
						],
						parent_id : "false",
						li_id : "168",
						li_type : "fixed",
					}
				]
			}, {
				id : "",
				title : "成本分析",
				submenu : [{
						title : "工程成本综合分析",
						id : "",
						submenu : [],
						excelType : "159",
						template_tab : [{
								name : "综合统计",
								tableType : "159_002",
								template : 'JZ/JZ-09-159/sheet002.htm'
							}],
						parent_id : "false",
						li_id : "169",
						li_type : "fixed",
					}, {
						title : "工程成本综合分析",
						id : "",
						submenu : [],
						excelType : "160",
						template_tab : [{
								name : "工程项目",
								tableType : "160_002",
								template : 'JZ/JZ-10-160/sheet002.htm'
							}, {
								name : "单项工程",
								tableType : "160_003",
								template : 'JZ/JZ-10-160/sheet003.htm'
							}
						],
						parent_id : "false",
						li_id : "169-2",
						li_type : "fixed",
					}, {
						title : "主要物资成本分析",
						id : "",
						submenu : [],
						excelType : "161",
						template_tab : [{
								name : "汇总统计",
								tableType : "161_002",
								template : 'JZ/JZ-11-161/sheet002.htm'
							}, {
								name : "月度统计",
								tableType : "161_003",
								template : 'JZ/JZ-11-161/sheet003.htm'
							}
						],
						parent_id : "false",
						li_id : "170",
						li_type : "fixed",
					}
				]
			}, {
				id : "",
				title : "利润预测",
				submenu : [{
						title : "项目利润预测表",
						id : "",
						submenu : [],
						excelType : "162",
						template_tab : [{
								name : "成本利润分析表",
								tableType : "162_002",
								template : 'JZ/JZ-12-162/sheet002.htm'
							}
						],
						parent_id : "false",
						li_id : "171",
						li_type : "fixed",
					}
				]
			}

		]
	}, {
		id : "o_m",
		title : "产值与资金",
		submenu : [{
				title : "年度资金收支计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "181",
				li_type : "fixed",
			}, {
				title : "月度资金支付计划",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "182",
				li_type : "fixed",
			}, {
				title : "工程进度款报审",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "183",
				li_type : "fixed",
			}, {
				title : "工程款支付申请",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "184",
				li_type : "fixed",
			}, {
				title : "产值与资金回收统计",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "185",
				li_type : "fixed",
			}, {
				title : "工程形象进度确认单",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "186",
				li_type : "fixed",
			}, {
				title : "分供商付款支付表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "187",
				li_type : "fixed",
			}, {
				title : "分供商产值与支付统计",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "188",
				li_type : "fixed",
			}, {
				title : "分包代扣\罚款记录",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "189",
				li_type : "fixed",
			}
		]
	}, {
		id : "e_e",
		title : "考核与激励",
		submenu : [{
				title : "员工考核与评价表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "190",
				li_type : "fixed",
			}, {
				title : "员工奖励分配表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "191",
				li_type : "fixed",
			}
		]
	}, {
		id : "c_m",
		title : "竣工与维保",
		submenu : [{
				title : "项目解体策划书",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "192",
				li_type : "fixed",
			}, {
				title : "项目延期解体申请表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "193",
				li_type : "fixed",
			}, {
				title : "项目解体工作完成情况会签",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "194",
				li_type : "fixed",
			}, {
				title : "项目移交申请表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "195",
				li_type : "fixed",
			}, {
				title : "项目移交汇签表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "196",
				li_type : "fixed",
			}, {
				title : "工程技术资料",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "197",
				li_type : "fixed",
			}, {
				title : "管理资料移交",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "198",
				li_type : "fixed",
			}, {
				title : "项目完工总结报告",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "199",
				li_type : "fixed",
			}, {
				title : "工程回访计划表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "200",
				li_type : "fixed",
			}, {
				title : "工程回访记录表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "201",
				li_type : "fixed",
			}, {
				title : "用户满意调查表",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "202",
				li_type : "fixed",
			}, {
				title : "顾客投诉记录",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "203",
				li_type : "fixed",
			}, {
				title : "工程维修记录",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "204",
				li_type : "fixed",
			}, {
				title : "工程保修期满通知",
				id : "",
				submenu : [],
				excelType : "",
				template_tab : [],
				parent_id : "false",
				li_id : "205",
				li_type : "fixed",
			}
		]
	}
]
