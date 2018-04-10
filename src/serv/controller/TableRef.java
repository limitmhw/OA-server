package serv.controller;

import java.io.IOException;
import java.util.List;

import model.mapper.*;
import model.po.*;


public class TableRef extends BaseCtl{
	TableRef() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDataFrom152_456To2(Integer table_id_152002){

		
		
		sqlSession.getMapper(WtableMapper.class);
		
		String ss="";
		int ptable_id4=-1;
		int ptable_id5=-1;
		int ptable_id6=-1;

		WtableMapper mapper_ex = sqlSession.getMapper(WtableMapper.class);
		Wtable t152=mapper_ex.selectByPrimaryKey(table_id_152002);
		Integer pexcel_id=t152.getExcelId();
		WtableExample ee_ex=new WtableExample();
		ee_ex.or().andExcelIdEqualTo(pexcel_id);	
		List<Wtable>  lee_ex=mapper_ex.selectByExample(ee_ex);

		for(Wtable it:lee_ex){
			System.out.println(it.getTabletype());
			if("152_004".equals(it.getTabletype())){
				ptable_id4=it.getId();
			}
			if("152_005".equals(it.getTabletype())){
				ptable_id5=it.getId();
			}
			if("152_006".equals(it.getTabletype())){
				ptable_id6=it.getId();
			}

		}




		if(ptable_id4!=-1){
			T152004Mapper t_mapper4 = sqlSession.getMapper(T152004Mapper.class);
			T152004Example ee4=new T152004Example();
			ee4.setOrderByClause("tr_order");
			ee4.or().andTableIdEqualTo(ptable_id4);
			List<T152004> lee4=t_mapper4.selectByExample(ee4);

			for(T152004 it : lee4) {
				String tr_data="["
						+"\""+String.valueOf(it.getChengBenBianMa())+"\","
						+"\""+String.valueOf(it.getChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getNaRongFanWeiMiaoShu())+"\","
						+"\""+String.valueOf("")+"\","
						+"\""+String.valueOf("")+"\","
						+"\""+String.valueOf("")+"\","
						+"\""+String.valueOf("")+"\","
						+"\""+String.valueOf("")+"\","
						+"]";
				ss+="{\"tabletype\":\""+String.valueOf("152_004")+"\",\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
			}
		}


		if(ptable_id5!=-1){

			T152005Mapper t_mapper5 = sqlSession.getMapper(T152005Mapper.class);
			T152005Example ee5=new T152005Example();
			ee5.setOrderByClause("tr_order");
			ee5.or().andTableIdEqualTo(ptable_id5);
			List<T152005> lee5=t_mapper5.selectByExample(ee5);
			for(T152005 it : lee5) {
				String tr_data="["	
						+"\""+String.valueOf(it.getBianHao())+"\","
						+"\""+String.valueOf(it.getCaiLiaoMingChen())+"\","
						+"\""+String.valueOf(it.getGuiGeXingHao())+"\","
						+"\""+String.valueOf("")+"\","
						+"\""+String.valueOf("")+"\","
						+"\""+String.valueOf("")+"\","
						+"\""+String.valueOf("")+"\","
						+"\""+String.valueOf("")+"\","
						+"]";
				ss+="{\"tabletype\":\""+String.valueOf("152_005")+"\",\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
			}
		}

		if(ptable_id6!=-1){
			T152006Mapper t_mapper6 = sqlSession.getMapper(T152006Mapper.class);
			T152006Example ee6=new T152006Example();
			ee6.setOrderByClause("tr_order");
			ee6.or().andTableIdEqualTo(ptable_id6);
			List<T152006> lee6=t_mapper6.selectByExample(ee6);

			for(T152006 it : lee6) {
				String tr_data="["	
						+"\""+String.valueOf(it.getChengBenBianMa())+"\","
						+"\""+String.valueOf(it.getChengBenXiangMu())+"\","
						+"\""+String.valueOf(it.getNaRongFanWeiMiaoShu())+"\","
						+"\""+String.valueOf("")+"\","
						+"\""+String.valueOf("")+"\","
						+"\""+String.valueOf("")+"\","
						+"\""+String.valueOf("")+"\","
						+"\""+String.valueOf("")+"\","
						+"]";
				ss+="{\"tabletype\":\""+String.valueOf("152_006")+"\",\"tr_id\":\""+String.valueOf(it.getId())+"\",\"tr_order\":\""+String.valueOf(it.getTrOrder())+"\",\"trType\":\""+String.valueOf(it.getTrType())+"\",\"tr_data\":"+tr_data+"},";	
			}
		}

		return ss;
	}
}
