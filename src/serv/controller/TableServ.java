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


@Controller
@RequestMapping("/excel")
public class TableServ {
	private SqlSession sqlSession;
	TableServ()throws IOException{
		String res = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(res);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession();
	}

	public List<String> getTableForExcel(String tem_excelType) {
		List<String> subTable = new ArrayList<String>();
		MaskHandle hh=new MaskHandle();
		return hh.getExcelSubTableType(tem_excelType);
	}

	public void createExcelSubTable(int excel_id, String excelType)
			throws Exception {


		List<String> subTable = getTableForExcel(excelType);
		for (String i : subTable) {
			// 创建Usermapper对象，mybatis自动生成mapper代理对象
			WtableMapper mapper = sqlSession.getMapper(WtableMapper.class);
			Wtable tt = new Wtable();
			tt.setTabletype(i);
			tt.setExcelId(excel_id);
			mapper.insert(tt);
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
		// 创建Usermapper对象，mybatis自动生成mapper代理对象
		WexcelMapper mapper = sqlSession.getMapper(WexcelMapper.class);
		Wexcel record = new Wexcel();
		record.setExceltype(pexcelType);
		record.setGongChengId(Integer.parseInt(pgong_cheng_id));
		record.setName("新建表单(" + String.valueOf(mapper.countByExample(null) + 1)
				+ ")");
		java.sql.Date createDate = new java.sql.Date(
				new java.util.Date().getTime());
		record.setCreatedate(createDate);

		mapper.insert(record);
		System.out.println(record.getId());
		createExcelSubTable(record.getId(), pexcelType);
		return;
	}

	public void copyTr(Integer newTableId,Integer oldTableIdId,String tableType)throws Exception {


		switch(tableType){

		case"151_002":{
			System.out.println("151_002");
			T151002Mapper mapper = sqlSession.getMapper(T151002Mapper.class);
			T151002Example ee=new T151002Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T151002> lee=mapper.selectByExample(ee);
			for(T151002 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"152_002":{
			System.out.println("152_002");
			T152002Mapper mapper = sqlSession.getMapper(T152002Mapper.class);
			T152002Example ee=new T152002Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T152002> lee=mapper.selectByExample(ee);
			for(T152002 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"152_004":{
			System.out.println("152_004");
			T152004Mapper mapper = sqlSession.getMapper(T152004Mapper.class);
			T152004Example ee=new T152004Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T152004> lee=mapper.selectByExample(ee);
			for(T152004 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"152_005":{
			System.out.println("152_005");
			T152005Mapper mapper = sqlSession.getMapper(T152005Mapper.class);
			T152005Example ee=new T152005Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T152005> lee=mapper.selectByExample(ee);
			for(T152005 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"152_006":{
			System.out.println("152_006");
			T152006Mapper mapper = sqlSession.getMapper(T152006Mapper.class);
			T152006Example ee=new T152006Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T152006> lee=mapper.selectByExample(ee);
			for(T152006 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"152_007":{
			System.out.println("152_007");
			T152007Mapper mapper = sqlSession.getMapper(T152007Mapper.class);
			T152007Example ee=new T152007Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T152007> lee=mapper.selectByExample(ee);
			for(T152007 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"153_002":{
			System.out.println("153_002");
			T153002Mapper mapper = sqlSession.getMapper(T153002Mapper.class);
			T153002Example ee=new T153002Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T153002> lee=mapper.selectByExample(ee);
			for(T153002 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"154_002":{
			System.out.println("154_002");
			T154002Mapper mapper = sqlSession.getMapper(T154002Mapper.class);
			T154002Example ee=new T154002Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T154002> lee=mapper.selectByExample(ee);
			for(T154002 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"155_002":{
			System.out.println("155_002");
			T155002Mapper mapper = sqlSession.getMapper(T155002Mapper.class);
			T155002Example ee=new T155002Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T155002> lee=mapper.selectByExample(ee);
			for(T155002 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"155_004":{
			System.out.println("155_004");
			T155004Mapper mapper = sqlSession.getMapper(T155004Mapper.class);
			T155004Example ee=new T155004Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T155004> lee=mapper.selectByExample(ee);
			for(T155004 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"155_005":{
			System.out.println("155_005");
			T155005Mapper mapper = sqlSession.getMapper(T155005Mapper.class);
			T155005Example ee=new T155005Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T155005> lee=mapper.selectByExample(ee);
			for(T155005 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"156_002":{
			System.out.println("156_002");
			T156002Mapper mapper = sqlSession.getMapper(T156002Mapper.class);
			T156002Example ee=new T156002Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T156002> lee=mapper.selectByExample(ee);
			for(T156002 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"157_002":{
			System.out.println("157_002");
			T157002Mapper mapper = sqlSession.getMapper(T157002Mapper.class);
			T157002Example ee=new T157002Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T157002> lee=mapper.selectByExample(ee);
			for(T157002 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"158_002":{
			System.out.println("158_002");
			T158002Mapper mapper = sqlSession.getMapper(T158002Mapper.class);
			T158002Example ee=new T158002Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T158002> lee=mapper.selectByExample(ee);
			for(T158002 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"158_003":{
			System.out.println("158_003");
			T158003Mapper mapper = sqlSession.getMapper(T158003Mapper.class);
			T158003Example ee=new T158003Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T158003> lee=mapper.selectByExample(ee);
			for(T158003 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"158_004":{
			System.out.println("158_004");
			T158004Mapper mapper = sqlSession.getMapper(T158004Mapper.class);
			T158004Example ee=new T158004Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T158004> lee=mapper.selectByExample(ee);
			for(T158004 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"159_002":{
			System.out.println("159_002");
			T159002Mapper mapper = sqlSession.getMapper(T159002Mapper.class);
			T159002Example ee=new T159002Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T159002> lee=mapper.selectByExample(ee);
			for(T159002 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"160_002":{
			System.out.println("160_002");
			T160002Mapper mapper = sqlSession.getMapper(T160002Mapper.class);
			T160002Example ee=new T160002Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T160002> lee=mapper.selectByExample(ee);
			for(T160002 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"161_002":{
			System.out.println("161_002");
			T161002Mapper mapper = sqlSession.getMapper(T161002Mapper.class);
			T161002Example ee=new T161002Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T161002> lee=mapper.selectByExample(ee);
			for(T161002 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"161_003":{
			System.out.println("161_003");
			T161003Mapper mapper = sqlSession.getMapper(T161003Mapper.class);
			T161003Example ee=new T161003Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T161003> lee=mapper.selectByExample(ee);
			for(T161003 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		case"162_002":{
			System.out.println("162_002");
			T162002Mapper mapper = sqlSession.getMapper(T162002Mapper.class);
			T162002Example ee=new T162002Example();
			ee.or().andTableIdEqualTo(oldTableIdId);
			List< T162002> lee=mapper.selectByExample(ee);
			for(T162002 ww:lee){
				ww.setId(null);
				ww.setTableId(newTableId);
				mapper.insert(ww);
			}
			break;
		}
		}
	}

	public void copyTable(Integer id,Integer newExcelId)throws Exception {
		WtableMapper mapper = sqlSession.getMapper(WtableMapper.class);
		WtableExample ee=new WtableExample();
		ee.or().andExcelIdEqualTo(id);
		List<Wtable> lee=mapper.selectByExample(ee);
		System.out.println("lee:");
		System.out.println(lee.size());

		for(Wtable ww:lee){

			Integer oldTableId=ww.getId();
			ww.setId(null);
			ww.setExcelId(newExcelId);
			mapper.insert(ww);
			Integer newTableId=ww.getId();
			copyTr(newTableId,oldTableId,ww.getTabletype());
		}

		return;
	}
	@RequestMapping("/copyExcel")
	public void table_copy(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Integer id=Integer.parseInt(request.getParameter("excel_id"));

		WexcelMapper mapper = sqlSession.getMapper(WexcelMapper.class);
		Wexcel xx=mapper.selectByPrimaryKey(id);
		if(xx!=null){
			Integer excelId=xx.getId();
			xx.setId(null);
			xx.setName(xx.getName()+"（复制）");
			System.out.println(xx.getName());
			mapper.insert(xx);
			Integer newExcelId=xx.getId();
			copyTable(excelId,newExcelId);
		}else{
			System.out.println("没找到");
		}



		return;
	}
	@RequestMapping("deleteExcel")
	public void table3(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String pexcel_id= request.getParameter("excel_id");

		WexcelMapper mapper = sqlSession.getMapper(WexcelMapper.class);
		mapper.deleteByPrimaryKey(Integer.parseInt(pexcel_id));

		deleteExcelSubTable(Integer.parseInt(pexcel_id));
		return;
	}

	@RequestMapping("getExcelList")
	public void table4(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String pexcelType = request.getParameter("excelType");
		String pgong_cheng_id = request.getParameter("gong_cheng_id");


		WexcelMapper mapper = sqlSession.getMapper(WexcelMapper.class);
		WexcelExample ee=new WexcelExample();
		ee.setOrderByClause("createdate");
		ee.or().andExceltypeEqualTo(pexcelType).andGongChengIdEqualTo(Integer.parseInt(pgong_cheng_id));	

		List<Wexcel> lee=mapper.selectByExample(ee);

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

		WtableMapper mapper = sqlSession.getMapper(WtableMapper.class);
		WtableExample ee=new WtableExample();
		ee.or().andExcelIdEqualTo(Integer.parseInt(pexcel_id));	
		List<Wtable>  lee=mapper.selectByExample(ee);

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

		WtableMapper mapper = sqlSession.getMapper(WtableMapper.class);
		Wtable tt=mapper.selectByPrimaryKey(Integer.parseInt(ptable_id));
		String ptableType=tt.getTabletype();


		String ret="[{\"xiang_mu_ming_chen_\":\""+tt.getXiangMuMingChen()+"\""+
				",\"biao_dan_bian_hao_\":\""+tt.getBiaoDanBianHao()+"\""+
				",\"tong_ji_ri_qi_nian_\":\""+tt.getTongJiRiQi()+"\""+
				",\"tong_ji_ri_qi_yue_\":\""+tt.getTongJiYueFen()+"\""+
				",\"dan_wei_\":\""+tt.getDanWei()+"\""+
				",\"bian_zhi_ren_\":\""+tt.getBianZhiRen()+"\""+
				",\"bian_zhi_ren_nian_\":\""+tt.getBianZhiRiQi()+"\""+
				",\"bian_zhi_ren_yue_\":\""+"\""+
				",\"bian_zhi_ren_ri_\":\""+"\""+
				",\"shen_he_ren_\":\""+tt.getShenHeRen()+"\""+
				",\"shen_he_ren_nian_\":\""+tt.getShenHeRiQi()+"\""+
				",\"shen_he_ren_yue_\":\""+"\""+
				",\"shen_he_ren_ri_\":\""+"\""+
				",\"shen_pi_ren_\":\""+tt.getShenPiRen()+"\""+
				",\"shen_pi_ren_nian_\":\""+tt.getShenPiRiQi()+"\""+
				",\"shen_pi_ren_yue_\":\""+"\""+
				",\"shen_pi_ren_ri_\":\""+"\"";








		WtableTitleMapper titlemapper = sqlSession.getMapper(WtableTitleMapper.class);
		WtableTitleExample titleEE=new WtableTitleExample();
		titleEE.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
		List<WtableTitle> titleLee=titlemapper.selectByExample(titleEE);
		String titleCtx="";
		for(WtableTitle kk:titleLee){
			titleCtx+="{\"tr_id\":\""+kk.getId()
					+"\",\"tr_order\":\""+kk.getTrOrder()
					+"\",\"title\":\""+kk.getTitle()
					+"\",\"level\":\""+kk.getLevel()
					+"\"},";
		}


		String ss="[";
		ss+=titleCtx;//"{\"tr_id\":\"\",\"tr_order\":\"4\",\"title\":\"萨顶\",\"level\":\"1\"},";
		switch(ptableType){
		case "151_002":{
			System.out.println("151002");
			T151002Mapper t_mapper = sqlSession.getMapper(T151002Mapper.class);
			T151002Example ee=new T151002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T151002> lee=t_mapper.selectByExample(ee);

			for(T151002 it : lee) {
				String tr_data="["	
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;
		}
		case "152_002":{
			System.out.println("152002");
			T152002Mapper t_mapper = sqlSession.getMapper(T152002Mapper.class);
			T152002Example ee=new T152002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T152002> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;
		}
		case "152_004":{
			System.out.println("152004");
			T152004Mapper t_mapper = sqlSession.getMapper(T152004Mapper.class);
			T152004Example ee=new T152004Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T152004> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}


		case "152_005":{
			System.out.println("152005");
			T152005Mapper t_mapper = sqlSession.getMapper(T152005Mapper.class);
			T152005Example ee=new T152005Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T152005> lee=t_mapper.selectByExample(ee);
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}
		case "152_006":{
			System.out.println("152006");
			T152006Mapper t_mapper = sqlSession.getMapper(T152006Mapper.class);
			T152006Example ee=new T152006Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T152006> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}
		case "152_007":{
			System.out.println("152007");
			T152007Mapper t_mapper = sqlSession.getMapper(T152007Mapper.class);
			T152007Example ee=new T152007Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T152007> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}
		case "153_002":{
			System.out.println("153002");
			T153002Mapper t_mapper = sqlSession.getMapper(T153002Mapper.class);
			T153002Example ee=new T153002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T153002> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}
		case "154_002":{
			System.out.println("154002");
			T154002Mapper t_mapper = sqlSession.getMapper(T154002Mapper.class);
			T154002Example ee=new T154002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T154002> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}

		case "155_002":{
			System.out.println("155002");
			T155002Mapper t_mapper = sqlSession.getMapper(T155002Mapper.class);
			T155002Example ee=new T155002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T155002> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}

		case "155_004":{
			System.out.println("155004");
			T155004Mapper t_mapper = sqlSession.getMapper(T155004Mapper.class);
			T155004Example ee=new T155004Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T155004> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}
		case "155_005":{



			System.out.println("155005");
			T155005Mapper t_mapper = sqlSession.getMapper(T155005Mapper.class);
			T155005Example ee=new T155005Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T155005> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}
		case "156_002":{
			System.out.println("156002");
			T156002Mapper t_mapper = sqlSession.getMapper(T156002Mapper.class);
			T156002Example ee=new T156002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T156002> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}
		case "157_002":{
			System.out.println("157002");
			T157002Mapper t_mapper = sqlSession.getMapper(T157002Mapper.class);
			T157002Example ee=new T157002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T157002> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}

		case "158_002":{
			System.out.println("158002");
			T158002Mapper t_mapper = sqlSession.getMapper(T158002Mapper.class);
			T158002Example ee=new T158002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T158002> lee=t_mapper.selectByExample(ee);

			for(T158002 it : lee) {
				String tr_data="["	
						+"\""+String.valueOf(it.getChengBenBianMa())+"\","
						+"\""+String.valueOf(it.getChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getNaRongFanWeiMiaoShu())+"\","
						+"\""+String.valueOf(it.getYuSuanChengBen())+"\","
						+"\""+String.valueOf(it.getShiJiChengBen())+"\","
						+"\""+String.valueOf(it.getBeiZhu())+"\","
						+"]";
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}
		case "158_003":{
			System.out.println("158003");
			T158003Mapper t_mapper = sqlSession.getMapper(T158003Mapper.class);
			T158003Example ee=new T158003Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T158003> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}
		case "158_004":{
			System.out.println("158004");
			T158004Mapper t_mapper = sqlSession.getMapper(T158004Mapper.class);
			T158004Example ee=new T158004Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T158004> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}
		case "159_002":{
			System.out.println("159002");
			T159002Mapper t_mapper = sqlSession.getMapper(T159002Mapper.class);
			T159002Example ee=new T159002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T159002> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}
		case "160_002":{
			System.out.println("160002");
			T160002Mapper t_mapper = sqlSession.getMapper(T160002Mapper.class);
			T160002Example ee=new T160002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T160002> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}

		case "161_002":{
			System.out.println("161002");
			T161002Mapper t_mapper = sqlSession.getMapper(T161002Mapper.class);
			T161002Example ee=new T161002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T161002> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}
		case "161_003":{
			System.out.println("161003");
			T161003Mapper t_mapper = sqlSession.getMapper(T161003Mapper.class);
			T161003Example ee=new T161003Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T161003> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}
		case "162_002":{
			System.out.println("162002");
			T162002Mapper t_mapper = sqlSession.getMapper(T162002Mapper.class);
			T162002Example ee=new T162002Example();
			ee.setOrderByClause("tr_order");
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<T162002> lee=t_mapper.selectByExample(ee);

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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}
		}

		ss+="]";
		ss=ss.replace("},]","}]");
		///**************

		ret+=",\"tr_info\":"+ss+"}]";
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ret);
		return;
	}

	@RequestMapping("deleteTr")
	public void table8(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String id= request.getParameter("id");
		String tableType= request.getParameter("tableType");
		String istitle= request.getParameter("istitle");
		/*
			System.out.println("id:"+id);
			System.out.println("tableType:"+tableType);
			System.out.println("isTitle:"+istitle);
		 */
		if(istitle!=null&&istitle.equals("istitle")){
			WtableTitleMapper mapper = sqlSession.getMapper(WtableTitleMapper.class);
			mapper.deleteByPrimaryKey(Integer.parseInt(id));
		}else{
			System.out.println("删除普通行");	

			switch(tableType){

			case"151_002":{
				System.out.println("151_002");
				T151002Mapper mapper = sqlSession.getMapper(T151002Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"152_002":{
				System.out.println("152_002");
				T152002Mapper mapper = sqlSession.getMapper(T152002Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"152_004":{
				System.out.println("152_004");
				T152004Mapper mapper = sqlSession.getMapper(T152004Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"152_005":{
				System.out.println("152_005");
				T152005Mapper mapper = sqlSession.getMapper(T152005Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"152_006":{
				System.out.println("152_006");
				T152006Mapper mapper = sqlSession.getMapper(T152006Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"152_007":{
				System.out.println("152_007");
				T152007Mapper mapper = sqlSession.getMapper(T152007Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"153_002":{
				System.out.println("153_002");
				T153002Mapper mapper = sqlSession.getMapper(T153002Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"154_002":{
				System.out.println("154_002");
				T154002Mapper mapper = sqlSession.getMapper(T154002Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"155_002":{
				System.out.println("155_002");
				T155002Mapper mapper = sqlSession.getMapper(T155002Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"155_004":{
				System.out.println("155_004");
				T155004Mapper mapper = sqlSession.getMapper(T155004Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"155_005":{
				System.out.println("155_005");
				T155005Mapper mapper = sqlSession.getMapper(T155005Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"156_002":{
				System.out.println("156_002");
				T156002Mapper mapper = sqlSession.getMapper(T156002Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"157_002":{
				System.out.println("157_002");
				T157002Mapper mapper = sqlSession.getMapper(T157002Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"158_002":{
				System.out.println("158_002");
				T158002Mapper mapper = sqlSession.getMapper(T158002Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"158_003":{
				System.out.println("158_003");
				T158003Mapper mapper = sqlSession.getMapper(T158003Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"158_004":{
				System.out.println("158_004");
				T158004Mapper mapper = sqlSession.getMapper(T158004Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"159_002":{
				System.out.println("159_002");
				T159002Mapper mapper = sqlSession.getMapper(T159002Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"160_002":{
				System.out.println("160_002");
				T160002Mapper mapper = sqlSession.getMapper(T160002Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"161_002":{
				System.out.println("161_002");
				T161002Mapper mapper = sqlSession.getMapper(T161002Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"161_003":{
				System.out.println("161_003");
				T161003Mapper mapper = sqlSession.getMapper(T161003Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			case"162_002":{
				System.out.println("162_002");
				T162002Mapper mapper = sqlSession.getMapper(T162002Mapper.class);
				mapper.deleteByPrimaryKey(Integer.parseInt(id));
				break;
			}
			}
		}

		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write("[]");
		return;
	}

	@RequestMapping("saveTable")
	public void table9(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		//st:8080/simpleMVC/excel/saveTable.action?
		int ptable_id= Integer.parseInt(request.getParameter("id"));
		String ptableType= request.getParameter("tableType");
		String ptableCtx= request.getParameter("tableCtx");
		String ptableInfo= request.getParameter("tableInfo");
		String ptableTitle= request.getParameter("tableTitle");

		//System.out.println("XXXXXXXXXXXXXXXXXXX");
		//System.out.println(ptableCtx);
		////////////////////////////////////////
		//存储title
		JSONObject tabletitleInfoJson;
		tabletitleInfoJson = JSON.parseObject(ptableTitle);
		Map<String, Object> tabletitleItemMap= JSONObject.toJavaObject(tabletitleInfoJson, Map.class);
		WtableTitleMapper titlemapper = sqlSession.getMapper(WtableTitleMapper.class);

		for (Map.Entry<String, Object> entry : tabletitleItemMap.entrySet()) {
			//System.out.println("##############");
			//System.out.println(entry.getKey());
			Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
			System.out.println(trMap.toString());
			if(trMap.get("tr_id").trim().length()!=0){
				System.out.println(trMap.get("tr_id").trim());
				WtableTitle titleXX=titlemapper.selectByPrimaryKey(Integer.parseInt(trMap.get("tr_id").trim()));
				titleXX.setTableId(ptable_id);
				titleXX.setTitle(trMap.get("title").trim());
				//级别不可以改
				//titleXX.setLevel(trMap.get("level").trim());
				titleXX.setTrOrder(Integer.parseInt(entry.getKey()));
				titlemapper.updateByPrimaryKey(titleXX);
			}else{
				WtableTitle titleXX=new WtableTitle();
				titleXX.setTableId(ptable_id);
				titleXX.setTitle(trMap.get("title").trim());
				titleXX.setLevel(trMap.get("level").trim());
				titleXX.setTrOrder(Integer.parseInt(entry.getKey()));	
				titlemapper.insert(titleXX);
			}
		}
		////////////////////////////////////////
		JSONObject tableInfoJson;
		tableInfoJson = JSON.parseObject(ptableInfo);  
		Map<String, String> tableItemMap= JSONObject.toJavaObject(tableInfoJson, Map.class);
		WtableMapper tmapper = sqlSession.getMapper(WtableMapper.class);

		//先查询
		Wtable ttable = tmapper.selectByPrimaryKey(ptable_id);
		//然后更新
		ttable.setXiangMuMingChen(tableItemMap.get("xiang_mu_ming_chen_"));
		ttable.setBiaoDanBianHao(tableItemMap.get("biao_dan_bian_hao_"));
		String tongJiRiQi=tableItemMap.get("tong_ji_ri_qi_nian_")
				+tableItemMap.get("tong_ji_ri_qi_yue_")
				+tableItemMap.get("tong_ji_ri_qi_ri_");
		ttable.setTongJiRiQi(tongJiRiQi);
		ttable.setTongJiYueFen(tongJiRiQi);
		ttable.setDanWei(tableItemMap.get("dan_wei_"));


		ttable.setBianZhiRen(tableItemMap.get("bian_zhi_ren_"));		
		String bianZhiRiQi=tableItemMap.get("bian_zhi_ren_nian_")
				+tableItemMap.get("bian_zhi_ren_yue_")
				+tableItemMap.get("bian_zhi_ren_ri_");
		ttable.setBianZhiRiQi(bianZhiRiQi);



		ttable.setShenHeRen(tableItemMap.get("shen_he_ren_"));
		String shenHeRiQi=tableItemMap.get("shen_he_ren_nian_")
				+tableItemMap.get("shen_he_ren_yue_")
				+tableItemMap.get("shen_he_ren_ri_");
		ttable.setShenHeRiQi(shenHeRiQi);


		ttable.setShenPiRen(tableItemMap.get("shen_he_ren_ri_"));
		String shenPiRiQi=tableItemMap.get("shen_pi_ren_nian_")
				+tableItemMap.get("shen_pi_ren_yue_")
				+tableItemMap.get("shen_pi_ren_ri_");
		ttable.setShenPiRiQi(shenPiRiQi);

		tmapper.updateByPrimaryKey(ttable);


		//存储每一行
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
				/*
				else{
					T151002 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));

				}
				 */
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
				}else{
					T152002 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setNaRongFanWeiMiaoShu(trMap.get("2"));
					tt.setChuShiYuSuanChengBen(trMap.get("3"));
					tt.setDiaoZhengHouYuSuanChengBen(trMap.get("4"));
					tt.setBenQiShu(trMap.get("5"));
					tt.setLeiJiShu(trMap.get("6"));
					tt.setBeiZhu(trMap.get("7"));
					mapper.updateByPrimaryKey(tt);
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
				}else{
					T152004 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
					tt.setChengBenBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setNaRongFanWeiMiaoShu(trMap.get("2"));
					tt.setDanJia(trMap.get("3"));
					tt.setJiSuanJiShu(trMap.get("4"));
					tt.setYuSuanChengBen(trMap.get("5"));
					tt.setBeiZhu(trMap.get("6"));
					mapper.updateByPrimaryKey(tt);
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
				}else{
					T152005 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
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
					mapper.updateByPrimaryKey(tt);
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
				}else{
					T152006 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setChengBenBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setNaRongFanWeiMiaoShu(trMap.get("2"));
					tt.setDanJia(trMap.get("3"));
					tt.setJiSuanJiShu(trMap.get("4"));
					tt.setYuSuanChengBen(trMap.get("5"));
					tt.setBeiZhu(trMap.get("6"));
					mapper.updateByPrimaryKey(tt);
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
				}else{
					T152007 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setChengBenBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setNaRongFanWeiMiaoShu(trMap.get("2"));
					tt.setDanJia(trMap.get("3"));
					tt.setJiSuanJiShu(trMap.get("4"));
					tt.setYuSuanChengBen(trMap.get("5"));
					tt.setBeiZhu(trMap.get("6"));
					mapper.updateByPrimaryKey(tt);
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
				}else{
					T153002 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
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
					mapper.updateByPrimaryKey(tt);
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
				}else{
					T154002 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setChengBenBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setNaRongFanWeiMiaoShu(trMap.get("2"));
					tt.setYuSuanChengBen(trMap.get("3"));
					tt.setJiHuaChengBen(trMap.get("4"));
					tt.setChengBenJiangDiLv(trMap.get("5"));
					tt.setBeiZhu(trMap.get("6"));
					mapper.updateByPrimaryKey(tt);

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
				}else{
					T155002 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
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
					mapper.updateByPrimaryKey(tt);
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
				}else{
					T155004 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
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
					mapper.updateByPrimaryKey(tt);
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
				}else{
					T155005 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
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
					mapper.updateByPrimaryKey(tt);
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
				}else{
					T156002 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
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
					mapper.updateByPrimaryKey(tt);
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
				}else{
					T157002 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
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
					mapper.updateByPrimaryKey(tt);
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
				}else{
					T158002 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setChengBenBianMa(trMap.get("0"));
					tt.setChengBenXiangMu(trMap.get("1"));
					tt.setNaRongFanWeiMiaoShu(trMap.get("2"));
					tt.setYuSuanChengBen(trMap.get("3"));
					tt.setShiJiChengBen(trMap.get("4"));
					tt.setBeiZhu(trMap.get("5"));
					mapper.updateByPrimaryKey(tt);
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
				}else{
					T158003 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
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
					mapper.updateByPrimaryKey(tt);
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
				}else{
					T158004 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
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
					mapper.updateByPrimaryKey(tt);

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
				}else{
					T159002 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
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
					mapper.updateByPrimaryKey(tt);
				}
				break;				
			}
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
				}else{
					T160002 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
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
					mapper.updateByPrimaryKey(tt);
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
				}else{
					T161002 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
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
					mapper.updateByPrimaryKey(tt);
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
				}else{
					T161003 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
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
					mapper.updateByPrimaryKey(tt);
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
				}else{
					T162002 tt =mapper.selectByPrimaryKey(Integer.parseInt(tr_id));
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
					mapper.updateByPrimaryKey(tt);
				}
			}
			break;				
		}
		}


		System.out.println(ptableCtx);
		System.out.println(ptableType+ptableCtx);
		System.out.println(ptable_id);
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write("[]");


		return;
	}
}
