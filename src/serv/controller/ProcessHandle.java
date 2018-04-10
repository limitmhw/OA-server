package serv.controller;

import java.util.ArrayList;
import java.util.List;

public class ProcessHandle {
	String[] baseProcess;
	public ProcessHandle(){
		this.baseProcess=new String[]{
				"WEITIJIAO",//未提交
				"ZHUBAN",//主办
				"PINGSHEN",//评审
				"SHENHE",//审核
				"SHENPI",//审批
				"YITONGGUO"//已通过
		};
	}
	String moveToNextStatus(String nowStatus){
		//通过后转换到下一个状态
		for(int i=0;i<this.baseProcess.length;i++){
			if(nowStatus==this.baseProcess[i]){
				nowStatus=this.baseProcess[i];
				return this.baseProcess[i];
			}
		}
		return nowStatus;
	}
	List<Integer> getExcelStatusPeopleList(
			String gongChengId,
			String excelType,
			String nowStatus){
		/**
		 * 获取对应工程的--对应excel的--有权限的ID
		 */
		List<Integer> ret= new ArrayList();
		if(nowStatus.trim().equals(this.baseProcess[0])||
				nowStatus.trim().equals(this.baseProcess[5])
				){
			//这里返回空，可以查看的只能是创建者
			return ret;
		}

		return ret;
	}
	List<Integer> getPeopleWaitHandleExcelList(
			String gongChengId,
			String nowStatus){
		/**
		 * 获取对应人的--待处理的表
		 * 某个工程对应的状态待处理的表
		 */
		List<Integer> ret= new ArrayList();
		return ret;
	}


}
