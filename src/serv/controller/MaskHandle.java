package serv.controller;

public class MaskHandle {
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
		String ret="";
		for(int i=1;i<v;i++){
			ret+="0";
		}
		ret+="1";
		return ret;
	}
}
