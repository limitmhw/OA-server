package serv.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import model.mapper.EauthorityMapper;
import model.po.Eauthority;
import model.po.EauthorityExample;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BaseCtl extends SystemConst {
	//public  SqlSession sqlSession;
	public static SqlSession sqlSession;

	public MaskHandle maskCTL;
	BaseCtl()throws IOException{
		maskCTL=new MaskHandle();

		//这里有个BUG，_mybatis有缓存，这里每个controller都有建立连接的过程，
		//就是说有多个数据库连接，因为有缓存，使用连接之间不能同步，这里应该改为
		//建立一个连接后大家共同使用
	}
	static {
		String res = "SqlMapConfig.xml";
		InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession();
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
}
