package serv.controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import model.mapper.*;
import model.po.*;
@Controller
@RequestMapping("/authority")
public class AuthorityServ extends BaseCtl {
	AuthorityServ()throws IOException{
		
	}

	private String changeResult(String vv){
		if(vv==null)return "0";
		if(vv.equals("1")){
			return "1";
		}
		return "0";
	}

	public String getCMask(Integer proId,Integer yongHuZuId){
		String cmask="";
		EauthorityMapper mapper = sqlSession.getMapper(EauthorityMapper.class);
		EauthorityExample ee=new EauthorityExample();
		ee.or().andGongChengIdEqualTo(proId).andYongHuZuIdEqualTo(yongHuZuId);
		List<Eauthority> lee=mapper.selectByExample(ee);
		if(lee.size()!=1){
			System.out.println("Find Mask Error");
			return cmask;
		}else{
			cmask=lee.get(0).getMask();
		}
		return cmask;
	}
	public String createAuthorityByMap(Map<String,String> mm){
		List< String > at = maskCTL.getValueFromMap(mm);
		String mask="";
		for(String i:at){
			mask+=changeResult(i);
		}
		return mask;
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

		String renYuanId = request.getParameter("renYuanId");
		String pro_id = request.getParameter("pro_id");
		Integer yongHuZuId=Integer.parseInt(renYuanId);
		Integer proId=Integer.parseInt(pro_id);



		String cmask=getCMask(proId,yongHuZuId);
		if(cmask.length()<5){
			return;
		}

		cmask="1111111111111111111111111"+
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
		//*/
		String ss="[";
		ss=maskCTL.getMenuJsonFromMask(cmask);
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ss);
		return;
	}

	@RequestMapping("set_authority")
	public void func4(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String pro_id = request.getParameter("pro_id");
		String authority = request.getParameter("authority");
		JSONObject tableInfoJson;
		tableInfoJson = JSON.parseObject(authority);  
		Map<String, String> ItemMap= JSONObject.toJavaObject(tableInfoJson, Map.class);

		Map<String, Map<String, String> > rQuanXianMap=new HashMap(); 
		for (Map.Entry<String, String> entry : ItemMap.entrySet()) {
			String cc=entry.getKey();
			String[] splitcc=cc.split("#");
			if(splitcc.length==2){
				String yongHongId=splitcc[0];
				String tableType=splitcc[1];
				if(rQuanXianMap.containsKey(yongHongId)){
					Map<String, String> tem=rQuanXianMap.get(yongHongId);
					if(!tem.containsKey(tableType)){
						tem.put(tableType, entry.getValue());
					}
				}else{
					Map<String, String> tem=new HashMap();
					rQuanXianMap.put(yongHongId, tem);
				}
			}
		}


		EauthorityMapper mapper = sqlSession.getMapper(EauthorityMapper.class);
		for (Entry<String, Map<String, String>> entry : rQuanXianMap.entrySet()) {
			Map<String, String>ppa=entry.getValue();
			String aas=createAuthorityByMap(ppa);
			Integer yongHuZuId=Integer.parseInt(entry.getKey());
			EauthorityExample ee=new EauthorityExample();
			pro_id="1";
			ee.or().andGongChengIdEqualTo(Integer.parseInt(pro_id)).andYongHuZuIdEqualTo(yongHuZuId);
			List<Eauthority> lee=mapper.selectByExample(ee);
			if(lee.size()==0){
				Eauthority nn=new Eauthority();
				nn.setGongChengId(1);
				nn.setYongHuZuId(yongHuZuId);
				nn.setMask(aas);
				mapper.insert(nn);	
			}else{
				Eauthority nn=lee.get(0);
				nn.setMask(aas);
				mapper.updateByPrimaryKey(nn);
			}
		}
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write("ssss");
		return;
	}
	@RequestMapping("get_authority")
	public void func6(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String pro_id = request.getParameter("pro_id");
		EauthorityMapper mapper = sqlSession.getMapper(EauthorityMapper.class);
		EauthorityExample ee=new EauthorityExample();
		ee.or().andGongChengIdEqualTo(Integer.parseInt(pro_id));
		List<Eauthority> lee=mapper.selectByExample(ee);
		String ret="[";
		for(Eauthority k :lee){
			String ss="{"+
					"\"renYuanId\":\""+k.getYongHuZuId()+"\","+
					"\"mask\":"+maskCTL.getJsonFromMask(k.getMask())+"},";
			ret+=ss;
		}
		ret+="]";
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ret);
		return;
	}
	
	@RequestMapping("get_people_and_table_init")
	public void func7(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String ret=maskCTL.getPeopleAndTableInit();
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(ret);
	}
}


