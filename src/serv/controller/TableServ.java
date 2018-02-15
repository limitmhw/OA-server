package serv.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.itcast.mybatis.mapper.UserMapper;
import cn.itcast.mybatis.po.User;

@Controller
@RequestMapping("/excel")
public class TableServ {
	public List<String> getTableForExcel(String tem_excelType) {
		List<String> subTable = new ArrayList<String>();
		switch (tem_excelType) {
		case "151": {
			System.out.println("151");
			subTable.add("151_002");
			break;
		}
		case "152": {
			System.out.println("152");
			subTable.add("152_002");
			subTable.add("152_003");
			subTable.add("152_004");
			subTable.add("152_005");
			subTable.add("152_006");
			subTable.add("152_007");
			break;
		}
		case "153": {
			System.out.println("153");
			subTable.add("153_002");
			break;
		}
		case "154": {
			System.out.println("154");
			subTable.add("154_002");
			subTable.add("154_003");
			break;
		}
		case "155": {
			System.out.println("155");
			subTable.add("155_002");
			subTable.add("155_003");
			subTable.add("155_004");
			subTable.add("155_005");
			break;
		}
		case "156": {
			System.out.println("156");
			subTable.add("156_002");
			break;
		}
		case "157": {
			System.out.println("157");
			subTable.add("157_002");
			subTable.add("157_003");
			break;
		}
		case "158": {
			System.out.println("158");
			subTable.add("158_002");
			subTable.add("158_003");
			subTable.add("158_004");
			break;
		}
		case "159": {
			System.out.println("159");
			subTable.add("159_002");
			break;
		}
		case "160": {
			System.out.println("160");
			subTable.add("160_002");
			subTable.add("160_003");
			break;
		}
		case "161": {
			System.out.println("161");
			subTable.add("161_002");
			subTable.add("161_003");
			break;
		}
		case "162": {
			System.out.println("162");
			subTable.add("162_002");
			break;
		}
		}
		return subTable;
	}

	public SqlSession getSession() throws IOException{
		String res = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(res);
		// 创建SqlSessionFcatory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession;
	}

	public void createExcelSubTable(int excel_id, String excelType)
			throws Exception {
		List<String> subTable = getTableForExcel(excelType);
		for (String i : subTable) {
			SqlSession sqlSession = getSession();
			// 创建Usermapper对象，mybatis自动生成mapper代理对象
			WtableMapper mapper = sqlSession.getMapper(WtableMapper.class);
			Wtable tt = new Wtable();
			tt.setTabletype(i);
			tt.setExcelId(excel_id);
			mapper.insert(tt);
			sqlSession.close();
		}
	}

	public void deleteExcelSubTable(int excel_id) throws Exception {
		// String excelType

	}



	@RequestMapping("/createExcel")
	public void table(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// http://localhost:8080/simpleMVC/excel/createExcel.action?excelType=xxxx&gong_cheng_id=1222
		String pexcelType = request.getParameter("excelType");
		String pgong_cheng_id = request.getParameter("gong_cheng_id");
		// /////////////////////////////////
		SqlSession sqlSession = getSession();
		// 创建Usermapper对象，mybatis自动生成mapper代理对象
		WexcelMapper mapper = sqlSession.getMapper(WexcelMapper.class);
		Wexcel record = new Wexcel();
		record.setExceltype(pexcelType);
		record.setGongChengId(Integer.parseInt(pgong_cheng_id));
		record.setName("new(" + String.valueOf(mapper.countByExample(null) + 1)
				+ ")");
		java.sql.Date createDate = new java.sql.Date(
				new java.util.Date().getTime());
		record.setCreatedate(createDate);

		mapper.insert(record);
		sqlSession.close();
		createExcelSubTable(record.getId(), pexcelType);
		return;
	}



	@RequestMapping("deleteExcel")
	public void table3(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String pexcel_id= request.getParameter("excel_id");
		SqlSession sqlSession = getSession();
		WexcelMapper mapper = sqlSession.getMapper(WexcelMapper.class);
		mapper.deleteByPrimaryKey(Integer.parseInt(pexcel_id));
		sqlSession.close();
		deleteExcelSubTable(Integer.parseInt(pexcel_id));
		return;
	}

	@RequestMapping("getExcelList")
	public void table4(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String pexcelType = request.getParameter("excelType");
		String pgong_cheng_id = request.getParameter("gong_cheng_id");

		SqlSession sqlSession = getSession();
		WexcelMapper mapper = sqlSession.getMapper(WexcelMapper.class);
		WexcelExample ee=new WexcelExample();
		ee.setOrderByClause("createdate");
		ee.or().andExceltypeEqualTo(pexcelType).andGongChengIdEqualTo(Integer.parseInt(pgong_cheng_id));	

		List<Wexcel> lee=mapper.selectByExample(ee);
		sqlSession.close();
		String ss="[";
		for(Wexcel it : lee) {
			ss+="{"
					+"\"excel_id\":\""+String.valueOf(it.getId())+"\","
					+"\"title\":\""+it.getName()+"\","
					+"\"excelType\":\""+it.getExceltype()+"\","
					+"\"gong_cheng_id\":\""+it.getGongChengId()+"\""
					+"},";
		}
		ss+="]";


		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ss);
		return;
	}

	@RequestMapping("getTableIdList")
	public void table6(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String pexcel_id= request.getParameter("excel_id");
		SqlSession sqlSession = getSession();
		WtableMapper mapper = sqlSession.getMapper(WtableMapper.class);
		WtableExample ee=new WtableExample();
		ee.or().andExcelIdEqualTo(Integer.parseInt(pexcel_id));	
		List<Wtable>  lee=mapper.selectByExample(ee);
		sqlSession.close();
		String ss="[";
		for(Wtable it:lee){
			ss+="{"
					+"\"table_id\":\""+String.valueOf(it.getId())+"\","
					+"\"tableType\":\""+it.getTabletype()+"\","
					+"},";
		}
		ss+="]";


		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ss);
		return;
	}

	@RequestMapping("getTable")
	public void table7(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String ptable_id= request.getParameter("id");
		SqlSession sqlSession = getSession();
		WtableMapper mapper = sqlSession.getMapper(WtableMapper.class);
		Wtable tt=mapper.selectByPrimaryKey(Integer.parseInt(ptable_id));
		String ptableType=tt.getTabletype();














		switch(ptableType){
		case "151_002":{
			System.out.println("151002");
			T151002Mapper t_mapper = sqlSession.getMapper(T151002Mapper.class);
			T151002Example ee=new T151002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T151002> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T151002 it : lee) {
				String tr_data="["	
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;
		}
		case "152_002":{
			System.out.println("152002");
			T152002Mapper t_mapper = sqlSession.getMapper(T152002Mapper.class);
			T152002Example ee=new T152002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T152002> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T152002 it : lee) {
				String tr_data="["
						+"\""+String.valueOf(it.getBianMa())+"\","
						+"\""+String.valueOf(it.getChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getNaRongFanWeiMiaoShu())+"\","
						+"\""+String.valueOf(it.getChuShiYuSuanChengBen())+"\","
						+"\""+String.valueOf(it.getDiaoZhengHouYuSuanChengBen())+"\","
						+"\""+String.valueOf(it.getBenQiShu())+"\","
						+"\""+String.valueOf(it.getLeiJiShu())+"\","
						+"\""+String.valueOf(it.getBeiZhu())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;
		}
		case "152_004":{
			System.out.println("152004");
			T152004Mapper t_mapper = sqlSession.getMapper(T152004Mapper.class);
			T152004Example ee=new T152004Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T152004> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T152004 it : lee) {
				String tr_data="["
						+"\""+String.valueOf(it.getChengBenBianMa())+"\","
						+"\""+String.valueOf(it.getChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getNaRongFanWeiMiaoShu())+"\","
						+"\""+String.valueOf(it.getDanJia())+"\","
						+"\""+String.valueOf(it.getJiSuanJiShu())+"\","
						+"\""+String.valueOf(it.getYuSuanChengBen())+"\","
						+"\""+String.valueOf(it.getBeiZhu())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}


		case "152_005":{
			System.out.println("152005");
			T152005Mapper t_mapper = sqlSession.getMapper(T152005Mapper.class);
			T152005Example ee=new T152005Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T152005> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T152005 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getBianHao())+"\","
						+"\""+String.valueOf(it.getCaiLiaoMingChen())+"\","
						+"\""+String.valueOf(it.getGuiGeXingHao())+"\","
						+"\""+String.valueOf(it.getDanWei())+"\","
						+"\""+String.valueOf(it.getShuLiang())+"\","
						+"\""+String.valueOf(it.getTouBiaoDanJia())+"\","
						+"\""+String.valueOf(it.getTouBiaoHeJi())+"\","
						+"\""+String.valueOf(it.getCeSuanDanJia())+"\","
						+"\""+String.valueOf(it.getCeSuanHeJi())+"\","
						+"\""+String.valueOf(it.getBeiZhu())+"\","


					+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}
		case "152_006":{
			System.out.println("152006");
			T152006Mapper t_mapper = sqlSession.getMapper(T152006Mapper.class);
			T152006Example ee=new T152006Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T152006> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T152006 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getChengBenBianMa())+"\","
						+"\""+String.valueOf(it.getChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getNaRongFanWeiMiaoShu())+"\","
						+"\""+String.valueOf(it.getDanJia())+"\","
						+"\""+String.valueOf(it.getJiSuanJiShu())+"\","
						+"\""+String.valueOf(it.getYuSuanChengBen())+"\","
						+"\""+String.valueOf(it.getBeiZhu())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}
		case "152_007":{
			System.out.println("152007");
			T152007Mapper t_mapper = sqlSession.getMapper(T152007Mapper.class);
			T152007Example ee=new T152007Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T152007> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T152007 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getChengBenBianMa())+"\","
						+"\""+String.valueOf(it.getChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getNaRongFanWeiMiaoShu())+"\","
						+"\""+String.valueOf(it.getDanJia())+"\","
						+"\""+String.valueOf(it.getJiSuanJiShu())+"\","
						+"\""+String.valueOf(it.getYuSuanChengBen())+"\","
						+"\""+String.valueOf(it.getBeiZhu())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}
		case "153_002":{
			System.out.println("153002");
			T153002Mapper t_mapper = sqlSession.getMapper(T153002Mapper.class);
			T153002Example ee=new T153002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T153002> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T153002 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getChengBenBianMa())+"\","
						+"\""+String.valueOf(it.getChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getBenQiShuDiaoZhengE())+"\","
						+"\""+String.valueOf(it.getBenQiShuShuLiang())+"\","
						+"\""+String.valueOf(it.getBenQiShuJiaGe())+"\","
						+"\""+String.valueOf(it.getBenQiShuQiTa())+"\","
						+"\""+String.valueOf(it.getLeiJiShuDiaoZhengE())+"\","
						+"\""+String.valueOf(it.getLeiJiShuShuLiang())+"\","
						+"\""+String.valueOf(it.getLeiJiShuJiaGe())+"\","
						+"\""+String.valueOf(it.getLeiJiShuQiTa())+"\","
						+"\""+String.valueOf(it.getBeiZhu())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}
		case "154_002":{
			System.out.println("154002");
			T154002Mapper t_mapper = sqlSession.getMapper(T154002Mapper.class);
			T154002Example ee=new T154002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T154002> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T154002 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getChengBenBianMa())+"\","
						+"\""+String.valueOf(it.getChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getNaRongFanWeiMiaoShu())+"\","
						+"\""+String.valueOf(it.getYuSuanChengBen())+"\","
						+"\""+String.valueOf(it.getJiHuaChengBen())+"\","
						+"\""+String.valueOf(it.getChengBenJiangDiLv())+"\","
						+"\""+String.valueOf(it.getBeiZhu())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}

		case "155_002":{
			System.out.println("155002");
			T155002Mapper t_mapper = sqlSession.getMapper(T155002Mapper.class);
			T155002Example ee=new T155002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T155002> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T155002 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getBianMa())+"\","
						+"\""+String.valueOf(it.getChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getNaRongFanWeiMiaoShu())+"\","
						+"\""+String.valueOf(it.getYuSuanChengBen())+"\","
						+"\""+String.valueOf(it.getJiHuaChengBen())+"\","
						+"\""+String.valueOf(it.getShiJiYuJiChengBen())+"\","
						+"\""+String.valueOf(it.getYuSuanShiJiJinE())+"\","
						+"\""+String.valueOf(it.getYuSuanShiJiBiLi())+"\","
						+"\""+String.valueOf(it.getJiHuaShiJiJinE())+"\","
						+"\""+String.valueOf(it.getJiHuaShiJiBiLi())+"\","
						+"\""+String.valueOf(it.getZhuangTai())+"\","

					+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}

		case "155_004":{
			System.out.println("155004");
			T155004Mapper t_mapper = sqlSession.getMapper(T155004Mapper.class);
			T155004Example ee=new T155004Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T155004> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T155004 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getChengBenBianMa())+"\","
						+"\""+String.valueOf(it.getChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getYuSuanChengBen())+"\","
						+"\""+String.valueOf(it.getZhiQiMoYiFaShengChengBen())+"\","
						+"\""+String.valueOf(it.getZuLinShiJianZongYuSuanShiJian())+"\","
						+"\""+String.valueOf(it.getZuLinShiJianYiFaShengShiJian())+"\","
						+"\""+String.valueOf(it.getZuLinShiJianYuSuanShengYuShiJian())+"\","
						+"\""+String.valueOf(it.getZuLinShiJianHuaiXuYaoShiJian())+"\","
						+"\""+String.valueOf(it.getShengYuChengBenYuKongShuYueDuYuKongShu())+"\","
						+"\""+String.valueOf(it.getShengYuChengBenYuKongShuZongYuKongShu())+"\","
						+"\""+String.valueOf(it.getShengYuChengBenYuCeShuYueDuYuCeShu())+"\","
						+"\""+String.valueOf(it.getShengYuChengBenYuCeShuZongYuCeShu())+"\","
						+"\""+String.valueOf(it.getShengYuChengBenYuCeShuJieChao())+"\","
						+"\""+String.valueOf(it.getShiJiYuJiChengBen())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}
		case "155_005":{



			System.out.println("155005");
			T155005Mapper t_mapper = sqlSession.getMapper(T155005Mapper.class);
			T155005Example ee=new T155005Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T155005> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T155005 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getChengBenBianHao())+"\","
						+"\""+String.valueOf(it.getChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getYuSuanChengBen())+"\","
						+"\""+String.valueOf(it.getZhiQiMoYiFaShengChengBen())+"\","
						+"\""+String.valueOf(it.getChengBenShiJianZongYuSuanShiJian())+"\","
						+"\""+String.valueOf(it.getChengBenShiJianYiFaShengShiJian())+"\","
						+"\""+String.valueOf(it.getChengBenShiJianYuSuanShengYuShiJian())+"\","
						+"\""+String.valueOf(it.getChengBenShiJianHuaiXuYaoShiJian())+"\","
						+"\""+String.valueOf(it.getShengYuChengBenYuKongShuYueDuYuKongShu())+"\","
						+"\""+String.valueOf(it.getShengYuChengBenYuKongShuZongYuKongShu())+"\","
						+"\""+String.valueOf(it.getShengYuChengBenYuCeShuYueDuYuCeShu())+"\","
						+"\""+String.valueOf(it.getShengYuChengBenYuCeShuZongYuCeShu())+"\","
						+"\""+String.valueOf(it.getShengYuChengBenYuCeShuJieChao())+"\","
						+"\""+String.valueOf(it.getShiJiYuJiChengBen())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}
		case "156_002":{
			System.out.println("156002");
			T156002Mapper t_mapper = sqlSession.getMapper(T156002Mapper.class);
			T156002Example ee=new T156002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T156002> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T156002 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getXuHao())+"\","
						+"\""+String.valueOf(it.getWuZiMingChen())+"\","
						+"\""+String.valueOf(it.getGuiGeXingHao())+"\","
						+"\""+String.valueOf(it.getDanWei())+"\","
						+"\""+String.valueOf(it.getZongYuSuanShuShuLiang())+"\","
						+"\""+String.valueOf(it.getZongYuSuanShuDanJia())+"\","
						+"\""+String.valueOf(it.getZongYuSuanShuJinE())+"\","
						+"\""+String.valueOf(it.getYiWanCaiGouShuShuLiang())+"\","
						+"\""+String.valueOf(it.getYiWanCaiGouShuJinE())+"\","
						+"\""+String.valueOf(it.getWeiWanYuKongShuShengYuLiang())+"\","
						+"\""+String.valueOf(it.getWeiWanYuKongShuYuCeDanJia())+"\","
						+"\""+String.valueOf(it.getWeiWanYuKongShuYuKongDanJia())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}
		case "157_002":{
			System.out.println("157002");
			T157002Mapper t_mapper = sqlSession.getMapper(T157002Mapper.class);
			T157002Example ee=new T157002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T157002> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T157002 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getBianMa())+"\","
						+"\""+String.valueOf(it.getChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getBenQiShuYuSuanChengBen())+"\","
						+"\""+String.valueOf(it.getBenQiShuShiJiChengBen())+"\","
						+"\""+String.valueOf(it.getBenQiShuJiangDiE())+"\","
						+"\""+String.valueOf(it.getBenQiShuJiangDiLv())+"\","
						+"\""+String.valueOf(it.getLeiJiShuYuSuanChengBen())+"\","
						+"\""+String.valueOf(it.getLeiJiShuShiJiChengBen())+"\","
						+"\""+String.valueOf(it.getLeiJiShuJiangDiE())+"\","
						+"\""+String.valueOf(it.getLeiJiShuJiangDiLv())+"\","
						+"\""+String.valueOf(it.getBeiZhu())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}

		case "158_002":{
			System.out.println("158002");
			T158002Mapper t_mapper = sqlSession.getMapper(T158002Mapper.class);
			T158002Example ee=new T158002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T158002> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T158002 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getChengBenBianMa())+"\","
						+"\""+String.valueOf(it.getChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getNaRongFanWeiMiaoShu())+"\","
						+"\""+String.valueOf(it.getYuSuanChengBen())+"\","
						+"\""+String.valueOf(it.getShiJiChengBen())+"\","
						+"\""+String.valueOf(it.getBeiZhu())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}
		case "158_003":{
			System.out.println("158003");
			T158003Mapper t_mapper = sqlSession.getMapper(T158003Mapper.class);
			T158003Example ee=new T158003Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T158003> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T158003 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getXuHao())+"\","
						+"\""+String.valueOf(it.getWuZiMingChen())+"\","
						+"\""+String.valueOf(it.getGuiGeXingHao())+"\","
						+"\""+String.valueOf(it.getDanWei())+"\","
						+"\""+String.valueOf(it.getBenYueYuSuanChengBenYuSuanDanJia())+"\","
						+"\""+String.valueOf(it.getBenYueYuSuanChengBenYuSuanYongLiang())+"\","
						+"\""+String.valueOf(it.getBenYueYuSuanChengBenHeJia())+"\","
						+"\""+String.valueOf(it.getSunHaoLv())+"\","
						+"\""+String.valueOf(it.getBenYueShiJiChengBenCaiGouDanJia())+"\","
						+"\""+String.valueOf(it.getBenYueShiJiChengBenShiJiYongLiang())+"\","
						+"\""+String.valueOf(it.getBenYueShiJiChengBenHeJia())+"\","
						+"\""+String.valueOf(it.getSuoShuChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getShiYongBuWei())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}
		case "158_004":{
			System.out.println("158004");
			T158004Mapper t_mapper = sqlSession.getMapper(T158004Mapper.class);
			T158004Example ee=new T158004Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T158004> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T158004 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getXuHao())+"\","
						+"\""+String.valueOf(it.getWuZiMingChen())+"\","
						+"\""+String.valueOf(it.getGuiGeXingHao())+"\","
						+"\""+String.valueOf(it.getZuLinDanJiaDanWei())+"\","
						+"\""+String.valueOf(it.getZuLinDanJiaYuSuanShu())+"\","
						+"\""+String.valueOf(it.getZuLinDanJiaShiJiShu())+"\","
						+"\""+String.valueOf(it.getZuLinShuLiangDanWei())+"\","
						+"\""+String.valueOf(it.getZuLinShuLiangYuSuanShu())+"\","
						+"\""+String.valueOf(it.getZuLinShuLiangYuSuanShu())+"\","
						+"\""+String.valueOf(it.getZuLinShiJianDanWei())+"\","
						+"\""+String.valueOf(it.getZuLinShiJianYuSuanShu())+"\","
						+"\""+String.valueOf(it.getZuLinShiJianShiJiShu())+"\","
						+"\""+String.valueOf(it.getYuSuanChengBenHeJi())+"\","
						+"\""+String.valueOf(it.getShiJiChengBenHeJia())+"\","
						+"\""+String.valueOf(it.getSuoShuChengBenXiangMu())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}
		case "159_002":{
			System.out.println("159002");
			T159002Mapper t_mapper = sqlSession.getMapper(T159002Mapper.class);
			T159002Example ee=new T159002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T159002> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T159002 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getXuHao())+"\","
						+"\""+String.valueOf(it.getJiHuaXiangMu())+"\","
						+"\""+String.valueOf(it.getChengBenJiangDiLvMuBiaoZhi())+"\","
						+"\""+String.valueOf(it.getBenQiShuZongFen())+"\","
						+"\""+String.valueOf(it.getBenQiShuDaBiao())+"\","
						+"\""+String.valueOf(it.getBenQiShuWeiDaBiao())+"\","
						+"\""+String.valueOf(it.getBenQiShuShiJiJiaQuanPingJunZhi())+"\","
						+"\""+String.valueOf(it.getLeiJiShuZongFen())+"\","
						+"\""+String.valueOf(it.getLeiJiShuDaBiao())+"\","
						+"\""+String.valueOf(it.getLeiJiShuWeiDaBiao())+"\","
						+"\""+String.valueOf(it.getLeiJiShuShiJiJiaQuanPingJunZhi())+"\","
						+"\""+String.valueOf(it.getBeiZhu())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}
		case "160_002":{
			System.out.println("160002");
			T160002Mapper t_mapper = sqlSession.getMapper(T160002Mapper.class);
			T160002Example ee=new T160002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T160002> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T160002 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getBianMa())+"\","
						+"\""+String.valueOf(it.getChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getNaRongFanWeiMiaoShu())+"\","
						+"\""+String.valueOf(it.getYuSuanChengBen())+"\","
						+"\""+String.valueOf(it.getGuoChengChengBen())+"\","
						+"\""+String.valueOf(it.getJieChaoJinE())+"\","
						+"\""+String.valueOf(it.getJieChaoBiLi())+"\","
						+"\""+String.valueOf(it.getJieChaoYinSuFenXiShuLiang())+"\","
						+"\""+String.valueOf(it.getJieChaoYinSuFenXiJiaGe())+"\","
						+"\""+String.valueOf(it.getJieChaoYinSuFenXiQiTa())+"\","
						+"\""+String.valueOf(it.getZhuangTai())+"\","


					+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}

		case "161_002":{
			System.out.println("161002");
			T161002Mapper t_mapper = sqlSession.getMapper(T161002Mapper.class);
			T161002Example ee=new T161002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T161002> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T161002 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getXuHao())+"\","
						+"\""+String.valueOf(it.getWuZiMingChen())+"\","
						+"\""+String.valueOf(it.getGuiGeXingHao())+"\","
						+"\""+String.valueOf(it.getDanWei())+"\","
						+"\""+String.valueOf(it.getYuSuanZhiShuLiang())+"\","
						+"\""+String.valueOf(it.getYuSuanZhiDanJia())+"\","
						+"\""+String.valueOf(it.getYuSuanZhiJinE())+"\","
						+"\""+String.valueOf(it.getShiJiZhiShuLiang())+"\","
						+"\""+String.valueOf(it.getShiJiZhiDanJia())+"\","
						+"\""+String.valueOf(it.getShiJiZhiJinE())+"\","
						+"\""+String.valueOf(it.getYingKui())+"\","
						+"\""+String.valueOf(it.getLiangChaYingXiangLiangCha())+"\","
						+"\""+String.valueOf(it.getLiangChaYingXiangJinE())+"\","
						+"\""+String.valueOf(it.getJiaChaYingXiangJiaCha())+"\","
						+"\""+String.valueOf(it.getJiaChaYingXiangJinE())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}
		case "161_003":{
			System.out.println("161003");
			T161003Mapper t_mapper = sqlSession.getMapper(T161003Mapper.class);
			T161003Example ee=new T161003Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T161003> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T161003 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getXuHao())+"\","
						+"\""+String.valueOf(it.getWuZiMingChen())+"\","
						+"\""+String.valueOf(it.getGuiGeXingHao())+"\","
						+"\""+String.valueOf(it.getDanWei())+"\","
						+"\""+String.valueOf(it.getYuSuanZhiShuLiang())+"\","
						+"\""+String.valueOf(it.getYuSuanZhiDanJia())+"\","
						+"\""+String.valueOf(it.getYuSuanZhiJinE())+"\","
						+"\""+String.valueOf(it.getShiJiZhiShuLiang())+"\","
						+"\""+String.valueOf(it.getShiJiZhiDanJia())+"\","
						+"\""+String.valueOf(it.getShiJiZhiJinE())+"\","
						+"\""+String.valueOf(it.getYingKui())+"\","
						+"\""+String.valueOf(it.getLiangChaYingXiangLiangCha())+"\","
						+"\""+String.valueOf(it.getLiangChaYingXiangJinE())+"\","
						+"\""+String.valueOf(it.getLiangChaYingXiangZhanBi())+"\","
						+"\""+String.valueOf(it.getJiaChaYingXiangJiaCha())+"\","
						+"\""+String.valueOf(it.getJiaChaYingXiangJinE())+"\","
						+"\""+String.valueOf(it.getJiaChaYingXiangZhanBi())+"\","

					+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}
		case "162_002":{
			System.out.println("162002");
			T162002Mapper t_mapper = sqlSession.getMapper(T162002Mapper.class);
			T162002Example ee=new T162002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T162002> lee=t_mapper.selectByExample(ee);
			String ss="[";
			for(T162002 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getXuHao())+"\","
						+"\""+String.valueOf(it.getChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getNaRongFanWeiMiaoShu())+"\","
						+"\""+String.valueOf(it.getYuSuanZaoJia())+"\","
						+"\""+String.valueOf(it.getYuSuanChengBen())+"\","
						+"\""+String.valueOf(it.getYingKuiEDu())+"\","
						+"\""+String.valueOf(it.getLiRunDianBiaoJi())+"\","
						+"\""+String.valueOf(it.getBeiZhu())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_data\":"+tr_data+"},";	
			}
			ss+="]";
			ss=ss.replace("},]","}]");
			break;				
		}
		}




		///**************
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write("[]");
		return;
	}

	@RequestMapping("deleteTr")
	public void table8(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write("[]");
		return;
	}

	@RequestMapping("saveTable")
	public void table9(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		//st:8080/simpleMVC/excel//saveTable.action?
		int ptable_id= Integer.parseInt(request.getParameter("id"));
		String ptableType= request.getParameter("tableType");
		String ptableCtx= request.getParameter("tableCtx");


		SqlSession sqlSession = getSession();
		// 创建Usermapper对象，mybatis自动生成mapper代理对象
		JSONObject json;
		Map<String, Object> itemMap;
		json = JSON.parseObject(ptableCtx);  
		itemMap= JSONObject.toJavaObject(json, Map.class);

		switch(ptableType){
		case "151_002":{
			System.out.println("151_002");
			T151002Mapper mapper = sqlSession.getMapper(T151002Mapper.class);

			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T151002 tt=new T151002();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					mapper.insert(tt);
				}
			}
			break;
		}
		case "152_002":{
			T152002Mapper mapper = sqlSession.getMapper(T152002Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T152002 tt=new T152002(); 
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setNaRongFanWeiMiaoShu(trMap.get("2"));
					tt.setChuShiYuSuanChengBen(trMap.get("3"));
					tt.setDiaoZhengHouYuSuanChengBen(trMap.get("4"));
					tt.setBenQiShu(trMap.get("5"));
					tt.setLeiJiShu(trMap.get("6"));
					tt.setBeiZhu(trMap.get("7"));
					mapper.insert(tt);
				}
			}
			break;
		}
		case "152_004":{
			System.out.println("152_004");
			T152004Mapper mapper = sqlSession.getMapper(T152004Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T152004 tt=new T152004();
					tt.setTableId(ptable_id);
					tt.setChengBenBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setNaRongFanWeiMiaoShu(trMap.get("2"));
					tt.setDanJia(trMap.get("3"));
					tt.setJiSuanJiShu(trMap.get("4"));
					tt.setYuSuanChengBen(trMap.get("5"));
					tt.setBeiZhu(trMap.get("6"));
					mapper.insert(tt);
				}
			}
			break;				
		}


		case "152_005":{
			System.out.println("152_005");
			T152005Mapper mapper = sqlSession.getMapper(T152005Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T152005 tt=new T152005();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setBianHao(trMap.get("0"));
					tt.setCaiLiaoMingChen(trMap.get("1"));
					tt.setGuiGeXingHao(trMap.get("2"));
					tt.setDanWei(trMap.get("3"));
					tt.setShuLiang(trMap.get("4"));
					tt.setTouBiaoDanJia(trMap.get("5"));
					tt.setTouBiaoHeJi(trMap.get("6"));
					tt.setCeSuanDanJia(trMap.get("7"));
					tt.setCeSuanHeJi(trMap.get("8"));
					tt.setBeiZhu(trMap.get("9"));


					mapper.insert(tt);
				}
			}
			break;				
		}
		case "152_006":{
			System.out.println("152_006");
			T152006Mapper mapper = sqlSession.getMapper(T152006Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T152006 tt=new T152006();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setChengBenBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setNaRongFanWeiMiaoShu(trMap.get("2"));
					tt.setDanJia(trMap.get("3"));
					tt.setJiSuanJiShu(trMap.get("4"));
					tt.setYuSuanChengBen(trMap.get("5"));
					tt.setBeiZhu(trMap.get("6"));
					mapper.insert(tt);
				}
			}
			break;				
		}
		case "152_007":{
			System.out.println("152_007");
			T152007Mapper mapper = sqlSession.getMapper(T152007Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T152007 tt=new T152007();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setChengBenBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setNaRongFanWeiMiaoShu(trMap.get("2"));
					tt.setDanJia(trMap.get("3"));
					tt.setJiSuanJiShu(trMap.get("4"));
					tt.setYuSuanChengBen(trMap.get("5"));
					tt.setBeiZhu(trMap.get("6"));
					mapper.insert(tt);
				}
			}
			break;				
		}
		case "153_002":{
			System.out.println("153_002");
			T153002Mapper mapper = sqlSession.getMapper(T153002Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T153002 tt=new T153002();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setChengBenBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setBenQiShuDiaoZhengE(trMap.get("2"));
					tt.setBenQiShuShuLiang(trMap.get("3"));
					tt.setBenQiShuJiaGe(trMap.get("4"));
					tt.setBenQiShuQiTa(trMap.get("5"));
					tt.setLeiJiShuDiaoZhengE(trMap.get("6"));
					tt.setLeiJiShuShuLiang(trMap.get("7"));
					tt.setLeiJiShuJiaGe(trMap.get("8"));
					tt.setLeiJiShuQiTa(trMap.get("9"));
					tt.setBeiZhu(trMap.get("10"));
					mapper.insert(tt);
				}
			}
			break;				
		}
		case "154_002":{
			System.out.println("154_002");
			T154002Mapper mapper = sqlSession.getMapper(T154002Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T154002 tt=new T154002();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setChengBenBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setNaRongFanWeiMiaoShu(trMap.get("2"));
					tt.setYuSuanChengBen(trMap.get("3"));
					tt.setJiHuaChengBen(trMap.get("4"));
					tt.setChengBenJiangDiLv(trMap.get("5"));
					tt.setBeiZhu(trMap.get("6"));
					mapper.insert(tt);
				}
			}
			break;				
		}

		case "155_002":{
			System.out.println("155_002");
			T155002Mapper mapper = sqlSession.getMapper(T155002Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T155002 tt=new T155002();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));

					tt.setBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setNaRongFanWeiMiaoShu(trMap.get("2"));
					tt.setYuSuanChengBen(trMap.get("3"));
					tt.setJiHuaChengBen(trMap.get("4"));
					tt.setShiJiYuJiChengBen(trMap.get("5"));
					tt.setYuSuanShiJiJinE(trMap.get("6"));
					tt.setYuSuanShiJiBiLi(trMap.get("7"));
					tt.setJiHuaShiJiJinE(trMap.get("8"));
					tt.setJiHuaShiJiBiLi(trMap.get("9"));
					tt.setZhuangTai(trMap.get("10"));

					mapper.insert(tt);
				}
			}
			break;				
		}

		case "155_004":{
			System.out.println("155_004");
			T155004Mapper mapper = sqlSession.getMapper(T155004Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T155004 tt=new T155004();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setChengBenBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setYuSuanChengBen(trMap.get("2"));
					tt.setZhiQiMoYiFaShengChengBen(trMap.get("3"));
					tt.setZuLinShiJianZongYuSuanShiJian(trMap.get("4"));
					tt.setZuLinShiJianYiFaShengShiJian(trMap.get("5"));
					tt.setZuLinShiJianYuSuanShengYuShiJian(trMap.get("6"));
					tt.setZuLinShiJianHuaiXuYaoShiJian(trMap.get("7"));
					tt.setShengYuChengBenYuKongShuYueDuYuKongShu(trMap.get("8"));
					tt.setShengYuChengBenYuKongShuZongYuKongShu(trMap.get("9"));
					tt.setShengYuChengBenYuCeShuYueDuYuCeShu(trMap.get("10"));
					tt.setShengYuChengBenYuCeShuZongYuCeShu(trMap.get("11"));
					tt.setShengYuChengBenYuCeShuJieChao(trMap.get("12"));
					tt.setShiJiYuJiChengBen(trMap.get("13"));
					mapper.insert(tt);
				}
			}
			break;				
		}
		case "155_005":{
			System.out.println("155_005");
			T155005Mapper mapper = sqlSession.getMapper(T155005Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T155005 tt=new T155005();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setChengBenBianHao(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setYuSuanChengBen(trMap.get("2"));
					tt.setZhiQiMoYiFaShengChengBen(trMap.get("3"));
					tt.setChengBenShiJianZongYuSuanShiJian(trMap.get("4"));
					tt.setChengBenShiJianYiFaShengShiJian(trMap.get("5"));
					tt.setChengBenShiJianYuSuanShengYuShiJian(trMap.get("6"));
					tt.setChengBenShiJianHuaiXuYaoShiJian(trMap.get("7"));
					tt.setShengYuChengBenYuKongShuYueDuYuKongShu(trMap.get("8"));
					tt.setShengYuChengBenYuKongShuZongYuKongShu(trMap.get("9"));
					tt.setShengYuChengBenYuCeShuYueDuYuCeShu(trMap.get("10"));
					tt.setShengYuChengBenYuCeShuZongYuCeShu(trMap.get("11"));
					tt.setShengYuChengBenYuCeShuJieChao(trMap.get("12"));
					tt.setShiJiYuJiChengBen(trMap.get("13"));
					mapper.insert(tt);
				}
			}
			break;				
		}
		case "156_002":{
			System.out.println("156_002");
			T156002Mapper mapper = sqlSession.getMapper(T156002Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T156002 tt=new T156002();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));

					tt.setXuHao(trMap.get("0"));
					tt.setWuZiMingChen(trMap.get("1"));
					tt.setGuiGeXingHao(trMap.get("2"));
					tt.setDanWei(trMap.get("3"));
					tt.setZongYuSuanShuShuLiang(trMap.get("4"));
					tt.setZongYuSuanShuDanJia(trMap.get("5"));
					tt.setZongYuSuanShuJinE(trMap.get("6"));
					tt.setYiWanCaiGouShuShuLiang(trMap.get("7"));
					tt.setYiWanCaiGouShuJinE(trMap.get("8"));
					tt.setWeiWanYuKongShuShengYuLiang(trMap.get("9"));
					tt.setWeiWanYuKongShuYuCeDanJia(trMap.get("10"));
					tt.setWeiWanYuKongShuYuKongDanJia(trMap.get("11"));

					mapper.insert(tt);
				}
			}
			break;				
		}
		case "157_002":{
			System.out.println("157_002");
			T157002Mapper mapper = sqlSession.getMapper(T157002Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T157002 tt=new T157002();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setBenQiShuYuSuanChengBen(trMap.get("2"));
					tt.setBenQiShuShiJiChengBen(trMap.get("3"));
					tt.setBenQiShuJiangDiE(trMap.get("4"));
					tt.setBenQiShuJiangDiLv(trMap.get("5"));
					tt.setLeiJiShuYuSuanChengBen(trMap.get("6"));
					tt.setLeiJiShuShiJiChengBen(trMap.get("7"));
					tt.setLeiJiShuJiangDiE(trMap.get("8"));
					tt.setLeiJiShuJiangDiLv(trMap.get("9"));
					tt.setBeiZhu(trMap.get("10"));
					mapper.insert(tt);
				}
			}
			break;				
		}

		case "158_002":{
			System.out.println("158_002");
			T158002Mapper mapper = sqlSession.getMapper(T158002Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T158002 tt=new T158002();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setChengBenBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setNaRongFanWeiMiaoShu(trMap.get("2"));
					tt.setYuSuanChengBen(trMap.get("3"));
					tt.setShiJiChengBen(trMap.get("4"));
					tt.setBeiZhu(trMap.get("5"));



					mapper.insert(tt);
				}
			}
			break;				
		}
		case "158_003":{
			System.out.println("158_003");
			T158003Mapper mapper = sqlSession.getMapper(T158003Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T158003 tt=new T158003();
					tt.setTableId(ptable_id);

					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setXuHao(trMap.get("0"));
					tt.setWuZiMingChen(trMap.get("1"));
					tt.setGuiGeXingHao(trMap.get("2"));
					tt.setDanWei(trMap.get("3"));
					tt.setBenYueYuSuanChengBenYuSuanDanJia(trMap.get("4"));
					tt.setBenYueYuSuanChengBenYuSuanYongLiang(trMap.get("5"));
					tt.setBenYueYuSuanChengBenHeJia(trMap.get("6"));
					tt.setSunHaoLv(trMap.get("7"));
					tt.setBenYueShiJiChengBenCaiGouDanJia(trMap.get("8"));
					tt.setBenYueShiJiChengBenShiJiYongLiang(trMap.get("9"));
					tt.setBenYueShiJiChengBenHeJia(trMap.get("10"));
					tt.setSuoShuChengBenXiangMu(trMap.get("11"));
					tt.setShiYongBuWei(trMap.get("12"));




					mapper.insert(tt);
				}
			}
			break;				
		}
		case "158_004":{
			System.out.println("158_004");
			T158004Mapper mapper = sqlSession.getMapper(T158004Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T158004 tt=new T158004();
					tt.setTableId(ptable_id);

					tt.setTrOrder(Integer.parseInt(entry.getKey()));

					tt.setXuHao(trMap.get("0"));
					tt.setWuZiMingChen(trMap.get("1"));
					tt.setGuiGeXingHao(trMap.get("2"));
					tt.setZuLinDanJiaDanWei(trMap.get("3"));
					tt.setZuLinDanJiaYuSuanShu(trMap.get("4"));
					tt.setZuLinDanJiaShiJiShu(trMap.get("5"));
					tt.setZuLinShuLiangDanWei(trMap.get("6"));
					tt.setZuLinShuLiangYuSuanShu(trMap.get("7"));
					tt.setZuLinShuLiangYuSuanShu(trMap.get("8"));
					tt.setZuLinShiJianDanWei(trMap.get("11"));
					tt.setZuLinShiJianYuSuanShu(trMap.get("12"));
					tt.setZuLinShiJianShiJiShu(trMap.get("13"));
					tt.setYuSuanChengBenHeJi(trMap.get("14"));
					tt.setShiJiChengBenHeJia(trMap.get("15"));
					tt.setSuoShuChengBenXiangMu(trMap.get("16"));
					mapper.insert(tt);
				}
			}
			break;				
		}
		case "159_002":{
			System.out.println("159_002");
			T159002Mapper mapper = sqlSession.getMapper(T159002Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T159002 tt=new T159002();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));

					tt.setXuHao(trMap.get("0"));
					tt.setJiHuaXiangMu(trMap.get("1"));
					tt.setChengBenJiangDiLvMuBiaoZhi(trMap.get("2"));
					tt.setBenQiShuZongFen(trMap.get("3"));
					tt.setBenQiShuDaBiao(trMap.get("4"));
					tt.setBenQiShuWeiDaBiao(trMap.get("5"));
					tt.setBenQiShuShiJiJiaQuanPingJunZhi(trMap.get("6"));
					tt.setLeiJiShuZongFen(trMap.get("7"));
					tt.setLeiJiShuDaBiao(trMap.get("8"));
					tt.setLeiJiShuWeiDaBiao(trMap.get("9"));
					tt.setLeiJiShuShiJiJiaQuanPingJunZhi(trMap.get("10"));
					tt.setBeiZhu(trMap.get("11"));






					mapper.insert(tt);
				}
			}
			break;				
		}
		case "160_002":{
			System.out.println("160_002");
			T160002Mapper mapper = sqlSession.getMapper(T160002Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T160002 tt=new T160002();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));



					tt.setBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setNaRongFanWeiMiaoShu(trMap.get("2"));
					tt.setYuSuanChengBen(trMap.get("3"));
					tt.setGuoChengChengBen(trMap.get("4"));
					tt.setJieChaoJinE(trMap.get("5"));
					tt.setJieChaoBiLi(trMap.get("6"));
					tt.setJieChaoYinSuFenXiShuLiang(trMap.get("7"));
					tt.setJieChaoYinSuFenXiJiaGe(trMap.get("8"));
					tt.setJieChaoYinSuFenXiQiTa(trMap.get("9"));
					tt.setZhuangTai(trMap.get("10"));


					mapper.insert(tt);
				}
			}
			break;				
		}

		case "161_002":{
			System.out.println("161_002");
			T161002Mapper mapper = sqlSession.getMapper(T161002Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T161002 tt=new T161002();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setXuHao(trMap.get("0"));
					tt.setWuZiMingChen(trMap.get("1"));
					tt.setGuiGeXingHao(trMap.get("2"));
					tt.setDanWei(trMap.get("3"));
					tt.setYuSuanZhiShuLiang(trMap.get("4"));
					tt.setYuSuanZhiDanJia(trMap.get("5"));
					tt.setYuSuanZhiJinE(trMap.get("6"));
					tt.setShiJiZhiShuLiang(trMap.get("7"));
					tt.setShiJiZhiDanJia(trMap.get("8"));
					tt.setShiJiZhiJinE(trMap.get("9"));
					tt.setYingKui(trMap.get("10"));
					tt.setLiangChaYingXiangLiangCha(trMap.get("11"));
					tt.setLiangChaYingXiangJinE(trMap.get("12"));
					tt.setJiaChaYingXiangJiaCha(trMap.get("13"));
					tt.setJiaChaYingXiangJinE(trMap.get("14"));
					mapper.insert(tt);
				}
			}
			break;				
		}
		case "161_003":{
			System.out.println("161_003");
			T161003Mapper mapper = sqlSession.getMapper(T161003Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T161003 tt=new T161003();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setXuHao(trMap.get("0"));
					tt.setWuZiMingChen(trMap.get("1"));
					tt.setGuiGeXingHao(trMap.get("2"));
					tt.setDanWei(trMap.get("3"));
					tt.setYuSuanZhiShuLiang(trMap.get("4"));
					tt.setYuSuanZhiDanJia(trMap.get("5"));
					tt.setYuSuanZhiJinE(trMap.get("6"));
					tt.setShiJiZhiShuLiang(trMap.get("7"));
					tt.setShiJiZhiDanJia(trMap.get("8"));
					tt.setShiJiZhiJinE(trMap.get("9"));
					tt.setYingKui(trMap.get("10"));
					tt.setLiangChaYingXiangLiangCha(trMap.get("11"));
					tt.setLiangChaYingXiangJinE(trMap.get("12"));
					tt.setLiangChaYingXiangZhanBi(trMap.get("13"));
					tt.setJiaChaYingXiangJiaCha(trMap.get("14"));
					tt.setJiaChaYingXiangJinE(trMap.get("15"));
					tt.setJiaChaYingXiangZhanBi(trMap.get("16"));		

					mapper.insert(tt);
				}
			}
			break;				
		}
		case "162_002":{
			System.out.println("162_002");
			T162002Mapper mapper = sqlSession.getMapper(T162002Mapper.class);
			for (Map.Entry<String, Object> entry : itemMap.entrySet()) { 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T162002 tt=new T162002();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setXuHao(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setNaRongFanWeiMiaoShu(trMap.get("2"));
					tt.setYuSuanZaoJia(trMap.get("3"));
					tt.setYuSuanChengBen(trMap.get("4"));
					tt.setYingKuiEDu(trMap.get("5"));
					tt.setLiRunDianBiaoJi(trMap.get("6"));
					tt.setBeiZhu(trMap.get("7"));
					mapper.insert(tt);
				}
			}
			break;				
		}
		}


		sqlSession.close();
		System.out.println(ptableType+ptableCtx);
		System.out.println(ptable_id);
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write("[]");
		return;
	}
}
