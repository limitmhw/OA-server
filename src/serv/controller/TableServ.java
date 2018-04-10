package serv.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
public class TableServ extends BaseCtl {
	TableServ()throws IOException{

	}


	public void saveTableTitle(Integer ptable_id,String ptableInfo){

		//存储title

		////////////////////////////////////////
		JSONObject tableInfoJson;
		tableInfoJson = JSON.parseObject(ptableInfo);  
		Map<String, String> tableItemMap= JSONObject.toJavaObject(tableInfoJson, Map.class);
		WtableMapper tmapper = sqlSession.getMapper(WtableMapper.class);

		//System.out.println("tableItemMap.toString():");
		//System.out.println(tableItemMap.toString());


		//空字符串会报错这里用null替换空字符串

		//先查询
		Wtable ttable = tmapper.selectByPrimaryKey(ptable_id);
		//然后更新
		if(ttable==null){
			System.out.println("ptable_id有问题！！！！");
		}

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
		//System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
		//System.out.println(ttable.toString());
	}

	public void saveTableByType(Integer ptable_id,String ptableType,String ptableCtx)throws Exception{
		JSONObject json;
		Map<String, Object> itemMap = new HashMap<String, Object>();
		try{
			json = JSON.parseObject(ptableCtx);//这里对于非json数据可能会爆异常  
			itemMap= JSONObject.toJavaObject(json, Map.class);
		}catch(Exception e){

		}


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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
				//这里有bug？？？
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getClass()); 
				Map<String, String> trMap = JSONObject.toJavaObject((JSONObject)entry.getValue(), Map.class);
				String tr_id=trMap.get("tr_id");
				if(tr_id==null||tr_id.equals("")){
					T153002 tt=new T153002();
					tt.setTableId(ptable_id);
					tt.setTrOrder(Integer.parseInt(entry.getKey()));
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));

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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));

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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
					tt.setTrType(trMap.get("trType"));
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
		default:{				
			saveAsText(ptable_id, ptableCtx);
		}
		}


	}


	public Integer createNewExcel(String pexcelType,String pgong_cheng_id){
		// /////////////////////////////////
		// 创建Usermapper对象，mybatis自动生成mapper代理对象
		WexcelMapper mapper = sqlSession.getMapper(WexcelMapper.class);
		Wexcel record = new Wexcel();
		record.setExceltype(pexcelType);
		record.setGongChengId(Integer.parseInt(pgong_cheng_id));
		record.setExcelstatus("WEITIJIAO");
		record.setName(maskCTL.getExcelTypeName(pexcelType)+"(" + String.valueOf(mapper.countByExample(null) + 1)
				+ ")");
		java.sql.Date createDate = new java.sql.Date(
				new java.util.Date().getTime());
		record.setCreatedate(createDate);
		mapper.insert(record);
		System.out.println(record.getId());
		return record.getId();

	}

	public List<String> getTableForExcel(String tem_excelType) {
		List<String> subTable = new ArrayList<String>();

		return maskCTL.getExcelSubTableType(tem_excelType);
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
		String pexcelType = request.getParameter("excelType");
		String pgong_cheng_id = request.getParameter("gong_cheng_id");

		Integer excel_id=createNewExcel( pexcelType, pgong_cheng_id);
		createExcelSubTable(excel_id, pexcelType);
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
	/*
	@RequestMapping("getTableTypeList")
	public void table6_1(HttpServletRequest request, HttpServletResponse response)
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
	 */
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

		String ss="[";
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
			TableRef im=new TableRef();
			ss+=im.getDataFrom152_456To2(Integer.parseInt(ptable_id));
			System.out.println("getDataFrom152_456To2:");
			System.out.println(im.getDataFrom152_456To2(Integer.parseInt(ptable_id)));
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
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
				ss+="{\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
			}


			break;				
		}
		default:{
			System.out.println("TXT存储");
			TableContentMapper t_mapper = sqlSession.getMapper(TableContentMapper.class);
			TableContentExample ee=new TableContentExample();
			ee.or().andTableIdEqualTo(Integer.parseInt(ptable_id));
			List<TableContent> lee=t_mapper.selectByExample(ee);
			if(lee.size()>0){
				//				System.out.println(lee.get(0).getId());
				//				System.out.println(lee.get(0).getTableId());
				//				System.out.println(lee.get(0).getContent());
				String cc=lee.get(0).getContent();
				response.setHeader("Content-type", "text/html;charset=UTF-8");
				response.getWriter().write(cc);
				return;

			}
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

		if(istitle!=null&&istitle.equals("istitle")){

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

		Integer ptable_id= Integer.parseInt(request.getParameter("id"));
		String ptableType= request.getParameter("tableType");
		String ptableCtx= request.getParameter("tableCtx");
		String ptableInfo= request.getParameter("tableInfo");
		this.saveTableTitle(ptable_id,  ptableInfo);
		this.saveTableByType(ptable_id, ptableType, ptableCtx);
		System.out.println(ptableCtx);
		System.out.println(ptableType+ptableCtx);
		System.out.println(ptable_id);
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write("[]");
		return;
	}

	@RequestMapping("createExcelAndSaveTable")
	public void table10(HttpServletRequest request, HttpServletResponse response) throws Exception{

		System.out.println("createExcelAndSaveTable");

		String pgong_cheng_id= request.getParameter("gong_cheng_id"); 
		String pexcelType= request.getParameter("excelType"); 
		String ptableType= request.getParameter("tableType"); 
		String ptableInfo= request.getParameter("tableInfo");
		String ptableCtx= request.getParameter("tableCtx"); 
	
		Integer excel_id=createNewExcel( pexcelType, pgong_cheng_id);
		List<String> subTable = getTableForExcel(pexcelType);
		String ss="[";
		for (String i : subTable) {
			// 创建Usermapper对象，mybatis自动生成mapper代理对象
			WtableMapper ttmapper = sqlSession.getMapper(WtableMapper.class);
			Wtable tt = new Wtable();
			tt.setTabletype(i);
			tt.setExcelId(excel_id);
			ttmapper.insert(tt);
			Integer ptable_id=tt.getId();
			System.out.println(i);
			System.out.println(ptableType);
			if(i.equals(ptableType)){
				this.saveTableTitle(ptable_id,  ptableInfo);
				this.saveTableByType(ptable_id, ptableType, ptableCtx);
			}
			ss+="{\"tableId\":\""+ptable_id+"\",\"tableType\":\""+i+"\"},";
		}
		ss+="]";

		String ret="{\"excelId\":\""+excel_id+"\",\"excelType\":\""+pexcelType +"\",\"table\":"+ss +"}";
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ret);
		return;
	}
	public String func_emptyLiItem(
			String title,
			String template,
			String excelType){
		String img_empty="<img src=\"./images/file.png\" style=\"-moz-box-sizing: border-box; -webkit-box-sizing:border-box; border: 0; box-sizing: border-box;vertical-align: middle;\">";

		return 	"<li emptyfile=\"true\" layout=\"click\" title=\""+title+"\" " +
		"exceltype=\""+excelType+"\"" +
		"template_tab=\""+template+"\" >" +
		img_empty+"<span>"+title+"</span></li>";
	}
	public String func_liItem(
			String excelId,
			String exceltype,
			String title,String gong_cheng_id){
		String img_file="<img src=\"./images/file2.png\" style=\"-moz-box-sizing: border-box; -webkit-box-sizing:border-box; border: 0; box-sizing: border-box;vertical-align: middle;\">";
		return "<li layout=\"click\" excel_id=\""+excelId+"\" title=\""+title+"\"" +
		" exceltype=\""+exceltype+"\" gong_cheng_id=\""+gong_cheng_id+"\" " +
		">"+img_file+"<span>"+title+"</span></li>";
	}
	public String func_allExcelTypeliItem(String pexcelType,String pgong_cheng_id){
		WexcelMapper mapper = sqlSession.getMapper(WexcelMapper.class);
		WexcelExample ee=new WexcelExample();
		ee.setOrderByClause("createdate");
		ee.or().andExceltypeEqualTo(pexcelType).andGongChengIdEqualTo(Integer.parseInt(pgong_cheng_id));	
		List<Wexcel> lee=mapper.selectByExample(ee);
		String ss="";
		System.out.println(pexcelType+"  lee.size():");
		System.out.println(lee.size());
		for(Wexcel it : lee) {
			ss+=func_liItem(String.valueOf(it.getId()),
					pexcelType,
					it.getName(),
					pgong_cheng_id);
			System.out.println(it.getName());
		}

		return ss;
	}

	public String func_UlLiItem(
			String title,
			String[] ooStrArr){

		List<String> innerStrArr=new ArrayList<>();
		//过滤空字符串
		for(String it:ooStrArr){
			if(it.trim().length()!=0){
				innerStrArr.add(it);
			}
		}
		if(innerStrArr.size()==0){
			return "";
		}
		if(innerStrArr.size()==1){
			return innerStrArr.get(0);
		}
		String innerStr="";
		for(String ss: innerStrArr){
			innerStr+=ss;
		}
		String img_folder="<img src=\"./images/folder.png\" style=\"-moz-box-sizing: border-box; -webkit-box-sizing:border-box; border: 0; box-sizing: border-box;vertical-align: middle;\">";
		return "<li id=\"\" title=\""+title+"\" >" +
		img_folder+	"<span>"+title+"</span>"+
		"<ul>"+
		innerStr+
		"</ul></li>";
	}
	public String getExcelItem(String userCmask,String excelType,String gong_cheng_id){
		//这里判断权限
		String template="";
		String[] titleAndMask=maskCTL.getExcelTypeNameAndMask(String.valueOf(Integer.parseInt(excelType)));
		String title=titleAndMask[0];
		String gatewayMask=titleAndMask[1];

		if(maskCTL.isExist(userCmask,gatewayMask)){
			return func_emptyLiItem(title, template, excelType)+
					func_allExcelTypeliItem(excelType, gong_cheng_id);
		}
		return "";


	}

	@RequestMapping("get_ooMenu")
	public void func11(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String modelId=request.getParameter("modelId");
		System.out.println(modelId);
		String ss;
		String gong_cheng_id="1";





		Integer yongHuZuId=(Integer)request.getSession().getAttribute("yongHuZuId");
		yongHuZuId=23;
		//这里写23要不然会报错，因为没有为登录用户分配
		String userCmask=this.getCMask(Integer.parseInt(gong_cheng_id)
				,yongHuZuId);
		if(userCmask.length()<5){
			return;
		}
		/*
		userCmask="1111111111111111111111111"+
				"1111111111111111111111111"+
				"1111111111111111111111111"+
				"1111111111111111111111111"+
				"1111111111111111111111111"+
				"1111111111111111111111111"+
				"1111111111111111111111111"+
				"1111111111111111111111111"+
				"1111111111111111111111111"+
				"1111111111111111111111111"+
				"1111111111111111111111111"+
				"1111111111111111111111111";
		 */
		ss="<ul>";
		switch(modelId){
		case "o_p":{
			ss+=func_UlLiItem("机构设置",new String[] {
					getExcelItem(userCmask,"0", gong_cheng_id)
			});
			ss+=func_UlLiItem("人员配备",new String[] {
					getExcelItem(userCmask,"1", gong_cheng_id)
			});
			ss+=func_UlLiItem("任务部署",new String[] {
					getExcelItem(userCmask,"2", gong_cheng_id)
			});
			ss+=func_UlLiItem("权责分配",new String[] {
					getExcelItem(userCmask,"3", gong_cheng_id)
			});
			ss+=func_UlLiItem("策划编制",new String[] {
					getExcelItem(userCmask,"4", gong_cheng_id)
			});
			break;
		}
		case "a_o":{
			ss+=func_UlLiItem("工作计划",new String[] {
					getExcelItem(userCmask,"5", gong_cheng_id)
			});
			ss+=func_UlLiItem("文件草拟",new String[] {
					getExcelItem(userCmask,"6", gong_cheng_id),
					getExcelItem(userCmask,"7", gong_cheng_id),
					getExcelItem(userCmask,"8", gong_cheng_id),
					getExcelItem(userCmask,"9", gong_cheng_id),
					getExcelItem(userCmask,"10", gong_cheng_id),
					getExcelItem(userCmask,"11", gong_cheng_id),
					getExcelItem(userCmask,"12", gong_cheng_id)
			});
			ss+=func_UlLiItem("文件收发",new String[] {
					getExcelItem(userCmask,"13", gong_cheng_id),
					getExcelItem(userCmask,"14", gong_cheng_id),
					getExcelItem(userCmask,"15", gong_cheng_id)
			});
			ss+=func_UlLiItem("员工考勤",new String[] {
					getExcelItem(userCmask,"16", gong_cheng_id),
					getExcelItem(userCmask,"17", gong_cheng_id),
					getExcelItem(userCmask,"18", gong_cheng_id)
			});
			ss+=func_UlLiItem("印鉴使用",new String[] {
					getExcelItem(userCmask,"19", gong_cheng_id),
					getExcelItem(userCmask,"20", gong_cheng_id)
			});
			ss+=func_UlLiItem("办公用品",new String[] {
					getExcelItem(userCmask,"21", gong_cheng_id),
					getExcelItem(userCmask,"22", gong_cheng_id),
					getExcelItem(userCmask,"23", gong_cheng_id)
			});
			ss+=func_UlLiItem("图书借阅",new String[] {
					getExcelItem(userCmask,"24", gong_cheng_id),
					getExcelItem(userCmask,"25", gong_cheng_id)
			});
			ss+=func_UlLiItem("车辆使用",new String[] {
					getExcelItem(userCmask,"26", gong_cheng_id),
					getExcelItem(userCmask,"27", gong_cheng_id)
			});
			ss+=func_UlLiItem("资产管理",new String[] {
					getExcelItem(userCmask,"28", gong_cheng_id)
			});
			break;
		}
		case "b_p":{
			ss+=func_UlLiItem("招标准备",new String[] {
					getExcelItem(userCmask,"29", gong_cheng_id),
					getExcelItem(userCmask,"30", gong_cheng_id)
			});
			ss+=func_UlLiItem("招标公告",new String[] {
					getExcelItem(userCmask,"31", gong_cheng_id)
			});
			ss+=func_UlLiItem("报名资审",new String[] {
					getExcelItem(userCmask,"32", gong_cheng_id),
					getExcelItem(userCmask,"33", gong_cheng_id)
			});
			ss+=func_UlLiItem("文件领取",new String[] {
					getExcelItem(userCmask,"34", gong_cheng_id)
			});
			ss+=func_UlLiItem("投标报价",new String[] {
					getExcelItem(userCmask,"35", gong_cheng_id)
			});
			ss+=func_UlLiItem("开评定标",new String[] {
					getExcelItem(userCmask,"36", gong_cheng_id),
					getExcelItem(userCmask,"37", gong_cheng_id)
			});
			ss+=func_UlLiItem("中标通知",new String[] {
					getExcelItem(userCmask,"38", gong_cheng_id)
			});
			break;
		}
		case "c_b":{
			ss+=func_UlLiItem("合同签订 ",new String[] {
					getExcelItem(userCmask,"39", gong_cheng_id)
			});
			ss+=func_UlLiItem("合同交底",new String[] {
					getExcelItem(userCmask,"40", gong_cheng_id)
			});
			ss+=func_UlLiItem("合同变更",new String[] {
					getExcelItem(userCmask,"41", gong_cheng_id)
			});
			ss+=func_UlLiItem("合同台账",new String[] {
					getExcelItem(userCmask,"42", gong_cheng_id)
			});
			ss+=func_UlLiItem("供方名册",new String[] {
					getExcelItem(userCmask,"43", gong_cheng_id)
			});
			break;
		}
		case "p_t":{
			ss+=func_UlLiItem("技术准备",new String[] {
					getExcelItem(userCmask,"44", gong_cheng_id),
					getExcelItem(userCmask,"45", gong_cheng_id),
					getExcelItem(userCmask,"46", gong_cheng_id),
					getExcelItem(userCmask,"47", gong_cheng_id),
					getExcelItem(userCmask,"48", gong_cheng_id),
					getExcelItem(userCmask,"49", gong_cheng_id),
					getExcelItem(userCmask,"50", gong_cheng_id)
			});
			ss+=func_UlLiItem("资源需求",new String[] {
					getExcelItem(userCmask,"51", gong_cheng_id),
					getExcelItem(userCmask,"52", gong_cheng_id),
					getExcelItem(userCmask,"53", gong_cheng_id),
					getExcelItem(userCmask,"54", gong_cheng_id),
					getExcelItem(userCmask,"55", gong_cheng_id)
			});
			ss+=func_UlLiItem("生产组织",new String[] {
					getExcelItem(userCmask,"56", gong_cheng_id),
					getExcelItem(userCmask,"57", gong_cheng_id),
					getExcelItem(userCmask,"58", gong_cheng_id),
					getExcelItem(userCmask,"59", gong_cheng_id)
			});
			ss+=func_UlLiItem("进度控制",new String[] {
					getExcelItem(userCmask,"60", gong_cheng_id),
					getExcelItem(userCmask,"61", gong_cheng_id)
			});
			ss+=func_UlLiItem("质量控制",new String[] {
					getExcelItem(userCmask,"62", gong_cheng_id),
					getExcelItem(userCmask,"63", gong_cheng_id)
			});
			ss+=func_UlLiItem("安全控制",new String[] {
					getExcelItem(userCmask,"64", gong_cheng_id),
					getExcelItem(userCmask,"65", gong_cheng_id),
					getExcelItem(userCmask,"66", gong_cheng_id),
					getExcelItem(userCmask,"67", gong_cheng_id)
			});
			ss+=func_UlLiItem("环境控制",new String[] {
					getExcelItem(userCmask,"68", gong_cheng_id),
					getExcelItem(userCmask,"69", gong_cheng_id)
			});
			ss+=func_UlLiItem("监测装置",new String[] {
					getExcelItem(userCmask,"70", gong_cheng_id),
					getExcelItem(userCmask,"71", gong_cheng_id)
			});
			ss+=func_UlLiItem("施工日志",new String[] {
					getExcelItem(userCmask,"72", gong_cheng_id)
			});
			ss+=func_UlLiItem("生产月报",new String[] {
					getExcelItem(userCmask,"73", gong_cheng_id)
			});
			ss+=func_UlLiItem("管理台账",new String[] {
					getExcelItem(userCmask,"74", gong_cheng_id),
					getExcelItem(userCmask,"75", gong_cheng_id),
					getExcelItem(userCmask,"76", gong_cheng_id)
			});
			break;
		}
		case "s_m":{
			ss+=func_UlLiItem("进场计划",new String[] {
					getExcelItem(userCmask,"77", gong_cheng_id),
					getExcelItem(userCmask,"78", gong_cheng_id)
			});
			ss+=func_UlLiItem("进场登记",new String[] {
					getExcelItem(userCmask,"79", gong_cheng_id),
					getExcelItem(userCmask,"80", gong_cheng_id),
					getExcelItem(userCmask,"81", gong_cheng_id),
					getExcelItem(userCmask,"82", gong_cheng_id),
					getExcelItem(userCmask,"83", gong_cheng_id)
			});
			ss+=func_UlLiItem("人员注册",new String[] {
					getExcelItem(userCmask,"84", gong_cheng_id),
					getExcelItem(userCmask,"85", gong_cheng_id)
			});
			ss+=func_UlLiItem("入场教育",new String[] {
					getExcelItem(userCmask,"86", gong_cheng_id)
			});
			ss+=func_UlLiItem("劳务考勤",new String[] {
					getExcelItem(userCmask,"87", gong_cheng_id),
					getExcelItem(userCmask,"88", gong_cheng_id),
					getExcelItem(userCmask,"89", gong_cheng_id)
			});
			ss+=func_UlLiItem("工资发放",new String[] {
					getExcelItem(userCmask,"90", gong_cheng_id)
			});
			ss+=func_UlLiItem("维保计划",new String[] {
					getExcelItem(userCmask,"91", gong_cheng_id)
			});
			ss+=func_UlLiItem("运行记录",new String[] {
					getExcelItem(userCmask,"92", gong_cheng_id),
					getExcelItem(userCmask,"93", gong_cheng_id)
			});
			ss+=func_UlLiItem("维保记录",new String[] {
					getExcelItem(userCmask,"94", gong_cheng_id),
					getExcelItem(userCmask,"95", gong_cheng_id)
			});
			ss+=func_UlLiItem("事故报告",new String[] {
					getExcelItem(userCmask,"96", gong_cheng_id)
			});
			ss+=func_UlLiItem("使用评价",new String[] {
					getExcelItem(userCmask,"97", gong_cheng_id),
					getExcelItem(userCmask,"98", gong_cheng_id),
					getExcelItem(userCmask,"99", gong_cheng_id)
			});
			break;
		}
		case "m_e":{
			ss+=func_UlLiItem("物资供应",new String[] {
					getExcelItem(userCmask,"100", gong_cheng_id),
					getExcelItem(userCmask,"101", gong_cheng_id),
					getExcelItem(userCmask,"102", gong_cheng_id)
			});
			ss+=func_UlLiItem("进场计划",new String[] {
					getExcelItem(userCmask,"103", gong_cheng_id)
			});
			ss+=func_UlLiItem("进场通知",new String[] {
					getExcelItem(userCmask,"104", gong_cheng_id)
			});
			ss+=func_UlLiItem("验收入库",new String[] {
					getExcelItem(userCmask,"105", gong_cheng_id),
					getExcelItem(userCmask,"106", gong_cheng_id),
					getExcelItem(userCmask,"107", gong_cheng_id),
					getExcelItem(userCmask,"108", gong_cheng_id),
					getExcelItem(userCmask,"109", gong_cheng_id)
			});
			ss+=func_UlLiItem("领用出库",new String[] {
					getExcelItem(userCmask,"110", gong_cheng_id),
					getExcelItem(userCmask,"111", gong_cheng_id)
			});
			ss+=func_UlLiItem("贮存保管",new String[] {
					getExcelItem(userCmask,"112", gong_cheng_id),
					getExcelItem(userCmask,"113", gong_cheng_id)
			});
			ss+=func_UlLiItem("库存盘点",new String[] {
					getExcelItem(userCmask,"114", gong_cheng_id),
					getExcelItem(userCmask,"115", gong_cheng_id)
			});
			ss+=func_UlLiItem("检验报验",new String[] {
					getExcelItem(userCmask,"116", gong_cheng_id),
					getExcelItem(userCmask,"117", gong_cheng_id),
					getExcelItem(userCmask,"118", gong_cheng_id),
					getExcelItem(userCmask,"119", gong_cheng_id),
					getExcelItem(userCmask,"120", gong_cheng_id),
			});
			ss+=func_UlLiItem("废料处置",new String[] {
					getExcelItem(userCmask,"121", gong_cheng_id),
					getExcelItem(userCmask,"122", gong_cheng_id)
			});
			ss+=func_UlLiItem("账目报表",new String[] {

					getExcelItem(userCmask,"123", gong_cheng_id),
					getExcelItem(userCmask,"124", gong_cheng_id),
					getExcelItem(userCmask,"125", gong_cheng_id),
					getExcelItem(userCmask,"126", gong_cheng_id),
					getExcelItem(userCmask,"127", gong_cheng_id),
			});
			break;
		}
		case "e_m":{////
			ss+=func_UlLiItem("计划编制",new String[] {
					getExcelItem(userCmask,"128", gong_cheng_id)
			});
			ss+=func_UlLiItem("取样通知",new String[] {
					getExcelItem(userCmask,"129", gong_cheng_id)
			});
			ss+=func_UlLiItem("试样制取",new String[] {
					getExcelItem(userCmask,"130", gong_cheng_id)
			});
			ss+=func_UlLiItem("试样养护",new String[] {
					getExcelItem(userCmask,"131", gong_cheng_id)
			});
			ss+=func_UlLiItem("试样送检",new String[] {
					getExcelItem(userCmask,"132", gong_cheng_id)
			});
			ss+=func_UlLiItem("检验报告",new String[] {
					getExcelItem(userCmask,"133", gong_cheng_id)
			});
			ss+=func_UlLiItem("工程资料",new String[] {
					getExcelItem(userCmask,"134", gong_cheng_id),
					getExcelItem(userCmask,"135", gong_cheng_id),
					getExcelItem(userCmask,"136", gong_cheng_id)
			});
			break;
		}
		case "b_c":{
			ss+=func_UlLiItem("工程计量",new String[] {
					getExcelItem(userCmask,"137", gong_cheng_id),
					getExcelItem(userCmask,"138", gong_cheng_id),
					getExcelItem(userCmask,"139", gong_cheng_id)
			});
			ss+=func_UlLiItem("工程计价",new String[] {
					getExcelItem(userCmask,"140", gong_cheng_id),
					getExcelItem(userCmask,"141", gong_cheng_id),
					getExcelItem(userCmask,"142", gong_cheng_id)
			});
			ss+=func_UlLiItem("分供结算",new String[] {
					getExcelItem(userCmask,"143", gong_cheng_id),
					getExcelItem(userCmask,"144", gong_cheng_id),
					getExcelItem(userCmask,"145", gong_cheng_id),
					getExcelItem(userCmask,"146", gong_cheng_id),
					getExcelItem(userCmask,"147", gong_cheng_id),
					getExcelItem(userCmask,"148", gong_cheng_id),
					getExcelItem(userCmask,"149", gong_cheng_id)
			});
			ss+=func_UlLiItem("总包结算",new String[] {
					getExcelItem(userCmask,"150", gong_cheng_id),
					//这里跳
					getExcelItem(userCmask,"163", gong_cheng_id)
			});
			break;
		}
		case "v_c":{
			ss+=func_UlLiItem("现场签证",new String[] {
					getExcelItem(userCmask,"164", gong_cheng_id)
			});
			ss+=func_UlLiItem("变更索赔",new String[] {
					getExcelItem(userCmask,"165", gong_cheng_id),
					getExcelItem(userCmask,"166", gong_cheng_id)
			});
			ss+=func_UlLiItem("收支记录",new String[] {
					getExcelItem(userCmask,"167", gong_cheng_id)
			});
			break;
		}
		case "c_p":{
			ss+=func_UlLiItem("成本责任",new String[] {
					getExcelItem(userCmask,"151", gong_cheng_id)
			});
			ss+=func_UlLiItem("成本测算",new String[] {
					getExcelItem(userCmask,"152", gong_cheng_id),
					getExcelItem(userCmask,"153", gong_cheng_id)
			});
			ss+=func_UlLiItem("成本计划",new String[] {
					getExcelItem(userCmask,"154", gong_cheng_id)
			});
			ss+=func_UlLiItem("成本控制",new String[] {
					getExcelItem(userCmask,"155", gong_cheng_id),
					getExcelItem(userCmask,"156", gong_cheng_id)
			});
			ss+=func_UlLiItem("成本核算",new String[] {
					getExcelItem(userCmask,"157", gong_cheng_id),
					getExcelItem(userCmask,"158", gong_cheng_id)
			});
			ss+=func_UlLiItem("成本分析",new String[] {
					getExcelItem(userCmask,"159", gong_cheng_id),
					getExcelItem(userCmask,"160", gong_cheng_id),
					getExcelItem(userCmask,"161", gong_cheng_id)
			});
			ss+=func_UlLiItem("利润预测",new String[] {
					getExcelItem(userCmask,"162", gong_cheng_id)
			});
			break;
		}
		case "o_m":{
			ss+=func_UlLiItem("资金计划",new String[] {
					getExcelItem(userCmask,"168", gong_cheng_id),
					getExcelItem(userCmask,"169", gong_cheng_id)
			});
			ss+=func_UlLiItem("进度报量",new String[] {
					getExcelItem(userCmask,"170", gong_cheng_id)
			});
			ss+=func_UlLiItem("资金回收",new String[] {
					getExcelItem(userCmask,"171", gong_cheng_id),
					getExcelItem(userCmask,"172", gong_cheng_id)
			});
			ss+=func_UlLiItem("确认进度",new String[] {
					getExcelItem(userCmask,"173", gong_cheng_id)
			});
			ss+=func_UlLiItem("资金支付",new String[] {
					getExcelItem(userCmask,"174", gong_cheng_id),
					getExcelItem(userCmask,"175", gong_cheng_id)
			});
			ss+=func_UlLiItem("资金往来",new String[] {
					getExcelItem(userCmask,"176", gong_cheng_id)
			});
			break;
		}
		case "e_e":{
			ss+=func_UlLiItem("考核",new String[] {
					getExcelItem(userCmask,"177", gong_cheng_id)
			});
			ss+=func_UlLiItem("激励",new String[] {
					getExcelItem(userCmask,"178", gong_cheng_id)
			});
			break;
		}
		case "c_m":{
			ss+=func_UlLiItem("项目解体",new String[] {
					getExcelItem(userCmask,"179", gong_cheng_id),
					getExcelItem(userCmask,"180", gong_cheng_id),
					getExcelItem(userCmask,"181", gong_cheng_id)
			});
			ss+=func_UlLiItem("工程移交",new String[] {
					getExcelItem(userCmask,"182", gong_cheng_id),
					getExcelItem(userCmask,"183", gong_cheng_id)
			});
			ss+=func_UlLiItem("资料移交",new String[] {
					getExcelItem(userCmask,"184", gong_cheng_id),
					getExcelItem(userCmask,"185", gong_cheng_id)
			});
			ss+=func_UlLiItem("项目总结",new String[] {
					getExcelItem(userCmask,"186", gong_cheng_id)
			});
			ss+=func_UlLiItem("工程回访",new String[] {
					getExcelItem(userCmask,"187", gong_cheng_id),
					getExcelItem(userCmask,"188", gong_cheng_id),
					getExcelItem(userCmask,"189", gong_cheng_id)
			});
			ss+=func_UlLiItem("业主投诉",new String[] {
					getExcelItem(userCmask,"190", gong_cheng_id)
			});
			ss+=func_UlLiItem("工程维保",new String[] {
					getExcelItem(userCmask,"191", gong_cheng_id),
					getExcelItem(userCmask,"192", gong_cheng_id)
			});
			break;
		}
		}

		ss+="</ul>";

		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ss);
		return;
	}
	@RequestMapping("get_excelTypeTemplate")
	public void func12(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String excelType=request.getParameter("excelType");
		String ss=maskCTL.getTemplateTab(excelType);
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ss);
		return;
	}
	@RequestMapping("renameExcelById")
	public void func13(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Integer excelId=Integer.parseInt(request.getParameter("excelId"));
		String newName=request.getParameter("newName");
		WexcelMapper mapper = sqlSession.getMapper(WexcelMapper.class);
		Wexcel record = mapper.selectByPrimaryKey(excelId);
		if(newName.trim().length()!=0){
			record.setName(newName);
		}
		mapper.updateByPrimaryKey(record);

		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write("success");
		return;
	}

	public void saveAsText(Integer tableId,String content)throws Exception {
		TableContentMapper mapper = sqlSession.getMapper(TableContentMapper.class);
		TableContentExample ee=new TableContentExample();
		ee.or().andTableIdEqualTo(tableId);
		System.out.println(content);
		List<TableContent> lee=mapper.selectByExample(ee);
		if(lee.size()==0){
			TableContent record=new TableContent();
			record.setTableId(tableId);
			record.setContent(content.trim());
			mapper.insert(record);
		}else{
			TableContent record=lee.get(0);
			record.setTableId(tableId);
			record.setContent(content.trim());
			mapper.updateByPrimaryKey(record);
		}

		return;
	}
}


/**
//excel表对应状态
WEITIJIAO//未提交
ZHUBAN//主办
PINGSHEN//评审
SHENHE//审核
SHENPI//审批
YITONGGUO//已通过
 */
